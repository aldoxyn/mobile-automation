package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.ProductDiscoveryPage;
import utils.AndroidSetup;

public class ProductDiscoverySteps {
    ProductDiscoveryPage productDiscoveryPage;

    public ProductDiscoverySteps() {
        productDiscoveryPage = new ProductDiscoveryPage(AndroidSetup.driver);
    }

    @Given("user choose the product")
    public void userTapsBackPacksProduct() {
        productDiscoveryPage.tapBackPacksProduct();
    }
}
