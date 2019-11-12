package com.spartaglobal.bbcSeleniumExample.BbcSite;

import com.spartaglobal.bbcSeleniumExample.BbcSite.pages.BbcHomepage;
import com.spartaglobal.bbcSeleniumExample.BbcSite.pages.BbcSignInPage;
import org.openqa.selenium.WebDriver;

public class BbcSite {
    private WebDriver driver;
    private BbcHomepage bbcHomepage;
    private BbcSignInPage bbcSignInPage;

    public BbcSite(WebDriver driver)
    {
        this.driver = driver;
        this.bbcHomepage = new BbcHomepage(driver);
        this.bbcSignInPage = new BbcSignInPage(driver);
    }

    public BbcHomepage bbcHomepage(){
        return bbcHomepage;
    }

    public BbcSignInPage bbcSignInPage(){
        return bbcSignInPage;
    }


}
