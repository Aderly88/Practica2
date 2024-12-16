package com.nttdata.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class PetStoreStepDef {
    @Given("la url es {string}")
    public void laUrlEs(String arg0) {
        RestAssured
                .given()
                //.relaxedHTTPSValidation()
                .baseUri("https://petstore.swagger.io/v2/pet/1")
                .log().all()
                .get()
        ;
    }

    @When("consulto la mascota con ID {string}")
    public void consultoLaMascotaConID(String arg0) {
    }

    @Then("valido el codigo de resúesta sea {int}")
    public void validoElCodigoDeResuestaSea(int arg0) {
    }
}
