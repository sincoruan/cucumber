package com.practice.chapter01;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matcher;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorDef {
    private Calculator calculator;
    private int result;

    @Given("^x is (\\d+) and y is (\\d+)$")
    public void xIsAndYIs(int arg0, int arg1) {
        this.calculator= new Calculator(arg0,arg1);
    }

    @When("^I invoke add method$")
    public void iInvokeAddMethod() {
        result = this.calculator.add();
    }

    @Then("^the result is (\\d+)$")
    public void theResultIs(int arg0) {
        assertThat(arg0,equalTo(result));
    }


}
