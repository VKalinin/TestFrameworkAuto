package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTestSuite extends BaseTest {
    String expectedResult;
    String actualResult;

    @Test
    public void openSignInPageSoft_Assert() throws InterruptedException {
        homePage.clickSignIn();
        actualResult = driver.getTitle();
        expectedResult = "Sign in";
        //String soft assert passed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);
        System.out.println("Title is correct \nFirst test done");
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
        signInPage.errorMessageIsDisplayed();
        //boolean soft assert failed
        boolean errorMessageIsDisplayedTrue = false;
        softAssert.assertEquals(errorMessageIsDisplayedTrue, signInPage.errorMessageIsDisplayedAfterCredentials());
        System.out.println("Second test done");
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
        signInPage.errorMessageIsDisplayed();
        //boolean soft assert failed
        softAssert.assertEquals(errorMessageIsDisplayedTrue, signInPage.errorMessageIsDisplayedAfterCredentials());
        System.out.println("Third test done");
        homePage.openHomePage();
        courseGalleryPage.openCourseGalleryPage();
        int expectedNumberOfElements = 3;
        //Int soft assert failed
        softAssert.assertEquals(courseGalleryPage.actualNumberOfElements,expectedNumberOfElements);
        softAssert.assertAll();
        courseGalleryPage.openTestingTab();
        courseGalleryPage.openSql101TestTab();
        courseGalleryPage.backToHomePage();
        System.out.println("Fourth test done");
    }
}
