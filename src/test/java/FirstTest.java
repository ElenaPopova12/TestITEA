import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseTest {

    @Test
    public void someCheak() {

        WebElement buttonNewIssues = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
        buttonNewIssues.click();

        WebElement pageQuestion = driver.findElement
                (By.xpath("//*[@class=\"text-center mb-4\"]"));

        boolean checkPage = pageQuestion.isDisplayed();
        Assertions.assertTrue(checkPage);
    }
}