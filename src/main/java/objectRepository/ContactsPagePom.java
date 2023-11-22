package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPagePom {
	@FindBy(xpath = "//select[@name='salutationtype']")
	WebElement salutation_type;
	@FindBy(xpath = "//option[@value='Mr.']")
	WebElement salutation;
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstname;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastname;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	WebElement organization_name;
	@FindBy(xpath = "//a[@id='1' and .='Ample Software Solution']")
	WebElement selected_organization;
	@FindBy(xpath = "//select[@name='leadsource']")
	WebElement lead_source;
	@FindBy(xpath = "//option[@value='Self Generated']")
	WebElement lead_source_option;
	@FindBy(xpath = "//input[@id='title']")
	WebElement title;
	@FindBy(xpath = "//input[@id='department']")
	WebElement dept;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement office_phone;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='assistant']")
	WebElement assistant;
	@FindBy(xpath = "//input[@id='assistantphone']")
	WebElement assistant_phone;
	@FindBy(xpath = "//input[@name='emailoptout']")
	WebElement email_opt_out;
	@FindBy(xpath = "//input[@name='reference']")
	WebElement reference;
	@FindBy(xpath = "//input[@name='notify_owner']")
	WebElement notify_owner;
	@FindBy(xpath = "//input[@name='mobile']")
	WebElement mobile;
	@FindBy(xpath = "//input[@name='homephone']")
	WebElement home_phone;
	@FindBy(xpath = "//input[@name='otherphone']")
	WebElement other_phone;
	@FindBy(xpath = "//input[@name='fax']")
	WebElement fax;
	@FindBy(xpath = "//input[@name='secondaryemail']")
	WebElement second_email;
	@FindBy(xpath = "//input[@name='donotcall']")
	WebElement do_not_call;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	WebElement savebtn;
	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	WebElement cancel;
	//Constructor
	public ContactsPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getOrganazitionName() {
		return organization_name;
	}
	public WebElement getSelectedorgnation() {
		return selected_organization;
	}
	public WebElement getSalutation_type() {
		return salutation_type;
	}
	public WebElement getSalutation() {
		return salutation;
	}
	public WebElement getOrganization_name() {
		return organization_name;
	}
	public WebElement getSelected_organization() {
		return selected_organization;
	}
	public WebElement getLead_source() {
		return lead_source;
	}
	public WebElement getLead_source_option() {
		return lead_source_option;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getDept() {
		return dept;
	}
	public WebElement getOffice_phone() {
		return office_phone;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAssistant() {
		return assistant;
	}
	public WebElement getAssistant_phone() {
		return assistant_phone;
	}
	public WebElement getEmail_opt_out() {
		return email_opt_out;
	}
	public WebElement getReference() {
		return reference;
	}
	public WebElement getNotify_owner() {
		return notify_owner;
	}
	public WebElement getMobile() {
		return mobile;
	}
	public WebElement getHome_phone() {
		return home_phone;
	}
	public WebElement getOther_phone() {
		return other_phone;
	}
	public WebElement getFax() {
		return fax;
	}
	public WebElement getSecond_email() {
		return second_email;
	}
	public WebElement getDo_not_call() {
		return do_not_call;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancel() {
		return cancel;
	}
	//Business Library
	public void ClickONFirstName(String firstname) {
		getFirstname().sendKeys(firstname);
	}
	public void ClickOnLastName(String lastname) {
		getLastname().sendKeys(lastname);
	}
	public void ClickOnOrg_Name() {
		getOrganazitionName().click();
	}
	public void ClickOnSelectedOrganization() {
		getSelectedorgnation().click();
	}
	public void ClickOnSalutation() {
		getSalutation().click();
		getSalutation_type().click();
	}
	public void ClickOnLeadSource() {
		getLead_source().click();
		getLead_source_option().click();
	}
	public void ClickOnTitle(String title) {
		getTitle().sendKeys(title);
	}
	public void ClickOnDept(String dept) {
		getDept().sendKeys(dept);
	}
	public void ClickOnEmail(String email) {
		getEmail().sendKeys(email);
	}
	public void ClickOnAssistant(String assistantname) {
		getAssistant().sendKeys(assistantname);
	}
	public void ClickOnAssistantPhone(String phone) {
		getAssistant_phone().sendKeys(phone);
	}
	public void ClickOnOfficePhone(String phone) {
		getOffice_phone().sendKeys(phone);
	}
	public void ClickOnEmailOptOut() {
		getEmail_opt_out().click();
	}
	public void ClickOnReference() {
		getReference().click();
	}
	public void ClickOnNotifyOwner() {
		getNotify_owner().click();
	}
	public void ClickOnMobile(String mobileno) {
		getMobile().sendKeys(mobileno);
	}
	public void ClickOnHomePhone(String homeno) {
		getHome_phone().sendKeys(homeno);
	}
	public void ClickOnOtherPhone(String otherno) {
		getOffice_phone().sendKeys(otherno);
	}
	public void ClickOnFax(String faxno) {
		getFax().sendKeys(faxno);
	}
	public void ClickOnSecodEmail(String email2) {
		getSecond_email().sendKeys(email2);
	}
	public void ClickOnDoNotCall() {
		getDo_not_call().click();
	}
	public void ClickOnSave() {
		getSavebtn().click();
	}
	public void ClickOnCancel() {
		getCancel().click();
	}
}
