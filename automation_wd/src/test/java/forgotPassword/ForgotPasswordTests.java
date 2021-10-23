package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;


import static org.testng.Assert.*;


public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.fillEmail("ilonagorodzetskaya@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickSubmitButton();
        forgotPasswordPage.clickSubmitButton();
        assertTrue(emailSentPage.getErrorText().contains("Internal Server Error"), "no error text!");
    }


}
