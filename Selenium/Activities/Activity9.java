package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/ajax");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        System.out.println("Before clicking text: " + driver.findElement(By.xpath("//h2[@class = 'ui header']")).getText());

        driver.findElement(By.xpath("//button[text() = 'Change Content']")).click();

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();

        System.out.println("After clicking text: " +text);

        System.out.println(driver.findElement(By.tagName("h3")).getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);

        // Close the browser
        driver.close();
    }
}
