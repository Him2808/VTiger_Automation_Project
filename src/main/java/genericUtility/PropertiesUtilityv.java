package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * This class is for properties utility
 * @author Himanshu
 */

public class PropertiesUtilityv {
	/**
	 * This is a generic method to use properties data
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String data)throws Exception {
		 FileInputStream fis=new FileInputStream
				 (IconstantUtilityv.PropertiesPath);
		 Properties pobj=new Properties();
		 pobj.load(fis);
		 String value=pobj.getProperty(data);
		return value;
	}
}
