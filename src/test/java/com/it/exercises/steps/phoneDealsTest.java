package com.it.exercises.steps;

import com.it.exercises.domain.Deal;
import com.it.exercises.domain.Customer;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
/**
 * Created by TechTalks on 1/11/2018.
 */
public class phoneDealsTest {
    private Customer customer;
    private List<Deal> availableDeals;

    @Given("I am a star member")
    public void given(){
        customer =new Customer();
    }

    @When("I request for $filter types phone deals")
    public void when(@Named("filter") String filter){
        availableDeals= customer.getDeals(filter);
    }

    @Then("I should get the list of available deals with prices: $table")
    public void then(ExamplesTable exampleDeals){
        int counter=0;
        for(Map<String,String> row:exampleDeals.getRows()){
            assertThat(availableDeals.get(counter).getPhoneName(), is(equalTo(row.get("Phone name"))));
            assertThat(availableDeals.get(counter).getRAM(), is(equalTo(row.get("RAM"))));
            assertThat(availableDeals.get(counter).getPlanName(), is(equalTo(row.get("Plan name"))));
            assertThat(availableDeals.get(counter).getPrice(), is(equalTo(row.get("Price"))));
            counter++;
        }
    }
}
