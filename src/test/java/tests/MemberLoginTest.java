package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MemberLoginPage;

public class MemberLoginTest extends TestBase {

    @Test
    public void invalid_Username_And_Password_Test() {
        MemberLoginPage mlp = new MemberLoginPage();
        mlp.provideUsername();
        mlp.providePassword();
        mlp.clickLoginBtn();

        Assert.assertTrue(mlp.verifyErrorMsg(), "Error msg is not displayed");
    }

}
