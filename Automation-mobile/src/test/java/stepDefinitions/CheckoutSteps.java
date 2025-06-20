package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CheckoutPage;


public class CheckoutSteps {
    CheckoutPage checkoutPage;

    public CheckoutSteps() {
        checkoutPage = new CheckoutPage(Hooks.driver); //Use initialized driver
    }

    @Then("the product title should be {string}")
    public void verifyProductTitle(String expectedTitle) {
        String actualTitle = checkoutPage.getProductTitle();
        Assert.assertEquals("Product title doesn't match", expectedTitle, actualTitle);
    }

    @And("the product quantity should be {int}")
    public void verifyProductQuantity(int expectedQty) {
        String actualQtyStr = checkoutPage.getProductQuantity();
        int actualQty = Integer.parseInt(actualQtyStr);
        Assert.assertEquals("Product quantity doesn't match", expectedQty, actualQty);
    }
}
