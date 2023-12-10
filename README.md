# Buton-Uygulamasi
ButonKontrolUygulamasi

GraphQL nedir?

Sunucudan veri çekerken istemcilere tam olarak istediklerini vermeyi önceliklendiren bir sorgu dilidir
İstemciler, sunucuya bir şema üzerinden hangi alanları istediklerine göre bir sorgu oluşturur. Sunucu, bu sorguyu işler ve yalnızca istenilen verileri yanıt olarak gönderir.

GraphQL neden kullanılmalıdır?

1)Ağ üzerinden aktarılması gereken verileri en aza indirerek uygulamaların düşük koşullardaki performansını iyileştirebilir.
2)Sadece gerekli kolonları sorgulayabilmek istersek bu uygulama kullanılabilir.
3)GraphQL ilişkili veriler ile çalışırken size çok büyük kolaylıklar sağlar. Sistemde bulunan tüm kullanıcıları, her bir kullanıcının sahip olduğu gönderileri ve bu gönderilere ait yorumları listeler.

GraphQL Avantajları;

API Documentation:Schema sayesinde API kendini dokümante eder.

Data Fetching:Query ile istemcinin yalnızca ihtiyaç duyduğu veriler sorgulanır.

Development Experience:Backend değişikliğine bağımlılığı azaltarak frontend tarafında geliştirmeyi hızlandırır.

Schema Stiching:Birden fazla GraphQL Schema’sı tek bir şemada birleştirilebilir.


GraphQL Dezavantajları;

Veri İsteği ve Yanıt: GraphQL, istemci tarafından belirlenen veri yapısına göre yanıt döndürürken, REST API belirli bir yapıda (genellikle JSON) veri döndürür.

Esneklik: GraphQL, istemcilerin ihtiyaca uygun veri istemesine olanak tanırken, REST API genellikle belirli bir veri yapısı ile sınırlıdır.

Performans: GraphQL, over-fetching ve under-fetching problemlerini minimize ederken, REST API bu problemlere daha açık olabilir.

Belgeler ve Araçlar: REST API'nin Swagger ve OpenAPI gibi belgelendirme araçları yaygın olarak kullanılırken, GraphQL'in kendi belgeleme araçları bulunmaktadır.


GraphQL kullanılan bazı alanlar;

Çoklu kaynaklardan veri alma:Örnek olarak Ev Otomasyon Sistemleri; ev sahiplerinin evlerindeki farklı cihazları, lambaları veya elektronik ekipmanları kontrol etmelerini sağlayabilir.

İstemci tarafında özelleştirilebilir sorgu: İstemcilerin ihtiyaç duyduğu verilere göre özelleştirilebilir sorgular yapmak istiyorsanız, GraphQL kullanabilirsiniz.

Mimari uyumluluk: Backend For Frontend(BFF) gibi yazılım mimarileri ile uyumlu olduğu için tercih edilebilir.


Uygulamanın Kullanım Biçimi İle Alakalı Bilgiler ve Örnek Fotoğraflar;

![Ekran görüntüsü 2023-12-10 182145](https://github.com/Gulbaharelik/Buton-Uygulamasi/assets/115218532/6f0d2d83-1700-4145-ad64-4410b05af7d1)

Bu görüntüde run kısmına basarak uygulamamız çalıştırıldı.

![Ekran görüntüsü 2023-12-10 182217](https://github.com/Gulbaharelik/Buton-Uygulamasi/assets/115218532/5cf4b8c6-17e8-4ea6-8319-1866cd33a75b)

Bu görselde anlatılmak istenen herhangi bir düğmeye basıldığında GraphQL sayesinde terminalde graphql shema adresi görüntülenir. Aynı zamanda ilk basılan düğme pasif halden aktif hale geçer.

![Ekran görüntüsü 2023-12-10 182226](https://github.com/Gulbaharelik/Buton-Uygulamasi/assets/115218532/ef13b452-7034-4aad-9035-f1a671ff2661)

Bu görselde ilk düğme dışında herhangi bir düğmeye bastığımızda ikinci basıldığında o da pasif halden aktif hale dönüşür. Ve shema adresi aynı şekilde terminalde belirtilir. 

![Ekran görüntüsü 2023-12-10 182248](https://github.com/Gulbaharelik/Buton-Uygulamasi/assets/115218532/404b0416-8c75-4428-b4a0-90c347606d6c)

Bu görselde belirtilen nokta şudur ilk düğme basımına gelene kadar her basılan düğme pasif halden aktif hale dönüşürken ilk basılan düğmeye tekrar basıldığına aktif olan her düğme pasifleşir ve yalnızca ilk düğme aktif hale gelir ve terminalde shema adresi yazdırılmaz.
