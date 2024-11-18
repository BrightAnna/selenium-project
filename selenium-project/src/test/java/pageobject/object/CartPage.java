package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private By removeButton = By.cssSelector("[name='remove_cart_item']");
    private By cartIsEmptyText = By.cssSelector("[id='checkout-cart-wrapper'] em");
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRemoveButton() {
        driver.findElement(removeButton).click();
    }

    public boolean emptyCartIsDisplayed() {
        return driver.findElement(cartIsEmptyText).isDisplayed();
    }

    public String getCartIsEmptyText() {
        return driver.findElement(cartIsEmptyText).getText();
    }
}
