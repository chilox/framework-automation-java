package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import pages.HomePage;


public class Test {

    private final HomePage homePage;

    public Test(){
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Given("Navegamos hacia la pagina principal")
    public void abrir_el_navegador() {
        homePage.navegarHome();

    }
    @Given("Validamos que nos encontramos en la pagina principal")
    public void validamos_el_sitio() {
        homePage.validarHomePage();
    }
    @Given("Ingresamos a la seccion de login")
    public void vemos_algun_elemento() {
        homePage.navegarLoginPage();
    }

}
