package Defination;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SimpleFormSteps {
    WebDriver driver;

    @Given("I am on the simple form page")
    public void i_am_on_the_simple_form_page() {
        driver = new ChromeDriver();
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }

    @When("I enter the name {string} and email {string}")
    public void i_enter_name_and_email(String name, String email) {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement emailField = driver.findElement(By.id("email"));
        nameField.sendKeys(name);
        emailField.sendKeys(email);
    }

    @When("I enter the message {string}")
    public void i_enter_message(String message) {
        WebElement messageField = driver.findElement(By.id("message"));
        messageField.sendKeys(message);
    }

    @When("I click on the submit button")
    public void i_click_submit_button() {
        WebElement submitButton = driver.findElement(By.cssSelector(".ui.green.button"));
        submitButton.click();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_confirmation_message() {
        WebElement confirmation = driver.findElement(By.id("confirmation-message"));
        Assert.assertTrue(confirmation.isDisplayed());
        driver.quit();
    }
}