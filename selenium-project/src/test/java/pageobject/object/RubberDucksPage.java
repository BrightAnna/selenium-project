package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RubberDucksPage {

    private By buttonName = By.xpath("//div[@id='box-category']//a[text()='Name']");
    private By activeButtonLocator = By.cssSelector(".button.active");

    private WebDriver driver;

    public RubberDucksPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonName() {
        driver.findElement(buttonName).click();
    }

    public String getActiveButtonName() {
        return driver.findElement(activeButtonLocator).getText();
    }

}
