package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void pageTitleValidation() {
        // Check the title of the page
        String title = driver.getTitle();

        //Assertion for page title
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void blackButtonValidation(){
        WebElement button = driver.findElement(By.xpath("//button[@class = 'ui black button']"));
        Assert.assertTrue(button.isDisplayed());
        Assert.assertEquals(button.getText(), "black");
    }

    @Test(enabled = false)
    public void skipMethod(){
        System.out.println("This method should be skipped");
    }

    @Test
    public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }

    @AfterClass
    public void tearDown() {
        //Close the browser
        driver.quit();
    }

}
