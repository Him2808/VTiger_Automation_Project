package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePagePom;
import objectRepository.LoginpagePom;

public class BaseClass {
	public DataBaseUtility DUTIL=new DataBaseUtility();
	public PropertiesUtilityv PUTIL=new PropertiesUtilityv();
	public WebDriverUtility WUTIL=new WebDriverUtility();
	public static WebDriver driver=null;
	
	@BeforeSuite(alwaysRun = true)
	public void DbConnectionEstablished() throws Exception {
		DUTIL.establishConnection();
		System.out.println("DataBase Connection Established..");
	}
	@BeforeClass(alwaysRun = true)
	public void LaunchingBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", IconstantUtilityv.chromeDriverPath);
		String URL=PUTIL.getDataFromProperties("url");
		driver= new ChromeDriver();
		driver.get(URL);
		WUTIL.implicitWaitInScript(driver);
		WUTIL.maximizeWindow(driver);
		System.out.println("Browser Launched Successfully..");
	}
	@BeforeMethod(alwaysRun = true)
	public void LoginOperation() throws Exception {
		LoginpagePom LPP=new LoginpagePom(driver);
		String USERNAME=PUTIL.getDataFromProperties("username");
		String PASSWORD=PUTIL.getDataFromProperties("password");
		LPP.ClickUserName(USERNAME);
		LPP.ClickPassword(PASSWORD);
		LPP.ClickLogin();
		System.out.println("Login Successful..");
	}
	@AfterMethod(alwaysRun = true)
	public void LogOutOperation() throws InterruptedException {
		HomePagePom HPP=new HomePagePom(driver);
		Thread.sleep(3000 );
		HPP.ClickProfile();
		HPP.ClickSignOut();
		System.out.println("LogOut Successful..");
	}
	@AfterClass(alwaysRun = true)
	public void CloseWindow() {
		driver.close();
		System.out.println("Window Closed Successfully..");
	}
	@AfterSuite(alwaysRun = true)
	public void CloseDbConnection() throws Exception {
		try {
			
		} 
		finally {
			DUTIL.closeConnection();
		}
		System.out.println("DataBase Connection Closed Successfully..");
	}

}
