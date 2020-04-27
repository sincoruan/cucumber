package com.practice.chapter01;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleScenarioWithoutBackground {
    @Given("^x and y value$")
    public void xAndYValue() {
        
    }

    @And("^add operation$")
    public void addOperation() {
        
    }

    @When("^invoke calculator button$")
    public void invokeCalculatorButton() {
        
    }

    @Then("^the result is x\\+y$")
    public void theResultIsXY() {
    }
}
