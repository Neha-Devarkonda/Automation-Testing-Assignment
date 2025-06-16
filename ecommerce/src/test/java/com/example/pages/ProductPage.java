package com.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    @FindBy(id = "add-to-cart")
    WebElement addToCartBtn;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart(){
        addToCartBtn.click();
    }
}
