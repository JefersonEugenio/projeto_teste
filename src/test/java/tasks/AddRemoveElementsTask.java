package tasks;

import appObjects.AddRemoveElementsApp;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsTask {

    private final WebDriver webDriver;
    private final AddRemoveElementsApp addRemoveElementsApp;

    public AddRemoveElementsTask (WebDriver driver) {
        this.webDriver = driver;
        addRemoveElementsApp = new AddRemoveElementsApp(driver);
    }

    public void clickButtonAdd() {
        addRemoveElementsApp.getAddButton().click();
    }

}
