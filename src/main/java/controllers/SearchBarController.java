package controllers;

import models.User;
import pages.tasks.SearchBarTask;

public class SearchBarController {

    SearchBarTask searchBarTask;

    public void searchSku(User user){
        searchBarTask.searchSku(user);
    }
    public void clickSearch(){
        searchBarTask.clickSearch();
    }

    public void validateCode(){
        searchBarTask.productCodeSearch();
    }

    public void searchSkuName(User user){
        searchBarTask.searchSkuName(user);
    }

    public void searchSkuBrand(User user){
        searchBarTask.searchSkuBrand(user);
    }

    public void searchAnyWord(User user){
        searchBarTask.searchAnyWord(user);
    }

    public void productNotFound(){
        searchBarTask.productNotFound();
    }

    public void clickProductSelect(){
        searchBarTask.clickProductSelect();
    }

    public void searchEmpty(User user){
        searchBarTask.searchEmpty(user);
    }

    public void productEmpty(){
        searchBarTask.productEmpty();
    }
}
