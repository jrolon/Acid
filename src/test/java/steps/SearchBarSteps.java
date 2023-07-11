package steps;

import controllers.LoginController;
import controllers.SearchBarController;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import models.User;
import net.thucydides.core.annotations.Steps;
import pages.tasks.LoginTask;

import java.util.List;

public class SearchBarSteps {

    @Steps
    SearchBarController searchBarController;
    User userAdmin;
    List<List<String>> params;


    @And("busco el SKU 118465120")
    public void buscoElSku118465120() {
        searchBarController.searchSku(userAdmin);
    }

    @And("hago click en la lupa")
    public void hagoClickEnLaLupa() {
        searchBarController.clickSearch();
    }

    @Then("se valida que el SKU corresponda al producto")
    public void seValidaQueElSKUCorrespondaAlProducto() {
        searchBarController.validateCode();
    }

    @And("busco el nombre del producto")
    public void buscoElNombreDelProducto() {
        searchBarController.searchSkuName(userAdmin);
    }

    @And("selecciono el producto")
    public void seleccionoElProducto() {
        searchBarController.clickProductSelect();
    }

    @And("busco la marca del producto")
    public void buscoLaMarcaDelProducto() {
        searchBarController.searchSkuBrand(userAdmin);
    }

    @And("busco la palabra jajkajkajka")
    public void buscoLaPalabraJajkajkajka() {
        searchBarController.searchAnyWord(userAdmin);
    }

    @Then("se valida el mensaje Lo sentimos, no encontramos resultados para")
    public void seValidaElMensajeLoSentimosNoEncontramosResultadosPara() {
        searchBarController.productNotFound();
    }

    @And("dejo la barra de busqueda en blanco")
    public void dejoLaBarraDeBusquedaEnBlanco() {
        searchBarController.searchEmpty(userAdmin);
    }

    @Then("se valida que muestre el mensaje Busqueda vacia")
    public void seValidaQueMuestreElMensajeBusquedaVacia() {
        searchBarController.productEmpty();
    }
}
