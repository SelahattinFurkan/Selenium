package tests.day02_webDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WebDriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver-win64");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com/");

      driver.quit();

     System.out.println(driver.getCurrentUrl());
     // driverin icinde oldugu sayfanin urlsini getirir

     System.out.println(driver.getTitle());
     //driverin icinde oldugu sayfanin title'ini getirir

     System.out.println(driver.getPageSource());
     //html deki butun sayfa kaynagini getirir.

     System.out.println(driver.getWindowHandle());
     System.out.println(driver.getWindowHandles());

    /*
     // bunu ayri bir konu olarak isleyecegiz
     //getWindowHandle  driverin icinde oldugu sayfaya atadigi
     // unique WindowHandleDegerini getirir

     eger test sirasinda birden fazla browser acilirsa
     acilan tum sayfalarin WindowHandleDegerlerini bir Set olarak getirir
        */


    }
}
