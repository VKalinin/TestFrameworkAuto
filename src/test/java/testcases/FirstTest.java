package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void openWebSite() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void openSignInPage() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']")).click();

    }
    @Test
    public void EmailPasswordFieldsAndLoginButtonCheck() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']")).click();

        System.out.println("Email field is displayed: " + driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println("Password field is displayed: " + driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println("Login Button is displayed: " + driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).isDisplayed());

    }
    @Test
    public void InvalidEmailAndPassword() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("v.kalinin.m94@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123asd");
        driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).sendKeys(Keys.ENTER);

    }
    @Test
    public void ValidateErrorAfterInvalidInformation() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("v.kalinin.m94@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123asd");
        driver.findElement(By.xpath("//button[@class='auth-page-main-block-form-submit-button']")).click();

        Thread.sleep(5000);

        System.out.println("Email is incorrect: " + driver.findElement(By.xpath("//p[contains(text(),'email is incorrect')]")).isDisplayed());

    }
    @Test
    public void RememberMeCheckedByDefaultValidation() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\KalininTestAutomationFramework\\src\\test\\resources\\executables\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://test.my-fork.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']")).click();

        Thread.sleep(2000);

        System.out.println("Remember Me checked by default: " + driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());

    }
}
