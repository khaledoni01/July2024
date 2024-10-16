package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {

    public static WebDriver driver = null;
//    public String baseURL = "https://nktechsolutions.com/membership-login/";
//    public String baseURL = "file:///C:/Users/Khaled%20Zaman/OneDrive/Desktop/pc_backup/NK%20TECH%20Solutions/Automation/WebPage/index.html";
    @BeforeTest(alwaysRun = true)
    @Parameters("baseURL")
    public void launchBrowser(String baseURL) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }
    @BeforeClass
    public void callDB() {
        // I want to get data from the DB
    }
}
