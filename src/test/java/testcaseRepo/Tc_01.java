package testcaseRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePagePom;

public class Tc_01 extends BaseClass {
	@Test
	public void LoginCalendar() {
		HomePagePom HP=new HomePagePom(driver);
		HP.ClickCalendar();
	}

}
