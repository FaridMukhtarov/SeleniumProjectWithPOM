package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class RegisterUserTest {
    WebDriver driver;
    ReusableMethods reusableMethods = new ReusableMethods();

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

        System.out.println("kgsdfs");
    }

    @Test(priority = 4)
    public void ClickOnSignupLoginButton(){

        System.out.println("sdgl");
    }

    @Test(priority = 5)
    public void  VerifyNewUserSignupIsVisible(){

        System.out.println("sdkjgh");
    }

    @Test(priority = 6)
    public void EnterNameAndEmailAddress(){

    }
    @Test(priority = 7)
    public void ClickSignupButton(){

    }
    @Test(priority = 8)
    public void VerifyThat_ENTER_ACCOUNT_INFORMATION_isVisible(){

    }
    @Test(priority = 9)
    public void FillDetailsFirst(){
        // Title, Name, Email, Password, Date of birth

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
