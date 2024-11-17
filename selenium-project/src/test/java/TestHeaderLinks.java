import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderLinks {

    @Test
    public void homeLink() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement homeLink = driver.findElement(By.cssSelector(".general-0>[href='https://litecart.stqa.ru/en/']"));
        homeLink.click();

        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");

        driver.quit();

    }

    @Test
    public void rubberDuckLink() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDuckLink = driver.findElement(By.cssSelector("#site-menu " +
                "[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        rubberDuckLink.click();

        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");

        driver.quit();

    }

    @Test
    public void subCategoryLink() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        WebElement rubberDuckLink = driver.findElement(By.cssSelector("#site-menu .category-1>a"));
        WebElement subCategoryLink = driver.findElement(By.cssSelector(".category-2>a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(rubberDuckLink).perform();
        actions.moveToElement(subCategoryLink).click().perform();

        Assert.assertEquals(driver.getTitle(), "Subcategory | My Store");

        driver.quit();

    }

}
