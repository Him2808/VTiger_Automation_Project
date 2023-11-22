package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import objectRepository.ContactsPagePom;
import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;

public class Scenario2  extends BaseClass{
	@Test
	public void contact() throws Exception {
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickContacts();
		
		CreateContactPagePom CCP=new CreateContactPagePom(driver);
		CCP.ClickOnCreateContact();
		ExcelUtilityv EUTIL=new ExcelUtilityv();
		String FIRSTNAME= EUTIL.getDataFromExcel("contacts", 1, 0);
		String LASTNAME= EUTIL.getDataFromExcel("contacts", 1, 1);
		ContactsPagePom CPP=new ContactsPagePom(driver);
		CPP.ClickONFirstName(FIRSTNAME);
		CPP.ClickOnLastName(LASTNAME);
		CPP.ClickOnSave();
		System.out.println("contact created successfully..");
	}

}
