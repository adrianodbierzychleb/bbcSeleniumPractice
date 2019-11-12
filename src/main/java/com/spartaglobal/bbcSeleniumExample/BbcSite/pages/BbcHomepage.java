package com.spartaglobal.bbcSeleniumExample.BbcSite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BbcHomepage {

    private WebDriver driver;

    private String homepageURL = "https://www.bbc.co.uk/";

    private By signInIdLink = By.id("idcta-link");

    public BbcHomepage(WebDriver driver)
    {
        this.driver = driver;
    }


    public void goToBbcHomePage(){
        driver.navigate().to(homepageURL);
    }

    public void clickSignInLink(){
        driver.findElement(signInIdLink).click();
    }

    public void closeDriver(){
        driver.close();
    }

}
