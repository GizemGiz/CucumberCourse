package StepDefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class DataTableIntro {

    @Given("Navigate to website")
    public void navigate_to_website() {
        System.out.println("Navigate to website");

    }
    @When("User enter email address")
    public void user_enter_email_address(io.cucumber.datatable.DataTable dataTable) {

        // list
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

        // List = {"sagahg","1234567", {"grt45"}}
        List<String> testData = dataTable.asList();

        for (int i=0; i< testData.size(); i++){
            System.out.println("SendKeys --> " + testData.get(i));
        }
    }
    @Then("Close App")
    public void close_app() {
        System.out.println("Close app");
    }

}
