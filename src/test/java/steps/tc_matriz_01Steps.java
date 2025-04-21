package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_matriz_01Page;

public class tc_matriz_01Steps {

    private tc_matriz_01Page matrizPage = new tc_matriz_01Page();

    @Given("I am on the matriz page")
    public void i_am_on_the_matriz_page() {
        matrizPage.navigateToMatrizPage();
    }

    @When("I retrieve the matriz data")
    public void i_retrieve_the_matriz_data() {
        matrizPage.retrieveMatrizData();
    }

    @Then("the matriz should contain correct data")
    public void the_matriz_should_contain_correct_data() {
        Assert.assertTrue("Matriz data is incorrect", matrizPage.isMatrizDataCorrect());
    }
}