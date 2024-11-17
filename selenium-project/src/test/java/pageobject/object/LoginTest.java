package pageobject.object;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {

    @Test
    public void loginWithCorrectCredentials() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginWithCredentials("anyrise@yandex.by", "1234!");
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");

    }

    @Test
    public void loginWithWrongEmailAndCorrectPassword() {

        LoginPage loginPage = new LoginPage(driver);
        SoftAssert softAssert = new SoftAssert();

        loginPage.loginWithCredentials("annyrise@yandex.by", "1234!");
        softAssert.assertTrue(loginPage.errorMessageIsDisplayed(), "Error message is not displayed");
        softAssert.assertEquals(loginPage.getErrorMessageText(),
                "Wrong password or the account is disabled, or does not exist");

        softAssert.assertAll();

    }

}