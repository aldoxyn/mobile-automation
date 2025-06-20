package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ProductDetailPage;


public class ProductDetailSteps {
    ProductDetailPage productDetailPage;

    public ProductDetailSteps() {
        productDetailPage = new ProductDetailPage(Hooks.driver); //Use initialized driver
    }

    @And("user choose the colour of product")
    public void userChooseTheColour() {
        productDetailPage.setColourOptions();
    }

    @And("user set the quantity")
    public void userSetTheQuantity() {
        productDetailPage.setIncreaseQuantity();
    }

    @And("user click add to cart")
    public void userTapAddToCart() {
        productDetailPage.tapAddToCart();
    }

    @When("user navigate to checkout page")
    public void userNavigateToCheckotPage(){
        productDetailPage.tapCartIcon();
    }
}
