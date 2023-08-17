package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class OverviewScreen {
    private final By productPriceText = AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-Price\"]/android.widget.TextView)[1]");
    private final By finishButton = AppiumBy.accessibilityId("test-FINISH");
    SHAFT.GUI.WebDriver driver;

    public OverviewScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * assert On Product Price
     * @return OverviewScreen
     */
    @Step("assert On Product Price")
    public OverviewScreen assertOnProductPrice(String expectedProductPrice) {
        driver.assertThat().element(productPriceText).text().isEqualTo(expectedProductPrice).perform();
        return this;
    }

    /**
     * scroll Down To Finish Button then click On Finish Button
     * @return Checkout Complete Screen
     */
    @Step("click On Finish Button")
    public CheckoutCompleteScreen clickOnFinishButton() {
        driver.element().scrollToElement(finishButton).click(finishButton);
        return new CheckoutCompleteScreen(driver);
    }
}
