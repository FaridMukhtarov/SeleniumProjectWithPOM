package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ReusableMethods {
    private final WebDriver driver = Driver.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    public String url = "http://automationexercise.com";

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.visibilityOf(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String sendValue){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(sendValue);
    }

    public void isVisible(WebElement visibleElement){
        wait.until(ExpectedConditions.visibilityOf(visibleElement));
        Assert.assertTrue(visibleElement.isDisplayed(),"Element is not visible");
    }

    public void getText (WebElement textElement){
        wait.until(ExpectedConditions.visibilityOf(textElement));
        String text = textElement.getText();
        System.out.println("From System: " + text);
    }

    public void equal(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected, "Texts are not equal");
    }

    public void selectFromDropDown(WebElement dropDownElement, String selectText){
        Select select = new Select(dropDownElement);
        select.selectByVisibleText(selectText);
    }

    public void isEnabled(WebElement isEnabledElement){
        wait.until(ExpectedConditions.visibilityOf(isEnabledElement));
            Assert.assertTrue(isEnabledElement.isEnabled());
    }

    public static void threadWait(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
