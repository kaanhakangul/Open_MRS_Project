package US_406;

import Utility.GkkBaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_406_Elements {

    public US_406_Elements() {

        PageFactory.initElements(GkkBaseDriver.driver,this);
    }

    @FindBy (xpath = "//a[@href='/openmrs/coreapps/findpatient/findPatient.page?app=coreapps.findPatient']")
    public WebElement findPatient;

    @FindBy (xpath="//input[@id='patient-search']")
    public WebElement idorNameInput;

    @FindBy (xpath="(//tbody[@role='alert']//tr//td)[2]")
    public WebElement name;

    @FindBy (xpath="//div[@class='info-header']")
    public WebElement patientInfos;





}
