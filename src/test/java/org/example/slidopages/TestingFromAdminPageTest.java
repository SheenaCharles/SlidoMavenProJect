package org.example.slidopages;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingFromAdminPageTest extends BasicSetupPageTest {

    @Test
    public void testFromAdminPageTest() {
        TestingFromAdminAsParticipantModePage testingFromAdminPage = PageFactory.initElements(driver, TestingFromAdminAsParticipantModePage.class);
        Assert.assertTrue(testingFromAdminPage.checkPollIsPresentInParticipantMode());
    }

    @Test
    public void testFromAdminPage1Test() {
        TestingFromAdminAsParticipantModePage testingFromAdminPage = PageFactory.initElements(driver, TestingFromAdminAsParticipantModePage.class);
        Assert.assertTrue(testingFromAdminPage.editResponseToPollInParticipantMode());
    }
}
