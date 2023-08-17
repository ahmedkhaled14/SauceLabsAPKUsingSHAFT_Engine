package sauceLabsScreens;

import com.shaft.driver.SHAFT;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginScreen {
    private final By userNameInput = AppiumBy.accessibilityId("test-Username");
    private final By passwordInput = AppiumBy.accessibilityId("test-Password");
    private final By loginButton = AppiumBy.accessibilityId("test-LOGIN");
    private final By errorMessageText = AppiumBy.accessibilityId("test-Error message");
    SHAFT.GUI.WebDriver driver;

    public LoginScreen(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /**
     * login Using Email And Password
     * @param username value from src/test/resources/testData/loginTestData.json
     * @param password value from src/test/resources/testData/loginTestData.json
     * @return new Home Screen
     */
    @Step("login Using Email And Password ==> user Name: [{username}], password: [{password}]")
    public HomeScreen loginUsingEmailAndPassword(String username, String password) {
        driver.element().type(userNameInput, username);
        driver.element().type(passwordInput, password);
        driver.element().click(loginButton);
        return new HomeScreen(driver);
    }

    /**
     * validate That error Message Displayed after invalid Login
     * by get Error Message Displayed attribute and check if is true or false
     */
    @Step("validate That error Message Displayed after invalid Login")
    public LoginScreen assertThatErrorMessageDisplayedAfterInvalidLogin() {
        driver.assertThat().element(errorMessageText).attribute("displayed").isEqualTo("true").perform();
        return this;
    }

}
