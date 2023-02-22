import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/elenapopova/IdeaProjects/TestITEA/src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/ElenaPopova12/ITEA/issues");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
