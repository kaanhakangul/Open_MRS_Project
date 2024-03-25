package US_402;


import Utility.GkkBaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_402_POM extends GkkBaseDriver {

    //Kodların olacağı kısım
    @Test(groups = {"Smoke","Login"})
    public void US402() {

        US_402_Elements elements = new US_402_Elements();
        myClick(elements.language);
        myClick(elements.english);
        myClick(elements.demo);
        myClick(elements.openMRS2);
        myClick(elements.EnterTheOpenMRS2Demo);
        wait.until(ExpectedConditions.visibilityOf(elements.userName));
        elements.userName.sendKeys("admin");
        wait.until(ExpectedConditions.visibilityOf(elements.password));
        elements.password.sendKeys("Admin123");
        myClick(elements.inpatientWard);
        myClick(elements.loginButton);

        Assert.assertTrue(elements.admin.getText().contains("admin"));

    }
}
