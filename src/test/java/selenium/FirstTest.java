package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://nktechsolutions.com/membership-login/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='swpm_user_name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='swpm_password']")).sendKeys("pass");

//        driver.quit();
    }
}
