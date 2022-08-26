package StepDefinition;

import io.cucumber.java.en.*;

public class SearchWithData {

    @When("User search for {string}")
    public void user_search_for(String searchItem) {
        System.out.println("User search for: " + searchItem);
    }
    @Then("All the result should be displayed for {string}")
    public void all_the_result_should_be_displayed_for(String searchResultItem) {
        System.out.println("User got result related to: " + searchResultItem);

    }

}
