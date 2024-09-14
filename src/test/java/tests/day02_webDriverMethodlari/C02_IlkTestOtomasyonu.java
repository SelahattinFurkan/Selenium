package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTestOtomasyonu {
    public static void main(String[] args) {

        // gerekli ayarlari yapip
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64");
        WebDriver driver = new ChromeDriver();

        // test otomsayonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // testotomasyonu anasayfanin acildigini test etmek icin acilan
        // sayfanin url'inin "https://testotomasyon.com/" oldugunu test edin
        String expectedUrl= "https://www.testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();
                /*
                 bir testi yapabilmek icin
                 expected deger ile actual degeri karsilastiririz

                expected deger testcase yazilirken mantik olarak karsialsmayi bekledigimiz degerdir
                actual deger is driver'in ulastigi degerdir
                 */
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Expected url :" + expectedUrl);
            System.out.println("Actual url : " + actualUrl);
        }
        //sayfayi kapatin

        driver.quit();

    }
}
