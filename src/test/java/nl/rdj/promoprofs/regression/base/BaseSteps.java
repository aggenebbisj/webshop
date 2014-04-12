package nl.rdj.promoprofs.regression.base;

import nl.rdj.promoprofs.regression.plugin.browser.WebdriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseSteps {

    protected final WebDriver browser;
    private static final String BASE_URL = "http://localhost:8080/webshop";
    
    public BaseSteps() {
        this.browser = WebdriverFactory.getBrowser();
        browser.get(BASE_URL);
    }
    
}
