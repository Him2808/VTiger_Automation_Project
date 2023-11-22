package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import genericUtility.JavaUtility;
import objectRepository.CreateOrganizationPgaePom;
import objectRepository.HomePagePom;
import objectRepository.OrganizationsPagePom;

public class Scenario3 extends BaseClass {
	@Test
	public void organization1() throws Exception {
		JavaUtility JUTIL=new JavaUtility();
	    int NUM =JUTIL.createRandomNumber();
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickOrganizations();
		
		CreateOrganizationPgaePom COP=new CreateOrganizationPgaePom(driver);
		COP.ClickOnCreateOrganization();
		
		ExcelUtilityv EUTIL=new ExcelUtilityv();
		String ORG_NAME= EUTIL.getDataFromExcel("organizations", 1, 1);
		
		OrganizationsPagePom OPP=new OrganizationsPagePom(driver);
		OPP.ClickOrgName(ORG_NAME+NUM);
		OPP.ClickIndustry();
		OPP.ClickSave();
		System.out.println("organization created successfully..");
	}

}
