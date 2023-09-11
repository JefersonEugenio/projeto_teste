package testCases;

import org.example.supports.BaseTest;
import org.example.webDrivers.DriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import tasks.AddRemoveElementsTask;

public class AddRemoveElementsTestCase extends BaseTest {

    private final WebDriver driver = DriverManager.getDriver();
    private final AddRemoveElementsTask addRemoveElementsTask = new AddRemoveElementsTask(driver);


    @Test
    public void test() {
        addRemoveElementsTask.clickButtonAdd();
    }

}
