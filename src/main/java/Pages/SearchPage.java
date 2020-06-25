package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    WebDriver driver;

    @FindBy(id = "image_item17929266")
    private WebElement appleElement;

    public SearchPage(WebDriver driver) {
        this.driver = driver;

    }

    public void clickOnFirstElement() {
        appleElement.click();
    }


}
