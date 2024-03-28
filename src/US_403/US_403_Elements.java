package US_403;

import Utility.GkkBaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_403_Elements extends GkkBaseDriver{
    public US_403_Elements() {
        PageFactory.initElements(GkkBaseDriver.driver, this);
    }

    //Locaterları tanımlayacağımız kısım
    @FindBy(xpath = "//span[@class='gt-lang-code']")
    public WebElement language;

    @FindBy(xpath = "//a[@data-gt-lang='en']")
    public WebElement english;

    @FindBy(xpath = "//a[text()='Demo']")
    public WebElement demo;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement openMRS2;

    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement EnterTheOpenMRS2Demo;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='Inpatient Ward']")
    public WebElement inpatientWard;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='nav-item identifier']")
    public WebElement admin;

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
    public WebElement logout;

}
