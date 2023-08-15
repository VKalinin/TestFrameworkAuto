package testcases;

import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @Test
    public void emailPasswordFieldsAndLoginButtonCheck() throws InterruptedException
    {
    homePage.clickSignIn();
    signInPage.credentialsAndLogInButtonCheck();
    signInPage.credentialsAndLogInButtonCheckReport();
    }
}
