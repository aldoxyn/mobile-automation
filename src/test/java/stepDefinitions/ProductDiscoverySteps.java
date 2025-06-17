import hooks.Hooks;
import io.cucumber.java.en.Given;
import pages.ProductDiscoveryPage;

public class ProductDiscoverySteps {
    ProductDiscoveryPage productDiscoveryPage;

    public ProductDiscoverySteps() {
        productDiscoveryPage = new ProductDiscoveryPage(Hooks.driver); // Use initialized driver
    }

    @Given("user choose the product")
    public void userTapsBackPacksProduct() {
        productDiscoveryPage.tapBackPacksProduct();
        System.out.println("Launching Appium...");
    }
}
