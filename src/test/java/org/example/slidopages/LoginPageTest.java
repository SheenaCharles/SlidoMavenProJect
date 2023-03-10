package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BasicSetupPageTest {

    @Test(priority = 0)
    public void loginTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.doLogin();
    }

    @Test(priority = 1)
    public void loginWithCredentialsTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.doLoginWithCredentials(getEmail(), getPassword());
    }

    @Test(priority = 2)
    public void loginWithWrongCredentialsTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Assert.assertTrue(loginPage.doLoginWithWrongCredentials("abc@gmail.com", "123456"));
    }
}

