package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.CommonPageObjects;

public class CommonPage extends CommonPageObjects {
    public CommonPage(WebDriver driver){
        super(driver);
        loadMoisturizerPage();
    }
    private CommonPage loadMoisturizerPage() {
        waitUntil(ExpectedConditions.visibilityOf(checkoutCartButton));
        return this;
    }

    public CartPage navigateToCartPage(){
        checkoutCartButton.click();
        return new CartPage(driver);
    }
}
