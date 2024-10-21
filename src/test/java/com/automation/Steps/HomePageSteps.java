package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage home = new HomePage();

    @When("User Click Logout")
    public void user_click_logout() {
        home.userLogout();
    }

}
