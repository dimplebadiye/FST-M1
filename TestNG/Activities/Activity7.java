package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }

    @Test (dataProvider = "Authentication")
    public void pageTitleTest(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        Assert.assertEquals(driver.findElement(By.id("action-confirmation")).getText(), "Welcome Back, admin");
    }

    @AfterClass
    public void tearDown() {
        //Close the browser
        driver.quit();
    }

}
