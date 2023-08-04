package weathershopperpageobjects.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import weathershopperpageobjects.pages.PayPageObjects;

public class PayPage extends PayPageObjects {
    public PayPage(WebDriver driver){
        super(driver);
        loadPayPage();
    }
    private PayPage loadPayPage() {
        waitUntil(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        waitUntil(ExpectedConditions.visibilityOf(submitPayButton));
        return this;
    }

    public void inputMail(String value) {
        inputValue(emailInput,value);
    }

    public void inputCardNumber(String value) {
        inputValue(card_numberInput,value);
        card_numberInput.submit();
        waitUntil(ExpectedConditions.visibilityOf(zipCode));
    }
    public void inputCVC(String value) {
        inputValue(cccscInput,value);
    }
    public void inputExpDate(String value) {
        inputValue(ccexpInput,value);
    }

    public void inputZipCode(String value) {
        inputValue(zipCode,value);
    }

    public SuccessPage submitPayButton() {
        waitUntil(ExpectedConditions.visibilityOf(submitPayButton));
        submitPayButton.click();
        driver.switchTo().parentFrame();
        return new SuccessPage(driver);
    }

}
