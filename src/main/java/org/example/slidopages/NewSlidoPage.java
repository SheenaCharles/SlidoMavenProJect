package org.example.slidopages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;

public class NewSlidoPage extends BasicSetupPage {

    @FindBy(css = "admin-events-event-item.event-item--first > div > div > div > div:nth-child(1)")
    protected WebElement firstSlidoEvent;

    /**
     * admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)
     * nth-child(n) == nth number of SlidoEvent available in the Event page
     */

    @FindBy(css = "admin-events-event-item:nth-child(2) > div > div > div > div:nth-child(1)")
    protected WebElement secondSlidoEvent;

    @FindBy(css = "#share-dropdown-button > div")
    protected WebElement shareButton;

    @FindBy(css = "#share-dropdown-menu > li:nth-child(1) > div:nth-child(2) > div.fw-500")
    protected WebElement shareLinkWithParticipantsOption;

    @FindBy(css = "#qrcode-download > div:nth-child(2) > div.fw-500")
    protected WebElement downloadQRCodeOption;

    @FindBy(css = "#share-dropdown-menu > admin-is-allowed-event > div > fieldset > admin-is-allowed-lock > div > li > div > div:nth-child(2) > div.fw-500")
    protected WebElement inviteCollaboratorsOption;

    @FindBy(css = "input[data-cy='email-input']")
    protected WebElement emailInputInInviteCollaboratorsOption;

    @FindBy(css = "div > div > div:nth-child(1) > div.esc-item__action")
    protected WebElement inviteButtonInInviteCollaboratorsOption;

    @FindBy(css = "button[data-cy='save-settings']")
    protected WebElement saveButtonInInviteCollaboratorsOption;

    @FindBy(css = "div.mat-tooltip-trigger > div")
     protected WebElement eventNameInDashBoard;

    @FindBy(css = "div[class='notranslate hide-in-percy']")
    protected WebElement eventCodeInDashBoard;

    @FindBy(css = "input[data-placeholder='Event name']")
     protected WebElement eventNameInput;

    @FindBy(css = "input[data-placeholder='Event code']")
    protected WebElement eventCodeInput;

    @FindBy(css = "input[data-placeholder='Start date']")
    protected WebElement eventStartDateInput;

    @FindBy(css = "input[data-placeholder='End date']")
    protected WebElement eventEndDateInput;

    @FindBy(css = "div.settings__content-footer > button > div")
     protected WebElement saveButton;

    @FindBy(css = "button[data-cy='eh-bottom-right-settings']")
     protected WebElement settingsIcon;

    @FindBy(css = "div.settings__event-link-wrap > div > svg")
     protected WebElement copyLinkInSettings;

    @FindBy(css = "admin-event-settings-basic > form > div > button > div")
    protected WebElement showAdditionalSettings;

    @FindBy(css = "input[data-placeholder='Location']")
    protected WebElement locationInputInSettings;

    String downloadedFilePath = "C:\\Users\\Anand Sambanthan\\Desktop\\Java Programming\\gitpractice\\SlidoMavenProject\\src\\screenshots\\QR Code for Digital Gatherings.png";
//    String downloadedFilePath = "C:\\Users\\Anand Sambanthan\\Downloads\\QR Code for Digital Gatherings.png";
    File downloadedFile = new File(downloadedFilePath);

    public NewSlidoPage(WebDriver driver) {
        super(driver);
    }


    public void mouseHoverOnShareButton() {
        clickOnElement(firstSlidoEvent);
        mouseHoverOnMainOption(shareButton);
    }

    public boolean copySlidoEventLink() {

        String copiedLinkToPaste = null;
        mouseHoverOnShareButton();
        mouseHoverOnSubOption(shareLinkWithParticipantsOption);
        clickOnElement(shareLinkWithParticipantsOption);
        pauseScreen();
        Clipboard copiedLink = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tempVariableTopaste = copiedLink.getContents(this);
        if (tempVariableTopaste == null)
            System.out.println("null");;
        try {
            copiedLinkToPaste = (String) tempVariableTopaste.getTransferData(DataFlavor.stringFlavor);
        } catch (Exception e){
            e.printStackTrace();
        }
        openNewTab(copiedLinkToPaste);
        Toolkit.getDefaultToolkit().getSystemClipboard();
        pauseScreen();
        return driver.getCurrentUrl().contains("live");
    }

    public boolean downloadSlidoEventQRCode() {
        try {
            mouseHoverOnShareButton();
            mouseHoverOnSubOption(downloadQRCodeOption);
            clickOnElement(downloadQRCodeOption);
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        return downloadedFile.exists();
    }

    public void deleteDownloadedFile() {
        downloadedFile.delete();
    }

    public boolean inviteCollaborators(String email) {
        mouseHoverOnShareButton();
        mouseHoverOnSubOption(inviteCollaboratorsOption);
        clickOnElement(inviteCollaboratorsOption);
        enterText(emailInputInInviteCollaboratorsOption, email);
        clickOnElement(inviteButtonInInviteCollaboratorsOption);
        clickOnElement(saveButtonInInviteCollaboratorsOption);
        return driver.getPageSource().contains("Successfully saved!");
    }

    public String changeEventName(String eventName) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(eventNameInDashBoard);
        enterText(eventNameInput, eventName);
        clickOnElement(saveButton);
        pauseScreen();
        return eventNameInDashBoard.getText();
    }

    public String changeEventCode(String eventCode) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(eventCodeInDashBoard);
        enterText(eventCodeInput, eventCode);
        clickOnElement(saveButton);
        pauseScreen();
        return eventCodeInDashBoard.getText();
    }

    public boolean changeEventDateInSettings(String startDate, String endDate) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(settingsIcon);
        enterText(eventStartDateInput, startDate);
        enterText(eventEndDateInput, endDate);
        clickOnElement(saveButton);
        return driver.getPageSource().contains("Successfully saved!");
    }

    public boolean copyEventLinkInSettings() {
        clickOnElement(secondSlidoEvent);
        clickOnElement(settingsIcon);
        pauseScreen();
        clickOnElement(copyLinkInSettings);
        return driver.getPageSource().contains("Copied!");
    }

    public boolean editLocationInSettings(String location) {
        clickOnElement(secondSlidoEvent);
        clickOnElement(settingsIcon);
        clickOnElement(showAdditionalSettings);
        enterText(locationInputInSettings, location);
        clickOnElement(saveButton);
        return driver.getPageSource().contains("Successfully saved!");
    }
}
