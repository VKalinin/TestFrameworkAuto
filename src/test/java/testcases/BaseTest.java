package testcases;

import PageObjects.CourseGalleryPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {

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
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void driverQuit(){
        driver.quit();
    }
}
