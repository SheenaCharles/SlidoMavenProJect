package org.example.slidopages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BasicSetupPageTest {

    @Test
    public void logoutTest() {
        Logout logout = PageFactory.initElements(driver, Logout.class);
        Assert.assertTrue(logout.logOut());
    }
}
