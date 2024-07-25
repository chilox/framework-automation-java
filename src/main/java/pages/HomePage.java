package pages;
import locators.HomePageLocators;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navegarHome(){
        navigateTo("https://automationexercise.com/");
    }

    public void validarHomePage(){
        String titulo = getTitle();
        validateTitle(titulo);
    }

    public void navegarLoginPage(){
        click(HomePageLocators.singUpLocator);
    }

    public void validarLoginPage(){
        String titulo = getTitle();
        validateTitle(titulo);
    }
}
