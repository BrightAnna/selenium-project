package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RedDuckPage {

    private By addToCartButton = By.cssSelector("[type='submit'][name='add_cart_product']");
    private By cartQuantityLabel = By.cssSelector("span[class='quantity']");
    private By checkoutLink = By.cssSelector("#cart a[href].link");
    private WebDriver driver;

    public RedDuckPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public String getItemsQuantity() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.textToBe(cartQuantityLabel, "1"));

        return driver.findElement(cartQuantityLabel).getText();
    }

    public void clickCheckoutLink() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.textToBe(cartQuantityLabel, "1"));

        driver.findElement(checkoutLink).click();
    }


}
