package US_407;

import US_406.US_406_Elements;
import Utility.BaseDriver;
import Utility.GkkBaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class US_407_POM extends GkkBaseDriver {

    @Test(dataProvider = "patientName")
    public void US_407(String patientName){

        US_407_Elements elements=new US_407_Elements();
        login();
        myClick(elements.findPatient);
        mySendKeys(elements.idorNameInput, patientName);
        if (elements.name.getText().equals(patientName)){
            wait.until(ExpectedConditions.visibilityOf(elements.name));
            elements.name.click();
        }

        //Hasta detaylarının liste atılması
        List<WebElement> patientDetails = driver.findElements(By.xpath("//div[@class='info-header']"));

        //Listenin kontrolü
        for (WebElement a:patientDetails)
            System.out.println("a = " + a.getText());

        //Hasta bilgilerinin görüntülenmesinin kontrolü
        Assert.assertTrue(!patientDetails.isEmpty(),"Hasta bilgileri görüntülenemiyor");

        myClick(elements.deletePatient);
        mySendKeys(elements.deleteReasonInput, "Gizlilik");
        myClick(elements.confirmButton);

        wait.until(ExpectedConditions.visibilityOf(elements.successMessage));
        Assert.assertTrue(elements.successMessage.getText().contains("successfully"));

    }

    @DataProvider
    Object[] patientName() {
        Object[][] patientName = {
                {"Emma Hostert"}
        };

        return patientName;

    }


}
