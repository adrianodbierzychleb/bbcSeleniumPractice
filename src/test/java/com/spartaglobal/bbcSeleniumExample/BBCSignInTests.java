package com.spartaglobal.bbcSeleniumExample;

import com.spartaglobal.bbcSeleniumExample.BbcSite.BbcSite;
import com.spartaglobal.bbcSeleniumExample.seleniumconfig.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCSignInTests {



    private static BbcSite bbcSite;
    private static WebDriver chromeDriver;

    private String invalidPasswordExpectedMessage = "Sorry, that password isn't valid. Please include something that isn't a letter.";
    private String passwordTooShortExpectedMessage = "Sorry, that password is too short. It needs to be eight characters or more.";
    private String incorectPasswordExpectedMessage = "That's not the right password for that account. Reset your password here.";
    private String accountNotExistExpectedMessage = "Sorry, we can’t find an account with that username. If you're over 13, try your email address instead or get help here.";
    private String invalidUsernameExpectedMessage = "Usernames can only include... Letters, numbers and these characters: ?/|}{+=_-^~`%$#";


    @BeforeClass
    public static void setup(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        SeleniumConfig driver = new SeleniumConfig("chrome", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        bbcSite = new BbcSite(driver.getDriver());
    }

//    @AfterClass
//    public static void teardown(){
//        bbcSite.bbcHomepage().closeDriver();
//    }


    @Test
    public void invalidPasswordErrorTest(){
//        bbcSite.bbcHomepage().goToBbcHomePage().clickSignInLink();
//        bbcSite.bbcSignInPage().inputUserName("dsada").inputPassword("shortadek").clickSubmitButton();
        Assert.assertEquals(invalidPasswordExpectedMessage, bbcSite.bbcSignInPage().goToSignInPage().inputUserName("asda").inputPassword("shortadek").sendTabKey().passwordError());

    }

    @Test
    public void incorectPasswordErrorTest(){
//        bbcSite.bbcHomepage().goToBbcHomePage().clickSignInLink();
//        bbcSite.bbcSignInPage().inputUserName("test@gmail.com").inputPassword("wrongpass123").clickSubmitButton();
        Assert.assertEquals(incorectPasswordExpectedMessage,bbcSite.bbcSignInPage().goToSignInPage().inputUserName("test@gmail.com").inputPassword("wrongpass123").sendTabKey().passwordError());
    }


    @Test
    public void tooShortPasswordErrorTest()
    {
//        bbcSite.bbcHomepage().goToBbcHomePage().clickSignInLink();
//        bbcSite.bbcSignInPage().inputUserName("makeczek").inputPassword("krotkie").clickSubmitButton();
        Assert.assertEquals(passwordTooShortExpectedMessage, bbcSite.bbcSignInPage().goToSignInPage().inputUserName("bobby").inputPassword("srt").sendTabKey().passwordError());
    }



    @Test
    public void accountDoesNotExistError(){
//        bbcSite.bbcHomepage().goToBbcHomePage().clickSignInLink();
//        bbcSite.bbcSignInPage().inputUserName("thisi234421").inputPassword("krotkie3421").clickSubmitButton();
        Assert.assertEquals(accountNotExistExpectedMessage, bbcSite.bbcSignInPage().goToSignInPage().inputUserName("this11231231").inputPassword("wrongpass123").sendTabKey().userNameError());
    }


    @Test
    public void invalidUsernameTest(){
//        bbcSite.bbcHomepage().goToBbcHomePage().clickSignInLink();
//        bbcSite.bbcSignInPage().inputUserName("username$%*!").inputPassword("short12345").clickSubmitButton();
        Assert.assertEquals(invalidUsernameExpectedMessage, bbcSite.bbcSignInPage().goToSignInPage().inputUserName("username&!%").inputPassword("wrongpass123").sendTabKey().userNameError());
    }


}
