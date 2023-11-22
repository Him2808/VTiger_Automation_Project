package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPagePom {
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement addLead;
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement salutation;
	@FindBy(xpath = "//option[@value='Mr.']")
	private WebElement salutationOption;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[2]")
	private WebElement cancelbtn;
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Sign Out']")
	private WebElement signout;
	//Constructor
	public LeadsPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Getters
	public WebElement getAddLead() {
		return addLead;
	}
	public WebElement getSalutation() {
		return salutation;
	}
	public WebElement getSalutationOption() {
		return salutationOption;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getSignout() {
		return signout;
	}
	//Business Library
	public void ClickAdd() {
		getAddLead().click();
	}
	public void ClickSalutation() {
		getSalutation().click();
		getSalutationOption().click();
	}
	public void ClickFirstName(String firstname) {
		getFirstname().sendKeys(firstname);
	}
	public void ClickLastName(String lastname) {
		getLastname().sendKeys(lastname);
	}
	public void ClickCompany(String company) {
		getCompany().sendKeys(company);
	}
	public void ClickSave() {
		getSavebtn().click();
	}
	public void ClickProfile() {
		getProfile().click();
	}
	public void ClickSignOut() {
		getSignout().click();
	}
}
