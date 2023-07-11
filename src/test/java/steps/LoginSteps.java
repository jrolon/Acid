package steps;

import controllers.LoginController;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java8.Da;
import models.User;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginSteps {

    @Steps
    LoginController loginController;
    User userAdmin;
    List<List<String>> params;

    @Given("The user needs to login")
    public void theUserNeedsToLogin(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
    }

    @When("The user enters user name and password")
    public void theUserEntersUserNameAndPassword() {
        //loginController.signIn(userAdmin);
    }

    @Then("The user can see the welcome page")
    public void theScreenDisplayTheWelcomePage() {
        loginController.validateWelcomePage();
    }

    @And("Login as administrator")
    public void loginAsAdministrator() {
        loginController.validateNickname(userAdmin);
    }

    @Given("The user needs verify msg error")
    public void theUserNeedsVerifyMsgError() {
        loginController.launchBrowser();
    }

    @When("The user enter de botton")
    public void theUserEnterDeBotton() {
        loginController.signInBlank();
    }

    @Then("Validate msg")
    public void validateMsg() {
        //loginController.validateMessage();
    }

    @Given("que quiero validar mensaje de error en el sitio")
    public void queQuieroValidarMensajeDeErrorEnElSitio(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
    }

    @When("ingreso un usuario incorrecto")
    public void ingresoUnUsuarioIncorrecto() {
        //params = parameters.cells();
        //userAdmin = new User(params);
        loginController.signInIncorrect(userAdmin);
    }

    @When("ingreso un password incorrecto")
    public void ingresoUnPasswordIncorrecto(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.signInIncorrectPass(userAdmin);
    }

    @Then("Validate msg Pop up")
    public void validateMsgPopUp() {
        //loginController.validateMessagePopUp();
    }

    @Given("que quiero loguearme en el sitio")
    public void queQuieroLoguearmeEnElSitio(DataTable parameters) {
        //params = parameters.cells();
        //userAdmin = new User(params);
        loginController.launchBrowser();
        //loginController.signIn(userAdmin);
    }

    @When("ingreso a www.falabella.cl")
    public void ingresoAWwwFalabellaCl() {
        //
    }

    @And("hago click en el botón Iniciar Sesión")
    public void hagoClickEnElBotónIniciarSesión() {
        //loginController.signIn(userAdmin);
    }

    @And("ingreso un usuario correcto")
    public void ingresoUnUsuarioCorrecto() {
        //loginController.signIn(userAdmin);
    }

    @And("ingreso una contraseña correcta")
    public void ingresoUnaContraseñaCorrecta() {
        //
    }

    @And("hago click en el botón ingresar")
    public void hagoClickEnElBotónIngresar() {
        //
    }

    @Then("el sitio debe mostrar mi nombre indicando que estoy logueado en forma correcta")
    public void elSitioDebeMostrarMiNombreIndicandoQueEstoyLogueadoEnFormaCorrecta() {
        loginController.validateWelcomePage();
    }

    @When("ingreso a www.Paris.cl")
    public void ingresoAWwwParisCl() {
        //
    }

    @Then("el sitio debe mostrar mensaje Por favor, ingresa un correo válido.")
    public void elSitioDebeMostrarMensajePorFavorIngresaUnCorreoVálido() {
        loginController.validateMessage();
    }

    @Given("que quiero validar mensaje de error de contraseña en el sitio")
    public void queQuieroValidarMensajeDeErrorDeContraseñaEnElSitio(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
        loginController.signInIncorrectPass(userAdmin);
    }

    @And("ingreso una contraseña incorrecta")
    public void ingresoUnaContraseñaIncorrecta() {
        //
    }

    @Then("el sitio debe mostrar mensaje de error")
    public void elSitioDebeMostrarMensajeDeError() {
        loginController.validateMessagePopUp();
    }

    @Given("que quiero validar mensaje de error en el email")
    public void queQuieroValidarMensajeDeErrorEnElEmail(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
    }

    @And("dejo el campo usuario vacio")
    public void dejoElCampoUsuarioVacio() {
        loginController.signInEmailEmpty(userAdmin);
    }

    @Then("el sitio debe mostrar mensaje Ingresa un correo electrónico")
    public void elSitioDebeMostrarMensajeIngresaUnCorreoElectrónico() {
        loginController.validateMessageEmailEmpty();
    }

    @Given("que quiero validar mensaje de error en el la contraseña")
    public void queQuieroValidarMensajeDeErrorEnElLaContraseña(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
    }

    @And("dejo el campo contraseña vacio")
    public void dejoElCampoContraseñaVacio() {
        loginController.signInPassEmpty(userAdmin);
    }

    @Then("el sitio debe mostrar mensaje Ingresa una contraseña")
    public void elSitioDebeMostrarMensajeIngresaUnaContraseña() {
        loginController.validateMessagePassEmpty();
    }

    @And("dejo el campo usuario vacio empty")
    public void dejoElCampoUsuarioVacioEmpty() {
        loginController.signInEmailAndPassEmpty(userAdmin);
    }

    @And("dejo el campo contraseña vacio empty")
    public void dejoElCampoContraseñaVacioEmpty() {
        //
    }

    @Given("que quiero validar mensaje de error en el los dos campos")
    public void queQuieroValidarMensajeDeErrorEnElLosDosCampos(DataTable parameters) {
        params = parameters.cells();
        userAdmin = new User(params);
        loginController.launchBrowser();
    }

    @Then("el sitio debe mostrar mensaje de error en los dos campos")
    public void elSitioDebeMostrarMensajeDeErrorEnLosDosCampos() {
        loginController.validateMessageErrorEmailAndPassEmpty();
    }

    @And("ingreso un usuario con caracteres especiales")
    public void ingresoUnUsuarioConCaracteresEspeciales() {
        loginController.signInIncorrectSpecialCharacters(userAdmin);
    }
}