package pages.locators;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage extends PageObject {

    @FindBy(id = "testId-loggedout-item-0")
    @CacheLookup
    public WebElementFacade btnAdvanceSettings;

    @FindBy(id = "testId-UserAction-userinfo")
    @CacheLookup
    public WebElementFacade btnContinueToWebPage;

    @FindBy(xpath = "//*[@id='dytmpl-16660807']/picture/img")
    @CacheLookup
    public WebElementFacade btnPopUp;

    @FindBy(id = "testId-cc-login-form-email-input")
    @CacheLookup
    public WebElementFacade txtUserField;

    @FindBy(id = "testId-cc-login-form-password-input")
    @CacheLookup
    public WebElementFacade txtPasswordField;

    @FindBy(id = "testId-SearchBar-Input")
    @CacheLookup
    public WebElementFacade btnSearch;

    @FindBy(id = "testId-cc-login-form-submit")
    @CacheLookup
    public WebElementFacade btnSubmitPassword;

    @FindBy(xpath = "//*[@id='tabContent']/p[1]/b")
    @CacheLookup
    public WebElementFacade lblTextToVerify;

    @FindBy(id = "testId-UserAction-userinfo")
    @CacheLookup
    public WebElementFacade lblNickname;

    @FindBy(id = "testId-cc-login-form-email-help")
    @CacheLookup
    public WebElementFacade msgError;

    @FindBy(id = "testId-cc-login-form-password-help")
    @CacheLookup
    public WebElementFacade msgErrorPass;

    @FindBy(xpath = "//*[@id='testId-cc-login-form']/form/div[1]")
    @CacheLookup
    public WebElementFacade msgPopUp;

    @FindBy(id = "testId-cc-login-form-password-icon-button")
    @CacheLookup
    public WebElementFacade showPass;

    @FindBy(id = "testId-cc-login-form-email-help")
    @CacheLookup
    public WebElementFacade msgErrorEmailEmpty;

}


