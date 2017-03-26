package com.vinokur;

import com.vinokur.pages.GoogleSearchPage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by user on 3/26/2017.
 */

public class GoogleSearchWixTest extends TestNgTestBase {

    private GoogleSearchPage googleSearchPage;

    @BeforeMethod
    public void initGooglePage() {
        System.setProperty("webdriver.gecko.driver",
                "src\\test\\resources\\geckodriver.exe");

        driver = new FirefoxDriver();
        googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
    }

    @Test
    public void testGoToWixPage(){
        driver.get(googleSearchPage.PAGE_URL);
        googleSearchPage.waitUntilGooglePageIsLoaded();
        googleSearchPage.FillSearchGoogleForm("Wix");
        googleSearchPage.waitUntilSearchWixPageIsLoaded();
        googleSearchPage.ClickFirstElementInSearch();

     //   Assert.assertFalse("".equals(googleSearchPage.header.getText()));
    }
}
