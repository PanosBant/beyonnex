package weathershopperpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HtmlPart {

    protected WebDriver driver;

    public HtmlPart(WebDriver webDriver){
        Objects.requireNonNull(webDriver);
        this.driver = webDriver;
    }

    protected final <v> v waitUntil(Function<WebDriver, v> isTrue){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(60)).pollingEvery((Duration.ofMillis(5)))
                .ignoring(org.openqa.selenium.NoSuchElementException.class,
                        org.openqa.selenium.StaleElementReferenceException.class);
        return wait.until(isTrue);
    }

    public int countElements(String xpath) {
        return  driver.findElements(By.xpath(xpath)).size();
    }


    public  HashMap<Integer,Integer> sortResults(String xpathValue){

        String xpath = "//div//p[contains(text(),'"+xpathValue+"')]";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=1; i<=countElements(xpath);){
            String elementResult = driver.findElement(By.xpath("("+xpath+"/following-sibling::p"+")["+i+"]")).getText();
            String[] splitValue = elementResult.split(" ");
            String newValue = splitValue[splitValue.length-1];
            Integer value = Integer.parseInt(newValue);
            map.put(i,value);
            i++;
        }
        HashMap<Integer, Integer> sortedMap =map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return sortedMap;
    }

    public void selectLessExpensiveValue(HashMap map,String xpathValue){
        HashMap.Entry<Integer, Integer> entry = (HashMap.Entry<Integer, Integer>) map.entrySet().stream().findFirst().get();
        int key = entry.getKey();
        String xpath = "//div//p[contains(text(),'"+xpathValue+"')]";
        driver.findElement(By.xpath("("+xpath+")["+key+"]/following-sibling::button")).click();
    }

    public void inputValue(WebElement element, String value){
        waitUntil(ExpectedConditions.visibilityOf(element));
        element.clear();
        for (int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            String newValue = new StringBuilder().append(c).toString();
            element.sendKeys(newValue);
        }
    }

}
