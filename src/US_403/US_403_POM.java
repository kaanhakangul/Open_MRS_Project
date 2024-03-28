package US_403;

import US_402.US_402_Elements;
import Utility.GkkBaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.util.Elements;

public class US_403_POM extends GkkBaseDriver {

    @Test(groups = {"Smoke", "Logout"})
    public void US403() {
        US_403_Elements elements = new US_403_Elements();
        myClick(elements.language);
        myClick(elements.english);
        myClick(elements.demo);
        myClick(elements.openMRS2);
        myClick(elements.EnterTheOpenMRS2Demo);
        mySendKeys(elements.userName,"admin");
        mySendKeys(elements.password,"Admin123");
        myClick(elements.inpatientWard);
        myClick(elements.loginButton);

        Assert.assertTrue(elements.admin.getText().contains("admin"));
        myClick(elements.logout);
        Assert.assertTrue(elements.loginButton.getAttribute("id").contains("loginButton"));


    }
}
