package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LivePollsTest extends BasicSetupPageTest {

    @Test( priority = 1)
    public void createMultipleChoicePollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createMultipleChoicePoll("Which mythical creature would make the best pet?", "Unicorn", "Fairy", "Dragon", "Dragulla"));
    }

    @Test( priority = 2)
    public void runMultipleChoicePollInPresentTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.runMultipleChoicePollInPresent());
    }

    @Test( priority = 3)
    public void createWordCloudPollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createWordCloudPoll("Using one word, how are you feeling right now?"));
    }

    @Test( priority = 4)
    public void createQuizPollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createQuizPoll("Which language has the more native speakers?", "English", "Spanish", "French"));
    }

    @Test( priority = 5)
    public void createRatingPollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createRatingPoll("How much would you like to rate this event?", "1", "5"));
    }

    @Test( priority = 6)
    public void createOpenTextPollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createOpenTextPoll("What company was originally called \"Cadabra\"?"));
    }

    @Test( priority = 7)
    public void createRankingPollTest() {
        LivePolls livePolls = PageFactory.initElements(driver, LivePolls.class);
        Assert.assertTrue(livePolls.createRankingPoll("Rank your preference on the sport you like ?", "Sky diving", "Bungee jumping", "Free climbing"));
    }
}
