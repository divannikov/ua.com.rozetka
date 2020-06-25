package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {
    WebDriver driver;

    public OrderPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".cart-check-icon.sprite")
    private WebElement closeBtnFromOrder;

    @FindBy(css = ".cart-i-delete-link")
    private WebElement deleteWithoutSave;


    public void clickToDeleteElement(){
        closeBtnFromOrder.click();

}
    public void confirmDeleteElement() {
        deleteWithoutSave.click();
    }
}
