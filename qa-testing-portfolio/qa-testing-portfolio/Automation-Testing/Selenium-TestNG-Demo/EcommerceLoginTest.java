import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EcommerceLoginTest {
    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/login");

        driver.findElement(By.id("email")).sendKeys("user@example.com");
        driver.findElement(By.id("pass")).sendKeys("password123");
        driver.findElement(By.id("submit")).click();

        assert driver.getTitle().contains("Dashboard");

        driver.quit();
    }
}
