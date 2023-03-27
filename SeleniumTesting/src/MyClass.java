import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
public class MyClass {
    WebDriver driver = new EdgeDriver();
    @BeforeTest
    public void setUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\webdrivers\\msedgedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/");
    }
    @Test
    public void fillTheContactForm()
    {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "STORE";
        System.out.print(ActualTitle);
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        WebElement Contact = driver.findElement(By.xpath("//a[@data-target='#exampleModal']"));
        Contact.click();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.id("recipient-email")));
        driver.findElement(By.id("recipient-email")).sendKeys("test@test.com");
        driver.findElement(By.id("recipient-name")).sendKeys("test");
        driver.findElement(By.id("message-text")).sendKeys("test message");
        driver.findElement(By.xpath("//*[contains(text(),'Send message')]")).click();
        driver.switchTo().alert().accept();
    }
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
