package US_404;

import Utility.GkkBaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_404_Elements extends GkkBaseDriver{

    //Locaterları tanımlayacağımız kısım
    public US_404_Elements() {
        PageFactory.initElements(GkkBaseDriver.driver, this);
    }

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

    @FindBy(xpath = "//div[@id='error-message']")
    public WebElement invalid;
    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[3]/a")
    public WebElement logout;
    @FindBy(css = "//li[contains(@data-key,'')]")
    public WebElement locationrandom;
    @FindBy(id = "referenceapplication-registrationapp-myRegisterPat-homepageLink-referenceapplication-registrationapp-myRegisterPat-homepageLink-extension")
    public WebElement RegisteraPatient;
    @FindBy(name = "givenName")
    public WebElement givenName;
    @FindBy(name = "middleName")
    public WebElement middleName;
    @FindBy(name = "familyName")
    public WebElement familyName;
    @FindBy(id = "next-button")
    public WebElement rightButton;

    @FindBy(xpath = "//option[@value='M']")
    public WebElement male;
    @FindBy(id = "birthdateDay-field")
    public WebElement day;
    @FindBy(id = "birthdateMonth-field")
    public WebElement months;
    @FindBy(xpath = "//option[@value='3']")
    public WebElement march;
    @FindBy(id = "birthdateYear-field")
    public WebElement year;
    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public WebElement address2;
    @FindBy(id = "cityVillage")
    public WebElement cityVillage;
    @FindBy(id = "stateProvince")
    public WebElement stateProvince;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "postalCode")
    public WebElement postalCode;
    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "relationship_type")
    public WebElement patientrelationship;
    @FindBy(xpath = "//option[@data-val='Sibling']")
    public WebElement sibling;
    @FindBy(xpath = "//input[@placeholder='Person Name']")
    public WebElement personName;
    @FindBy(id = "submit")
    public WebElement confirm;
    @FindBy(xpath = "//em[text()='Patient ID']")
    public WebElement patientId;
    @FindBy(name = "mothersname")
    public WebElement mothersname;


}

