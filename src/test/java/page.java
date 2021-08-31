import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class page
{
    @Test
    public void runm()
    {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Downloads\\Finalcodebases\\Finalcodebases\\seleniumbas1\\driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Downloads\\Finalcodebases\\Finalcodebases\\seleniumbas1\\driver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println("Navigated to google site successfully");
        driver.close();
        System.out.println("Browser has been closed successfully");
        System.out.println("***end**uu");
    }
}