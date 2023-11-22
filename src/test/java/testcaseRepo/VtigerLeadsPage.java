package testcaseRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtilityv;
import genericUtility.IconstantUtilityv;
import genericUtility.JavaUtility;
import genericUtility.PropertiesUtilityv;
import genericUtility.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LeadsPagePom;
import objectRepository.LoginpagePom;

public class VtigerLeadsPage {
	@Test
	public void leads() throws Exception {
		
		PropertiesUtilityv PUTIL=new PropertiesUtilityv();
		String URL=PUTIL.getDataFromProperties("url");
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		
		ExcelUtilityv EUTIL=new ExcelUtilityv();
		String FIRSTNAME=EUTIL.getDataFromExcel("leads", 1, 1);
		String LASTNAME=EUTIL.getDataFromExcel("leads", 1, 2);
		String COMPANY=EUTIL.getDataFromExcel("leads", 1, 3);
		
		WebDriverUtility WUTIL=new WebDriverUtility();
		
		JavaUtility JUTIL=new JavaUtility();
		int NUM=JUTIL.createRandomNumber();
		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",IconstantUtilityv.chromeDriverPath);
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		WUTIL.maximizeWindow(driver);
		WUTIL.implicitWaitInScript(driver);
		
		LoginpagePom LPP=new LoginpagePom(driver);
		LPP.ClickUserName(USERNAME);
		LPP.ClickPassword(PASSWORD);
		LPP.ClickLogin();
		
		HomePagePom HPP=new HomePagePom(driver);
		HPP.ClickLeads();
		
		
		
		LeadsPagePom LP=new LeadsPagePom(driver);
		LP.ClickAdd();
		LP.ClickSalutation();
		LP.ClickFirstName(FIRSTNAME+NUM);
		LP.ClickLastName(LASTNAME);
		LP.ClickCompany(COMPANY);
		LP.ClickSave();
		LP.ClickProfile();
		LP.ClickSignOut();
		
		
	}

}
