package hooks;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Hooks {
    public static AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", System.getProperty("user.dir") + "/app/example.apk");
        caps.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        System.out.println("Launching Appium...");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

