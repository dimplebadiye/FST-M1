package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select multiSelect = new Select(dropdown);

        multiSelect.selectByVisibleText("Javascript");

        for(int i = 4; i<=6 ; i++) {
            multiSelect.selectByIndex(i);
        }

        multiSelect.selectByValue("node");

        multiSelect.deselectByIndex(5);

        // Close the browser
        driver.close();
    }
}
