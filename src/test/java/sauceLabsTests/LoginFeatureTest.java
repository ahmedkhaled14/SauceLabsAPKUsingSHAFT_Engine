package sauceLabsTests;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sauceLabsScreens.LoginScreen;
import setup.Setup;

@Epic("Sauce labs APK")
@Feature("Login Feature")
public class LoginFeatureTest {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON loginTestData;

    @BeforeClass
    public void beforeClass() {
        loginTestData = new SHAFT.TestData.JSON("loginTestData.json");
    }

    @BeforeMethod(description = "setup Device")
    public void setup() {
        driver = new Setup(driver).setupDevice();
        driver = new SHAFT.GUI.WebDriver();
    }

    @Description("Given user open the application" +
            "When user login with Valid Email And Password" +
            "Then Login should Performed Successfully")
    @Story("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "TC1: login Using Valid Email And Password")
    public void testLoginUsingValidEmailAndPassword() {
        new LoginScreen(driver)
                .loginUsingEmailAndPassword
                        (
                                loginTestData.getTestData("userName"),
                                loginTestData.getTestData("password")
                        )
                .assertThatLoginIsPerformedSuccessfully();
    }

    @Description("Given user open the application" +
            "When user login with Invalid Email And Password" +
            "Then Error Message should be Displayed After Invalid Login")
    @Story("Login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "TC2: login Using Invalid Email or Password")
    public void testLoginUsingInvalidEmailOrPassword() {
        new LoginScreen(driver)
                .loginUsingEmailAndPassword
                        (
                                loginTestData.getTestData("invalidUserName"),
                                loginTestData.getTestData("invalidPassword")
                        );
        new LoginScreen(driver)
                .assertThatErrorMessageDisplayedAfterInvalidLogin();
    }

    @AfterMethod(description = "tear down")
    public void tearDown() {
        new Setup(driver).tearDown();
    }
}
