package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DataTableWithMultipleColumn {

    WebDriver driver;

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        System.out.println("User navigate to Login page");

    }

    @When("User enter valid email address and password")
    public void user_enter_valid_email_address_and_password(io.cucumber.datatable.DataTable dataTable) {
        //{ {"test@tech.com", "12345678"}, {"admin@tech.com", "asdfgh4t5"}
        // we are using 2 list in below, that's why we put asLists here
        List<List<String >> testData = dataTable.asLists();

        for (List<String> data : testData) {
            System.out.println("Username: " + data.get(0));
            System.out.println("Password: " + data.get(1));
        }
    }

    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {

    }
}
