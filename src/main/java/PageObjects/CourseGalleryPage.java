package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

import java.time.Duration;
import java.util.List;

public class CourseGalleryPage extends BaseMain{
    Locators locators = new Locators();
    String leftMenuBlock = "//div[@class='left-menu-block']/div";
    public int expectedNumberOfElements;
    public int actualNumberOfElements;
    WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public CourseGalleryPage(WebDriver driver){
        super(driver);
    }

    public void openCourseGalleryPage(){
        driver.findElement(locators.courseGalleryLink).click();
        List<WebElement> leftMenuBlockSize = driver.findElements(By.xpath(leftMenuBlock));
        expectedNumberOfElements = 3;
        actualNumberOfElements = leftMenuBlockSize.size();
    }

    public void openTestingTab() throws InterruptedException {

        driver.findElement(locators.testingTab);
    }

    public void openSql101TestTab() throws InterruptedException {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locators.sql101TestLab));
        driver.findElement(locators.sql101TestLab);
    }

    public void backToHomePage() throws InterruptedException {
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(locators.logoLink));
        driver.findElement(locators.logoLink);

    }

}
