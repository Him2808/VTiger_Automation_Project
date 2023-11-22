package testcaseRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtilityv;
import genericUtility.JavaUtility;
import genericUtility.PropertiesUtilityv;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginpagePom;
import objectRepository.OrganizationsPagePom;

public class VtigerOrganizationsPage {
	@Test
	public void organizations() throws Exception {
	
	PropertiesUtilityv PUTIL=new PropertiesUtilityv();
	String URL=PUTIL.getDataFromProperties("url");
	String USERNAME=PUTIL.getDataFromProperties("username");
	String PASSWORD=PUTIL.getDataFromProperties("password");
	
	ExcelUtilityv EUTIL=new ExcelUtilityv();
	String ORG_NAME=EUTIL.getDataFromExcel("organizations", 1, 1);
	String WEBSITE=EUTIL.getDataFromExcel("organizations", 1, 2);
	String PHONENO=EUTIL.getDataFromExcel("organizations", 1, 3);
	String ADDRESS=EUTIL.getDataFromExcel("organizations", 1, 4);
	
	WebDriverUtility WUTIL=new WebDriverUtility();
	
	JavaUtility JUTIL=new JavaUtility();
	int NUM=JUTIL.createRandomNumber();
	
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(URL);
	WUTIL.maximizeWindow(driver);
	WUTIL.implicitWaitInScript(driver);
	LoginpagePom LPP=new LoginpagePom(driver);
	LPP.ClickUserName(USERNAME);
	LPP.ClickPassword(PASSWORD);
	LPP.ClickLogin();
	
	HomePagePom HPP=new HomePagePom(driver);
	HPP.ClickOrganizations();
	
	OrganizationsPagePom OPP=new OrganizationsPagePom(driver);
	OPP.ClickAddOrgnizations();
	OPP.ClickOrgName(ORG_NAME+NUM);
	OPP.ClickWebsite(WEBSITE);
	OPP.ClickPhoneno(PHONENO);
	OPP.ClickRating();
	OPP.ClickAddress(ADDRESS);
	OPP.ClickAddressInfo();
	OPP.ClickSave();
	Thread.sleep(3000);
	OPP.ClickSignOut();
   }
}
