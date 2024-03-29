package US_405;

import Utility.GkkBaseDriver;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_405_POM extends GkkBaseDriver {



    @Test(groups = {"Smoke"}, dependsOnMethods = {"US_402.US_402_POM_US402"})
    public void US_405() {

        US_405_Elements elements = new US_405_Elements();
        login();
        elements.hoverOver(elements.admin);
        myClick(elements.myAccount);

        //Change Password visible and clickable checking
        Assert.assertTrue(elements.changePassword.isDisplayed(),"Change password is not visible.");
        myClick(elements.changePassword);
        Assert.assertEquals(GkkBaseDriver.driver.getCurrentUrl(),"https://demo.openmrs.org/openmrs/adminui/myaccount/changePassword.page","Change password is not clickable.");

        GkkBaseDriver.driver.navigate().back();

        //My languages visible and clickable checking
        Assert.assertTrue(elements.myLanguages.isDisplayed(),"My languages section is not visible.");
        myClick(elements.myLanguages);
        Assert.assertEquals(GkkBaseDriver.driver.getCurrentUrl(),"https://demo.openmrs.org/openmrs/adminui/myaccount/changeDefaults.page","My languages is not clickable.");




    }
}
