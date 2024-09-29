package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.TestBase;

public class FirstPage {
    public FirstPage() {
        PageFactory.initElements(TestBase.driver, this);
    }

    @FindBy(xpath = "//select[@id='month']")
    WebElement monthDropDown;


    public void selectDropDown(String value) {
        Select sel = new Select(monthDropDown);
        sel.selectByVisibleText(value);
    }
}
