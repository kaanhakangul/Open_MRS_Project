package US_409;


import Utility.GkkBaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
public class US_409_POM extends GkkBaseDriver {

    @Test(groups = {"Regression", "PatientManagement"})
    public void US408() {
        US_408_Elements elements = new US_408_Elements();
        login();
        myClick(elements.findPatient);
        myClick(elements.searchResults);
        String text = elements.searchResults.getText();
        String[] parts = text.split(" of ");
        String lastNumbers = parts[1].split(" ")[0];
        int lastNumber = Integer.parseInt(lastNumbers);
        List<WebElement> size = driver.findElements(By.xpath("//*[@class='recent-lozenge']"));
        Assert.assertTrue(lastNumber == size.size(), "Numbers are not equal");

    }
}