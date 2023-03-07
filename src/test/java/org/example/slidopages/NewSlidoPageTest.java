package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewSlidoPageTest extends BasicSetupPageTest {

    @Test ( priority = 1)
    public void copySlidoEventLinkTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.copySlidoEventLink());
    }

    @Test (priority = 2)
    public void downloadSlidoEventQRCodeTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.downloadSlidoEventQRCode());
        newSlidoPage.deleteDownloadedFile();
    }

    @Test ( priority = 3)
    public void inviteCollaboratorsTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.inviteCollaborators("nancydaniel@gmail.com"));
    }

    @Test (priority = 4)
    public void editEventNameTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertEquals(newSlidoPage.changeEventName("The Watercolor Orchid Planners"), "The Watercolor Orchid Planners");
    }

    @Test (priority = 5)
    public void editEventCodeTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertEquals(newSlidoPage.changeEventCode("EventCode123"), "#EventCode123");
    }

    @Test (priority = 6)
    public void editEventDateTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.changeEventDateInSettings("March 1, 2023", "March 6, 2023"));
    }

    @Test (priority = 7)
    public void copyEventLinkInSettingsTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.copyEventLinkInSettings());
    }

    @Test (priority = 8)
    public void editLocationInSettingsTest() {
        NewSlidoPage newSlidoPage = PageFactory.initElements(driver, NewSlidoPage.class);
        Assert.assertTrue(newSlidoPage.editLocationInSettings("Toronto, Canada"));
    }
}
