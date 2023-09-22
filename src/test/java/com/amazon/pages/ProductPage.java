package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(id="add-to-wishlist-button-submit")
    public WebElement addToListButton;


}
