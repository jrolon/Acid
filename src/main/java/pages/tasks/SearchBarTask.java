package pages.tasks;

import models.User;
import net.thucydides.core.annotations.Step;
import pages.locators.SearchBarPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SearchBarTask extends SearchBarPage {

    @Step
    public void searchSku(User user) {
        inputSearchBar.sendKeys("118465120");
    }

    @Step
    public void searchSkuName(User user) {
        inputSearchBar.sendKeys("Tenis Running adidas Coreracer - NegroTenis Running adidas Coreracer - Negro");
    }

    @Step
    public void searchSkuBrand(User user) {
        inputSearchBar.sendKeys("ADIDAS");
    }

    @Step
    public void clickSearch() {
        btnSearchBar.click();
    }

    @Step
    public void productCodeSearch() {
        assertThat(productoCode.getText(), equalTo("Código: 118465120"));
    }

    @Step
    public void productNotFound() {
        assertThat(productNotFound.getText(), equalTo("Lo sentimos, no encontramos resultados para 'jajkajkajka'"));
    }

    @Step
    public void productEmpty() {
        assertThat(productEmpty.getText(), equalTo("Busqueda Vacia"));
    }



    @Step
    public void clickProductSelect() {
        productSelect.click();
    }

    @Step
    public void searchAnyWord(User user) {
        inputSearchBar.sendKeys("jajkajkajka");
    }

    @Step
    public void searchEmpty(User user) {
        inputSearchBar.sendKeys("   ");
    }
}
