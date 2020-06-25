package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  Pages.BaseMethods.*;

public class HomePage {
    WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".search-form__input.ng-pristine")
    private WebElement searchField;

    @FindBy(css = ".button.search-form__submit")
    private WebElement submitButton;

    @FindBy(css = ".header-topline__user-link.link-dashed")
    private WebElement loginLink;

    @FindBy(id = "auth_email")
    private WebElement loginUser;

    @FindBy(id = "auth_pass")
    private WebElement loginPassword;

    @FindBy(css = ".button_size_large.button_color_green")
    private WebElement loginBtn;
    

    public HomePage openPage(String site) {
        driver.get(site);
        return this;
    }

    public HomePage searchText(String textName) {
        searchField.sendKeys(textName);
        return this;
    }

    public HomePage clickSearchBtn() {
        submitButton.click();
        return this;
    }

    public void clickToLoginLink() {
        loginLink.click();
    }

    public void fillUsername() {
        loginUser.sendKeys("musikos@i.ua");
    }

    public void fillPassword() {
        loginPassword.sendKeys("852456DeNiS852456");
    }

    public void clickToLoginBtn() {
        loginBtn.click();
    }

    public void clickToOpenUserPage() {
        loginBtn.click();
    }

}
