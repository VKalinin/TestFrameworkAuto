package testcases;

import org.openqa.selenium.By;

public class Locators {
    public By logoLink = By.xpath("//img[@alt='logo']");
    public By courseGaleryLink = By.xpath("//div[@id='app']//a[@href='/quizzes-list']");
    public By signInButton = By.xpath("//div[@id='app']//a[@class='menu-item log-in-button']");
    public By signUpButton = By.xpath("//a[@class='menu-item sign-in-button']");
    public By emailField = By.xpath("//input[@id='email']");
    public By passwordField = By.xpath("//input[@id='password']");
    public By logInButton = By.xpath("//button[@class='auth-page-main-block-form-submit-button']");
    public By rememberMeChekbox = By.xpath("//input[@id='auth-page-remember-me']");
    public By incorrectEmail = By.xpath("//p[contains(text(),'email is incorrect')]");
}
