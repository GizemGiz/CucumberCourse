package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class GoogleSearchFromDataFeature {

    WebDriver driver;

    @Given("User navigate to Google website")
    public void user_navigate_to_google_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

    }
    @When("user search for {string} in Google")
    public void user_search_for_in_google(String searchData) {
        WebElement searchInput = driver.findElement(By.cssSelector("input[title='Search']"));
        searchInput.sendKeys(searchData);

        WebElement googleSearchButton = driver.findElement(By.cssSelector("input[value='Google Search']"));
        googleSearchButton.click();


    }
    @Then("User should see results {string} related in Google")
    public void user_should_see_results_related_in_google(String resultItem) {
        WebElement firstResult = driver.findElement(By.xpath("//a//h3"));

        Assert.assertTrue(firstResult.getText().toLowerCase().contains(resultItem.toLowerCase()));

        driver.quit();


    }

}
