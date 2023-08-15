package testcases;

import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {
    @Test
    public void fillSignUp() throws InterruptedException {
        signUpPage.openRegistrationPage();
        signUpPage.fillRegistrationForms();
    }
}
