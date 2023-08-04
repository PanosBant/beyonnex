package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class SunscreensPageObjects extends HtmlPart {

    @FindBy(xpath = "//h2[contains(text(),\"Sunscreens\")]")
    protected WebElement moisturizersTitle;

    public SunscreensPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
