package com.automation.Steps;

import com.automation.Pages.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSteps {
    AdminPage admin = new AdminPage();

    @And("click on Admin page")
    public void clickOnAdminPage() {
        admin.goToAdminPage();
    }

    @When("Click on Add button")
    public void click_on_add_button() {
        admin.AddBtnClick();
    }

    @Then("Select user Role - ESS")
    public void selectUserRoleESS() {
        admin.setUserRole();
    }

    @And("Employee name - James  Butler")
    public void employeeNameJamesButler() {
        admin.selectEmployeeName();
    }

    @And("Status Enable")
    public void statusEnable() {
        admin.setStatus();
    }

    @When("Generate username randomly")
    public void generateUsernameRandomly() {
        admin.UsernameRandomly();
    }

    @And("Generate password randomly")
    public void generatePasswordRandomly() {
        admin.passwordAndConfirmRandomly();
    }

    @And("Click on Save Button")
    public void clickOnSaveButton() {
        admin.setSaveBtn();
    }

    @Then("Verify success message is displayed")
    public void verifySuccessMessageIsDisplayed() {
        Assert.assertTrue(admin.VefSuccessMsg());
    }
    @When("Search with newly created user")
    public void search_with_newly_created_user() throws InterruptedException {
        admin.searchUsernameBar();
        admin.searchRole();

    }

    @And("Verify newly created user displayed in search list")
    public void verifyNewlyCreatedUserDisplayedInSearchList() {
        Assert.assertTrue(admin.VerifyUserDetailDisplayed());
    }

    @And("Click on delete icon of the newly created user")
    public void clickOnDeleteIconOfTheNewlyCreatedUser() {
        admin.clickDeleteBtn();
    }


    @And("Verify Successfully Deleted is displayed")
    public void verifySuccessfullyDeletedIsDisplayed()  {
        Assert.assertTrue(admin.vefDeleteMsgDisplayed());
    }
}
