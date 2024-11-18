package pageobject.object;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;
    String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void methodSetup() {

        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        driver = switch (browser) {
            case chrome -> new ChromeDriver();
            case edge -> new EdgeDriver();
        };

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get(baseUrl);

    }

    @AfterMethod
    public void methodTeardown() {

        driver.quit();
    }

}