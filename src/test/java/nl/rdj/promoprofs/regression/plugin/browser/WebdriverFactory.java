package nl.rdj.promoprofs.regression.plugin.browser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebdriverFactory {
    
    private static WebDriver driver;

    // TODO find alternative for synchronized
    public synchronized static WebDriver getBrowser() {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("phantomjs");
            capabilities.setCapability("phantomjs.binary.path", "C:/Dev/Browsers/PhantomJS/phantomjs.exe"); 
            try {
                driver = new PhantomJSDriver(capabilities);            
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        return driver;
    }
    
//    Can use @After?
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            System.out.println("Shutting down PhantomJs WebDriver");
            getBrowser().quit();                
            driver = null;
        }
    }
    
}
