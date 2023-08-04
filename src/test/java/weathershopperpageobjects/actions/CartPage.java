package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.CartPageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    //check the rows to verify the products in cart
    public void assertsOnUI() {
        assertEquals(countElements("//tr//td[1]"),2);
        assertTrue(tableHeader.isDisplayed());
    }
}
