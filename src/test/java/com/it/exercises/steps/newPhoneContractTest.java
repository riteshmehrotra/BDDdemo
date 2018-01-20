package com.it.exercises.steps;

import com.it.exercises.domain.Customer;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by TechTalks on 1/15/2018.
 */
public class newPhoneContractTest {

    private Customer customer;
    @Given("I am a customer")
    public void given(){
        customer=new Customer();
    }

    @When("I sign a mobile contract")
    public void when(){
        customer.buyContract();
    }

    @Then("I should recevie a new phone")
    public void then(){
        assertThat(customer.myContracts(), is(equalTo(1)));
    }

    @Then("500 reward points")
    public void and(){
        assertThat(customer.myRewardPoints(),is(equalTo(500)));
    }


}
