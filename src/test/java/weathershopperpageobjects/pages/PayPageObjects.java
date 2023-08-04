package weathershopperpageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import weathershopperpageobjects.HtmlPart;

public class PayPageObjects extends HtmlPart {

    @FindBy(xpath = "//h2[contains(text(),\"Example charge\")]")
    protected WebElement payWithCardPopUp;

    @FindBy(xpath = "//input[@id=\"email\"]")
    protected WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"card_number\"]")
    protected WebElement card_numberInput;

    @FindBy(xpath = "//input[@id=\"cc-exp\"]")
    protected WebElement ccexpInput;

    @FindBy(xpath = "//input[@id=\"cc-csc\"]")
    protected WebElement cccscInput;

    @FindBy(xpath = "//button[@id=\"submitButton\"]//span[contains(text(),\"Pay\")]")
    protected WebElement submitPayButton;

    @FindBy(xpath = "//iframe")
    protected WebElement iframe;

    @FindBy(xpath = "//input[@id=\"billing-zip\"]")
    protected WebElement zipCode;


    public PayPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
}
