package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="sp-cc-accept")
    public WebElement acceptCookiesButton;

    @FindBy(xpath="//span[text()='Sign in']")
    public WebElement signInButton;

    @FindBy(css="#ap_email")
    public WebElement emailInput;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(xpath="//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(id="signInSubmit")
    public WebElement signInSubmitButton;

    HomePage homePage = new HomePage();
    public void login() {
        BrowserUtils.hover(helloUser);
        signInButton.click();
        emailInput.sendKeys(ConfigurationReader.get("email"));
        continueButton.click();
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        signInSubmitButton.click();
        Assert.assertFalse(homePage.helloUser.getText().contains("sign in"));
    }
}
