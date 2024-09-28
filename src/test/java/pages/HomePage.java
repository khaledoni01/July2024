package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.TestBase;
import util.CommonMethods;

import java.util.List;

public class HomePage {
    @FindBy(xpath = "//ul[@id='menu-main-menu']/li/a")
    List<WebElement> menuOptions;

    public HomePage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    public void clickMenuOptions(String menuOption) {

        for(WebElement menu : menuOptions) {
            if(menu.getText().contains(menuOption)) {
                CommonMethods.checkIfElementIsClickable(menu);
                CommonMethods.jsClick(menu);
                break;
            }
        }
    }
}
