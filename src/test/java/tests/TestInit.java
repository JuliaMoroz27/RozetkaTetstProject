package tests;

import common.CommonActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.RozetkaHomePage;
import static common.Config.HOLD_BROWSER_OPEN;

public class TestInit {

    protected RozetkaHomePage rozetkaHomePage;
    WebDriver driver;

    @BeforeMethod
    public void bef() {
        driver = CommonActions.createDriver();
        rozetkaHomePage = new RozetkaHomePage(driver);
    }


    @AfterMethod
    public void tearDown() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
