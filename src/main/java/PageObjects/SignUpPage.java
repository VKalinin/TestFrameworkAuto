package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Locators;

import java.util.ArrayList;
import java.util.List;

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
    public void writeDropDownInConsole(){
        WebElement searchDropDownElement;
        searchDropDownElement = driver.findElement(By.id("job-title"));
        Select searchDropDown = new Select(searchDropDownElement);
        List<WebElement> options = new ArrayList<>();
        options = searchDropDown.getOptions();
        int listSize = options.size();

        for(int i = 0; i < listSize; i++) {
            System.out.println(options.get(i).getText());
        }
    }
}
