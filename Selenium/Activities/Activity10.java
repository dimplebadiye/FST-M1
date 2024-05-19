package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {

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
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        WebElement removeCheckbox = driver.findElement(By.xpath("//button[text() = 'Remove checkbox']"));
        removeCheckbox.click();
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        // Close the browser
        driver.close();
    }
}
