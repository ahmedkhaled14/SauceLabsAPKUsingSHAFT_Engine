package setup;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;

public class Setup {
    SHAFT.GUI.WebDriver driver;

    public Setup(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    @Step("setup")
    public SHAFT.GUI.WebDriver setupDevice() {
        SHAFT.Properties.platform.set().executionAddress(System.getProperty("executionAddress"));
        SHAFT.Properties.platform.set().targetPlatform(System.getProperty("targetPlatform"));
        SHAFT.Properties.mobile.set().app(SHAFT.Properties.paths.testData()+System.getProperty("app"));
        SHAFT.Properties.mobile.set().deviceName(System.getProperty("deviceName"));
        SHAFT.Properties.mobile.set().platformVersion(System.getProperty("platformVersion"));
        SHAFT.Properties.mobile.set().automationName(System.getProperty("automationName"));
        return driver;

    }

    @Step("tear down")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
