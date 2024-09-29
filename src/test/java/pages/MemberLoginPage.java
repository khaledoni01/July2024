package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.MemberLoginTest;
import tests.TestBase;
import util.CommonMethods;

public class MemberLoginPage {
    public MemberLoginPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//input[@id='swpm_user_name']")
    WebElement username;
    @FindBy(xpath = "//input[@id='swpm_password']")
    WebElement password;
    @FindBy(xpath = "//input[@name='swpm-login']")
    WebElement loginButton;
    @FindBy(xpath = "//span[text()='No user found with that username or email.']")
    WebElement errorMsg;

    public void provideUsername() {
        CommonMethods.checkIfElementIsVisible(username);
        username.sendKeys("abc123");
    }
    public void providePassword() {
        password.sendKeys("pass");
    }
    public void clickLoginBtn(){
        loginButton.click();
    }
    public boolean verifyErrorMsg() {
        return errorMsg.isDisplayed();
    }

}
