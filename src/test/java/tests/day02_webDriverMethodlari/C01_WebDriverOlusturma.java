package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverOlusturma {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver-win64");

        /*
        selenioum 4 ile birlikte
        selenium kendi webDriverini kodlarin icine koydu

        selenium 4 sonrasinda
        yukarda 11.satirda yazdigimiz driwer ayari OPSIYONEL hale geldi

        eger calistigimiz sirket
        ozel bir webDriver kullanmamizi isterse
        bize kullanacagimiz webDriverin kurulum dosyasini verirler
        bizde 11. satirda verilen webDriver'i tanimlariz

        eger calistigimiz sirket
        webDriver secimini bize birakirsa
        veya Seleniumun kendi webDriver'ini kullan derse
        11. satiri hic kullanmayiz

         */
        // windows bilgisayarlarda / farkli olabilir , dosya yolunun sonunda da .exe olur

        WebDriver driver = new ChromeDriver();

                /*

         // Biz web'de yapacagimiz tum testler icin webDriwer objesine ihtiyac duyariz
        //webDriver objesi bizim elimiz , gozumuz klavyemiz ve mouse'muzdur
        // dolayisiyla bir test yazacaksak
        // once webDriver objesi olusturmaliyiz
        33 . satirdaki kodu yazdigimizda
        Selenium esitligin saginda hangi constructor'i kullandiysak
        o browser'in bir kopyasini olusturur
        ve bizim kullanimimiza sunar

        olusturulan kopya browser'da
        choreme is begin controlled by automated test software yazar
         */

        // test otomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        /*
        bir web sayfasina gitmek istedigimizde
        webDriver.get("istenenURL") methodunu kullaniriz

        gitmek istediginiz web sayfasinin url'sinde
        www yazmasakda istenen sayfa acilir
        ANCAK https;// yazilmazsa istenen sayfa acilmaz
         */

        // 5 saniye bekleyin
        Thread.sleep(5000);

        /*
        bu method java'dan gelir
        ve kodlari yazilan milisaniye kadar bekletir

        biz genelde bir testi ilk defa calistirmak istedigimizde
        adimlarin dogru olarak ilerledigini gormek icin aralara
        Thread.sleep(...); koyariz

        testin uzerinde calismamiz bittiginde
        artik testimiz sorunsuz calisiyor dedigimizde
        Thread.sleep(); leri silmeniz tavsiye olunur

         */

        // sayfayi kapatin
        driver.quit();
        //driver.close();

        /*
        33.satirda yazdigimizda olusturulan webDriver dosyasini kapatir

         driver.close(); da ayni islemi yapar
         ancak bazi yeni surumlerde
          driver.close(); calismayabiliyor, onun icin quit() tercih edilir

          Selenium bu kapatma islemini 2 farkli methodla yapma sebebi
           driver.close(); uzerinde calisilan tek bir browser'i kapatir

           driver.quit(); test sirasinda acilan butun browserlari kapatir

         */


    }
}
