package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_estrategia_01Page;

public class tc_estrategia_01Steps {
    WebDriver driver;
    tc_estrategia_01Page estrategiaPage;

    public tc_estrategia_01Steps() {
        this.driver = Hooks.driver; // Assuming Hooks is a class managing WebDriver
        estrategiaPage = new tc_estrategia_01Page(driver);
    }

    @Given("^estoy en la página de estrategias$")
    public void estoy_en_la_pagina_de_estrategias() {
        estrategiaPage.navigateToEstrategiasPage();
    }

    @When("^reviso la estrategia$")
    public void reviso_la_estrategia() {
        estrategiaPage.revisarEstrategia();
    }

    @Then("^la estrategia es aprobada$")
    public void la_estrategia_es_aprobada() {
        estrategiaPage.verificarAprobacionEstrategia();
    }
}