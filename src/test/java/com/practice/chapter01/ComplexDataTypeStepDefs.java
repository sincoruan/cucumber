package com.practice.chapter01;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class ComplexDataTypeStepDefs {
    @Given("^the user account information$")
    public void theUserAccountInformation() {
        
    }

    @Then("^we can found user \"([^\"]*)\" with password \"([^\"]*)\" ,phone \"([^\"]*)\" exists$")
    public void weCanFoundUserWithPasswordPhoneExists(String arg0, String arg1, String arg2) throws Throwable {
        System.out.println(arg0);
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Given("^the user account infomation$")
    public void theUserAccountInfomation() {

    }

    @Then("^we verify following user exsits$")
    public void weVerifyFollowingUserExsits(DataTable dataTable) {
        List<List<String>> list= dataTable.raw();
        list.forEach(System.out::println);
    }
}
