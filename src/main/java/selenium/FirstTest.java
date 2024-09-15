package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirstTest {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://nktechsolutions.com/membership-login/");

        driver.manage().window().maximize();

        System.out.println( driver.getCurrentUrl() );
        System.out.println( driver.getTitle() );

        By username = By.xpath("//input[@id='swpm_user_name']");
        By password = By.xpath("//input[@id='swpm_password']");

        WebElement uname = driver.findElement(username);
        WebElement pword = driver.findElement(password);

        uname.sendKeys("test");
        pword.sendKeys("pass");

        System.out.println( uname.getAttribute("size") );
        System.out.println( uname.isDisplayed() );
        System.out.println( uname.isEnabled() );

        Assert.assertTrue(uname.isDisplayed());

//        driver.quit();
    }
}
