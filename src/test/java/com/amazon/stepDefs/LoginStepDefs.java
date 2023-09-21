package com.amazon.stepDefs;

import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.acceptCookiesButton.click();
        Assert.assertEquals("Hello, sign in", loginPage.helloUser.getText());
    }

    @Given("the user logs in successfully")
    public void the_user_logs_in_successfully() {
        loginPage.login();
    }

}
