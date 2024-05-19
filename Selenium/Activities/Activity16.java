package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.xpath("(//label[text() = 'Username']/following-sibling::input)[2]")).sendKeys("admin");;
        driver.findElement(By.xpath("(//label[text() = 'Password']/following-sibling::input)[2]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Email']/following-sibling::input")).sendKeys("dynamic@gmail.com");
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@id = 'action-confirmation']")).getText());

        // Close the browser
        driver.close();
    }
}
