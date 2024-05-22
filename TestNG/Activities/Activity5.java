package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
        //Assertion for page title
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test(dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void headerTest() {
        //Assertion for page title
        Assert.assertEquals(driver.findElement(By.id("third-header")).getText(), "Third header", "Header not matching");
        Assert.assertEquals(driver.findElement(By.xpath("//h5[@class = 'ui green header']")).getCssValue("color"), "rgb(33, 186, 69)", "Header color not matching");
    }

    @Test(dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void buttonTest() {
        //Assertion for page title
        Assert.assertEquals(driver.findElement(By.xpath("//button[@class = 'ui olive button']")).getText(), "Olive", "Button text not matching");
        Assert.assertEquals(driver.findElement(By.xpath("//button[@class = 'ui brown button']")).getCssValue("color"), "rgb(255, 255, 255)", "Button color not matching");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        //Close the browser
        driver.quit();
    }

}
