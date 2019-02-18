import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    String titleHomePage = "'''";


    public HomePage(WebDriver driver) {
        this.driver = driver;

        if(!titleHomePage.equals(driver.getTitle()))
            throw new IllegalStateException("This is not the Home page!");




    }
}
