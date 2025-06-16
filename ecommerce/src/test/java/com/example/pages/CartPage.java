package com.example.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    @FindBy(id = "cart-item-quantity")
    WebElement itemQuantity;

    @FindBy(id = "item-price")
    WebElement itemPrice;

    @FindBy(id = "remove-item")
    WebElement removeBtn;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void updateQuantity(int qty) {
        itemQuantity.clear();
        itemQuantity.sendKeys(String.valueOf(qty));

        itemQuantity.sendKeys(Keys.RETURN);
    }

    public boolean isCartEmpty(){
        return driver.findElements(By.cssSelector("#cart-item")).isEmpty();
    }
}
