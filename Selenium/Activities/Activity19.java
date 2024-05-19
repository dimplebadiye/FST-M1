package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity19 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.id("confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.accept();

        // Close the browser
        driver.close();
    }
}
