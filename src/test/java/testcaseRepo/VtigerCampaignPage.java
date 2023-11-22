package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import genericUtility.WebDriverUtility;
import objectRepository.CampaignPagePom;
import objectRepository.CreateCampaignPagePom;
import objectRepository.HomePagePom;

public class VtigerCampaignPage extends BaseClass {
	@Test
	public void campaigns() throws Exception {
		WebDriverUtility WUTIL=new WebDriverUtility();
		HomePagePom HPP=new HomePagePom(driver);
		HPP.CLickMore();
		HPP.ClickCampaign();
		CreateCampaignPagePom CCPP=new CreateCampaignPagePom(driver);
		CCPP.ClickOnCreateCampaign();
		ExcelUtilityv EUTIL=new ExcelUtilityv();
		String CAMPAIGNNAME=EUTIL.getDataFromExcel("campaigns", 1, 0);
		String AUDIENCE=EUTIL.getDataFromExcel("campaigns", 1, 1);
		String SPONSOR=EUTIL.getDataFromExcel("campaigns", 1, 2);
		String NUMSENT=EUTIL.getDataFromExcel("campaigns", 1, 3);
		String TARGETSIZE=EUTIL.getDataFromExcel("campaigns", 1, 4);
		String BUDGET=EUTIL.getDataFromExcel("campaigns", 1, 5);
		//String E_SALECOUNT=EUTIL.getDataFromExcel("campaigns", 0, 0);
		String E_RESPONSECOUNT=EUTIL.getDataFromExcel("campaigns", 1, 6);
		String E_ROI=EUTIL.getDataFromExcel("campaigns", 1, 7);
		String A_COST=EUTIL.getDataFromExcel("campaigns", 1, 8);
		String E_REVENUE=EUTIL.getDataFromExcel("campaigns", 1, 9);
		String A_SALECOUNT=EUTIL.getDataFromExcel("campaigns", 1, 10);
		String A_RESPONSECOUNT=EUTIL.getDataFromExcel("campaigns", 1, 11);
		String A_ROI=EUTIL.getDataFromExcel("campaigns", 1, 12);
		String DESC=EUTIL.getDataFromExcel("campaigns", 1, 13);
		String parentID=driver.getWindowHandle();
		CampaignPagePom CPP=new CampaignPagePom(driver);
		CPP.ClickOnCampaignName(CAMPAIGNNAME);
		CPP.ClickOnCampaignType();
		CPP.ClickOnTargetAudience(AUDIENCE);
		CPP.ClickOnSponsor(SPONSOR);
		CPP.ClickOnNumSent(NUMSENT);
		CPP.ClickOnCampaignStatus();
		CPP.ClickOnProduct();
		WUTIL.switchToWindow(driver, parentID);
		CPP.ClickOnSelectedProduct();
		driver.switchTo().window(parentID);
		CPP.ClickOnTargerSize(TARGETSIZE);
		CPP.ClickOnBudgetCost(BUDGET);
		Thread.sleep(3000);
		CPP.ClickOnExpectedresponse();
		CPP.ClickOnExpectedResponseCount(E_RESPONSECOUNT);
		CPP.ClickOnExpectedROI(E_ROI);
		CPP.ClickOnActualCost(A_COST);
		CPP.ClickOnExpectedRevenue(E_REVENUE);
		CPP.ClickOnActualSaleCount(A_SALECOUNT);
		CPP.ClickOnActualResponseCount(A_RESPONSECOUNT);
		CPP.ClickOnActualROI(A_ROI);
		CPP.ClickOnDesc(DESC);
		CPP.ClickOnSave();
		System.out.println("Script Executed Successfully..");
		
		
	}

}
