package appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsApp {

    private final WebDriver driver;

    public AddRemoveElementsApp (WebDriver webDriver) {
        this.driver = webDriver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.cssSelector(".example button"));
    }

}
