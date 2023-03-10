package org.example.slidopages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingFromAdminAsParticipantModePage extends BasicSetupPage {

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    @FindBy(css = "body admin-ui-view > admin-event > section > admin-event-header-wrapper > admin-event-header-desktop > div > div > div > div > div:nth-child(2) > button")
    protected WebElement  audienceQandAButton;

    @FindBy(css = "button[class='event-participant-toggle z1 ng-star-inserted']")
    protected WebElement participantModeButton;

    @FindBy(css = "div.poll__footer > div > button")
    protected WebElement editResponseButtonInParticipantMode;

    @FindBy(css = "div > label:nth-child(1)")
    protected WebElement answerOption1;

    @FindBy(css = "admin-event-polls-horizontal-bars-results > div > div:nth-child(1) > div > span")
    protected WebElement choosenAnswerInSlidoPage;

    @FindBy(css = "div.firstOption > div")
    protected WebElement choosenAnswerInParticipantMode;

    @FindBy(css = "div > label:nth-child(2)")
    protected WebElement answerOption2;

    @FindBy(css = "button[class='inset-tab-focus']")
    protected WebElement questionInputTabInQandAPage;

    @FindBy(css = "question-field")
    protected WebElement questionInputTabInAskTheSpeakerPage;

    @FindBy(css = "#app > div:nth-child(6) > div > div > div > form > div > button.btn-primary")
    protected WebElement sendButton;

    @FindBy(css = "div.ep-participant__iframe")
    protected WebElement participantModeFrame;

    public TestingFromAdminAsParticipantModePage(WebDriver driver) {
        super(driver);
    }

    public boolean checkPollIsPresentInParticipantMode() {
        clickOnElement(secondSlidoEvent);
        clickOnElement(participantModeButton);
        pauseScreen();
        return participantModeFrame.isDisplayed();
    }

    public boolean editResponseToPollInParticipantMode() {
        secondSlidoEvent.click();
        participantModeButton.click();
        pauseScreen();
//        editResponseButtonInParticipantMode.click();
        answerOption1.click();
        sendButton.click();
        pauseScreen();
        return choosenAnswerInSlidoPage.equals(choosenAnswerInParticipantMode);
    }
}
