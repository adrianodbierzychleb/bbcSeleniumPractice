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


    public BbcHomepage goToBbcHomePage(){
        driver.navigate().to(homepageURL);
        return this;
    }

    public BbcHomepage clickSignInLink(){
        driver.findElement(signInIdLink).click();
        return this;
    }

    public BbcHomepage closeDriver(){
        driver.close();
        return this;
    }

}
