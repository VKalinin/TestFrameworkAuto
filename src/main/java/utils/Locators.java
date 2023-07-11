package utils;

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

   //Registration page
    public By name = By.xpath("//input[@id='name']");
    public By surname = By.xpath("//input[@id='surname']");
    public By email = By.xpath("//input[@id='email']");
    public By createPassword = By.xpath("//input[@id='password']");
    public By confirmPassword = By.xpath("//input[@id='password-confirm']");

    //course gallery page
    public By testingTab = By.xpath("//div[@id='app']/div[2]/div[2]/div[2]");
    public By sql101TestLab = By.xpath("//a[@target='_blank']//div[@class='quiz-item-button continue-button']");
}
