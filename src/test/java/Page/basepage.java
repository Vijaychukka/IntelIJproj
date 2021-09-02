package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class basepage
{
    @Test
    public void runm()
    {
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

    @BeforeClass
    public void printmehtod()
    {
        System.out.println("running before actual test case");
    }
    @Test
    public void secondtest()
    {
        System.out.println("test");
    }
    @AfterTest
    public void aftermethods()
    {
        System.out.println("completed testing");
    }
}