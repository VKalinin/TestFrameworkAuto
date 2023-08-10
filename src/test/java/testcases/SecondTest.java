package testcases;

import PageObjects.*;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTest extends BaseTest {
    String expectedResult;
    String actualResult;
    @Test
    public void openSignInPage() throws InterruptedException {
        homePage.clickSignIn();
        actualResult = driver.getTitle();
        expectedResult = "Sign in";
        //String assert passed
        Assert.assertEquals(actualResult,expectedResult);
        System.out.println("Title is correct");
    }
    @Test
    public void openSignInPageSoftAssert() throws InterruptedException {
        homePage.clickSignIn();
        actualResult = driver.getTitle();
        expectedResult = "Sign in";
        //String soft assert passed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult,expectedResult);
        System.out.println("Title is correct");
        softAssert.assertAll();
    }
    @Test
    public void openingTwoTabsAndChangingToTheFirst(){
        homePage.openHomePagePlusNewTabAndScroll();
    }
    @Test
    public void emailPasswordFieldsAndLoginButtonCheck() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.credentialsAndLogInButtonCheck();
        signInPage.credentialsAndLogInButtonCheckReport();
    }
    @Test
    public void fillUpCredentials() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
    }
    @Test
    public void invalidEmailAndPassword() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
    }
    @Test
    public void validateErrorAfterInvalidInformation() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
        signInPage.errorMessageIsDisplayed();
        //boolean assert passed
        boolean errorMessageIsDisplayedTrue = true;
        Assert.assertEquals(errorMessageIsDisplayedTrue, signInPage.errorMessageIsDisplayedAfterCredentials());
    }
    @Test
    public void validateErrorAfterInvalidInformationSoftAssert() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.fillInTheSignInForm();
        signInPage.errorMessageIsDisplayed();
        //boolean soft assert failed
        SoftAssert softAssert = new SoftAssert();
        boolean errorMessageIsDisplayedTrue = false;
        softAssert.assertEquals(errorMessageIsDisplayedTrue, signInPage.errorMessageIsDisplayedAfterCredentials());
        softAssert.assertAll();
    }
    @Test
    public void rememberMeCheckedByDefaultValidation() throws InterruptedException {
        homePage.clickSignIn();
        signInPage.rememberMeIsChecked();
    }
    @Test
    public void fillSignUp() throws InterruptedException {
        signUpPage.openRegistrationPage();
        signUpPage.fillRegistrationForms();
    }
    @Test
    public void numberOfDropDownElementsRegistrationPage(){
        int actualResultInt = 14;
        signUpPage.openRegistrationPage();
        //int assert passed
        Assert.assertEquals(actualResultInt,signUpPage.numberOfDropDownElements());
        System.out.println("Actual result = " + actualResultInt + "\nExpected result = " + signUpPage.numberOfDropDownElements());
    }
    @Test
    public void numberOfDropDownElementsRegistrationPageSoftAssert(){
        int actualResultInt = 13;
        signUpPage.openRegistrationPage();
        //int soft assert failed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResultInt,signUpPage.numberOfDropDownElements());
        softAssert.assertAll();
    }

    @Test
    public void courseGalleryPage() throws InterruptedException {
        homePage.openHomePage();
        courseGalleryPage.openCourseGalleryPage();
        //Int assert failed
        Assert.assertEquals(courseGalleryPage.actualNumberOfElements,courseGalleryPage.expectedNumberOfElements);
        courseGalleryPage.openTestingTab();
        courseGalleryPage.openSql101TestTab();
        courseGalleryPage.backToHomePage();
    }

    @Test
    public void courseGalleryPageSoftAssert() throws InterruptedException {
        homePage.openHomePage();
        courseGalleryPage.openCourseGalleryPage();
        int expectedNumberOfElements = 3;
        //Int soft assert failed
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(courseGalleryPage.actualNumberOfElements,expectedNumberOfElements);
        softAssert.assertAll();
        courseGalleryPage.openTestingTab();
        courseGalleryPage.openSql101TestTab();
        courseGalleryPage.backToHomePage();
    }

    @Test
    public void signUpPageAllElementsInTheDropDown(){
        homePage.openHomePage();
        homePage.clickSignUp();
        signUpPage.writeDropDownInConsole();
    }
}
