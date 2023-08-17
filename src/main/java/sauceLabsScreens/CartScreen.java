package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CartScreen {
    private final By removeButton = AppiumBy.accessibilityId("test-REMOVE");
    private final By checkoutButton = AppiumBy.accessibilityId("test-CHECKOUT");
    private final By firstProductTitleInCartScreen = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]");
    private final By firstProductPriceInCartScreen = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Price\"]/android.widget.TextView");
    SHAFT.GUI.WebDriver driver;

    public CartScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * click on remove Button
     * @return cart screen
     */
    @Step("click on remove Button")
    public CartScreen clickOnRemoveButton() {
        driver.element().click(removeButton);
        return this;
    }


    /**
     * click On Checkout Button
     * @return Checkout Screen
     */
    @Step("click On Checkout Button")
    public CheckoutScreen clickOnCheckoutButton() {
        driver.element().click(checkoutButton);
        return new CheckoutScreen(driver);
    }

    /**
     * get First Product Title In Cart Screen
     * @return First Product Title In Cart Screen
     */
    @Step("get First Product Title In Cart Screen")
    public String getFirstProductTitleInCartScreen() {
        return driver.element().getText(firstProductTitleInCartScreen);
    }

    /**
     * get First Product Price In Cart Screen
     * @return First product price In Cart Screen
     */
    @Step("get First Product Price In Cart Screen")
    public String getFirstProductPriceInCartScreen() {
        return driver.element().getText(firstProductPriceInCartScreen);
    }

    /**
     * validate That Cart Is Empty
     */
    @Step("validate That Cart Is Empty")
    public void assertThatCartIsEmpty() {
        driver.assertThat().element(removeButton).doesNotExist().perform();
    }

}
