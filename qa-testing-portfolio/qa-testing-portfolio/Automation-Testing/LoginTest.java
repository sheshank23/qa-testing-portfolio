import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login"));

        username.sendKeys("testuser");
        password.sendKeys("testpass");
        loginButton.click();

        String expectedUrl = "https://example.com/dashboard";
        assert driver.getCurrentUrl().equals(expectedUrl);

        driver.quit();
    }
}
