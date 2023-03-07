package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventsPageTest extends BasicSetupPageTest {

    @Test(priority = 1)
    public void openInParticipantModeTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertTrue(eventsPage.openEventInParticipantMode());
    }

    @Test(priority = 2)
    public void openInPresentModeTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertTrue(eventsPage.openEventInPresentMode());
    }

    @Test(priority = 3)
    public void openEventTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertEquals(eventsPage.openEvent(), "Digital Gatherings");
    }

    @Test(priority = 4)
    public void shareAccessTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertTrue(eventsPage.shareAccessOfEvent("nancydaniel@gmail.com"));
    }

    @Test(priority = 5)
    public void duplicateEventTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertEquals(eventsPage.duplicateEvent(), "WaterFalls");
    }

    @Test(priority = 6)
    public void createNewSlidoInEventsPageTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertTrue(eventsPage.createSlidoEvent("02/22/2023", "02/24/2023", "River Stone Events"));
    }

    @Test(priority = 7)
    public void deleteEventTest() {
        EventsPage eventsPage = PageFactory.initElements(driver, EventsPage.class);
        Assert.assertFalse(eventsPage.deleteEvent());
    }
}
