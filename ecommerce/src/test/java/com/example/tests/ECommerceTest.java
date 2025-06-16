package com.example.tests;

import com.example.pages.CartPage;
import com.example.pages.ProductPage;
import com.example.pages.SearchPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ECommerceTest extends BaseTest {

    private SearchPage searchPage;
    private ProductPage productPage;
    private CartPage cartPage;

    @BeforeMethod
    public void setUpPageObjects(){
        searchPage = new SearchPage(SearchPage);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testSearchNonExistingProduct(){
        searchPage.searchProduct("ld345tsxslfer");

        assertTrue(searchPage.isNoResultsDisplayed(), "No results message not displayed.");
    }

    @Test
    public void testSearchExistingProduct(){
        searchPage.searchProduct("Laptop");

        assertTrue(searchPage.isProductListDisplayed(), "Product list not displayed.");
    }

    @Test
    public void testAddProductToCart(){
        searchPage.searchProduct("Laptop");

        List<WebElement> results = driver.findElements(By.cssSelector("#search-results .item"));
        results.get(3).click();

        productPage.addToCart();

        assertEquals(cartPage.itemQuantity.getAttribute("value"), "1");

        cartPage.updateQuantity(2);
        assertEquals(cartPage.itemQuantity.getAttribute("value"), "2");

        cartPage.removeBtn.click();

        assertTrue(cartPage.isCartEmpty(), "Cart is not empty after removal.");
    }
}
