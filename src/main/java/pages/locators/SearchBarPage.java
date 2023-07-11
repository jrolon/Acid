package pages.locators;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.support.CacheLookup;

public class SearchBarPage extends PageObject{

    @FindBy(id = "testId-SearchBar-Input")
    @CacheLookup
    public WebElementFacade inputSearchBar;

    @FindBy(xpath = "//*[@id='testId-search-wrapper']/div/button")
    @CacheLookup
    public WebElementFacade btnSearchBar;

    @FindBy(xpath = "//span[.='Código: 118465120']")
    @CacheLookup
    public WebElementFacade productoCode;

    @FindBy(xpath = "//span[.='Tenis Running adidas Coreracer - Negro']")
    @CacheLookup
    public WebElementFacade productSelect;

    @FindBy(xpath = "//h3[contains(.,'Lo sentimos, no encontramos resultados para')]")
    @CacheLookup
    public WebElementFacade productNotFound;

    @FindBy(xpath = "//p[contains(.,'Busqueda Vacia')]")
    @CacheLookup
    public WebElementFacade productEmpty;
}
