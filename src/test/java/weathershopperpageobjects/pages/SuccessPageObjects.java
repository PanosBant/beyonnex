package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class SuccessPageObjects extends HtmlPart {

    @FindBy(xpath = "//h2[contains(text(),\"PAYMENT SUCCESS\")]")
    protected WebElement successPageMessage;
    public SuccessPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
}
