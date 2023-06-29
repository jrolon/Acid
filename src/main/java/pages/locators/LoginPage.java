package pages.locators;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=''html-body']/div[2]/header/div[1]/div/div/div/div/ul[2]/li")
    @CacheLookup
    public WebElementFacade btnAdvanceSettings;

    @FindBy(xpath = "//a[@id='proceed-link']")
    @CacheLookup
    public WebElementFacade btnContinueToWebPage;

    @FindBy(id = "email")
    @CacheLookup
    public WebElementFacade txtUserField;

    @FindBy(xpath = "(//*[@id='pass'])[1]")
    @CacheLookup
    public WebElementFacade txtPasswordField;

    @FindBy(id = "identifierNext")
    @CacheLookup
    public WebElementFacade btnSubmit;


    @FindBy(xpath = "(//*[@id='send2'])[1]")
    @CacheLookup
    public WebElementFacade btnSubmitPassword;

    @FindBy(xpath = "//*[@id='tabContent']/p[1]/b")
    @CacheLookup
    public WebElementFacade lblTextToVerify;

    @FindBy(xpath = "//span[text()='Boletines informativos']")
    @CacheLookup
    public WebElementFacade lblNickname;

    @FindBy(id = "pass-error")
    @CacheLookup
    public WebElementFacade msgError;


}
