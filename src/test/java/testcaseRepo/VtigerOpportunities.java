package testcaseRepo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import genericUtility.WebDriverUtility;
import objectRepository.HomePagePom;
import objectRepository.OpportunitiesPagePom;


public class VtigerOpportunities extends BaseClass {
	@Test
	public void loginop() throws Exception {

	 HomePagePom HPP=new HomePagePom(driver);
	 HPP.ClickOpportunities();
	 ExcelUtilityv EUTIL=new ExcelUtilityv();
	 WebDriverUtility WUTIL=new WebDriverUtility();
	 String OPPNAME=EUTIL.getDataFromExcel("opportunities", 0, 0);
	 String AMOUNT=EUTIL.getDataFromExcel("opportunities", 0, 0);
	 String NEXTSTEP=EUTIL.getDataFromExcel("opportunities", 0, 0);
	 String PROBABILITY=EUTIL.getDataFromExcel("opportunities", 0, 0);
	 String DESC=EUTIL.getDataFromExcel("opportunities", 0, 0);
	 OpportunitiesPagePom OPP=new OpportunitiesPagePom(driver);
	 OPP.ClickOnCreateOpportunities();
	 OPP.ClickOnOpportunitiesName(OPPNAME);
	 OPP.ClickOnRelatedTo();
	 OPP.ClickOnType();
	 OPP.ClickOnLeadSource();
	 OPP.ClickOnCampaignSource();
	 //WUTIL.switchToWindow(driver);
	 OPP.ClickOnCampaignOption();
	 
	
  }
}
