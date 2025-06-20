package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductDiscoveryPage extends PageObjectManager{
    private String backPacks = "Sauce Lab Back Packs";

    public ProductDiscoveryPage(WebDriver driver) {
        super(driver);
    }

    public void tapBackPacksProduct(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("accessibilityid", backPacks);
    }

}
