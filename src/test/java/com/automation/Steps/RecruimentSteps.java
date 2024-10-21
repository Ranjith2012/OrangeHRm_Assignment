package com.automation.Steps;

import com.automation.Pages.RecruitmentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruimentSteps {
    RecruitmentPage req = new RecruitmentPage();

    @When("Click on Recruitment link")
    public void click_on_recruitment_link() {
        req.clickRecruirement();
    }

    @When("Fill required details with upload on doc file in resume")
    public void fill_required_details_with_upload_on_doc_file_in_resume() {
        req.filluserDetails();

    }

    @Then("Search candidate with name")
    public void search_candidate_with_name() {
        req.searchByname();
    }

    @Then("Verify search result displays candidate name")
    public void verify_search_result_displays_candidate_name() {
        req.VefNewlyCreatedUser();
    }

}
