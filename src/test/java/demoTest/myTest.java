package demoTest;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import weathershopperpageobjects.BaseTest;
import weathershopperpageobjects.actions.*;

import static org.junit.Assert.*;

import java.util.HashMap;

public class myTest extends BaseTest {

    @Test
    public void newTest() {
        WebDriver driver;
        driver = initializeDriver();
        driver.get("http://weathershopper.pythonanywhere.com/");
        LandingPage landingPage= new LandingPage(driver);
         if (landingPage.getTemperatureValue()<19)
         {
             MoisturizerPage moisturizerPage = landingPage.navigateToMoisturizersPage();
             HashMap sortedResultsValue = moisturizerPage.sortResults("Aloe");
             moisturizerPage.selectLessExpensiveValue(sortedResultsValue,"Aloe");
             sortedResultsValue = moisturizerPage.sortResults("Almond");
             moisturizerPage.selectLessExpensiveValue(sortedResultsValue,"Almond");
             CommonPage commonPage = new CommonPage(driver);
             CartPage cartPage = commonPage.navigateToCartPage();
             cartPage.assertsOnUI();
             editCardCredentials(cartPage);

         } else if (landingPage.getTemperatureValue()>34) {
             SunscreensPage sunscreensPage = landingPage.navigateToSunscreensPage();
             HashMap sortedResultsValue = sunscreensPage.sortResults("SPF-50");
             sunscreensPage.selectLessExpensiveValue(sortedResultsValue,"SPF-50");
             sortedResultsValue = sunscreensPage.sortResults("SPF-30");
             sunscreensPage.selectLessExpensiveValue(sortedResultsValue,"SPF-30");
             CommonPage commonPage = new CommonPage(driver);
             CartPage cartPage = commonPage.navigateToCartPage();
             cartPage.assertsOnUI();
             editCardCredentials(cartPage);
         } else {
             System.out.println("Do not test anything");
         }
    }
    private void editCardCredentials(CartPage cartPage){
        PayPage payPage = cartPage.navigateToPayWithCardPage();
        payPage.inputMail("test@test.com");
        payPage.inputCardNumber("4000056655665556");
        payPage.inputExpDate("03/34");
        payPage.inputCVC("123");
        payPage.inputZipCode("11111");
        SuccessPage successPage = payPage.submitPayButton();
    }
}
