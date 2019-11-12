package com.spartaglobal.bbcSeleniumExample;

import com.spartaglobal.bbcSeleniumExample.BbcSite.pages.BbcHomepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adrian Odbierzychleb\\Downloads\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

//         chromeDriver.navigate().to("https://www.bbc.co.uk/");
//        chromeDriver.findElementById("idcta-link").click();
//        chromeDriver.findElement(By.id("user-identifier-input")).sendKeys("Hello World!");
//        chromeDriver.findElementById("user-identifier-input").sendKeys("Hello my name is");
//        chromeDriver.findElementById("password-input").sendKeys("the password is");
//        chromeDriver.findElementById("submit-button").click();

//        BbcHomepage bbcHomepage = new BbcHomepage(chromeDriver);
//
//        bbcHomepage.goToBbcHomePage();
//        bbcHomepage.clickSignInLink();
//        bbcHomepage.closeDriver();

























//        chromeDriver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
//        chromeDriver.findElementById("cookie_action_close_header").click();
//        chromeDriver.findElementByLinkText("Partial Link Test").click();
//
//        chromeDriver.findElementByName("firstname").sendKeys("marek");
//        chromeDriver.findElementById("lastname").sendKeys("mostowiak");

        //chromeDriver.findElementById("sex-0").click();
        //chromeDriver.findElementById("buttonwithclass").click();


//        Random rnd = new Random();
//        List<WebElement> radios = chromeDriver.findElementsByName("sex");
//        radios.get(rnd.nextInt(radios.size())).click();
//        List<WebElement> radiosTwo = chromeDriver.findElementsByName("exp");
//        radiosTwo.get(rnd.nextInt(radiosTwo.size())).click();
//        chromeDriver.findElementById("datepicker").sendKeys("tomorrow");
//        List<WebElement> continents = chromeDriver.findElementsByName("continents");
//        continents.get(rnd.nextInt(continents.size())).click();


    }
}
