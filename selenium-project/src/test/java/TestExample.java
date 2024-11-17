import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestExample {

    @Test
    public void BrowserLinks() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }

        allLinks.get(9).click();

        Assert.assertEquals(driver.getTitle(), "The Internet");

        driver.quit();

    }

}
