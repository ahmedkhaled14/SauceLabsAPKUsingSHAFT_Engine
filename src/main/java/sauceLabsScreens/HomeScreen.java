package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomeScreen {
    private final By productsList = AppiumBy.accessibilityId("test-PRODUCTS");
    private final By firstProductLocator = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]");
    private final By cartIconLocator = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    private final By firstProductTitleInHomeScreen = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]");
    private final By firstProductPriceInHomeScreen = AppiumBy.xpath("(//android.widget.TextView[@content-desc=\"test-Price\"])[1]");

    SHAFT.GUI.WebDriver driver;

    public HomeScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * click On Add To Cart On First Product
     *
     * @return HomeScreen
     */
    @Step("click On Add To Cart On First Product")
    public HomeScreen clickOnAddToCartOnFirstProduct() {
        driver.element().click(firstProductLocator);
        return this;
    }

    /**
     * get First Product title In Home Screen
     *
     * @return First product title In Home Screen
     */
    @Step("get First Product title In Home Screen")
    public String getFirstProductTitleInHomeScreen() {
        return driver.element().getText(firstProductTitleInHomeScreen);
    }

    /**
     * get First Product Price In Home Screen
     * @return First product price In Home Screen
     */
    @Step("get First Product Price In Home Screen")
    public String getFirstProductPriceInHomeScreen() {
        return driver.element().getText(firstProductPriceInHomeScreen);
    }

    /**
     * click On Cart Icon
     * @return CartScreen
     */
    @Step("click on cart icon")
    public CartScreen clickOnCartIcon() {
        driver.element().click(cartIconLocator);
        return new CartScreen(driver);
    }


    /**
     * validate That Login Is Performed Successfully
     */
    @Step("validate That Login Is Performed Successfully")
    public HomeScreen assertThatLoginIsPerformedSuccessfully() {
        driver.assertThat().element(productsList).attribute("displayed").isEqualTo("true").perform();
        return this;
    }


}
