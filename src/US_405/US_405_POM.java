package US_405;

import Utility.GkkBaseDriver;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class US_405_POM extends GkkBaseDriver {



    @Test
    public void US_405() {

        US_405_Elements elements = new US_405_Elements();
        login();
        elements.hoverOver(elements.admin);
        myClick(elements.myAccount);



    }
}
