package com.spartaglobal.bbcSeleniumExample.BbcSite.pages;

import com.spartaglobal.bbcSeleniumExample.BbcSite.BbcSite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BbcSignInPage {
    private WebDriver driver;
    private String bbcSignInPage = "https://account.bbc.com/signin";
    private By userNameFieldID = By.id("user-identifier-input");
    private By passwordFieldID = By.id("password-input");
    private By submitBUttonID = By.id("submit-button");
    private By userNameError = By.id("form-message-username");
    private By passwordError = By.id("form-message-password");



    public BbcSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public BbcSignInPage goToSignInPage(){
        driver.navigate().to(bbcSignInPage);
        return this;
    }

    public BbcSignInPage inputUserName(String username){
        driver.findElement(userNameFieldID).sendKeys(username);
        return this;
    }
    public BbcSignInPage inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
        return this;
    }

    public BbcSignInPage clickSubmitButton(){
        driver.findElement(submitBUttonID).click();
        return this;
    }

    public BbcSignInPage sendTabKey(){
        driver.findElement(passwordFieldID).sendKeys(Keys.TAB);
        return this;
    }

    public String passwordError(){
        return driver.findElement(passwordError).getText();
    }

    public String userNameError(){
        return driver.findElement(userNameError).getText();
    }

}
