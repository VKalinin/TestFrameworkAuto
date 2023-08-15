package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTestSuite extends BaseTest {
    String expectedResult;
    String actualResult;

    @Test
    public void openSignInPageHardAssert() throws InterruptedException {
        homePage.clickSignIn();
        actualResult = driver.getTitle();
        expectedResult = "Sign in";
        //String assert passed
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println("Title is correct");
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
        signInPage.errorMessageIsDisplayed();
        //boolean assert passed
        boolean errorMessageIsDisplayedTrue = true;
        Assert.assertEquals(errorMessageIsDisplayedTrue, signInPage.errorMessageIsDisplayedAfterCredentials());
        int actualResultInt = 14;
        signUpPage.openRegistrationPage();
        //int assert passed
        Assert.assertEquals(actualResultInt, signUpPage.numberOfDropDownElements());
        System.out.println("Actual result = " + actualResultInt + "\nExpected result = " + signUpPage.numberOfDropDownElements());
        homePage.openHomePage();
        courseGalleryPage.openCourseGalleryPage();
        //Int assert failed
        Assert.assertEquals(courseGalleryPage.actualNumberOfElements, courseGalleryPage.expectedNumberOfElements);
        courseGalleryPage.openTestingTab();
        courseGalleryPage.openSql101TestTab();
        courseGalleryPage.backToHomePage();
    }
}