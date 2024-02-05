import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

    public static void main(String[] args) {
        // Set Chrome Driver Path
        System.setProperty("webdriver.chrome.driver", "/Users/nitesh/Documents/Brushar/chromedriver-mac-x64/chromedriver");

        // Create a new instance of the Chrome Driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google Homepage
        driver.get("https://www.instagram.com");

        // Wait for the page to load (you might need to adjust the time based on your internet speed)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the username and password input fields and login button
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Enter the username and password
        usernameInput.sendKeys("bru.shar");
        passwordInput.sendKeys("bru_shar");

        // Click on the login button
        loginButton.click();

        // Wait for the login process to complete (you might need to adjust the time)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Close the browser
        driver.quit();

    }
}
