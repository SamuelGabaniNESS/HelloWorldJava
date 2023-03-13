import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class SeleniumSampleTest {
    //@Test
    public void checkTest(){
        //set up Chrome Exe path
        //Launch Browser
        WebDriver driver= new ChromeDriver();
        //Launch URL
        driver.get("C:\\Users\\P3503633\\webdriver_chrome\\chromedriver.exe");
        //Define Expected Title Value
        String expectedTitle="Selenium Grid Online | Run Selenium Test On Cloud";
        //Validate using TestNG Assertion
        //Assert.assertEquals(driver.getTitle(),expectedTitle,"Title doesn't match");

    }
}

