package nl.rdj.promoprofs.regression;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {

    @Given("^the product overview page$")
    public void the_product_overview_page() throws Throwable {
        throw new PendingException();
    }

    @Then("^at least (\\d+) product should be displayed$")
    public void at_least_product_should_be_displayed(int arg1) throws Throwable {
        throw new PendingException();
    }
}
