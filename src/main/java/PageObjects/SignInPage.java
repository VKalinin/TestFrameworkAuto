package PageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Locators;

public class SignInPage extends BaseMain{

    Locators locators = new Locators();
    public SignInPage(WebDriver driver){

        super(driver);
    }

    public String email = "v.kalinin.m94@gmail.com";
    public String password = "test123";
    public void fillInTheSignInForm() throws InterruptedException {
        driver.findElement(locators.emailField).sendKeys(email);
        driver.findElement(locators.passwordField).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(locators.logInButton).click();
        Thread.sleep(5000);
    }
    public void credentialsAndLogInButtonCheck(){
        driver.findElement(locators.emailField).isDisplayed();
        driver.findElement(locators.passwordField).isDisplayed();
        driver.findElement(locators.logInButton).isDisplayed();

    }
    public void credentialsAndLogInButtonCheckReport(){

        System.out.println("Email field is displayed: " + driver.findElement(locators.emailField).isDisplayed());
        System.out.println("Password field is displayed: " + driver.findElement(locators.passwordField).isDisplayed());
        System.out.println("Log in button is displayed: " + driver.findElement(locators.logInButton).isDisplayed());
    }

    public void errorMessageIsDisplayed() throws InterruptedException {
        System.out.println("Invalid email and/or password: " + driver.findElement(locators.incorrectEmail).isDisplayed());
    }

    public void rememberMeIsChecked(){
        System.out.println("Remember Me checkbox is checked: " + driver.findElement(locators.rememberMeChekbox).isSelected());
    }

}
