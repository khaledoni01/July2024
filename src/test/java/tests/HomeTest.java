package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MemberLoginPage;

public class HomeTest extends TestBase {

    @Test
    public void chooseMenuOptions() {
        HomePage homePage = new HomePage();
        homePage.clickMenuOptions("Training");
    }

}
