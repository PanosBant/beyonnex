package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.MoisturizerPageObjects;

public class MoisturizerPage extends MoisturizerPageObjects {
    public MoisturizerPage(WebDriver driver){
        super(driver);
        loadMoisturizerPage();
    }
    private MoisturizerPage loadMoisturizerPage() {
        waitUntil(ExpectedConditions.visibilityOf(moisturizersTitle));
        return this;
    }

}
