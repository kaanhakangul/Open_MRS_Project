package US_407;

import Utility.GkkBaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_407_Elements {

    public US_407_Elements() {

        PageFactory.initElements(GkkBaseDriver.driver,this);
    }

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







}
