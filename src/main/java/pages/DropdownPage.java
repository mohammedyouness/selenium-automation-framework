package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    // This method will select the option from the dropdown
    public void selectFromDropdown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }
    // This method will get the selected option so that we can assert on this for our tests
    // will return that text value
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
//      return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    // dropdownElement is an object from the Select class
    // new Select(it takes a WebElement)
    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }



}
