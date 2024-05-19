package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/target-practice");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        System.out.println(driver.findElement(By.xpath("//h3[@id = 'third-header']")).getText());

        System.out.println(driver.findElement(By.xpath("//div[@class = 'column']/h5")).getCssValue("color"));

        System.out.println(driver.findElement(By.xpath("//button[text() = 'Violet']")).getAttribute("class"));

        System.out.println(driver.findElement(By.xpath("//button[@class = 'ui grey button']")).getText());

        // Close the browser
        driver.close();
    }
}
