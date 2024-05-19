package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Set;

public class Activity21 {

    public static void main(String[] args) throws InterruptedException {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tab-opener");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());


        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window: " + parentHandle);
        driver.findElement(By.id("launcher")).click();

        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if (handle != parentHandle) {
                driver.switchTo().window(handle);
                Thread.sleep(5000);
            }
        }

        System.out.println("Page title: " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//div[@class = 'content']")).getText());
        driver.findElement(By.id("actionButton")).click();
        handles = driver.getWindowHandles();

        for(String handle : handles) {
            driver.switchTo().window(handle);
            Thread.sleep(5000);
        }

        System.out.println("Page title: " + driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//div[@class = 'content']")).getText());

        // Close the browser
        driver.close();
    }
}
