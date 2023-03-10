package org.example.slidopages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class BasicSetupPage {

    protected WebDriver driver;

    public BasicSetupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDownByPage(int numberOfTimes) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,arguments[0]*350)", numberOfTimes);
    }

    public void scrollUpByPage(int numberOfTimes) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,arguments[0]*-350)", numberOfTimes);
    }

    public void enterText(WebElement element, String keyValue) {
        webDriverWaitForVisibility(element);
        element.clear();
        element.sendKeys(keyValue);
    }

    public void clickOnElement(WebElement element) {
        webDriverWaitForVisibility(element);
        element.click();
    }

    public void webDriverWaitForVisibility(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void mouseHoverOnMainOption(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void mouseHoverOnSubOption(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void pauseScreen() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void openNewTab(String url) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(url);
    }

    public void switchToParentTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void paste() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v")).build().perform();
    }

    public void rightClick() {
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("ID"));
        actions.contextClick(elementLocator).perform();
    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}

