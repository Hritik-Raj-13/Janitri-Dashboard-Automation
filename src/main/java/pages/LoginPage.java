package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    // These are the Locators accordding to the actual DOM
    private By emailField = By.id("formEmail"); // Adjust locator as per actual DOM
    private By passwordField = By.id("formPassword");
    private By loginButton = By.cssSelector("button.login-button");
    private By passwordToggle = By.cssSelector("img.password-visible");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Here are the methods
    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        WebElement pwd = driver.findElement(passwordField);
        return pwd.getAttribute("type").equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(passwordToggle).click();
    }

    public String getErrorMessage() {
        WebElement errorMsg = driver.findElement(By.cssSelector(".error-message")); // Update locator
        return errorMsg.getText();
    }

    public boolean areElementsPresent() {
        return driver.findElement(emailField).isDisplayed()
                && driver.findElement(passwordField).isDisplayed()
                && driver.findElement(loginButton).isDisplayed()
                && driver.findElement(passwordToggle).isDisplayed();
    }
}
