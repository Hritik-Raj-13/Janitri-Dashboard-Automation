package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertFalse(loginPage.isLoginButtonEnabled(),
                "Login button should be disabled when fields are empty");
    }

    @Test
    public void testInvalidLoginShowErrorMsg() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("random@test.com");
        loginPage.enterPassword("WrongPass");
        loginPage.clickLogin();
        String error = loginPage.getErrorMessage();
        System.out.println("Error Message: " + error);
        Assert.assertTrue(error.toLowerCase().contains("invalid") || error.toLowerCase().contains("error"),
                "Proper error message should be displayed for invalid login");
    }

    @Test
    public void testPasswordMaskedbutton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("dummyPassword");
        Assert.assertTrue(loginPage.isPasswordMasked(), "Password should be masked by default");

        loginPage.togglePasswordVisibility();
        Assert.assertFalse(loginPage.isPasswordMasked(), "Password should be visible after toggling");
    }

    @Test
    public void testPageElementsPresence() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.areElementsPresent(),
                "All login page elements should be present");
    }
}

