package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPagePom {
	@FindBy(xpath = "//img[@title='Create Contact...']")
	WebElement createcontact;
	@FindBy(xpath = "(//a[@title='Contacts'])[1]")
	WebElement contactname1;
	@FindBy(xpath = "//div[@id='More_Information_Modules_List']")
	WebElement more_information;
	@FindBy(xpath = "//img[@id='show_Contacts_Potentials']")
	WebElement show_opportunities;
	@FindBy(xpath = "//input[@value='Add Opportunity']")
	WebElement add_opportunities;
	//Constructor
	public CreateContactPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getCreatecontact() {
		return createcontact;
	}
	public WebElement getContactname1() {
		return contactname1;
	}
	public WebElement getMore_information() {
		return more_information;
	}
	public WebElement getShow_opportunities() {
		return show_opportunities;
	}
	public WebElement getAdd_opportunities() {
		return add_opportunities;
	}
	//Business Library
	public void ClickOnCreateContact() {
		getCreatecontact().click();
	}
	public void ClickOnContact1() {
		getContactname1().click();
	}
	public void ClickOnMoreInfo() {
		getMore_information().click();
	}
	public void ClickOnShowOpportunities() {
		getShow_opportunities().click();
	}
	public void ClickOnAddOpportunities() {
		getAdd_opportunities().click();
	}
}
