package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadsPagePom {
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	WebElement createleads;
	//Constructors

	public CreateLeadsPagePom( WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getCreateleads() {
		return createleads;
	}
	//Business Library
	public void ClickOnCreateLeads() {
		getCreateleads().click();
	}
	

}
