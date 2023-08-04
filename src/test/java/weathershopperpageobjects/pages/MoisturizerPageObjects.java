package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class MoisturizerPageObjects extends HtmlPart {

    @FindBy(xpath = "//h2[contains(text(),\"Moisturizers\")]")
    protected WebElement moisturizersTitle;

    public MoisturizerPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
