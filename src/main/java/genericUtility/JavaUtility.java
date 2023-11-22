package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
/**
 * this class is use to perform all java related operation
 * @author Himanshu
 *
 */
public class JavaUtility {
	/**
	 * this method is for using random number
	 * @return
	 */
	public int createRandomNumber() {
		Random r=new Random();
		int num=r.nextInt();
		return num;
	}
	/**
	 * this method is use to provide the current date
	 * @return
	 */
	public String getDateUsingCalendar() {
		Calendar cal=Calendar.getInstance();
		java.util.Date d= cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
	   String modifiedDate=	sdf.format(d);
	   return modifiedDate;
	}

}
