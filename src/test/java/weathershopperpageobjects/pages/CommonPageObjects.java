package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class CommonPageObjects extends HtmlPart {
    @FindBy(xpath = "//button[contains(text(),\"Cart\")]")
    protected WebElement checkoutCartButton;

    public CommonPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

}
