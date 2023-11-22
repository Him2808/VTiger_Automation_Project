package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPagePom {
	
	@FindBy(xpath = "//img[@title='Create Opportunity...']")
	WebElement create_opportunities;
	@FindBy(xpath = "//input[@name='potentialname']")
	WebElement opportunity_name;
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	WebElement related_to;
	@FindBy(xpath = "//a[.='Ample Software Solution']")
	WebElement related_to_option;
	@FindBy(xpath = "//input[@name='amount']")
	WebElement amount;
	@FindBy(xpath = "//select[@name='opportunity_type']")
	WebElement type;
	@FindBy(xpath = "//option[@value='New Business']")
	WebElement type_option;
	@FindBy(xpath = "//img[@id='jscal_trigger_closingdate']")
	WebElement expected_close_date;
	@FindBy(xpath = "")
	WebElement year;
	@FindBy(xpath = "")
	WebElement month;
	@FindBy(xpath = "")
	WebElement day;
	@FindBy(xpath = "//select[@name='leadsource']")
	WebElement lead_source;
	@FindBy(xpath = "//option[@value='Employee']")
	WebElement lead_source_option;
	@FindBy(xpath = "//input[@id='nextstep']")
	WebElement next_step;
	@FindBy(xpath = "//select[@name='sales_stage']")
	WebElement sales_stage;
	@FindBy(xpath = "//option[@value='Qualification']")
	WebElement sales_stage_option;
	@FindBy(xpath = "(//img[@title='Select'])[2]")
	WebElement campaign_source;
	@FindBy(xpath = "//a[.='REALME NEXUS I0']")
	WebElement campaign_option;
	@FindBy(xpath = "//input[@id='probability']")
	WebElement probability;
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement describtion;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	WebElement savebtn;
	//Constructor
	public OpportunitiesPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getCreate_opportunities() {
		return create_opportunities;
	}
	public WebElement getOpportunity_name() {
		return opportunity_name;
	}
	public WebElement getRelated_to() {
		return related_to;
	}
	public WebElement getRelated_to_option() {
		return related_to_option;
	}
	public WebElement getAmount() {
		return amount;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getType_option() {
		return type_option;
	}
	public WebElement getExpected_close_date() {
		return expected_close_date;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getLead_source() {
		return lead_source;
	}
	public WebElement getLead_source_option() {
		return lead_source_option;
	}
	public WebElement getNext_step() {
		return next_step;
	}
	public WebElement getSales_stage() {
		return sales_stage;
	}
	public WebElement getSales_stage_option() {
		return sales_stage_option;
	}
	public WebElement getCampaign_source() {
		return campaign_source;
	}
	public WebElement getCampaign_option() {
		return campaign_option;
	}
	public WebElement getProbability() {
		return probability;
	}
	public WebElement getDescribtion() {
		return describtion;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	//Business Library
	public void ClickOnCreateOpportunities() {
		getCreate_opportunities().click();
	}
	public void ClickOnOpportunitiesName(String opp_name) {
		getOpportunity_name().sendKeys(opp_name);
	}
	public void ClickOnRelatedTo() {
		getRelated_to().click();
		getRelated_to_option().click();
	}
	public void ClickOnAmount(String amount) {
		getAmount().sendKeys(amount);
	}
	public void ClickOnType() {
		getType().click();
		getType_option().click();
	}
	public void ClickOnExCloseDate() {
		
	}
	public void ClickOnLeadSource() {
		getLead_source().click();
		getLead_source_option().click();
	}
	public void ClickOnNextStep(String nextstep) {
		getNext_step().sendKeys(nextstep);
	}
	public void ClickOnSalesStage() {
		getSales_stage().click();
		getSales_stage_option().click();
	}
	public void ClickOnCampaignSource() {
		getCampaign_source().click();
	}
	public void ClickOnCampaignOption() {
		getCampaign_option().click();
	}
	public void ClickOnProbability(String probability) {
		getProbability().sendKeys(probability);
	}
	public void ClickOnDesc(String desc) {
		getDescribtion().sendKeys(desc);
	}
	public void ClickOnSave() {
		getSavebtn().click();
	}
}