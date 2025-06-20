package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CheckoutPage extends PageObjectManager{
    private String productTitle= "com.saucelabs.mydemoapp.android:id/titleTV";
    private String productQuantity = "com.saucelabs.mydemoapp.android:id/noTV";

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return getElement("id", productTitle).getText();
    }

    public String getProductQuantity(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return getElement("id", productQuantity).getText();
    }
}
