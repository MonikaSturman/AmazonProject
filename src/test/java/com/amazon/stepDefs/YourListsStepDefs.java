package com.amazon.stepDefs;

import com.amazon.pages.YourListsPage;
import io.cucumber.java.en.Given;

public class YourListsStepDefs {

    YourListsPage yourListsPage = new YourListsPage();
    @Given("the user creates a list named as {string}")
    public void the_user_creates_a_list_named_as(String listName) {
        yourListsPage.createAList(listName);
    }

}
