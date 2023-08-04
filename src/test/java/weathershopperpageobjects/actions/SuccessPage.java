package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.SuccessPageObjects;

public class SuccessPage extends SuccessPageObjects {
    public SuccessPage(WebDriver driver) {
        super(driver);
        loadSuccessPage();
    }
    private SuccessPage loadSuccessPage() {
        waitUntil(ExpectedConditions.visibilityOf(successPageMessage));
        return this;
    }

}
