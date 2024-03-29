package pages.tasks;

import kotlin.jvm.functions.Function5;
import models.User;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
            openUrl("https://www.falabella.com.co/falabella-co");

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

        //btnPopUp.click();
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
       // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("jrolon@acid.cl");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella01*");
        btnSubmitPassword.click();
        waitFor(6000);
    }

    @Step
    public void signInIncorrect(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("jrolon@aci");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella01*");
       // btnSubmitPassword.click();
        waitFor(6000);
    }

    @Step
    public void signInIncorrectSpecialCharacters(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("dasd*/-#%/[com");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella01*");
        // btnSubmitPassword.click();
        waitFor(6000);
    }

    @Step
    public void signInIncorrectPass(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("jrolon@acid.cl");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella099");
        btnSubmitPassword.click();
        waitFor(60000);
    }

    @Step
    public void signInEmailEmpty(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella099");
       // btnSubmitPassword.click();
        waitFor(60000);
    }

    @Step
    public void signInPassEmpty(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("jrolon@acid.cl");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("");
        // btnSubmitPassword.click();
        waitFor(60000);
    }

    @Step
    public void signInEmailAndPassEmpty(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("");
        // btnSubmitPassword.click();
        waitFor(60000);
    }


    public void signInIncorrectPopUp(User user) {
        btnContinueToWebPage.click();
        btnAdvanceSettings.click();
        // moveTo(btnContinueToWebPage())
        waitFor(txtUserField);
        txtUserField.click();
        txtUserField.sendKeys("jrolon@acid.cl");
        waitFor(2000);
        //btnSubmit.click();

        txtPasswordField.sendKeys("Falabella099");
        btnSubmitPassword.click();
        waitFor(6000);
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
        waitFor(600000);
        btnContinueToWebPage.click();
        btnSearch.click();
        assertThat(lblNickname.getText(), equalTo("Hola, Jeiner"));
    }

    @Step
    public void validateMessageError(){
        //assertThat(msgError.isDisplayed(), equalTo(true));
         assertThat(msgError.getText(), equalTo("Ingresa un correo electrónico válido (nombre@ejemplo.com)"));
    }
    @Step
    public void validateIncorrectPopUp(){
        showPass.click();
        waitFor(60000);
        //assertThat(msgPopUp.isDisplayed(), equalTo(true));
        assertThat(msgPopUp.getText(), equalTo("Correo electrónico o contraseña incorrecta. Por favor, vuelve a intentarlo nuevamente."));
    }

    @Step
    public void validateMessageErrorEmailEmpty(){
        //assertThat(msgError.isDisplayed(), equalTo(true));
        assertThat(msgError.getText(), equalTo("Ingresa un correo electrónico"));
    }

    @Step
    public void validateMessageErrorPassEmpty(){
        showPass.click();
        //assertThat(msgError.isDisplayed(), equalTo(true));
        assertThat(msgErrorPass.getText(), equalTo("Ingresa una contraseña"));
    }

    @Step
    public void validateMessageErrorEmailAndPassEmpty(){
        assertThat(msgError.getText(), equalTo("Ingresa un correo electrónico"));
        showPass.click();
        //assertThat(msgError.isDisplayed(), equalTo(true));
        assertThat(msgErrorPass.getText(), equalTo("Ingresa una contraseña"));
    }


    /**
     * Validates if the nickname is the indicated
     * Date: 24/04/2023
     *
     * @author jeinerrolon
     */
    @Step
    public void validateNickname(User user) {
        showPass.click();
        waitFor(lblNickname);
        waitFor(2000);
        assertThat(lblNickname.getText(), equalTo(user.getNickname()));
    }
}
