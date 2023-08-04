package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.CartPageObjects;
import weathershopperpageobjects.pages.LandingPageObjects;

public class CartPage extends CartPageObjects {
    public CartPage(WebDriver driver){
        super(driver);
        loadCartPage();
    }
    private CartPage loadCartPage() {
        waitUntil(ExpectedConditions.visibilityOf(checkoutTitle));
        return this;
    }

    public PayPage navigateToPayWithCardPage(){
        waitUntil(ExpectedConditions.visibilityOf(payWithCardButton));
        payWithCardButton.click();
        return new PayPage(driver);
    }
}
