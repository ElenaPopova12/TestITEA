import helpers.Level;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static helpers.PrintColor.printColorMessege;
public class MainTest extends BaseTest {
    protected Logger logger;
    @Test
    public void someCheak() {

        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.buttonNewIssues();

        Assertions.assertTrue(issuesPage.getPageInformMassege().isDisplayed());
        printColorMessege("Window open", logger, Level.INFO);

        Assertions.assertEquals("Have a question about this project?",
                issuesPage.getPageInformMassege().getText());
        printColorMessege("Text is Displayed", logger, Level.INFO);
    }
}
