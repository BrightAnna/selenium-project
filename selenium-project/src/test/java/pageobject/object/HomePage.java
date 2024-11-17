package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By rubberDucksLink = By.cssSelector("#site-menu .category-1>a");
    private By redDuckLink = By.cssSelector("a[href][title='Red Duck']");

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRubberDucksLink() {
        driver.findElement(rubberDucksLink).click();
    }

    public void clickRedDuckLink() {
        driver.findElement(redDuckLink).click();
    }
}
