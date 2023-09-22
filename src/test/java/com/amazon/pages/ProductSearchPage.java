package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductSearchPage extends BasePage{

    @FindBy(id="searchDropdownBox")
    public WebElement categoryDropdown;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(id="nav-search-submit-button")
    public WebElement searchIcon;

    @FindBy(css=".a-color-state.a-text-bold")
    public WebElement searchResultMessage;

    // try to find better locator to locate the search results
    // however, this one is good in terms of practising the "ignore case" in Xpath
    @FindBy(xpath="(//h2/a/span[contains(translate(., 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), 'hp laptop')])[2]")
    public WebElement firstProductInSearchResults;

    ProductPage productPage = new ProductPage();
    public void selectCategoryForSearch(String category) {
        Select select = new Select(categoryDropdown);
        select.selectByVisibleText(category);
        // verify category is actually selected)
        Assert.assertEquals(category, select.getFirstSelectedOption().getText());
    }

    public void searchProduct(String product) {
        searchBar.sendKeys(product);
//        searchIcon.click();
        searchIcon.sendKeys(Keys.ENTER);
    }

    public void verifySearchResult(String product) {
//        Assert.assertEquals("\"" + product + "\"", searchResultMessage.getText());
        Assert.assertTrue(searchResultMessage.getText().contains(product));
    }

    public void clickFirstProduct() {
        firstProductInSearchResults.click();
        productPage.addToListButton.click();
    }
}
