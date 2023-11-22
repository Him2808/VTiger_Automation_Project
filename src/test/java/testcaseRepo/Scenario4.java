package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;
import objectRepository.ContactsPagePom;
import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;

public class Scenario4 extends BaseClass {
	@Test
	public void contact1() throws Exception {
		
		WebDriverUtility WUTIL=new WebDriverUtility();
		
		JavaUtility JUTIL=new JavaUtility();
	    int NUM=JUTIL.createRandomNumber();
	    
	    ExcelUtilityv EUTIL=new ExcelUtilityv();
		String FIRSTNAME= EUTIL.getDataFromExcel("contacts", 1, 0);
		String LASTNAME= EUTIL.getDataFromExcel("contacts", 1, 1);
	    
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickContacts();
		
		CreateContactPagePom CCP=new CreateContactPagePom(driver);
		CCP.ClickOnCreateContact();
		
		ContactsPagePom CPP=new ContactsPagePom(driver);
		CPP.ClickONFirstName(FIRSTNAME+NUM);
		CPP.ClickOnLastName(LASTNAME);
		CPP.ClickOnOrg_Name();
		String parentId=driver.getWindowHandle();
		WUTIL.switchToWindow(driver,parentId);
		CPP.ClickOnSelectedOrganization();
		driver.switchTo().window(parentId);
		CPP.ClickOnSave();
		System.out.println("contact created successfully..");
	}

}
