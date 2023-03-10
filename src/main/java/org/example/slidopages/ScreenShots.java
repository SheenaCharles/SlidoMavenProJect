package org.example.slidopages;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends BasicSetupPage {

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    /**
     * admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)
     * nth-child(n) == nth number of SlidoEvent available in the Event page
     */

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    public ScreenShots(WebDriver driver) {
        super(driver);
    }

    public void takeScreenShotsOfSlidoWebsite() throws IOException {
        TakesScreenshot src = (TakesScreenshot) driver;
        File firstSnap = src.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Anand Sambanthan\\Desktop\\Java Programming\\Slido\\src\\screenshots\\img.png");
        FileHandler.copy(firstSnap, destination);
        pauseScreen();
        File secondSnap = firstSlidoEvent.getScreenshotAs(OutputType.FILE);
        File firstEventImage = new File("C:\\Users\\Anand Sambanthan\\Desktop\\Java Programming\\Slido\\src\\screenshots\\event1.png");
        FileHandler.copy(secondSnap, firstEventImage);
        pauseScreen();
        File thirdSnap = secondSlidoEvent.getScreenshotAs(OutputType.FILE);
        File secondEventImage = new File("C:\\Users\\Anand Sambanthan\\Desktop\\Java Programming\\Slido\\src\\screenshots\\event2.png");
        FileHandler.copy(thirdSnap, secondEventImage);
    }
}
