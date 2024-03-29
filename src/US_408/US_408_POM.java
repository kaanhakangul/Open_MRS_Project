package US_408;


import US_409.US_409_Elements;
import Utility.GkkBaseDriver;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
public class US_408_POM extends GkkBaseDriver {

    @Test(groups = {"Regression", "PatientManagement"})
    public void US408() {
        List<String> ids = new ArrayList<>();
        US_409_Elements elements=new US_409_Elements();
        login();
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
        ids.add(elements.patientid.getText());
        myClick(elements.homePage);
        myClick(elements.RegisteraPatient);
        mySendKeys(elements.givenName, givenName);
        mySendKeys(elements.middleName, middleName);
        mySendKeys(elements.familyName, familyName);
        myClick(elements.rightButton);
        myClick(elements.male);
        myClick(elements.rightButton);
        mySendKeys(elements.day, "11");
        myClick(elements.months);
        myClick(elements.march);
        mySendKeys(elements.year, "1986");
        myClick(elements.rightButton);
        mySendKeys(elements.address1, address1);
        mySendKeys(elements.address2, address2);
        mySendKeys(elements.cityVillage, cityVillage);
        mySendKeys(elements.stateProvince, stateProvince);
        mySendKeys(elements.country, country);
        mySendKeys(elements.postalCode, "55555");
        myClick(elements.rightButton);
        mySendKeys(elements.phoneNumber, "0505555555");
        myClick(elements.rightButton);
        myClick(elements.patientrelationship);
        myClick(elements.sibling);
        mySendKeys(elements.personName, personName);
        myClick(elements.rightButton);
        myClick(elements.confirm);
        wait.until(ExpectedConditions.visibilityOf(elements.patientId));
        ids.add(elements.patientid.getText());
        myClick(elements.homePage);
        myClick(elements.dataManagement);
        myClick(elements.mergePatient);
        mySendKeys(elements.id1,ids.get(0));
        mySendKeys(elements.id2,ids.get(1));
        myClick(elements.patientSearch);
        myClick(elements.continueButton);
        Assert.assertTrue(elements.warning.getText().contains("Merging cannot be undone!"));
        myClick(elements.firstPatient);
        myClick(elements.secondPatient);
        myClick(elements.continueButton);
        Assert.assertTrue(elements.finalid1.isDisplayed(),"Error");
        Assert.assertTrue(elements.finalid2.isDisplayed(),"Error");

    }
}