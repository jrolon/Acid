package steps;

import controllers.LoginController;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
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
        loginController.signIn(userAdmin);
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
        loginController.validateMessage();
    }
}
