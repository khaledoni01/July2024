package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDef.TestBase;

import java.time.Duration;

public class CommonMethods {

    public static void jsClick(WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].click();", ele);
    }

    public static void checkIfElementIsClickable(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
    public static void checkIfElementIsVisible(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}
