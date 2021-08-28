package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.Button_Pages;



public class LoginPage {
	
	private Button_Pages buttonPages;
	
	@FindBy(how = How.CSS, using = "#txtUsername")
	private WebElement txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	private WebElement txtUserpass;
		
	public LoginPage(WebDriver driver) {
		
       PageFactory.initElements(driver, this);
       this.buttonPages = new Button_Pages(driver);
		
	}
	public void loginIn(String userName,String userPass) {
		
		txtUsername.sendKeys(userName);
		txtUserpass.clear();
		txtUserpass.sendKeys(userPass);
		buttonPages.btnLogin();
		
		
	}

}
