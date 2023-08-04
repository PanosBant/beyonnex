package weathershopperpageobjects;


import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    WebDriver driver;

    @After
    public void finish () {
        driver.close();
        driver.quit();
    }
    public WebDriver initializeDriver() {

        try {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless","--no-sandbox","--disable-extensions");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return driver;
    }
}