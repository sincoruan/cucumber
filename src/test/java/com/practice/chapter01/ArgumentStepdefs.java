package com.practice.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArgumentStepdefs {

    @Given("^the name is \"([^\"]*)\" and age is (\\d+)$")
    public void theNameIsAndAgeIs(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^format the input$")
    public void formatTheInput() {
    }

    @Then("^the format string is alex-(\\d+)$")
    public void theFormatStringIsAlex(int arg0) {
    }


}
