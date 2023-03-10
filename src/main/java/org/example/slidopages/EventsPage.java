package org.example.slidopages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class EventsPage extends BasicSetupPage {

    @FindBy(id = "events-create-button")
    protected WebElement newSlidoButton;

    @FindBy(id = "createSlidoDateFrom")
    protected WebElement startDateInput;

    @FindBy(id = "createSlidoDateTo")
    protected WebElement endDateInput;

    @FindBy(id = "name")
    protected WebElement slidoNameInput;

    @FindBy(className = "create-slido-button")
    protected WebElement createSlidoButton;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > div:nth-child(1) > button:nth-child(1)")
    protected WebElement participantModeOption;

    @FindBy(css = "div > div > div.app__header__title > span")
    protected WebElement headerOfParticipantMode;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > div:nth-child(1) > button:nth-child(2)")
    protected WebElement presentModeOption;

    @FindBy(css = ".event-item--first.ng-star-inserted > div > div.event-item__actions > button")
    protected WebElement dropDownOptions;

    @FindBy(css = "input[data-placeholder='Event name']")
    protected WebElement eventNameInput;

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    /**
     * admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)
     * nth-child(n) == nth number of SlidoEvent available in the Event page
     */

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > button:nth-child(8)")
    protected WebElement deleteOption;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > button:nth-child(6)")
    protected WebElement duplicateOption;

    @FindBy(css = "mat-dialog-actions > button.admin-button--red-color> div")
    protected WebElement deleteButton;

    @FindBy(css = "admin-events-duplicate > div > div.text-right > button.admin-button--blue-color")
    protected WebElement duplicateButton;

    @FindBy(css = "div[id^='mat-menu-panel'] > div > div > button:nth-child(3)")
    protected WebElement openOption;

    @FindBy(css = "div:nth-child(4) > admin-is-allowed-event > div > fieldset > admin-is-allowed-lock > div > button")
    protected WebElement shareAccessOption;

    @FindBy(css = "div.mat-tooltip-trigger > div")
    protected WebElement eventNameInDashBoard;

    @FindBy(css = "#share-dropdown-button > div")
    protected WebElement shareButton;

    @FindBy(css = "#share-dropdown-menu > admin-is-allowed-event > div > fieldset > admin-is-allowed-lock > div > li > div > div:nth-child(2) > div.fw-500")
    protected WebElement inviteCollaboratorsOption;

    @FindBy(css = "input[data-cy='email-input']")
    protected WebElement emailInputInInviteCollaboratorsOption;

    @FindBy(css = "div > div > div:nth-child(1) > div.esc-item__action")
    protected WebElement inviteButtonInInviteCollaboratorsOption;

    @FindBy(css = "button[data-cy='save-settings']")
    protected WebElement saveButtonInInviteCollaboratorsOption;


    public EventsPage(WebDriver driver) {
        super(driver);
    }

    public boolean openEventInParticipantMode() {
        clickOnElement(dropDownOptions);
        clickOnElement(participantModeOption);
        pauseScreen();
        return driver.getCurrentUrl().contains("admin.sli.do/event");
    }

    public boolean openEventInPresentMode() {
        clickOnElement(dropDownOptions);
        clickOnElement(presentModeOption);
        pauseScreen();
        return driver.getPageSource().contains("#Digital123");
    }

    public String openEvent() {
        clickOnElement(dropDownOptions);
        clickOnElement(openOption);
        pauseScreen();
        return eventNameInDashBoard.getText();
    }

    public boolean shareAccessOfEvent(String email) {
        clickOnElement(dropDownOptions);
        clickOnElement(shareAccessOption);
        enterText(emailInputInInviteCollaboratorsOption, email);
        clickOnElement(inviteButtonInInviteCollaboratorsOption);
        clickOnElement(saveButtonInInviteCollaboratorsOption);
        return driver.getPageSource().contains("Successfully saved!");
    }

    public String duplicateEvent() {
        clickOnElement(dropDownOptions);
        clickOnElement(duplicateOption);
        enterText(eventNameInput, "WaterFalls");
        pauseScreen();
        clickOnElement(duplicateButton);
        pauseScreen();
        return eventNameInDashBoard.getText();
    }

    public boolean createSlidoEvent(String startDate, String endDate, String slidoEventName) {
        clickOnElement(newSlidoButton);
        enterText(startDateInput, startDate);
        enterText(endDateInput, endDate);
        enterText(slidoNameInput, slidoEventName);
        clickOnElement(createSlidoButton);
        pauseScreen();
        return driver.getCurrentUrl().contains("polls");
    }

    public boolean deleteEvent() {
        clickOnElement(dropDownOptions);
        clickOnElement(deleteOption);
        clickOnElement(deleteButton);
        pauseScreen();
        return driver.getPageSource().contains("River Stone Events");
    }
}
