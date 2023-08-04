package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public abstract class LandingPageObjects extends HtmlPart {

    @FindBy(css = "span[id='temperature']")
    protected WebElement temperature;

    @FindBy(xpath = "//button[contains(text(),\"Buy moisturizers\")]")
    protected WebElement moisturizersButton;

    @FindBy(xpath = "//button[contains(text(),\"Buy sunscreens\")]")
    protected WebElement sunscreensButton;
    public LandingPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

}
