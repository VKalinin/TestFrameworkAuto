package week5hw1;

import PageObjects.CourseGalleryPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraysAndDropdown {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    CourseGalleryPage courseGalleryPage;



    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "/Users/vladkalinin/Documents/GitHub/TestFrameworkAuto/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        signUpPage = new SignUpPage(driver);
        courseGalleryPage = new CourseGalleryPage(driver);


    }

    @Test
    public void arrayAndDropDown(){
        driver.get("https://test.my-fork.com/register");
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

    @AfterTest
    public void driverClose(){
        driver.close();
    }
}
