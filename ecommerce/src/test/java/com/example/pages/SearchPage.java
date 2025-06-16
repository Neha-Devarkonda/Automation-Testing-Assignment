package com.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    WebDriver driver;

    @FindBy(id = "search-box")
    WebElement searchBox;

    @FindBy(id = "search-button")
    WebElement searchBtn;

    @FindBy(id = "search-results")
    List<WebElement> searchResults;

    @FindBy(id = "no-results-message")
    WebElement noResultsMsg;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBtn.click();
    }

    public boolean isNoResultsDisplayed(){
        return noResultsMsg.isDisplayed();
    }

    public boolean isProductListDisplayed(){
        return searchResults.size() > 0;
    }
}
