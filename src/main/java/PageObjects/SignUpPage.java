package PageObjects;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class SignUpPage extends BaseMain{


    Locators locators = new Locators();
    public SignUpPage(WebDriver driver){

        super(driver);
    }
    String registrationLink = "https://test.my-fork.com/register";
    String name = "Vlad";
    String surname = "Kalinin";
    String email = "v.kalinin.m94@gmail.com";
    String password = "test123";
    String confirmPassword = "test123";

    public void openRegistrationPage(){
        driver.get(registrationLink);
        driver.manage().window().maximize();
    }

    public void fillRegistrationForms() throws InterruptedException {
        driver.findElement(locators.name).sendKeys(name);
        driver.findElement(locators.surname).sendKeys(surname);
        driver.findElement(locators.email).sendKeys(email);
        driver.findElement(locators.createPassword).sendKeys(password);
        driver.findElement(locators.confirmPassword).sendKeys(confirmPassword);
        Thread.sleep(5000);
    }
}
