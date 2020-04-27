package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("input[type='range']");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderFocus() {
        driver.findElement(slider).click();
    }
    public void setSliderValue(String value) {
        setSliderFocus();
        while(!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getSliderValue() {
        return driver.findElement(sliderValue).getText();
    }


}
