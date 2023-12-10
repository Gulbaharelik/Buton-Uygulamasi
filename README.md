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
avantajları arasındadır.

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


