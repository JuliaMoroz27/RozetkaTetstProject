package tests;

import org.testng.annotations.Test;

import static constants.Constant.Urls.ROZETKA_HOME_PAGE;

public class RozetkaHomepageTest extends TestInit{

    @Test
    public void enterTextInField() {
        rozetkaHomePage.open(ROZETKA_HOME_PAGE);

        rozetkaHomePage
                .enterText()
                .clickToSearchButton()
                .getPrices();
    }
}



