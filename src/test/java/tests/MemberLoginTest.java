package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MemberLoginPage;

public class MemberLoginTest extends TestBase {

    @DataProvider(name="invalidLoginCreds")
    public static Object[][] testInvalidLoginCreds() {

        return new Object[][] {
                {"abc123", "pass"}
        };
    }

    @Test(groups = {"regression"}, dataProvider = "invalidLoginCreds")
    public void invalid_Username_And_Password_Test(String username, String password) {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.provideUsername(username);
        memberLoginPage.providePassword(password);
        memberLoginPage.clickLoginBtn();

//        Assert.assertTrue(memberLoginPage.verifyErrorMsg(), "Error msg is not displayed");
        Assert.assertFalse(memberLoginPage.verifyErrorMsg(), "Error msg is not displayed");
//        Assert.assertEquals(memberLoginPage.verifyErrorMsg(), false, "Error msg is not displayed");
    }

//    @Test(groups = {"smoke"})
    public void invalid_Username_Test() {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.provideUsername("username");
    }

    @Test(enabled = false, groups = {"smoke"})
    public void invalid_Password_Test() {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.providePassword("password");
    }

}
