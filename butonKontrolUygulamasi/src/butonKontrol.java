import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class butonKontrol extends JButton {
    //Degiskenler tanimlandi
    private String graphQLSchema;
    private Color aktifRenk;
    private Color pasifRenk;
    private boolean isActive; //Aktiflik durumu sorgulamasında kullanılır

    public butonKontrol(String text) {

        //Private tanımlanan değişkenler hakkında tanımlama yapıldı
        super(text);
        this.graphQLSchema = "";
        this.aktifRenk = Color.red;
        this.pasifRenk = Color.yellow;
        this.isActive = false;

        setPasifDurum();
        addActionListener(new butonTiklamaOlaylari());
    }

    public void setGraphQLSchema(String schema) {
        this.graphQLSchema = schema;
    }

    //aktif olduğundaki renk burada seçildi
    public void setAktifRenk(Color color) {
        this.aktifRenk = color;
    }
    //pasif olduğundaki renk burada seçildi
    public void setPasifRenk(Color color) {
        this.pasifRenk = color;
    }
    //pasif olduğunda renk ve yazı değişiyor
    private void setPasifDurum() {
        setBackground(pasifRenk);
        setText("Pasif");
        isActive = false;
    }
    //aktif olduğunda renk ve yazi degisiyor.
    private void setAktifDurum() {
        setBackground(aktifRenk);
        setText("Aktif");
        isActive = true;
    }

    private class butonTiklamaOlaylari implements ActionListener {
        //butona tiklama olayi yapildiginda gerceklesecekler
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isActive) {
                setPassiveStateForAllButtonsExceptCurrent();
                isActive = false; // Buton pasif hale getirir
            } else {
                setAktifDurum();
                isActive = true; // Buton aktif hale getirir
                //tiklandigi zaman aktif oldugunda çalışıyor yazacak.
                System.out.println("Çalışıyor: " + graphQLSchema);
            }
        }
    }

    private void setPassiveStateForAllButtonsExceptCurrent() {
        for (Component component : getParent().getComponents()) {
            if (component instanceof butonKontrol) {
                butonKontrol button = (butonKontrol) component;
                if (button != this) {
                    button.setPasifDurum();
                }
            }
        }
    }

    public static void main(String[] args) {
        //Butonları oluşturduk
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Kontrol Paneli"); // Yeni bir buton nesnesi oluştrulur ve Panele başlık atanır.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame kapatıldığında uygulamanın sonlanmasını sağlar.
            frame.setLayout(new GridLayout(4, 4, 15, 15)); //panelde kaç satır ,kaç sutunolacağı ve aralarındaki boşluk miktarı belirlenir.

            butonKontrol[] buttons = new butonKontrol[16];
            //Tıklanan kutuya link atamasi yapıldı
            for (int i = 0; i < 16; i++) {
                buttons[i] = new butonKontrol("Button " + (i + 1));
                frame.add(buttons[i]);
                buttons[i].setGraphQLSchema("https://api.example.com/graphql");
            }

            //pencere ayarları
            frame.setSize(400, 400); // Pencerenin boyutlarını belirler
            frame.setVisible(true); //pencerenin görünür olmasını sağlar.
        });
    }
}