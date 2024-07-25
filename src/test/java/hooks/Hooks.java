package hooks;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp(){
        if(driver == null){
            String browser = System.getProperty("browser", "firefox");
            driver = WebDriverFactory.getDriver(browser);
        }
    }

    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
