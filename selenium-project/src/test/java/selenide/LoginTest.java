package selenide;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends TestBase {

    @Test
    public void loginWithCorrectCredentials() {

        LoginPage.loginWithCredentials("anyrise@yandex.by", "1234!");
        assertEquals("Online Store | My Store", title());

    }

    @Test
    public void loginWithWrongEmailAndCorrectPassword() {

        LoginPage.loginWithCredentials("annyrise@yandex.by", "1234!");
        LoginPage.validateMessageIsDisplayed();
        LoginPage.validateErrorMessageText("Wrong password or the account is disabled, or does not exist");

    }


}