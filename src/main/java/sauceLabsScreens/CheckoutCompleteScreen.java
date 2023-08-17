package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckoutCompleteScreen {
    private final By backButton = AppiumBy.accessibilityId("test-BACK HOME");
    SHAFT.GUI.WebDriver driver;

    public CheckoutCompleteScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * assert That User Complete Ordering
     * @return Checkout Complete Screen
     */
    @Step("assert That User Complete Ordering")
    public CheckoutCompleteScreen assertThatUserCompleteOrdering() {
        driver.assertThat().element(backButton).attribute("displayed").isEqualTo("true").perform();
        return this;
    }

}
