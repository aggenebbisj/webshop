package nl.rdj.promoprofs.regression.base;

import org.openqa.selenium.WebDriver;

public class Page {
    
    protected final WebDriver browser;

    public Page(WebDriver browser) {
        this.browser = browser;
    }
    
}
