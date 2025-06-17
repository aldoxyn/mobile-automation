package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductDetailPage extends PageObjectManager{
    private String colourOptions = "Blue color";
    private String increaseQuantity = "Increase item quantity";
    private String decreaseQuantity = "Decrease item quantity";
    private String addToCart = "Tap to add product to cart";
    private String cartIcon = "com.saucelabs.mydemoapp.android:id/cartIV";

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }


    public void setColourOptions(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("accessibilityid", colourOptions);
    }

    public void setIncreaseQuantity(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("accessibilityid", increaseQuantity);
    }

    public void setDecreaseQuantity(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("accessibilityid", decreaseQuantity);
    }

    public void tapAddToCart(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("accessibilityid", addToCart);
    }

    public void tapCartIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", cartIcon);
    }
}
