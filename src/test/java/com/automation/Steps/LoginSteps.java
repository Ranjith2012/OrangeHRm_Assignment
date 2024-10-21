package com.automation.Steps;

import com.automation.Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("open Website")
    public void open_website() {
        login.openWeb();
    }

    @Then("Verify user in Login Page")
    public void verifyUserInLoginPage() {
        Assert.assertTrue(login.VefLoginPage());
    }

    @When("Enter username {string} ans password {string}")
    public void enterUsernameAnsPassword(String username, String password) {
        login.loginUser(username,password);
    }
}
