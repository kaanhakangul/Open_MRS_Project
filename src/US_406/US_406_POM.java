package US_406;

import Utility.GkkBaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class US_406_POM extends GkkBaseDriver {


   @Test (dataProvider = "patientName")
   public void US_406(String patientName){

     US_406_Elements elements=new US_406_Elements();
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
       Assert.assertTrue(patientDetails.size()>0,"Hasta bilgileri görüntülenemiyor");

   }

   @Test (dataProvider = "wrongName")
   public void US_406_NEGATIVE(String wrongName){

       US_406_Elements elements=new US_406_Elements();
       login();
       myClick(elements.findPatient);
       mySendKeys(elements.idorNameInput, wrongName);
       wait.until(ExpectedConditions.visibilityOf(elements.wrongNameMessage));
       //Hata mesajının görüntülenip görüntülenmediğinin kontrolü
       System.out.println("elements.wrongNameMessage.getText() = " + elements.wrongNameMessage.getText());
       Assert.assertEquals(elements.wrongNameMessage.getText(),"No matching records found","Kullanıcı mevcuttur.");

   }



    @DataProvider
    Object[] patientName() {
        Object[][] patientName = {
                {"Emma Hostert"}
        };

        return patientName;

    }

    @DataProvider
    Object[] wrongName() {
        Object[][] wrongName = {
                {"Kaan Hakan"}
        };

        return wrongName;

    }
}
