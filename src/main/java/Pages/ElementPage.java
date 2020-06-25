package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementPage {
    private WebDriver driver;

    public  ElementPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".product-credit > .product-credit__info")
    private WebElement creditInfo;

    @FindBy(css = "app-product-buy-btn > app-buy-button > button")
    private WebElement buyButton;

    @FindBy(css = ".cart-modal__check-button > .button-inner")
    private WebElement confirmButton;

    public ElementPage checkElementPageIsLoad() {
        creditInfo.isDisplayed();
        return this;
    }

    public ElementPage clickToBuyElement() {
        buyButton.click();
        return this;
    }

    public ElementPage clickOnOrderButton() {
        confirmButton.click();
        return this;
    }


}
