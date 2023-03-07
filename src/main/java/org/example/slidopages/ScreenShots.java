package org.example.slidopages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends BasicSetupPage {

    public ScreenShots(WebDriver driver) {
        super(driver);
    }

    public void takeScreenShotsOfSlidoWebsite() throws IOException {
        TakesScreenshot src = (TakesScreenshot) driver;
        File sourceSnap = src.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Anand Sambanthan\\Desktop\\Java Programming\\Slido\\src\\screenshots\\img.png");
        FileHandler.copy(sourceSnap, destination);
    }
}
