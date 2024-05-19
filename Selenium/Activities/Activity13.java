package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

public class Activity13 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tables");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'ui celled striped table']/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class = 'ui celled striped table']/tbody/tr[1]/td"));

        System.out.println("Number of rows: " + rows.size());
        System.out.println("Number of columns: " + columns.size());

        columns = driver.findElements(By.xpath("//table[@class = 'ui celled striped table']/tbody/tr[3]/td"));
        System.out.println("Third row values:");
        for (WebElement element : columns){
            System.out.println(element.getText());
        }

        System.out.println("Second row, second column value: " + driver.findElement(By.xpath("//table[@class = 'ui celled striped table']/tbody/tr[2]/td[2]")).getText());


        // Close the browser
        driver.close();
    }
}
