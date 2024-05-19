package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Activity22 {

    public static void main(String[] args) throws InterruptedException {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/popups");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        Actions builder = new Actions(driver);

        WebElement button = driver.findElement(By.xpath("//button[@class = 'ui huge inverted orange button']"));
        builder.moveToElement(button).build().perform();
        System.out.println(button.getAttribute("data-tooltip"));
        button.click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        System.out.println(driver.findElement(By.id("action-confirmation")).getText());

        // Close the browser
        driver.close();
    }
}
