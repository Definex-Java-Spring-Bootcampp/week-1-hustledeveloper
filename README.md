[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/Z1kPkJOi)
# 1.Hafta Ödevi 
1. Java dünyasındaki framework’ler ve çözdükleri problemler nedir? Kod Örneklendirini de içermelidir. `(5 Puan)`

<details>

<summary>Cevap-1</summary>
SPRING: Kurumsal alanda en çok kullanılan Java Framework’ü olarak Spring’i örnek verebiliriz. Spring Framework’ü hem .net hem de Java için geliştirilmiş Java EE uygulamaları yapmamızı kolaylaştıran harika bir Framework’tür. Bu framework model-view-controller katmanlarını kontrol ederek ihtiyacımız olan paket ve sınıfları ekleyebildiğimiz ve bu paketleri kullanabilmemizi sağlayan bir Framework’tür. Spring ile çok karmaşık uygulamaların yanında oldukça basit uygulamalar yapmak da mümkündür.

```java
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}

@Controller
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}

```

JSF (Java Server Faces): Bir web sitesini Java ile yapmak mümkündür. Ancak Java Server Faces Framework’ü dinamik web sayfaları oluşturmamıza yaramaktadır. JSP kodları HTML dilinin içine yazılır ve kendine özel etiket sistemi vardır. Bu sayede HTML ile karışmadan kendi içinde güzel ve düzenli bir performans sunarak kaliteli siteler yapma konusunda yazılımcıya yardımcı olmaktadır.

```java
@ManagedBean
@ViewScoped
public class MyBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


```

MAVEN: Bir proje geliştirirken proje içinde bir standart ve düzen oluşturmayı, geliştirme sürecini daha basitleştirmemizi sağlayan Java Framework’üdür. Geliştirdiğiniz projenin kütüphane bağımlılığını ve IDE bağımlılığını bu framework sayesinde ortadan kaldırabildiği gibi projenin daha kolay geliştirilmesi hakkında bize birçok kolaylık sağlamaktadır.
```java
<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.example</groupId>
    <artifactId>hello-world</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
    </build>

</project>

```

HIBERNATE: Hibernate bir ORM kütüphanesidir. Veritabanı üzerinde yapılan işlemleri kolaylaştıran bu framework için Java sınıflarının veritabanı dönüşümünü yapıyor diyebiliriz. Aynı zamanda veri çekme ve veri sorgulama işlerinde de oldukça yardımı dokunan bir Framework’tür.
```java
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int age;

}

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        session.save(person);

        session.close();
    }

}

```

</details>

2. SOA - Web Service - Restful Service - HTTP methods kavramlarını örneklerle açıklayınız. `(15 Puan)`
<details>

<summary>Cevap-2</summary>

SOA, bir uygulamanın işlevlerini birbirleriyle iletişim kuran ve veri paylaşan bağımsız servisler olarak organize etmeyi amaçlayan bir mimari modeldir. SOA'nın temel amacı, karmaşık uygulamaları daha küçük ve daha yönetilebilir parçalara ayırmak ve bu parçaların gevşek bir şekilde birbirine bağlanmasını sağlamaktır.

Web Servisi:

Web servisi, internet üzerinden iki uygulama arasında iletişim kurmak için kullanılan bir yazılım arabirimidir. Web servisleri, SOAP, REST gibi çeşitli protokoller kullanarak veri ve işlevsellik paylaşımı sağlar.

RESTful Servisi:

RESTful servisi, Representational State Transfer (REST) mimari stilini kullanan bir web servisidir. REST, basit ve hafif bir mimariye sahip olmasıyla bilinir ve HTTP protokolü üzerinde çalışır. RESTful servisler, CRUD (Create, Read, Update, Delete) işlemleri için GET, POST, PUT, DELETE gibi HTTP yöntemlerini kullanır.

HTTP Yöntemleri:

GET: Bir kaynaktan veri almak için kullanılır.
POST: Bir kaynağa veri göndermek için kullanılır.
PUT: Bir kaynağın var olan verisini güncellemek için kullanılır.
DELETE: Bir kaynağı silmek için kullanılır.
Örnek:

Diyelim ki bir kitap uygulaması var. Bu uygulamada kitapların listesini, belirli bir kitabı ve yeni bir kitap ekleme işlevini sunan bir RESTful servisi oluşturabiliriz.

Kitap Listesi:

URL: /api/books

HTTP Yöntemi: GET

Dönüş: JSON

```json
[
  {
    "id": 1,
    "title": "Harry Potter ve Felsefe Taşı",
    "author": "J.K. Rowling"
  },
  {
    "id": 2,
    "title": "Yüz Yıllık Yalnızlık",
    "author": "Gabriel Garcia Marquez"
  }
]

```

Belirli Bir Kitap:

URL: /api/books/{id}

HTTP Yöntemi: GET

Dönüş: JSON

```json

{
"id": 1,
"title": "Harry Potter ve Felsefe Taşı",
"author": "J.K. Rowling"
}
```
Yeni Kitap Ekleme:

URL: /api/books

HTTP Yöntemi: POST

Gönderilen Veri: JSON
```json

{
  "title": "Simyacı",
  "author": "Paulo Coelho"
}
```


</details>

3. Singleton ve Factory pattern kullanarak projedeki objeleri oluşturun. `(10 Puan)`



4. Aşağıdaki eksiklikleri [**bizimkredi**](https://github.com/Definex-Java-Spring-Bootcampp/kredinbizden-service) projesine ekleyin. `(50 Puan)` 
    * Aynı e-mail adresi ile bir kullanıcı kayıt olabilir.  
    * Kullanıcının şifresi **SHA-512** ile şifrelenerek kullanıcı oluşturulmalıdır.  
    * En çok başvuru yapan kullanıcıyı bulan methodu yazın.  
    * En yüksek kredi isteyen kullanıcıyı ve istediği tutarı bulan methodu yazın.  
    * Son bir aylık yapılan başvuruları listeleyen methodu yazın.  
    * Kampanya sayısı en çoktan aza doğru olacak şekilde kredi kartı tekliflerini listeleyen methodu yazın.  
    * cemdrman@gmail.com mail adresine sahip kullanıcının bütün başvurularını listeleyen methodu yazın.(Parametrik şekilde çalışmalıdır.)  

5. Bir müşteri, ürün, sipariş ve fatura objeleri olacak şekilde online alışveriş sistemi tasarlayın. `(20 PUAN)`
    * Bir müşteri birden fazla sipariş verebilir.
    * Bir sipariş içerisinde birden fazla ürün olabilir.
    * Ürünün kategorisi, fiyatı, ismi ve stok bilgisi vardır.
    * Her siparişin bir faturası vardır.

> Bu kurallar çerçevesinde derste öğrendiğimiz **OOP** kavramlarını ve **Collection Framework** yapılarını örnekleyin.   
> > Sadece derslerde yaptığımız gibi Main method üzerinden gerekli instance oluşturması yapılacaktır ekstra bir yapıya ihtiyaç yoktur. 

* Bu doğrultuda aşağıdaki soruların cevaplarını yazan kodu yazınız.
    - Sistemdeki bütün müşterisi sayısını bulan,  
    - İsmi Cem olan müşterilerin aldıkları ürün sayısını bulan, 
    - İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarını hesaplayın,
    - Sistemdeki 1500 TL üzerindeki faturaları listeleyin.
---
*Eğitmen - Cem DIRMAN*  
*Kolay Gelsin*  
