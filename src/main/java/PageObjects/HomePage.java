package PageObjects;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class HomePage extends BaseMain {

    Locators locators = new Locators();

    public HomePage(WebDriver driver){

        super(driver);
    }
    String websiteURL = "https://test.my-fork.com/";

    public void openHomePage(){
        driver.get(websiteURL);
        driver.manage().window().maximize();
    }
    public void clickSignIn(){
        driver.get(websiteURL);
        driver.manage().window().maximize();
        driver.findElement(locators.signInButton).click();
    }
}
