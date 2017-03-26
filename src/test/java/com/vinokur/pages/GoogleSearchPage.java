package com.vinokur.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
public class GoogleSearchPage extends Page {
    public String PAGE_URL;

    // public WebElement header;

    @FindBy(id = "fkbx-text")
    WebElement searchFormGoogle;
    // lst-ib id at chrome
    // gs_htif0 id at mozilla
    @FindBy(id = "_fZl")
    WebElement buttonSearchFormGoogle;
    // _fZl id at chrome and mozilla
    @FindBy(id = "vs0p1c0")
    WebElement wixFirstInSearch;
    // vs0p1c0 id wix first element

 // constructor
    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
        this.PAGE_URL = "https://www.google.co.il/";
        PageFactory.initElements(driver, this);
    }
// all methods
    public void waitUntilGooglePageIsLoaded() {
        waitUntilIsLoadedCustomTime(searchFormGoogle,10);
    }
    public void waitUntilSearchWixPageIsLoaded() {
        waitUntilIsLoadedCustomTime(wixFirstInSearch,10);
    }
    public void FillSearchGoogleForm(String searchedText) {
        setElementText(searchFormGoogle, searchedText);

    }
    public void ClickOnSearchGoogleButton() {
        clickElement(buttonSearchFormGoogle);
    }
    public void ClickFirstElementInSearch() {
        clickElement(wixFirstInSearch);
    }




    public void searchWix(String wix) {
    }

    public void clickToSubmit() {
    }
}
