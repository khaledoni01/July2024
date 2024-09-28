package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MemberLoginPage;

public class MemberLoginTest extends TestBase {

    @Test
    public void invalid_Username_And_Password_Test() {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.provideUsername();
        memberLoginPage.providePassword();
        memberLoginPage.clickLoginBtn();

        Assert.assertTrue(memberLoginPage.verifyErrorMsg(), "Error msg is not displayed");
    }

}
