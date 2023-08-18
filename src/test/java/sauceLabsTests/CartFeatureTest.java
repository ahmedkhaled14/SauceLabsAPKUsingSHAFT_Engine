package sauceLabsTests;

import com.shaft.driver.SHAFT;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sauceLabsScreens.CartScreen;
import sauceLabsScreens.HomeScreen;
import sauceLabsScreens.LoginScreen;
import setup.Setup;

@Epic("Sauce labs APK")
@Feature("Cart Feature")
public class CartFeatureTest {
    SHAFT.GUI.WebDriver driver;
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    CartScreen cartScreen;
    SHAFT.TestData.JSON loginTestData;
    SHAFT.TestData.JSON checkoutInformationTestData;
    SHAFT.TestData.JSON productTestData;


    @BeforeClass
    public void beforeClass() {
        loginTestData = new SHAFT.TestData.JSON("loginTestData.json");
        checkoutInformationTestData = new SHAFT.TestData.JSON("checkoutInformationTestData.json");
        productTestData = new SHAFT.TestData.JSON("productTestData.json");
    }

    @BeforeMethod(description = "setup Device")
    public void setup() {
        driver = new Setup(driver).setupDevice();
        driver = new SHAFT.GUI.WebDriver();
        loginScreen = new LoginScreen(driver);
        homeScreen = new HomeScreen(driver);
        cartScreen = new CartScreen(driver);
    }

    @Description("Given user open the application" +
            "When user login with valid Email And Password" +
            "And click On Add To Cart On First Product" +
            "And click On Cart Icon" +
            "Then the product Title And Price In Home Screen should be the same with product Title And Price In Cart Screen")
    @Story("Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "TC3: Add Item To The Cart And Validate Title And Price Of The Item")
    public void testAddItemToTheCartAndValidateTitleAndPriceOfTheItem() {

        loginScreen.loginUsingEmailAndPassword(
                loginTestData.getTestData("userName"),
                loginTestData.getTestData("password"));
        String productTitleInHomeScreen = homeScreen.getFirstProductTitleInHomeScreen();
        String productPriceInHomeScreen = homeScreen.getFirstProductPriceInHomeScreen();
        homeScreen.clickOnAddToCartOnFirstProduct();
        homeScreen.clickOnCartIcon();

        SHAFT.Validations.assertThat()
                .object(productTitleInHomeScreen)
                .isEqualTo(cartScreen.getFirstProductTitleInCartScreen())
                .perform();
        SHAFT.Validations.assertThat()
                .object(productPriceInHomeScreen)
                .isEqualTo(cartScreen.getFirstProductPriceInCartScreen())
                .perform();
    }

    @Description("Given user open the application" +
            "When user login with valid Email And Password" +
            "And click On Add To Cart On First Product" +
            "And click On Cart Icon" +
            "And click On Remove Button" +
            "Then the Cart should be Empty")
    @Story("Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "TC4: Removing Items From The Cart And Validate That The Cart Is Empty")
    public void testRemovingItemsFromTheCartAndValidateThatTheCartIsEmpty() {
        new LoginScreen(driver)
                .loginUsingEmailAndPassword
                        (
                                loginTestData.getTestData("userName"),
                                loginTestData.getTestData("password")
                        )
                .clickOnAddToCartOnFirstProduct()
                .clickOnCartIcon()
                .clickOnRemoveButton()
                .assertThatCartIsEmpty();
    }

    @Description("Given user open the application" +
            "When user login with valid Email And Password" +
            "And click On Add To Cart On First Product" +
            "And click On Cart Icon" +
            "And click On Checkout Button" +
            "And fill Checkout Information" +
            "And click On Continue Button" +
            "And click On Finish Button" +
            "Then the user is Online Ordering successfully")
    @Story("End To End Scenario")
    @Severity(SeverityLevel.CRITICAL)
    @Test(description = "TC5: Online Ordering E2E Scenario")
    public void testOnlineOrderingE2EScenario() {
        new LoginScreen(driver)
                .loginUsingEmailAndPassword
                        (
                                loginTestData.getTestData("userName"),
                                loginTestData.getTestData("password")
                        )
                .clickOnAddToCartOnFirstProduct()
                .clickOnCartIcon()
                .clickOnCheckoutButton()
                .fillCheckoutInformation
                        (
                                checkoutInformationTestData.getTestData("firstname"),
                                checkoutInformationTestData.getTestData("lastname"),
                                checkoutInformationTestData.getTestData("zipcode")
                        )
                .clickOnContinueButton()
                .assertOnProductPrice(productTestData.getTestData("productPrice"))
                .clickOnFinishButton()
                .assertThatUserCompleteOrdering();
    }

    @AfterMethod(description = "tear down")
    public void tearDown() {
        new Setup(driver).tearDown();
    }
}
