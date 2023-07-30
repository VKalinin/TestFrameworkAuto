package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utils.Locators;

public class HomePage extends BaseMain {

    Locators locators = new Locators();


    public HomePage(WebDriver driver){
        super(driver);
    }
    String websiteURL = "https://test.my-fork.com/";

    public void openHomePage(){
        driver.get(websiteURL);
    }
    public void openHomePagePlusNewTabAndScroll(){
        driver.get(websiteURL);
        driver.switchTo().newWindow(WindowType.TAB);
        nextTab(0);
        scrollPage(2000);
        System.out.println("The page is scrolled down");
        scrollPage(-1500);
        System.out.println("The page is scrolled up");
    }
    public void clickSignIn(){
        driver.get(websiteURL);
        driver.findElement(locators.signInButton).click();
    }
    public void clickSignUp(){
        driver.get(websiteURL);
        driver.findElement(locators.signUpButton).click();
    }
}
