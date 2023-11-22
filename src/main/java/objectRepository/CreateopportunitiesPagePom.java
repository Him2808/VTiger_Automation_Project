package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateopportunitiesPagePom {
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	WebElement createoppotunities;
	//Constructor

	public CreateopportunitiesPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getCreateoppotunities() {
		return createoppotunities;
	}
	//Business Library
	public void ClickOnCreateOpportunities() {
		getCreateoppotunities().click();
	}
	
	

}
