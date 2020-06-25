package Java.Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class BaseSettings {
    public WebDriver driver;
    protected HomePage homePage;
    protected SearchPage searchPage;
    protected CheckoutPage checkoutPage;
    protected OrderPage orderPage;
    protected SignInPage sighInPage;
    protected BaseMethods baseMethods;
    protected ElementPage elementPage;
    protected UserPage userPage;
    protected WebDriverWait wait;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        homePage = new HomePage(driver);
        searchPage = new SearchPage(driver);
        checkoutPage = new CheckoutPage(driver);
        orderPage = new OrderPage(driver);
        sighInPage = new SignInPage(driver);
        baseMethods = new BaseMethods(driver);
        elementPage = new ElementPage(driver);
        userPage = new UserPage(driver);

        PageFactory.initElements(driver, homePage);
        PageFactory.initElements(driver, searchPage);
        PageFactory.initElements(driver, checkoutPage);
        PageFactory.initElements(driver, orderPage);
        PageFactory.initElements(driver, sighInPage);
        PageFactory.initElements(driver, baseMethods);
        PageFactory.initElements(driver, elementPage);
        PageFactory.initElements(driver, userPage);
    }

    @AfterEach
    public void finished() {
        driver.quit();
    }
}


