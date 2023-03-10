package org.example.slidopages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EventCode extends BasicSetupPage {

    @FindBy(id = "join-event-input")
    protected WebElement enterCodeHereInput;

    @FindBy(css = "#main > form > div > div > button")
    protected WebElement joinNowArrowIcon;

    @FindBy(css = "#live-tabpanel-polls > div > div > div> div > div > form > input")
    protected WebElement participantNameInput;

    @FindBy(css = "#live-tabpanel-polls > div > div > div> div > div > form > div > button")
    protected WebElement joinButton;

    /**
     * label:nth-child(n)  == nth Number of AnswerOption In Quiz Poll Event.
     */

    @FindBy(css = "div:nth-child(1) > div > div.poll-question__body-container > div > div> div > label:nth-child(1)")
    protected WebElement answerOption1;

    @FindBy(css = "div:nth-child(1) > div > div.poll-question__body-container > div > div> div > label:nth-child(2)")
    protected WebElement answerOption2;

    @FindBy(css = "div:nth-child(1) > div > div.poll-question__body-container > div > div> div > label:nth-child(3)")
    protected WebElement answerOption3;

    @FindBy(css = "div:nth-child(1) > div > div.poll-question__body-container > div > div> div > label:nth-child(4)")
    protected WebElement answerOption4;

    @FindBy(css = "div > label:nth-child(1) > span.MuiButtonBase-root > span")
    protected WebElement quizAnswerOption1;

    @FindBy(css = "div > label:nth-child(2) > span.MuiButtonBase-root > span")
    protected WebElement quizAnswerOption2;

    @FindBy(css = "div > label:nth-child(3) > span.MuiButtonBase-root > span")
    protected WebElement quizAnswerOption3;

    @FindBy(id = "poll-submit-button")
    protected WebElement sendButtonInPoll;

    @FindBy(css = "div.quiz-poll-question > div > div > div > button")
    protected WebElement sendButtonInQuizPoll;

    @FindBy(css = "admin-events-event-item.event-item--last > div > div > div > div:nth-child(1)")
    protected WebElement lastSlidoEvent;

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    /**
     * admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)
     * nth-child(n) == nth number of SlidoEvent available in the Event page
     */

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    @FindBy(css = "div > span:nth-child(2) > button > svg > path:nth-child(2)")
    protected WebElement activateQuiz;

    @FindBy(css = "button[data-cy='quiz-controls-right-button']")
    protected WebElement startQuiz;

    @FindBy(css = "div:nth-child(2) > div > admin-event-polls-card-poll > admin-event-polls-card-base > div > div > div > div > div > span.desktop-buttons > button > svg > path:nth-child(2)")
    protected WebElement activateSecondPollButton;

    @FindBy(css = "div:nth-child(2) > div > admin-event-polls-card-quiz-poll > admin-event-polls-card-base > div > div > div > div > div > span.desktop-buttons > button > svg > path:nth-child(2)")
    protected WebElement activateQuizPollButton;

    @FindBy(css = "div:nth-child(3) > div > admin-event-polls-card-poll > admin-event-polls-card-base > div > div > div > div > div > span.desktop-buttons > button > svg > path:nth-child(2)")
    protected WebElement activateThirdPollButton;

    @FindBy(css = "div > div:nth-child(2) > div > admin-event-polls-card-poll")
    protected WebElement multiChoicePoll;

    @FindBy(css = "div > div:nth-child(3) > div > admin-event-polls-card-poll")
    protected WebElement wordCloudPoll;

    @FindBy(css = "div > div:nth-child(2) > div > admin-event-polls-card-quiz-poll")
    protected WebElement quizPoll;

    @FindBy(css = "div > div:nth-child(3) > div > admin-event-polls-card-poll")
    protected WebElement ratingPoll;

    @FindBy(css = "div > div:nth-child(2) > div > admin-event-polls-card-poll")
    protected WebElement openTextPoll;

    @FindBy(css = "div > div:nth-child(3) > div > admin-event-polls-card-poll")
    protected WebElement rankingPoll;

    @FindBy(css = "admin-event-polls-horizontal-bars-results > div > div:nth-child(1) > div> span")
    protected WebElement choosenAnswerInMultiChoicePoll;

    @FindBy(css = "div > div:nth-child(1) > div.option__bar > div.option__fill.option__fill--highlighted")
    protected WebElement highLightedFirstAnswer;

    @FindBy(css = "div > div:nth-child(2) > div.option__bar > div.option__fill.option__fill--highlighted")
    protected WebElement highLightedSecondAnswer;

    @FindBy(css = "div > div:nth-child(3) > div.option__bar > div.option__fill.option__fill--highlighted")
    protected WebElement highLightedThirdAnswer;

    @FindBy(css = "div > div:nth-child(4) > div.option__bar > div.option__fill.option__fill--highlighted")
    protected WebElement highLightedFourthAnswer;

    @FindBy(css = "input[placeholder='Enter a word']")
    protected WebElement wordCloudInput;

    @FindBy(css = "div > div:nth-child(1) > div > div.option__fill")
    protected WebElement firstChoosenAnswerInQuiz;

    @FindBy(css = "div > div:nth-child(2) > div > div.option__fill")
    protected WebElement secondChoosenAnswerInQuiz;

    @FindBy(css = "div > div:nth-child(3) > div > div.option__fill")
    protected WebElement thirdChoosenAnswerInQuiz;

    @FindBy(css = "div > div> div.star:nth-child(1)")
    protected WebElement highLightedStar1;

    @FindBy(css = "div > div> div.star:nth-child(2)")
    protected WebElement highLightedStar2;

    @FindBy(css = "div > div> div.star:nth-child(3)")
    protected WebElement highLightedStar3;

    @FindBy(css = "div > div> div.star:nth-child(4)")
    protected WebElement highLightedStar4;

    @FindBy(css = "div > div> div.star:nth-child(5)")
    protected WebElement highLightedStar5;

    @FindBy(css = "form > div:nth-child(1) > div > div > div > div > div > div > div:nth-child(2) > div > svg > path")
    protected WebElement firstStarRating;

    @FindBy(css = "form > div:nth-child(1) > div > div > div > div > div > div > div:nth-child(3) > div > svg > path")
    protected WebElement secondStarRating;

    @FindBy(css = "form > div:nth-child(1) > div > div > div > div > div > div > div:nth-child(4) > div > svg > path")
    protected WebElement thirdStarRating;

    @FindBy(css = "form > div:nth-child(1) > div > div > div > div > div > div > div:nth-child(5) > div > svg > path")
    protected WebElement fourthStarRating;

    @FindBy(css = "form > div:nth-child(1) > div > div > div > div > div > div > div:nth-child(6) > div > svg > path")
    protected WebElement fifthStarRating;

    @FindBy(css = "button[aria-label='Edit response']")
    protected WebElement editResponse;

    @FindBy(css = "#live-tabpanel-polls > div > div > div > form > div.poll__footer > div > button")
    protected WebElement addResponse;

    public EventCode(WebDriver driver) {
        super(driver);
    }

    public void enterEventCode(String slidoUrl, String eventCode) {
        openNewTab(slidoUrl);
        enterText(enterCodeHereInput, eventCode);
        clickOnElement(joinNowArrowIcon);
    }

    public boolean enterEventCodeAsParticipantOne(String slidoUrl, String eventCode) {
        enterEventCode(slidoUrl, eventCode);
        pauseScreen();
        return driver.getCurrentUrl().contains("event");
    }

    public void activateMultiChoicePoll() {
        clickOnElement(firstSlidoEvent);
        mouseHoverOnMainOption(multiChoicePoll);
        clickOnElement(activateSecondPollButton);
    }

    public boolean chooseAnswerOptionOneInMultiChoicePollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(answerOption1);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        return highLightedFirstAnswer.isDisplayed();
    }

    public boolean chooseAnswerOptionTwoInMultiChoicePollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        clickOnElement(answerOption2);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        clickOnElement(firstSlidoEvent);
        pauseScreen();
        return highLightedSecondAnswer.isDisplayed();
    }

    public boolean chooseAnswerOptionThreeInMultiChoicePollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        clickOnElement(answerOption3);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        clickOnElement(firstSlidoEvent);
        pauseScreen();
        return highLightedThirdAnswer.isDisplayed();
    }

    public boolean chooseAnswerOptionFourInMultiChoicePollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        clickOnElement(answerOption4);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        clickOnElement(firstSlidoEvent);
        pauseScreen();
        return highLightedFourthAnswer.isDisplayed();
    }

    public void activateWordCloudPoll() {
        clickOnElement(firstSlidoEvent);
        mouseHoverOnMainOption(wordCloudPoll);
        clickOnElement(activateThirdPollButton);
    }

    public boolean sendWordInWordCloudPollAsParticipantOne(String slidoUrl, String eventCode, String word) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(wordCloudInput);
        enterText(wordCloudInput, word);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        return driver.getPageSource().contains("Happy");
    }

    public boolean sendWordInWordCloudPollAsParticipantTwo(String slidoUrl, String eventCode, String word) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(addResponse);
        clickOnElement(wordCloudInput);
        enterText(wordCloudInput, word);
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        clickOnElement(firstSlidoEvent);
        pauseScreen();
        pauseScreen();
        return driver.getPageSource().contains("Excited");
    }

    public void activateQuizPoll() {
        clickOnElement(secondSlidoEvent);
        mouseHoverOnMainOption(quizPoll);
        clickOnElement(activateQuizPollButton);
        clickOnElement(startQuiz);
    }

    public boolean chooseAnswerOptionOneInQuizPollAsParticipant(String slidoUrl, String eventCode, String name) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        enterText(participantNameInput, name);
        clickOnElement(joinButton);
        pauseScreen();
        clickOnElement(quizAnswerOption1);
        clickOnElement(sendButtonInQuizPoll);
        pauseScreen();
        switchToParentTab();
        pauseScreen();
        return firstChoosenAnswerInQuiz.isDisplayed();
    }

    public boolean chooseAnswerOptionTwoInQuizPollAsParticipant(String slidoUrl, String eventCode, String name) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(quizAnswerOption2);
        clickOnElement(sendButtonInQuizPoll);
        switchToParentTab();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return secondChoosenAnswerInQuiz.isDisplayed();
    }

    public boolean chooseAnswerOptionThreeInQuizPollAsParticipant(String slidoUrl, String eventCode, String name) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(quizAnswerOption3);
        clickOnElement(sendButtonInQuizPoll);
        switchToParentTab();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return thirdChoosenAnswerInQuiz.isDisplayed();
    }

    public void activateRatingPoll() {
        clickOnElement(secondSlidoEvent);
        mouseHoverOnMainOption(ratingPoll);
        clickOnElement(activateThirdPollButton);
    }

    public boolean giveRatingOneInRatingPollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        Actions act =  new Actions(driver);
        act.moveToElement(firstStarRating).click().build().perform();
        clickOnElement(sendButtonInPoll);
        pauseScreen();
        switchToParentTab();
        pauseScreen();
        return highLightedStar1.isDisplayed();
    }

    public boolean giveRatingTwoInRatingPollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        Actions act =  new Actions(driver);
        act.moveToElement(secondStarRating).click().build().perform();
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return highLightedStar2.isDisplayed();
    }

    public boolean giveRatingThreeInRatingPollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        Actions act =  new Actions(driver);
        act.moveToElement(thirdStarRating).click().build().perform();
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return highLightedStar3.isDisplayed();
    }

    public boolean giveRatingFourInRatingPollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        Actions act =  new Actions(driver);
        act.moveToElement(fourthStarRating).click().build().perform();
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return highLightedStar4.isDisplayed();
    }

    public boolean giveRatingFiveInRatingPollAsParticipant(String slidoUrl, String eventCode) {
        enterEventCodeAsParticipantOne(slidoUrl, eventCode);
        clickOnElement(editResponse);
        Actions act =  new Actions(driver);
        act.moveToElement(fifthStarRating).click().build().perform();
        clickOnElement(sendButtonInPoll);
        switchToParentTab();
        pauseScreen();
        clickOnElement(secondSlidoEvent);
        pauseScreen();
        return highLightedStar5.isDisplayed();
    }
}















