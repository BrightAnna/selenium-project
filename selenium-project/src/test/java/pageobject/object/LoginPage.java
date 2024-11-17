package pageobject.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.name("login");
    private By errorMassageText = By.cssSelector(".notice.errors");


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void typePassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickButton() {
        driver.findElement(loginButton).click();
    }

    public void loginWithCredentials(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickButton();
    }

    public boolean errorMessageIsDisplayed() {
        return driver.findElement(errorMassageText).isDisplayed();
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMassageText).getText();
    }

}