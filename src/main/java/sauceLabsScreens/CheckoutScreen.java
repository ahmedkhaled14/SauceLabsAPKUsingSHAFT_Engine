package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckoutScreen {
    private final By firstNameInput = AppiumBy.accessibilityId("test-First Name");
    private final By lastNameInput = AppiumBy.accessibilityId("test-Last Name");
    private final By zipCodeInput = AppiumBy.accessibilityId("test-Zip/Postal Code");
    private final By continueButton = AppiumBy.accessibilityId("test-CONTINUE");
    SHAFT.GUI.WebDriver driver;

    public CheckoutScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * fill Checkout Information
     * @param firstname String value from src//test//resources//testDataFiles//checkoutInformationTestData.json
     * @param lastname  String value from src//test//resources//testDataFiles//checkoutInformationTestData.json
     * @param zipCode   String value from src//test//resources//testDataFiles//checkoutInformationTestData.json
     * @return Checkout Screen
     */
    @Step("fill Checkout Information Using ==> firstname: [{firstname}], lastname: [{lastname}], zipCode: [{zipCode}]")
    public CheckoutScreen fillCheckoutInformation(String firstname, String lastname, String zipCode) {
        driver.element().type(firstNameInput, firstname);
        driver.element().type(lastNameInput, lastname);
        driver.element().type(zipCodeInput, zipCode);
        return this;
    }

    /**
     * click On Continue Button
     * @return Overview Screen
     */
    @Step("click On Continue Button")
    public OverviewScreen clickOnContinueButton() {
        driver.element().click(continueButton);
        return new OverviewScreen(driver);
    }
}
