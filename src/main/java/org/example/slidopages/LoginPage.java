package org.example.slidopages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasicSetupPage {

    @FindBy(css = "#__next > div > div > nav > ul> li:nth-child(2) > a")
    protected WebElement LoginButtonInDashboard;

    @FindBy(id = "email")
    protected WebElement emailInput;

    @FindBy(css = "button[class^=auth-login--continue-btn")
    protected WebElement continueButton;

    @FindBy(id = "password")
    protected WebElement passwordInput;

    @FindBy(css = "button[data-cy='login-button']")
    protected WebElement loginButton;

    @FindBy(css = "button[data-ref='allow-btn']")
    protected WebElement acceptAllCookiesButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String expectedURL = "https://admin.sli.do/events";

    public void doLogin() {
        LoginButtonInDashboard.click();
    }

    public void doLoginWithCredentials(String email, String password) {
        LoginButtonInDashboard.click();
//        acceptAllCookiesButton.click();
        enterText(emailInput, email);
        continueButton.click();
        enterText(passwordInput, password);
        loginButton.click();
    }

    public boolean doLoginWithWrongCredentials(String email, String password) {
        LoginButtonInDashboard.click();
        acceptAllCookiesButton.click();
        enterText(emailInput, email);
        continueButton.click();
        enterText(passwordInput, password);
        loginButton.click();
        pauseScreen();
        return driver.getPageSource().contains("Sorry, you entered an incorrect email or password.");
    }
}
