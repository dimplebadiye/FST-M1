package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {

    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select singleSelect = new Select(dropdown);

        System.out.println("Selected option is: " + singleSelect.getFirstSelectedOption().getText());

        //Select the second option using the visible text.
        singleSelect.selectByVisibleText("Option 2");
        System.out.println("Selected option is: " + singleSelect.getFirstSelectedOption().getText());

        //Select the third option using the index.
        singleSelect.selectByIndex(3);
        System.out.println("Selected option is: " + singleSelect.getFirstSelectedOption().getText());

        //Select the fourth option using the value.
        singleSelect.selectByValue("4");
        System.out.println("Selected option is: " + singleSelect.getFirstSelectedOption().getText());

        //Get all the options and print them to the console.
        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.close();
    }
}
