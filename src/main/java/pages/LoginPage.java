package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.cssSelector("#login button");
    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginPage() {
        return new SecureAreaPage(driver);
    }


}
