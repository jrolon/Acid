package pages.tasks;

import models.User;
import net.thucydides.core.annotations.Step;
import pages.locators.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static utilities.LoggerHandler.logType.ERROR;
import static utilities.LoggerHandler.registerInfo;

public class LoginTask extends LoginPage {

    /**
     * Open the URL to the admin app
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     * ChangeLog:
     */
    @Step
    public void launchBrowser() {
        try {
            openUrl("https://www.kliper.cl/customer/account/login");
        } catch (Exception e) {
            registerInfo(LoginTask.class, ERROR, "It is not possible to launch the application");
        }
    }

    /**
     * Try to Log in on Evertec Admin using username and password from datatable feature
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    @Step
    public void signIn(User user) {
        //btnAdvanceSettings.click();
        //btnContinueToWebPage.click();
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("aleatorio1001@gmail.com");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Registro123.2");
        btnSubmitPassword.click();
    }

    @Step
    public void signInBlank(){
        btnSubmitPassword.click();
    }

    /**
     * Validates if the user's Log in was successful, and he's on welcome page
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    @Step
    public void validateWelcomePage() {
       // waitFor(lblNickname);
      //  lblNickname.shouldBeVisible();
        assertThat(lblNickname.getText(), equalTo("Boletines informativos"));
    }

    @Step
    public void validateMessageError(){
        assertThat(msgError.getText(), equalTo("Este es un campo obligatorio."));
    }

    /**
     * Validates if the nickname is the indicated
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    @Step
    public void validateNickname(User user) {
        waitFor(lblNickname);
        waitFor(2000);
        assertThat(lblNickname.getText(), equalTo(user.getNickname()));
    }
}
