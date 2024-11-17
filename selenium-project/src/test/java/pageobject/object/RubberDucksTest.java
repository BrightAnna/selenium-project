package pageobject.object;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RubberDucksTest extends TestBase {

    @Test
    public void sortingDucksByName() {

        HomePage homePage = new HomePage(driver);
        RubberDucksPage rubberDucksPage = new RubberDucksPage(driver);

        homePage.clickRubberDucksLink();
        rubberDucksPage.clickButtonName();

        Assert.assertEquals(rubberDucksPage.getActiveButtonName(), "Name");
    }

}
