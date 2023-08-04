package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.LandingPageObjects;

public class LandingPage extends LandingPageObjects {
    public LandingPage(WebDriver driver){
        super(driver);
        loadLandingPage();
    }
    private LandingPage loadLandingPage() {
        waitUntil(ExpectedConditions.visibilityOf(temperature));
        return this;
    }
    public Integer getTemperatureValue(){
        String tempValue = temperature.getText();
        String value = tempValue.split(" ")[0];
        return  Integer.parseInt(value);
    }

    public MoisturizerPage navigateToMoisturizersPage(){
        waitUntil(ExpectedConditions.visibilityOf(moisturizersButton));
        moisturizersButton.click();
        return new MoisturizerPage(driver);
    }

    public SunscreensPage navigateToSunscreensPage(){
        waitUntil(ExpectedConditions.visibilityOf(sunscreensButton));
        sunscreensButton.click();
        return new SunscreensPage(driver);
    }
}
