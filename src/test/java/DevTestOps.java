import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class DevTestOps extends Assert {

    WebDriver driver;


    @BeforeSuite

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

         driver = new ChromeDriver();

         driver.get("https://vk.com");


    }




}
