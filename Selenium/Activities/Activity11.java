package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Is checkbox selected: " + checkbox.isSelected());

        checkbox.click();
        System.out.println("Is checkbox selected: " + checkbox.isSelected());

        // Close the browser
        driver.close();
    }
}
