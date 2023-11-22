package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPagePom {
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	WebElement createcampaign;
	//Contructor
	public CreateCampaignPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getCreatecampaign() {
		return createcampaign;
	}
	//Business Library
	public void ClickOnCreateCampaign() {
		getCreatecampaign().click();
	}
	
	
	

}
