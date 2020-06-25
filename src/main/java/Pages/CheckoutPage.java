package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(linkText= "Редактировать заказ")
    private WebElement changeOrderLink;

    @FindBy(id = "suggest_locality")
    private WebElement dropDown;

    @FindBy(id = "reciever_name")
    private WebElement name;

    @FindBy(id = "reciever_phone")
    private WebElement number;

    @FindBy(id = "reciever_email")
    private WebElement email;

    @FindBy(css = ".check-step-btn-link.opaque")
    private WebElement continueBtn;

    @FindBy(id = "make-order")
    private WebElement confirmOrderText;


    public CheckoutPage clickOnChangeOrder() {
        changeOrderLink.click();
        return this;
    }

    public CheckoutPage fillName() {
        name.sendKeys("Den Ivanov");
        return this;
    }

    public CheckoutPage selectCity() {
//        Select select = new Select(driver.findElement(By.cssSelector(".dropdown-input input")));
//        select.getFirstSelectedOption();
        driver.findElement(By.cssSelector(".dropdown-input input")).click();
        driver.findElement(By.name("2")).click();
        return this;
    }

    public CheckoutPage fillMobileNumber() {
        number.sendKeys("0631234567");
        return this;
    }

    public  CheckoutPage fillEmail() {
        email.sendKeys("testinfo@gmail.com");
        return this;
    }

    public CheckoutPage clickContinueBtn() {
        continueBtn.click();
        return this;
    }

}
