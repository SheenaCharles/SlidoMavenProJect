package org.example.slidopages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasicSetupPage {

    @FindBy(css = "button > admin-user-initials > span")
    protected WebElement userAccountIcon;

    @FindBy(css = "#user-dropdown-menu > div.py4 > li:nth-child(11)")
    protected WebElement logoutOption;

    public Logout(WebDriver driver) {
        super(driver);
    }

    public boolean logOut() {
        mouseHoverOnMainOption(userAccountIcon);
        clickOnElement(userAccountIcon);
        clickOnElement(logoutOption);
        pauseScreen();
        return driver.getCurrentUrl().equals("https://www.slido.com/");
    }
}
