package selenide;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By emailInput = By.name("email");
    private static By passwordInput = By.name("password");
    private static By loginButton = By.name("login");
    private static By errorMassageText = By.cssSelector(".notice.errors");

    public static void typeEmail(String email) {
        $(emailInput).sendKeys(email);
    }

    public static void typePassword(String password) {
        $(passwordInput).sendKeys(password);
    }

    public static void clickButton() {
        $(loginButton).click();
    }

    public static void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickButton();
    }

    public static void validateMessageIsDisplayed() {
        $(errorMassageText).shouldBe(visible);
    }

    public static void validateErrorMessageText(String expectedText) {
        $(errorMassageText).shouldHave(text(expectedText));
    }


}