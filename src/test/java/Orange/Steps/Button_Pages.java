package Orange.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Button_Pages {
	private Questions questions;
	@FindBy(how = How.ID, using = "btnLogin")
	private WebElement btnLogin;
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'PIM')]")
	private WebElement btnPim;
	
	@FindBy(how = How.CSS, using = "#menu_pim_addEmployee")
	private WebElement btnAddEmpoloyee;
	@FindBy(how = How.ID, using = "btnSave")
	private WebElement btnSave;
	
	
	
	
	
	public Button_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.questions=new Questions(driver);
	}
	
	public void btnLogin() {
		
		btnLogin.isDisplayed();
		btnLogin.click();
	}
	
	public void btnPim() {
		questions.tiempoSegundos(1);
		btnPim.isDisplayed();
		btnPim.click();
	}

	public void btnAddEmployee(WebDriver driver){
		
		btnAddEmpoloyee.isDisplayed();
		btnAddEmpoloyee.click();
		questions.tiempoSegundos(1);
		questions.screenShot(driver);
		
	}
	public void btnSave(WebDriver driver){
		btnSave.isDisplayed();
		btnSave.click();
		
	}
	}

