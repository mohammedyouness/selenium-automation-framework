package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class AlertTests  extends BaseTests {
    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert",
                "Results text is incorrect");
    }
    @Test
    public void testGetTextFromAlert() {
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Confirm text is incorrect");
    }
    @Test
    public void testSetInputInAlert() {
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU IS AWESOME";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text is incorrect");
    }
}
