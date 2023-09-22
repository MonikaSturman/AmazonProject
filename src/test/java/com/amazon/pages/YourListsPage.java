package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourListsPage extends BasePage{

    @FindBy(xpath="//span[contains(text(), 'Create a List')]/preceding-sibling::*")
    public WebElement createAListButton;

    @FindBy(css="#list-name")
    public WebElement listNameInput;

    @FindBy(xpath="//span[text()='Create List']/preceding-sibling::*")
    public WebElement createListButtonOnPopUp;
    public void createAList(String listName) {
        BrowserUtils.hover(helloUser);
        createAList.click();
        try{
            createAListButton.click();
        }catch(NoSuchElementException nse){
            System.out.println("NoSuchElementException caught, there might be list created already...");
        }
        listNameInput.clear();
        listNameInput.sendKeys(listName);
        BrowserUtils.waitFor(2);
        createListButtonOnPopUp.click();
        BrowserUtils.waitFor(2);
    }


}
