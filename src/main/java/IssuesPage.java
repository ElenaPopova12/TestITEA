import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static helpers.PrintColor.printColorMessege;
public class IssuesPage extends BasePage {
    private final static String TITLE = "Isuues page";
    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }
    private WebElement buttonNewIssues = driver.findElement
            (By.xpath("//*[@class=\"btn btn-primary\"]"));
    private WebElement pageInformMassege = driver.findElement(By.xpath(
            "//*[contains(text(),'Have a question about this project?')]"));
    public WebElement getPageInformMassege() {
        return pageInformMassege;
    }
    public void buttonNewIssues() {
        buttonNewIssues.click();
        printColorMessege("Page New", log, Level.INFO);
    }
}

