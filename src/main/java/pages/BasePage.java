package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    private final WebDriverWait wait;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

     public void click(String locator){
        find(locator).click();
    }

    public void type(String locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    public void navigateTo(String url){
        driver.get(url);
    }

    public void closeWindow(){
        driver.close();
    }

    public void closeInstance(){
        driver.quit();
    }

    protected String getText(String locator){
        return find(locator).getText();
    }

    protected String getTitle(){
       return driver.getTitle();
    }

    public boolean validateTitle(String titleExpected){
        return getTitle().equals(titleExpected);
    }

    public boolean validateText(String locator, String textExpected){
        return getText(locator).equals(textExpected);
    }

    public String titleValue(){
        return getTitle();
    }

    public String textValue(String locator){
        return getText(locator);
    }


}
