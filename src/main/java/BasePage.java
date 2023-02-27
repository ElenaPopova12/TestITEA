import helpers.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import static helpers.PrintColor.printColorMessege;
abstract public class BasePage {
    private String title;
    protected Logger log;
    WebDriver driver;
    public BasePage(WebDriver driver, String title) {
        this.driver = driver;
        this.title = title;
        this.log = LogManager.getLogger(this.title);
        printColorMessege("Page object of" + title + getClass().getName(), log, Level.DEBUG);
    }
}