package PageObjects;

import org.openqa.selenium.WebDriver;
import utils.Locators;

public class CourseGalleryPage extends BaseMain{
    Locators locators = new Locators();
    public CourseGalleryPage(WebDriver driver){

        super(driver);
    }

    public void openCourseGalleryPage(){
        driver.findElement(locators.courseGaleryLink).click();
    }

    public void openTestingTab() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(locators.testingTab);
    }

    public void openSql101TestTab() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(locators.sql101TestLab);
    }

    public void backToHomePage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(locators.logoLink);

    }

}
