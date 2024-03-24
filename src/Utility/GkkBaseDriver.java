package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class GkkBaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeMethod
    public void BaslangicIslemleri() {
        //System.out.println("başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,

        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://openmrs.org/");


    }


    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    //elemente kadar scroll yap
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GkkBaseDriver.driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    @AfterMethod
    public static void quitDriver() {

        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //driver kapat
        if (driver != null) { //driver var ise
            driver.quit();
            driver = null;
        }
    }




}
