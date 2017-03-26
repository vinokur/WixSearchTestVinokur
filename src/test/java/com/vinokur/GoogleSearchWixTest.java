package com.vinokur;

import org.testng.annotations.Test;

/**
 * Created by user on 3/26/2017.
 */

public class GoogleSearchWixTest extends TestNgTestBase {


    @Test
    public void testGoToWixPage(){
        driver.get("https://www.google.co.il/");
        googleSearchPage.waitUntilGooglePageIsLoaded();
        googleSearchPage.FillSearchGoogleForm("Wix");
        googleSearchPage.waitUntilSearchWixPageIsLoaded();
        googleSearchPage.ClickFirstElementInSearch();

     //   Assert.assertFalse("".equals(googleSearchPage.header.getText()));
    }
}
