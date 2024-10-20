package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MemberLoginPage;

public class MemberLoginStepDef {

    @Given("user should be in the login page")
    public void userShouldBeInTheLoginPage() {
        System.out.println("given step");
    }

    @When("user provides invalid username and password")
    public void userProvidesInvalidUsernameAndPassword() {
        System.out.println("when step");
    }

    @Then("user should get error message")
    public void userShouldGetErrorMessage() {
        System.out.println("then step");
    }


    public void invalid_Username_And_Password_Test(String username, String password) {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.provideUsername(username);
        memberLoginPage.providePassword(password);
        memberLoginPage.clickLoginBtn();

//        Assert.assertTrue(memberLoginPage.verifyErrorMsg(), "Error msg is not displayed");
        Assert.assertFalse(memberLoginPage.verifyErrorMsg(), "Error msg is not displayed");
//        Assert.assertEquals(memberLoginPage.verifyErrorMsg(), false, "Error msg is not displayed");
    }


    @When("user provides invalid {string} and {string}")
    public void userProvidesInvalidUsernameAndPassword(String uname, String pword) {
        MemberLoginPage memberLoginPage = new MemberLoginPage();
        memberLoginPage.provideUsername(uname);
        memberLoginPage.providePassword(pword);

    }

    @Then("user should not get error message")
    public void userShouldNotGetErrorMessage() {
        System.out.println("no error");
    }
}
