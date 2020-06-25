package Java.Tests;

import Java.Base.BaseSettings;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Pages.ConstantClass.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1  extends  BaseSettings {

        @Test
        public void addAndDeleteElement() {
            homePage.openPage(URL)
                    .searchText(textName)
                    .clickSearchBtn();
            searchPage.clickOnFirstElement();
            elementPage.checkElementPageIsLoad()
                    .clickToBuyElement()
                    .clickOnOrderButton();
            checkoutPage.clickOnChangeOrder();
            orderPage.clickToDeleteElement();
            orderPage.confirmDeleteElement();
            assertEquals(sighInPage.checkTextOfPage(),
                    "Вход в интернет-магазин", "Unexpected text");
            System.out.println("Test addAndDeleteElement - passed");
        }

        @Test
        public void fillCheckoutPage() {
            homePage.openPage(URL)
                    .searchText(textName)
                    .clickSearchBtn();
            searchPage.clickOnFirstElement();
            elementPage.checkElementPageIsLoad()
                    .clickToBuyElement()
                    .clickOnOrderButton();
            checkoutPage.fillName()
                    .selectCity()
                    .fillMobileNumber()
                    .fillEmail()
                    .clickContinueBtn();
            System.out.println("Test fillCheckoutPage - passed");
        }

        @Test
        public void loginToSite() {
            homePage.openPage(URL);
            homePage.clickToLoginLink();
            homePage.fillUsername();
            homePage.fillPassword();
            homePage.clickToLoginBtn();
            homePage.clickToOpenUserPage();
            userPage.checkUserIsLogged();
        }

}


