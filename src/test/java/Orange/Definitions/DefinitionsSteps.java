package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPages;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPages pimPage = new PimPages(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^Ingrese username (.*) y la contraseña (.*)$")
	public void diligenciar_login(String userName, String userPass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginIn(userName, userPass);

	}

	@And("^Acceder a la opcion addEmployee$")
	public void ingresar_empleado() {
		this.pimPage = new PimPages(driver);
		this.pimPage.darclicPim();
		
	}
@Then("^Diligenciar los campos firstname (.*) y lastname (.*)$")

public void diligenciarCampos(String firstname,String lastname ) {
	this.pimPage.darclicAddEmployee(driver);
	this.pimPage.agregarEmployee(driver,firstname,lastname);
	driver.quit();
	}


}