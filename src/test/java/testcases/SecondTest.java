package testcases;

import PageObjects.HomePage;
import PageObjects.SignUpPage;
import PageObjects.SignInPage;
import PageObjects.SignInPage;
import PageObjects.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void openSignInPage() throws InterruptedException {
        homePage.clickSignIn();
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
    public void courseGalleryPage() throws InterruptedException {
        homePage.openHomePage();
        courseGalleryPage.openCourseGalleryPage();
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
