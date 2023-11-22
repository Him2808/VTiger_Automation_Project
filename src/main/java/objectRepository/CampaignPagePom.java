package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPagePom {
	
	@FindBy(xpath = "//input[@name='campaignname']")
	WebElement campaign_name;
	@FindBy(xpath = "//select[@name='campaigntype']")
	WebElement campaign_type;
	@FindBy(xpath = "//option[@value='Advertisement']")
	WebElement campaign_type_option;
	@FindBy(xpath = "//input[@name='targetaudience']")
	WebElement target_audience;
	@FindBy(xpath = "//input[@name='sponsor']")
	WebElement sponsor;
	@FindBy(xpath = "//input[@name='numsent']")
	WebElement num_sent;
	@FindBy(xpath = "//select[@name='campaignstatus']")
	WebElement campaign_status;
	@FindBy(xpath = "//option[@value='Planning']")
	WebElement campaign_status_option;
	@FindBy(xpath = "//img[@title='Select']")
	WebElement product;
	@FindBy(xpath = "//a[@id='4' and .='HONDA EV SCOOTER']")
	WebElement selected_product;
	@FindBy(xpath = "//input[@name='targetsize']")
	WebElement target_size;
	@FindBy(xpath = "//input[@name='budgetcost']")
	WebElement budget_cost;
	@FindBy(xpath = "//select[@name='expectedresponse' and @class='small']")
	WebElement expected_response;
	@FindBy(xpath = "//option[@value='Excellent']")
	WebElement expected_response_option;
	@FindBy(xpath = "//input[@name='expectedsalescount']")
	WebElement expected_sale_count;
	@FindBy(xpath = "//input[@name='expectedresponsecount']")
	WebElement expected_response_count;
	@FindBy(xpath = "//input[@name='expectedroi']")
	WebElement expected_ROI;
	@FindBy(xpath = "//input[@name='actualcost']")
	WebElement actual_cost;
	@FindBy(xpath = "//input[@name='expectedrevenue']")
	WebElement expected_revenue;
	@FindBy(xpath = "//input[@name='actualsalescount']")
	WebElement actual_sale_count;
	@FindBy(xpath = "//input[@name='actualresponsecount']")
	WebElement actual_response_count;
	@FindBy(xpath = "//input[@name='actualroi']")
	WebElement actual_ROI;
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement desc;
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
	WebElement savebtn;
	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[2]")
	WebElement cancelbtn;
	//Constructor
	public CampaignPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getCampaign_name() {
		return campaign_name;
	}
	public WebElement getCampaign_type() {
		return campaign_type;
	}
	public WebElement getCampaign_type_option() {
		return campaign_type_option;
	}
	public WebElement getTarget_audience() {
		return target_audience;
	}
	public WebElement getSponsor() {
		return sponsor;
	}
	public WebElement getNum_sent() {
		return num_sent;
	}
	public WebElement getCampaign_status() {
		return campaign_status;
	}
	public WebElement getCampaign_status_option() {
		return campaign_status_option;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getSelected_product() {
		return selected_product;
	}
	public WebElement getTarget_size() {
		return target_size;
	}
	public WebElement getBudget_cost() {
		return budget_cost;
	}
	public WebElement getExpected_response() {
		return expected_response;
	}
	public WebElement getExpected_response_option() {
		return expected_response_option;
	}
	public WebElement getExpected_sale_count() {
		return expected_sale_count;
	}
	public WebElement getExpected_response_count() {
		return expected_response_count;
	}
	public WebElement getExpected_ROI() {
		return expected_ROI;
	}
	public WebElement getActual_cost() {
		return actual_cost;
	}
	public WebElement getExpected_revenue() {
		return expected_revenue;
	}
	public WebElement getActual_sale_count() {
		return actual_sale_count;
	}
	public WebElement getActual_response_count() {
		return actual_response_count;
	}
	public WebElement getActual_ROI() {
		return actual_ROI;
	}
	public WebElement getDesc() {
		return desc;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	//Business Library
	public void ClickOnCampaignName(String campaign_name) {
		getCampaign_name().sendKeys(campaign_name);
	}
	public void ClickOnCampaignType() {
		getCampaign_type().click();
		getCampaign_type_option().click();
	}
	public void ClickOnTargetAudience(String target) {
		getTarget_audience().sendKeys(target);
	}
	public void ClickOnSponsor(String sponsor) {
		getSponsor().sendKeys(sponsor);	
	}
	public void ClickOnNumSent(String numsent) {
		getNum_sent().sendKeys(numsent);
	}
	public void ClickOnCampaignStatus() {
		getCampaign_status().click();
		getCampaign_status_option().click();
	}
	public void ClickOnProduct() {
		getProduct().click();
	}
	public void ClickOnSelectedProduct() {
		getSelected_product().click();
	}
	public void ClickOnTargerSize(String size) {
		getTarget_size().sendKeys(size);
	}
	public void ClickOnBudgetCost(String budget) {
		budget_cost.clear();
		getBudget_cost().sendKeys(budget);
	}
	public void ClickOnExpectedresponse() {
		getExpected_response().click();
		getExpected_response_option().click();
	}
	public void ClickOnExpectedResponseCount(String count) {
		getExpected_response_count().sendKeys(count);
	}
	public void ClickOnExpectedROI(String roi) {
		expected_ROI.clear();
		getExpected_ROI().sendKeys(roi);
	}
	public void ClickOnActualCost(String cost) {
		actual_cost.clear();
		getActual_cost().sendKeys(cost);
	}
	public void ClickOnExpectedRevenue(String revenue) {
		expected_revenue.clear();
		getExpected_revenue().sendKeys(revenue);
	}
	public void ClickOnActualSaleCount(String sale_count) {
		getActual_sale_count().sendKeys(sale_count);
	}
	public void ClickOnActualResponseCount(String response_count) {
		getActual_response_count().sendKeys(response_count);
	}
	public void ClickOnActualROI(String roi) {
		actual_ROI.clear();
		getActual_ROI().sendKeys(roi);
	}
	public void ClickOnDesc(String desc) {
		getDesc().sendKeys(desc);
	}
	public void ClickOnSave() {
		getSavebtn().click();
	}
	public void ClickOnCancel() {
		getCancelbtn().click();
	}
}
