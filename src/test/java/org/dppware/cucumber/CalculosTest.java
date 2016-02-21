package org.dppware.cucumber;

import org.junit.Assert;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CalculosTest {


	public int summatory = 0;
	public int param1 = 0;
	public int param2 = 0;
	
    @Given("^dos numeros (\\d+),(\\d+)$")
    public void given_dos_numeros(int x, int y) {
    	param1 = x;param2 =y;
    }

    @When("^sumo los dos numeros$")
    public void sumo_los_dos_numeros() {
    	summatory = param1+param2;
    }
    
    @And("^multiplico el resultado por (\\d+)$")
    public void multiplico_el_resultado_por(int x) {
    	summatory = summatory * x;
    }
   
    @Then("^resultado debe ser (\\d+)$")
    public void resultado_debe_ser(int x) {
        Assert.assertEquals(x,summatory);
    }

}
