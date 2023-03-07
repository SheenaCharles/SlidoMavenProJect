package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventCodeTest extends BasicSetupPageTest {

    @Test(priority = 1)
    public void checkEventCodeIsValidTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.enterEventCodeAsParticipantOne("https://www.slido.com/","Digital123"));
    }

    @Test(priority = 2)
    public void checkEventCodeIsInValidTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertFalse(eventCode.enterEventCodeAsParticipantOne("https://www.slido.com/","abcdef"));
    }

    @Test(priority = 3)
    public void chooseAnswerOptionOneInMultiChoicePollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        eventCode.activateMultiChoicePoll();
        Assert.assertTrue(eventCode.chooseAnswerOptionOneInMultiChoicePollAsParticipant("https://www.slido.com/","Digital123"));
    }

    @Test(priority = 4)
    public void chooseAnswerOptionTwoInMultiChoicePollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.chooseAnswerOptionTwoInMultiChoicePollAsParticipant("https://www.slido.com/","Digital123"));
    }

    @Test(priority = 5)
    public void chooseAnswerOptionThreeInMultiChoicePollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.chooseAnswerOptionThreeInMultiChoicePollAsParticipant("https://www.slido.com/","Digital123"));
    }

    @Test(priority = 6)
    public void chooseAnswerOptionFourInMultiChoicePollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.chooseAnswerOptionFourInMultiChoicePollAsParticipant("https://www.slido.com/","Digital123"));
    }

    @Test(priority = 7)
    public void sendWordInWordCloudPollAsParticipantOneTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        eventCode.activateWordCloudPoll();
        Assert.assertTrue(eventCode.sendWordInWordCloudPollAsParticipantOne("https://www.slido.com/","Digital123", "Happy"));
    }

    @Test(priority = 8)
    public void sendWordInWordCloudPollAsParticipantTwoTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.sendWordInWordCloudPollAsParticipantTwo("https://www.slido.com/","Digital123", "Excited"));
    }

    @Test(priority = 9)
    public void chooseAnswerOptionOneInQuizPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        eventCode.activateQuizPoll();
        Assert.assertTrue(eventCode.chooseAnswerOptionOneInQuizPollAsParticipant("https://www.slido.com/","EventCode123", "Noorhan Aswath"));
    }

    @Test(priority = 10)
    public void chooseAnswerOptionTwoInQuizPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.chooseAnswerOptionTwoInQuizPollAsParticipant("https://www.slido.com/","EventCode123", "Nancy Daniel"));
    }

    @Test(priority = 11)
    public void chooseAnswerOptionThreeInQuizPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.chooseAnswerOptionThreeInQuizPollAsParticipant("https://www.slido.com/","EventCode123", "Sharwat Alan"));
    }

    @Test(priority = 12)
    public void giveRatingOneInRatingPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        eventCode.activateRatingPoll();
        Assert.assertTrue(eventCode.giveRatingOneInRatingPollAsParticipant("https://www.slido.com/","EventCode123"));
    }

    @Test(priority = 13)
    public void giveRatingTwoInRatingPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.giveRatingTwoInRatingPollAsParticipant("https://www.slido.com/","EventCode123"));
    }

    @Test(priority = 14)
    public void giveRatingThreeInRatingPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.giveRatingThreeInRatingPollAsParticipant("https://www.slido.com/","EventCode123"));
    }

    @Test(priority = 15)
    public void giveRatingFourInRatingPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.giveRatingFourInRatingPollAsParticipant("https://www.slido.com/","EventCode123"));
    }

    @Test(priority = 16)
    public void giveRatingFiveInRatingPollAsParticipantTest() {
        EventCode eventCode = PageFactory.initElements(driver, EventCode.class);
        Assert.assertTrue(eventCode.giveRatingFiveInRatingPollAsParticipant("https://www.slido.com/","EventCode123"));
    }
}
