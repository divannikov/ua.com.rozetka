package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By elementBy) {
        waitUntil(elementBy);
        driver.findElement(elementBy).click();
    }

    public void waitUntil(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
}
