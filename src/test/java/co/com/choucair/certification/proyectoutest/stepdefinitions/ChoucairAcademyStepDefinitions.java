package co.com.choucair.certification.proyectoutest.stepdefinitions;

import co.com.choucair.certification.proyectoutest.questions.GetText;
import co.com.choucair.certification.proyectoutest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.choucair.certification.proyectoutest.userinterface.UtestSuccessPage.LABEL_SUCCESS;
import static co.com.choucair.certification.proyectoutest.util.Words.MENSAJE_EXITOSO;
import static org.hamcrest.Matchers.equalTo;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Christian quiere registrarse en la pagina de utest$")
    public void christianQuiereRegistrarseEnLaPaginaDeUtest() {
        OnStage.theActorCalled("Christian").wasAbleTo(
                OpenUp.thePage(),
                Login.OnThePage());
    }


    @When("^El ingresa al formato de registro en la pagina de utest$")
    public void elIngreseAlFormatoDeRegistroEnLaPaginaDeUtest() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                JoinForm.Navigate(),
                AddAddress.Navigate(),
                Devices.Navigate(),
                AddPassword.Navigate()
                );
    }

    @Then("^El ingresa sus datos y se registra en la pagina de utest$")
    public void elIngresaSusDatosYSeRegistraEnLaPaginaDeUtest() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(GetText.ofField(LABEL_SUCCESS),
                        equalTo(MENSAJE_EXITOSO)));
    }
}
