package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterUserPage extends ReusableMethods {

    public WebDriver driver;

    public RegisterUserPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt = 'Website for automation practice']")
    private WebElement pageVisibleElement;
    public void homePageIsVisible(){
        isVisible(pageVisibleElement);
    }

    @FindBy(xpath = "//ul/li[4]/a[@href = '/login']")
    private WebElement sigUpLoginButton;
    public void clickSigUpLoginButton(){
        clickFunction(sigUpLoginButton);
    }



}
