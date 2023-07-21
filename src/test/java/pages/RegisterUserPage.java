package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

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

    @FindBy(xpath = "//h2[.='New User Signup!']")
    private WebElement newUserSignupElement;
    public void newUserSignupIsVisible(){
        isVisible(newUserSignupElement);
    }

    @FindBy(xpath = "(//input[@placeholder='Name'])[1]")
    private WebElement nameElement;
    public void inputName(String nameValue){
        sendKeysFunction(nameElement, nameValue);
    }
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    private WebElement emailAddressElement;
    public void inputEmailAddress(String emailAddressValue){
        sendKeysFunction(emailAddressElement, emailAddressValue);
    }

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signUpButton;
    public void clickSignUpButton(){
        clickFunction(signUpButton);
    }

    @FindBy(xpath = "(//b)[1]")
    private WebElement accountInfoTextVisibleElement;
    public void accountInfoTextVisibleAndEqual(){
        isVisible(accountInfoTextVisibleElement);
        equal(accountInfoTextVisibleElement, "ENTER ACCOUNT INFORMATION");
    }

    @FindBy(css = "input[type='radio']")
    private List<WebElement> genders;
    public void selectGender(String genderValue){
        for (WebElement gender : genders) {
            if (gender.getAttribute("value").equals(genderValue)){
                if (gender.isEnabled()){
                    clickFunction(gender);
                }
            }
        }
    }

    @FindBy(id = "password")
    private WebElement passwordElement;
    public void setPassword(String passwordValue){
        sendKeysFunction(passwordElement, passwordValue);
    }

    @FindBy(id = "days")
    private WebElement days;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(id = "years")
    private WebElement years;
    public void dateOfBirth(String day, String month, String year){
        selectFromDropDown(days,day);
        selectFromDropDown(months,month);
        selectFromDropDown(years,year);
    }







}
