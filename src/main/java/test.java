import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws MalformedURLException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\pbantavanis\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions  = new ChromeOptions();
        chromeOptions.addArguments("--ignore-ssl-errors=yes");
        chromeOptions.addArguments("--ignore-certificate-errors");
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeOptions);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://weathershopper.pythonanywhere.com/");
        // identify element


        WebElement p=driver.findElement(By.id("input"));
        //enter text with sendKeys() then apply submit()
        p.sendKeys("Selenium Java");
        // Explicit wait condition for search results
//        WebDriverWait w = new WebDriverWait(driver, 5);
//        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        p.submit();
        driver.close();
    }
}