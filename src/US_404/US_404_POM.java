package US_404;

import Utility.GkkBaseDriver;
import Utility.Tools;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_404_POM extends GkkBaseDriver {

    //Kodların olacağı kısım
    @Test(groups = {"Regression", "dependsOnMethods"}, dependsOnMethods = {"US_402.US_402_POM_US402"})
    public void US404() {
        US_404_Elements elements = new US_404_Elements();
        myClick(elements.language);
        myClick(elements.english);
        myClick(elements.demo);
        myClick(elements.openMRS2);
        myClick(elements.EnterTheOpenMRS2Demo);
        mySendKeys(elements.userName, "admin");
        mySendKeys(elements.password, "Admin123");

        List<WebElement> locations = driver.findElements(By.xpath("//li[contains(@data-key,'')]"));
        int randomIndex = Tools.randomGenerator(locations.size());
        WebElement randomLocation = locations.get(randomIndex);
        myClick(randomLocation);
        myClick(elements.loginButton);

        myClick(elements.RegisteraPatient);

        String givenName = RandomString.make(8);
        mySendKeys(elements.givenName, givenName);

        String middleName = RandomString.make(8);
        mySendKeys(elements.middleName, middleName);

        String familyName = RandomString.make(8);
        mySendKeys(elements.familyName, familyName);
        myClick(elements.rightButton);

        myClick(elements.male);
        myClick(elements.rightButton);

        mySendKeys(elements.day, "11");
        myClick(elements.months);
        myClick(elements.march);
        mySendKeys(elements.year, "1986");
        myClick(elements.rightButton);

        String mothersName = RandomString.make(8);
        mySendKeys(elements.mothersname, mothersName);
        myClick(elements.rightButton);


        String address1 = RandomString.make(25);
        mySendKeys(elements.address1, address1);

        String address2 = RandomString.make(25);
        mySendKeys(elements.address2, address2);

        String cityVillage = RandomString.make(10);
        mySendKeys(elements.cityVillage, cityVillage);

        String stateProvince = RandomString.make(11);
        mySendKeys(elements.stateProvince, stateProvince);

        String country = RandomString.make(8);
        mySendKeys(elements.country, country);
        mySendKeys(elements.postalCode, "55555");
        myClick(elements.rightButton);

        mySendKeys(elements.phoneNumber, "0505555555");
        myClick(elements.rightButton);

        myClick(elements.patientrelationship);
        myClick(elements.sibling);

        String personName = RandomString.make(11);
        mySendKeys(elements.personName, personName);
        myClick(elements.rightButton);

        myClick(elements.confirm);

        wait.until(ExpectedConditions.visibilityOf(elements.patientId));

        Assert.assertTrue(elements.patientId.isDisplayed(), "geçersiz kayıt");


    }
}
