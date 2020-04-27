package com.practice.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleWithoutAddAndBut {
    @Given("^uesr open the url of git$")
    public void uesr_open_the_url_of_git() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user open the url of git");
    }

    @Given("^user open the url of jenkins$")
    public void user_open_the_url_of_jenkins() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user open the url of jenkins");
    }

    @When("^click build job button$")
    public void click_build_job_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^click build job button$");
    }

    @Then("^the job will be started$")
    public void the_job_will_be_started() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^the job will be started$");
    }

    @When("^click the job id link$")
    public void click_the_job_id_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^click the job id link$");
    }

    @When("^choice the job console$")
    public void choice_the_job_console() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^choice the job console$");
    }

    @When("^click into the console page$")
    public void click_into_the_console_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^click into the console page$");
    }

    @Then("^the job building log will be print$")
    public void the_job_building_log_will_be_print() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^the job building log will be print$");
    }

    @Then("^the last job can see successfully state$")
    public void the_last_job_can_see_successfully_state() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("^the last job can see successfully state$");
    }

}
