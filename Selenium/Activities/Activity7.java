package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement football = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));

        Actions builder = new Actions(driver);

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(football).moveToElement(dropZone1).pause(1000).release().build().perform();
        // Verify that the ball was dropped in dropzone 1
        if(dropZone1.findElement(By.tagName("p")).getText().equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");
        }

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(football, dropZone2).build().perform();
        // Verify that the ball was dropped in dropzone 2
        if(dropZone2.findElement(By.tagName("p")).getText().equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");
        }

        // Close the browser
        driver.close();
    }
}
