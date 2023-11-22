package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPgaePom {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	WebElement createorganization;
	//Constructor

	public CreateOrganizationPgaePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getCreateorganization() {
		return createorganization;
	}
	//Business Library
	public void ClickOnCreateOrganization() {
		getCreateorganization().click();
	}
	

}
