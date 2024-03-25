package US_405;

import Utility.GkkBaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_405_Elements {

    public US_405_Elements() {
        PageFactory.initElements(GkkBaseDriver.driver,this);
    }

    @FindBy(xpath = "//li[@class='nav-item identifier']")
    public WebElement admin;

    @FindBy(xpath = "//a[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement myAccount;

    public void hoverOver(WebElement element){
        Actions aksiyonDriver=new Actions(GkkBaseDriver.driver);
        Action aksiyon=aksiyonDriver.moveToElement(element).build();
        aksiyon.perform();
    }

}
