package org.example.slidopages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LivePolls extends BasicSetupPage {

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    /**
     * admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)
     * nth-child(n) == nth number of SlidoEvent available in the Event page
     */

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    @FindBy(css = "admin-event-polls-create-poll-button > button > div > span")
    protected WebElement createPollButton;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > button:nth-child(1) > span")
    protected WebElement multipleChoiceOption;

    @FindBy(css = "textarea[data-cy='poll-question-title-textarea']")
    protected WebElement questionInput;

    @FindBy(css = "div[id^='cdk-drop-list'] > div:nth-child(1) > div > mat-form-field > div > div[class^='mat-form-field-flex'] > div textarea")
    protected WebElement answerOption1Input;

    @FindBy(css = "div[id^='cdk-drop-list'] > div:nth-child(2) > div > mat-form-field > div > div[class^='mat-form-field-flex'] > div textarea")
    protected WebElement answerOption2Input;

    @FindBy(css = "div[id^='cdk-drop-list'] > div:nth-child(3) > div > mat-form-field > div > div[class^='mat-form-field-flex'] > div textarea")
    protected WebElement answerOption3Input;

    @FindBy(css = "div[id^='cdk-drop-list'] > div:nth-child(4) > div > mat-form-field > div > div[class^='mat-form-field-flex'] > div textarea")
    protected WebElement answerOption4Input;

    @FindBy(css = "#EventPollDialogNew > admin-event-polls-poll-dialog > div > div > div > div > button")
    protected WebElement launchButton;

    @FindBy(css = "button[data-cy='create-poll-modal-save-button-desktop']")
    protected WebElement saveButton;

    @FindBy(css = "button[data-cy='present-button']")
    protected WebElement presentButton;

    @FindBy(css = "admin-events-event-item.event-item--last > div > div > div > div:nth-child(1)")
    protected WebElement lastSlidoEvent;

    @FindBy(css = "div[class^='mat-menu-panel'] > div > div > button:nth-child(3)")
    protected WebElement quizOption;

    @FindBy(css = "div[class^='mat-menu-panel'] > div > div > button:nth-child(2)")
    protected WebElement wordCloudOption;

    @FindBy(css = "div[class^='mat-menu-panel'] > div > div > button:nth-child(4)")
    protected WebElement ratingOption;

    @FindBy(css = "div[class^='mat-menu-panel'] > div > div > button:nth-child(6)")
    protected WebElement rankingOption;

    @FindBy(css = "div[class^='mat-menu-panel'] > div > div > button:nth-child(5)")
    protected WebElement openTextOption;

    @FindBy(css = "input[data-cy='low-score-label']")
    protected WebElement lowRatingInput;

    @FindBy(css = "input[data-cy='high-score-label']")
    protected WebElement highRatingInput;

    @FindBy(css = "button[data-cy='mark-correct']")
    protected WebElement correctOption;

    @FindBy(css = "div:nth-child(1) > div > admin-event-polls-card-poll > admin-event-polls-card-base > div > div > div > div > div > span.desktop-buttons > button > svg > path:nth-child(2)")
    protected WebElement activatePollButton;

    public LivePolls(WebDriver driver) {
        super(driver);
    }

    public boolean createMultipleChoicePoll(String question, String option1, String option2, String option3, String option4) {
        clickOnElement(firstSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(multipleChoiceOption);
        enterText(questionInput, question);
        clickOnElement(answerOption1Input);
        enterText(answerOption1Input, option1);
        clickOnElement(answerOption2Input);
        enterText(answerOption2Input, option2);
        clickOnElement(answerOption3Input);
        enterText(answerOption3Input, option3);
        clickOnElement(answerOption4Input);
        enterText(answerOption4Input, option4);
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }

    public boolean runMultipleChoicePollInPresent() {
        clickOnElement(firstSlidoEvent);
        clickOnElement(presentButton);
        pauseScreen();
        return driver.getPageSource().contains("slido.com");
    }

    public void activatePollInEvent() {
        clickOnElement(firstSlidoEvent);
        clickOnElement(activatePollButton);
    }

    public boolean createWordCloudPoll(String question) {
        clickOnElement(firstSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(wordCloudOption);
        enterText(questionInput, question);
        pauseScreen();
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }

    public boolean createQuizPoll(String question, String option1, String option2, String option3) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(quizOption);
        enterText(questionInput, question);
        clickOnElement(answerOption1Input);
        enterText(answerOption1Input, option1);
        clickOnElement(answerOption2Input);
        enterText(answerOption2Input, option2);
        clickOnElement(answerOption3Input);
        enterText(answerOption3Input, option3);
        clickOnElement(correctOption);
        pauseScreen();
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }

    public boolean createRatingPoll(String question, String lowRating, String highRating) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(ratingOption);
        enterText(questionInput, question);
        enterText(lowRatingInput, lowRating);
        enterText(highRatingInput, highRating);
        pauseScreen();
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }

    public boolean createOpenTextPoll(String question) {
        clickOnElement(lastSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(openTextOption);
        enterText(questionInput, question);
        pauseScreen();
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }

    public boolean createRankingPoll(String question, String option1, String option2, String option3) {
        clickOnElement(lastSlidoEvent);
        clickOnElement(createPollButton);
        clickOnElement(rankingOption);
        enterText(questionInput, question);
        clickOnElement(answerOption1Input);
        enterText(answerOption1Input, option1);
        clickOnElement(answerOption2Input);
        enterText(answerOption2Input, option2);
        clickOnElement(answerOption3Input);
        enterText(answerOption3Input, option3);
        pauseScreen();
        clickOnElement(saveButton);
        pauseScreen();
        return driver.getPageSource().contains("Poll created.");
    }
}
