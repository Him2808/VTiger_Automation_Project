package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtilityv;
import genericUtility.WebDriverUtility;
import objectRepository.ContactsPagePom;
import objectRepository.CreateContactPagePom;
import objectRepository.HomePagePom;

public class VtigerContactPage extends BaseClass {
	@Test
	public void createcontact() throws Exception {
		WebDriverUtility WUTIL=new WebDriverUtility();
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickContacts();
		CreateContactPagePom CCP=new CreateContactPagePom(driver);
		CCP.ClickOnCreateContact();
		ExcelUtilityv EUTIL=new ExcelUtilityv();
	    String FIRSTNAME=EUTIL.getDataFromExcel("contacts", 1, 0);
	    String LASTNAME=EUTIL.getDataFromExcel("contacts", 1, 1);
	    String TITLE=EUTIL.getDataFromExcel("contacts", 1, 2);
	    String DEPT=EUTIL.getDataFromExcel("contacts", 1, 3);
	    String EMAIL=EUTIL.getDataFromExcel("contacts", 1, 4);
	    String ASSISTANTNAME=EUTIL.getDataFromExcel("contacts", 1, 5);
	    String ASSITANTPHONE=EUTIL.getDataFromExcel("contacts", 1, 6);
	    String OFFICENO=EUTIL.getDataFromExcel("contacts", 1, 7);
	    String MOBILENO=EUTIL.getDataFromExcel("contacts", 1, 8);
	    String HOMENO=EUTIL.getDataFromExcel("contacts", 1, 9);
	    String OTHERNO=EUTIL.getDataFromExcel("contacts", 1, 10);
	    String FAX=EUTIL.getDataFromExcel("contacts", 1, 11);
	    String EMAIL2=EUTIL.getDataFromExcel("contacts", 1, 12);
		ContactsPagePom CPP=new ContactsPagePom(driver);
		CPP.ClickOnSalutation();
		CPP.ClickONFirstName(FIRSTNAME);
		CPP.ClickOnLastName(LASTNAME);
		CPP.ClickOnOrg_Name();
		String parentID=driver.getWindowHandle();
		WUTIL.switchToWindow(driver, parentID);
		CPP.ClickOnSelectedOrganization();
		driver.switchTo().window(parentID);
		CPP.ClickOnLeadSource();
		CPP.ClickOnTitle(TITLE);
		CPP.ClickOnDept(DEPT);
		CPP.ClickOnEmail(EMAIL);
		CPP.ClickOnAssistant(ASSISTANTNAME);
		CPP.ClickOnAssistantPhone(ASSITANTPHONE);
		CPP.ClickOnOfficePhone(ASSITANTPHONE);
		CPP.ClickOnEmailOptOut();
		CPP.ClickOnReference();
		CPP.ClickOnNotifyOwner();
		CPP.ClickOnOfficePhone(OFFICENO);
		CPP.ClickOnMobile(MOBILENO);
		CPP.ClickOnHomePhone(HOMENO);
		CPP.ClickOnOtherPhone(OTHERNO);
		CPP.ClickOnFax(FAX);
		CPP.ClickOnSecodEmail(EMAIL2);
		CPP.ClickOnDoNotCall();
		CPP.ClickOnSave();
		System.out.println("Script Executed Successfully..");
	}

}
