package US_408;

import Utility.GkkBaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_408_Elements extends GkkBaseDriver{

    public US_408_Elements() {

        PageFactory.initElements(GkkBaseDriver.driver,this);
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

    @FindBy(id = "referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")
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
    @FindBy(xpath = "//a[@href='/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient']")
    public WebElement findPatient;

    @FindBy (xpath="//input[@id='patient-search']")
    public WebElement idorNameInput;

    @FindBy (xpath="(//tbody[@role='alert']//tr//td)[2]")
    public WebElement name;

    @FindBy (xpath="//td[text()='No matching records found']")
    public WebElement wrongNameMessage;

    @FindBy (xpath="(//div[@class='col-11 col-lg-10'])[8]")
    public WebElement deletePatient;

    @FindBy (xpath="//input[@id='delete-reason']")
    public WebElement deleteReasonInput;

    @FindBy(xpath="(//button[@class='confirm right'])[6]")
    public WebElement confirmButton;

    @FindBy(xpath="//*[contains(text(), 'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement myAccount;
    @FindBy(xpath = "(//div[@class='task'])[1]")
    public WebElement changePassword;
    @FindBy(xpath="(//div[@class='task'])[2]")
    public WebElement myLanguages;
    @FindBy(css = "//*[@class='recent-lozenge']")
    public WebElement identifier;
    @FindBy(xpath = "//*[@id='patient-search-results-table_info']")
    public WebElement searchResults;
    @FindBy(xpath = "//div[@class='float-sm-right']/span")
    public WebElement patientid;
    @FindBy(xpath = "//*[@class='icon-hdd']")
    public WebElement dataManagement;
    @FindBy(xpath = "//div[@class='logo']/a")
    public WebElement homePage;
    @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
    public WebElement mergePatient;
    @FindBy(id = "patient1-text")
    public WebElement id1;
    @FindBy(id = "patient2-text")
    public WebElement id2;
    @FindBy(id = "patient-search")
    public WebElement patientSearch;
    @FindBy(id="confirm-button")
    public WebElement continueButton;
    @FindBy(css = "[class='messages-container']>h1")
    public WebElement warning;
    @FindBy(xpath = "//*[@class='row identifiers']/h3[1]")
    public WebElement firstPatient;
    @FindBy(xpath = "//*[@class='row identifiers']/h3[1]")
    public WebElement secondPatient;
    @FindBy(xpath = "//div[@class='float-sm-right']/span[1]")
    public WebElement finalid1;
    @FindBy(xpath = "//div[@class='float-sm-right']/span[2]")
    public WebElement finalid2;






}
