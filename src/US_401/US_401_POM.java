package US_401;

import Utility.GkkBaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_401_POM extends GkkBaseDriver {
    //Kodların olacağı kısım
    @Test(groups = {"Smoke"}, dataProvider = "userNamePassword")
    public void US401(String userName, String password) {

        US_401_Elements elements = new US_401_Elements();

        myClick(elements.language);
        myClick(elements.english);
        myClick(elements.demo);
        myClick(elements.openMRS2);
        myClick(elements.EnterTheOpenMRS2Demo);
        wait.until(ExpectedConditions.visibilityOf(elements.userName));
        elements.userName.sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(elements.password));
        elements.password.sendKeys(password);
        myClick(elements.inpatientWard);
        myClick(elements.loginButton);

        wait.until(ExpectedConditions.visibilityOf(elements.invalid));
        Assert.assertTrue(elements.invalid.getText().contains("Invalid"));


    }

    @DataProvider
    Object[] userNamePassword() {
        Object[][] usernamePassword = {
                {"gokhan", "1234"},
                {"kaan", "44444"},
                {"Aycin", "6666"},
                {"fatih", "9999"},
                {"Aslı", "ddddd"},
                {"arafat", "aaaaa"},
        };
        return usernamePassword;

    }
    @Test
    public void logIn(){
        US_401_Elements elements = new US_401_Elements();
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
