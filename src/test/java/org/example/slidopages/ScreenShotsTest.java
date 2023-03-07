package org.example.slidopages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenShotsTest extends BasicSetupPageTest {

    @Test
    public void screenShotPageTest() throws IOException {
        ScreenShots screenShots = PageFactory.initElements(driver, ScreenShots.class);
        screenShots.takeScreenShotsOfSlidoWebsite();
    }
}
