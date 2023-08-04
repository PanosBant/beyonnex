package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class CartPageObjects extends HtmlPart {

    @FindBy(xpath = "//h2[contains(text(),\"Checkout\")]")
    protected WebElement checkoutTitle;

    @FindBy(xpath = "//button/span[contains(text(),\"Pay with Card\")]")
    protected WebElement payWithCardButton;
    public CartPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
