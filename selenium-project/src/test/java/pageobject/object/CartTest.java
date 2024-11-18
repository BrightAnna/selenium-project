package pageobject.object;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends TestBase {

    @Test
    public void deleteItemFromCart() {

        HomePage homePage = new HomePage(driver);
        RedDuckPage redDuckPage = new RedDuckPage(driver);
        CartPage cartPage = new CartPage(driver);
        SoftAssert softAssert = new SoftAssert();

        homePage.clickRedDuckLink();
        redDuckPage.clickAddToCartButton();
        redDuckPage.clickCheckoutLink();
        cartPage.clickRemoveButton();

        softAssert.assertTrue(cartPage.emptyCartIsDisplayed(), "Empty cart is not displayed");
        softAssert.assertEquals(cartPage.getCartIsEmptyText(), "There are no items in your cart.");
        softAssert.assertAll();

    }
}
