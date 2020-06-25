package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
    WebDriver driver;

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(linkText = "Знаменательные даты")
    private WebElement profile_accordion_link;

    public void checkUserIsLogged() {
        profile_accordion_link.isDisplayed();
    }

}
