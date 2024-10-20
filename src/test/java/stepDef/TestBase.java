package stepDef;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    public static WebDriver driver = null;
    public String baseURL = "https://nktechsolutions.com/membership-login/";
    @Before
    public void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }


}
