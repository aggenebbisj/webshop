package nl.rdj.promoprofs.regression.products;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.rdj.promoprofs.regression.base.BaseSteps;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.support.PageFactory;

public class ProductSteps extends BaseSteps {

    private AllProductsPage allProductsPage;

    @Given("^the available products \"(.*?)\"$")
    public void the_available_products(String products) throws Throwable {
        // TODO Insert products into database
    }

    @When("^navigating to the \"(.*?)\" page$")
    public void navigating_to_the_page(String page) {
        allProductsPage = PageFactory.initElements(browser, AllProductsPage.class);
    }

    @Then("^all (\\d+) products should be displayed$")
    public void all_products_should_be_displayed(int numberOfProducts) {
        assertThat(allProductsPage.products.getText().split("\n").length, is(numberOfProducts));
    }
}
