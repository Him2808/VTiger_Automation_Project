package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePom {
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement username;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement loginbtn;
	//Constructor
	public LoginpagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //Getters
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//Business Library
	public void ClickUserName(String username) throws Exception {
		Thread.sleep(3000);
		getUsername().sendKeys(username);
	}
	public void ClickPassword(String password) {
		getPassword().sendKeys(password);
	}
	public void ClickLogin() {
		getLoginbtn().click();
	}
}
