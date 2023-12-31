package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.RegisterUserPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterUserTest {
    WebDriver driver;
    ReusableMethods reusableMethods = new ReusableMethods();
    RegisterUserPage registerUserPage = new RegisterUserPage();

    @Test(priority = 1)
    public void LaunchBrowser(){
        driver = Driver.getDriver();
    }
    @Test(priority = 2)
    public void  NavigateToUrl(){
        driver.get(reusableMethods.url);
    }
    @Test(priority = 3)
    public void VerifyThatHomePageIsVisibleSuccessfully(){
        registerUserPage.homePageIsVisible();
    }
    @Test(priority = 4)
    public void ClickOnSignupLoginButton(){
        registerUserPage.clickSigUpLoginButton();
    }
    @Test(priority = 5)
    public void  VerifyNewUserSignupIsVisible(){
        registerUserPage.newUserSignupIsVisible();
    }
    @Test(priority = 6)
    public void EnterNameAndEmailAddress(){
        registerUserPage.inputName("Ferid");
        registerUserPage.inputEmailAddress("tttsaa@gmail.com");
    }
    @Test(priority = 7)
    public void ClickSignupButton(){
        registerUserPage.clickSignUpButton();

    }
    @Test(priority = 8)
    public void VerifyThat_ENTER_ACCOUNT_INFORMATION_isVisible(){
        registerUserPage.accountInfoTextVisibleAndEqual();
    }
    @Test(priority = 9)
    public void FillDetailsFirst(){
        // Title, Name, Email, Password, Date of birth
        registerUserPage.selectGender("Mr");
        registerUserPage.setPassword("ferid12345");
        registerUserPage.dateOfBirth("1", "January", "1995");
    }

    @Test(priority = 10)
    public void SelectCheckbox_SignUpForOurNewsletter(){

    }

    @Test(priority = 11)
    public void SelectCheckbox_ReceiveSpecialOffersFromOurPartners(){

    }

    @Test(priority = 12)
    public void FillDetailsSecond(){
        //  First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

    }

    @Test(priority = 13)
    public void ClickCreateAccountButton(){

    }

    @Test(priority = 14)
    public void VerifyThat_ACCOUNT_CREATED_isVisible(){

    }

    @Test(priority = 15)
    public void  ClickContinueButton(){

    }
    @Test(priority = 16)
    public void  VerifyThat_LoggedInAsUsername_isVisible(){

    }
    @Test(priority = 17)
    public void  ClickDeleteAccountButton(){

    }
    @Test(priority = 18)
    public void  VerifyThat_ACCOUNT_DELETED_isVisibleAndClick_Continue_Button(){

    }

    @Test(priority = 19)
    public void closeDriver(){
        Driver.tearDown();
    }
}
