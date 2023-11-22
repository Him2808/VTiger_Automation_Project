package genericUtility;

import org.testng.annotations.Test;

import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;
import objectRepository.OpportunitiesPagePom;

public class VtigerContactOpportunities extends BaseClass{
	@Test
	public void contactOpportunities() throws Exception {
		ExcelUtilityv EUTIL=new ExcelUtilityv();
		String OPPNAME=EUTIL.getDataFromExcel("opportunities", 1, 0);
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickContacts();
		CreateContactPagePom CCPP=new CreateContactPagePom(driver);
		CCPP.ClickOnContact1();
		Thread.sleep(3000);
		CCPP.ClickOnMoreInfo();
		CCPP.ClickOnAddOpportunities();
		OpportunitiesPagePom OPP=new OpportunitiesPagePom(driver);
		OPP.ClickOnOpportunitiesName(OPPNAME);
		OPP.ClickOnSave();
		System.out.println("script executed successfully..");
		
	}

}
