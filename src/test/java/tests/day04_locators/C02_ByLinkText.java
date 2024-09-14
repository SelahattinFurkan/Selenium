package tests.day04_locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByLinkText {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        // cookies kabul edin
       // List<WebElement> cookiesKabulListe = driver.findElements(By.className("fc-button-label"));
        //cookiesKabulListe.get(1).click();

       // //3- Sayfada 147 adet link bulundugunu test edin.
       // List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));
       // //System.out.println(linkElementleriList.size());
       // int expectedLinkSayisi = 147;
       // int actualLinkSayisi = linkElementleriList.size();
       // if (expectedLinkSayisi == actualLinkSayisi) {
       //     System.out.println("link sayisi testi PASSED");
       // }else System.out.println("link sayisi testi FAILED");

        //4- Products linkine tiklayin
        //WebElement productLinkElementi = driver.findElement(By.linkText(" Products"));
        //productLinkElementi.click();
        // bunu bulamadigi icin partialLinkText();

    //  //5- special offer yazisinin gorundugunu test edin
    //  WebElement specialOfferYaziElementi = driver.findElement(By.id("sale_image"));
    //  if (specialOfferYaziElementi.isDisplayed()){
    //      System.out.println("special offer yazi testi PASSED");
    //  }else System.out.println("special offer yazi testi FAILED");

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}