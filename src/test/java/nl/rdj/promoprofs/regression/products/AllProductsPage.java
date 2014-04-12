package nl.rdj.promoprofs.regression.products;

import nl.rdj.promoprofs.regression.base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllProductsPage extends Page {

    @FindBy(id = "all-products")
    public WebElement products;
    
    public AllProductsPage(WebDriver browser) {
        super(browser);
        
        // Check that we're on the right page.
        if (!"Sample Web Shop".equals(browser.getTitle())) {
            // Alternatively, we could navigate to the correct page
            throw new IllegalStateException("This is not the right page");
        }
    }
    
}
