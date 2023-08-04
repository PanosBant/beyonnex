package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.SunscreensPageObjects;

public class SunscreensPage extends SunscreensPageObjects {

    public SunscreensPage(WebDriver driver){
        super(driver);
        loadSunscreensPage();
    }
    private SunscreensPage loadSunscreensPage() {
        waitUntil(ExpectedConditions.visibilityOf(moisturizersTitle));
        return this;
    }

}
