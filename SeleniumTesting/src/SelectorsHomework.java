import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelectorsHomework {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\webdrivers\\msedgedriver.exe");
        driver.manage().window().maximize();

        driver.get("https://aws.amazon.com/?nc2=h_lg");
        //driver.get("https://demoblaze.com/");
        var elementByID = driver.findElement(By.id("aws-page-footer"));
        System.out.println(elementByID);
        var elementByName = driver.findElement(By.name("searchQuery"));
        System.out.println(elementByName);
        var elementByClassName = driver.findElement(By.className("m-nav-logo"));
        System.out.println(elementByClassName);
        var elementByTagName = driver.findElements(By.tagName("a"));
        //System.out.println(elementByTagName);
        var elementByLinkText = driver.findElement(By.linkText("Java on AWS"));
        System.out.println(elementByLinkText);
        var elementByPartialLinkText = driver.findElement(By.partialLinkText("Press"));
        System.out.println(elementByPartialLinkText);
        var elementByCSS = driver.findElement(By.cssSelector(".lb-small-pad"));
        System.out.println(elementByCSS);
        var elementByXPath = driver.findElement(
                By.xpath(
                        "//*[@id=\"aws-element-efd9c25c-d734-4816-850d-93d8b69dd31c-tab-2\"]")
        );
        System.out.println(elementByXPath);
        //var elementByXPath = driver.findElement(By.xpath("//a[@data-target='#exampleModal']"));
        driver.quit();
    }
}
