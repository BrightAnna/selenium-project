package pageobject.object;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RedDuckTest extends TestBase {

    @Test
    public void addOneItemToCart() {

        HomePage homePage = new HomePage(driver);
        RedDuckPage redDuckPage = new RedDuckPage(driver);

        homePage.clickRedDuckLink();
        redDuckPage.clickAddToCartButton();

        Assert.assertEquals(redDuckPage.getItemsQuantity(), "1");

    }

}
