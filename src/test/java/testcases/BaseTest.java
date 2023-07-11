package testcases;

import PageObjects.CourseGalleryPage;
import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    CourseGalleryPage courseGalleryPage;



    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        signUpPage = new SignUpPage(driver);
        courseGalleryPage = new CourseGalleryPage(driver);


    }
    @AfterTest
    public void driverClose(){
        driver.close();
    }
}
