package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");   // By object
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterPi() {
        enterText(Keys.chord(Keys.ALT, "227") + "=3.14");
        // chord() will allow us to send multiple keys at one time, in other words it
        // enable you to press multiple keys at the same time
    }
    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
