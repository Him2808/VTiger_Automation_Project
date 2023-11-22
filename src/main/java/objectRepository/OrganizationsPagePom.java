package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPagePom {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement add_organizations;
	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement org_name;
	@FindBy(xpath = "//input[@name='website']")
	private WebElement website;
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneno;
	@FindBy(xpath = "//select[@name='rating']")
	private WebElement rating;
	@FindBy(xpath = "//option[@value='Acquired']")
	private WebElement ratingoption;
	@FindBy(xpath = "(//input[@name='cpy'])[2]")
	private WebElement addressinfo;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement billingaddress;
	@FindBy(xpath = "//select[@name='industry']")
	WebElement industry;
	@FindBy(xpath = "//option[@value='Electronics']")
	WebElement industry_option;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	private WebElement savebtn;
	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[2]")
	private WebElement cancelbtn;
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Sign Out']")
	private WebElement signout;
	//Constructor
	public OrganizationsPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getAdd_organizations() {
		return add_organizations;
	}
	public WebElement getOrg_name() {
		return org_name;
	}
	public WebElement getWebsite() {
		return website;
	}
	public WebElement getPhoneno() {
		return phoneno;
	}
	public WebElement getRating() {
		return rating;
	}
	public WebElement getRatingoption() {
		return ratingoption;
	}
	public WebElement getAddressinfo() {
		return addressinfo;
	}
	public WebElement getBillingaddress() {
		return billingaddress;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	public WebElement getIndustry() {
		return industry;
	}
	public WebElement getIndustryoption() {
		return industry_option;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getSignout() {
		return signout;
	}
	//Business Library
	public void ClickAddOrgnizations() {
		getAdd_organizations().click();
	}
	public void ClickOrgName(String org_name) {
		getOrg_name().sendKeys(org_name);
	}
	public void ClickWebsite(String website_name) {
		getWebsite().sendKeys(website_name);
	}
	public void ClickPhoneno(String phoneno) {
		getPhoneno().sendKeys(phoneno);
	}
	public void ClickRating() {
		getRating().click();
		getRatingoption().click();
	}
	public void ClickIndustry() {
		getIndustry().click();
		getIndustryoption().click();
	}
	public void ClickAddress(String address) {
		getBillingaddress().sendKeys(address);
	}
	public void ClickAddressInfo() {
		getAddressinfo().click();
	}
	public void ClickSave() {
		getSavebtn().click();
	}
	public void ClickSignOut() {
		getProfile().click();
		getSignout().click();
	}

}
