package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.Button_Pages;
import Orange.Steps.Questions;

public class PimPages {
	private Questions questions;
	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtFirstName;
	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtLastName;

	private Button_Pages buttonPages;

	public PimPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new Button_Pages(driver);
		this.questions=new Questions(driver);

	}

	public void darclicPim() {
		buttonPages.btnPim();

	}

	public void darclicAddEmployee(WebDriver driver) {
		buttonPages.btnAddEmployee(driver);

	}

	public void agregarEmployee(WebDriver driver,String firstname, String lastname) {
		questions.tiempoSegundos(1);
		txtFirstName.sendKeys(firstname);
		txtLastName.sendKeys(lastname);
		questions.screenShot(driver);
	}
}
