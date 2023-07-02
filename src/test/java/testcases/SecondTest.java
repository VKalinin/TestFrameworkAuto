package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {


    public String websiteURL = "https://test.my-fork.com/";
    public ChromeDriver driver;
    public  Locators locators;


    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        locators = new Locators();

    }


    public void openWebSite() throws InterruptedException {

        driver.get(websiteURL);
        driver.manage().window().maximize();
    }
    @Test
    public void openSignInPage() throws InterruptedException {

        openWebSite();
        driver.findElement(locators.signInButton).click();

    }
    @Test
    public void EmailPasswordFieldsAndLoginButtonCheck() throws InterruptedException {

        openWebSite();

        Thread.sleep(2000);

        driver.findElement(locators.signInButton).click();

        System.out.println("Email field is displayed: " + driver.findElement(locators.emailField).isDisplayed());
        System.out.println("Password field is displayed: " + driver.findElement(locators.passwordField).isDisplayed());
        System.out.println("Login Button is displayed: " + driver.findElement(locators.logInButton).isDisplayed());

    }

    public void fillUpCredentials(String email, String password){
        driver.findElement(locators.emailField).sendKeys(email);
        driver.findElement(locators.passwordField).sendKeys(password);

    }
    public void InvalidEmailAndPassword() throws InterruptedException {

        openWebSite();

        driver.findElement(locators.signInButton).click();
        fillUpCredentials("v.kalinin.m94@gmail.com", "123asd");
        driver.findElement(locators.logInButton).sendKeys(Keys.ENTER);

    }
    @Test
    public void ValidateErrorAfterInvalidInformation() throws InterruptedException {

        InvalidEmailAndPassword();
        Thread.sleep(5000);

        System.out.println("Email is incorrect: " + driver.findElement(locators.incorrectEmail).isDisplayed());

    }
    @Test
    public void RememberMeCheckedByDefaultValidation() throws InterruptedException {

        openWebSite();
        Thread.sleep(2000);

        System.out.println("Remember Me checked by default: " + driver.findElement(locators.rememberMeChekbox).isSelected());

    }
}
