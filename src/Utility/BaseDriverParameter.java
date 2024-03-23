package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {

    public WebDriver driver;
    public WebDriverWait wait;
    @BeforeClass
    @Parameters ("browserTipi")
    public void BaslangicIslemleri(String browserTipi){
        //System.out.println("başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,

        switch (browserTipi.toLowerCase()){


            case "firefox" : driver=new FirefoxDriver(); break;
            case "edge" : driver=new EdgeDriver(); break;
            default: driver=new ChromeDriver(); break;

        }



        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        LoginTest();

    }

    public void LoginTest(){

        System.out.println("Login test başladı.");
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement loginInput= driver.findElement(By.xpath("//input[@id='input-email']"));
        loginInput.sendKeys("kaanhakang@gmail.com");

        WebElement passwordInput= driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordInput.sendKeys("Hakan5535.");

        WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();


        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"));
        System.out.println("Login Test bitti.");


    }

    @AfterClass
    public void KapanisIslemleri(){
        //System.out.println("kapanış işlemleri yapılıyor"); //BekleKapat

        Tools.Bekle(3);
        driver.quit();
    }
}
