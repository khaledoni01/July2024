package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MemberLoginPage;

public class HomeTest extends TestBase {

    @Test(priority = 0)
    public void chooseMenuOptionsTraining() {
        HomePage homePage = new HomePage();
        homePage.clickMenuOptions("Training");
    }

    @Test(priority = 1)
    public void chooseMenuOptionsMemberLogin() {
        HomePage homePage = new HomePage();
        homePage.clickMenuOptions("Member Login");
    }

}
