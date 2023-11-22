package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * the class is use to perform all webdriver related operations
 * @author Himanshu
 *
 */
public class WebDriverUtility {
	/**
	 * this method is use to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) { 
		
		driver.manage().window().maximize();
	}
	/**
	 * this method is use to perform implicit wait operation
	 * @param driver
	 */
	public void implicitWaitInScript(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is use to wait for a particular element
	 * @param driver
	 * @param element
	 */
	public void explicitWaitForAnElement(WebDriver driver,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is use to perform click operation on a particular element
	 * @param driver
	 * @param element
	 */
	public void explicitWaitToClickAnElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//DropDown handling methods
	/**
	 * this method is use to select an option by index value
	 * @param element
	 * @param indexValue
	 */
	public void selectOptionByIndexvalue(WebElement element,int indexValue) {
		Select s=new Select(element);
		s.selectByIndex(indexValue);
	}
	/**
	 * this method is use to select an option by string value
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is use to select an option by visible text
	 * @param element
	 * @param visibletext
	 */
	public void selectOptionByVisibelText(WebElement element,String visibletext) {
		Select s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	/**
	 * this method is use to deselect all options from a drop down
	 * @param element
	 */
	public void deselectAllOption(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	/**
	 * this method is use to check if element is multiselect or not
	 * @param element
	 */
	public void checkElemntIsMultiSelect(WebElement element) {
		Select s=new Select(element);
		s.isMultiple();
	}
	/**
	 * this method is use to de select option by index value
	 * @param element
	 * @param indexValue
	 */
	public void deselectOptionByIndexValue(WebElement element,int indexValue) {
		Select s=new Select(element);
		s.deselectByIndex(indexValue);
	}
	/**
	 * this method is use to de select option by String value
	 * @param element
	 * @param value
	 */
	public void deselectoptionByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	/**
	 * this method is use to de select option by visible text
	 * @param element
	 * @param visibleText
	 */
	public void deselectByVisibleText(WebElement element,String visibleText) {
		Select s=new Select(element);
		s.deselectByVisibleText(visibleText);
	}
	//Mouse action handling
	
	/**
	 * this method is use to move to a particular webElemnt
	 * @param driver
	 * @param element
	 */
	public void movingTowardsAnElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this method is use to perform right click operation
	 * @param driver
	 */
	public void rightClickoperation(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 * this method is use to perform right clcik operation on a particular webElement
	 * @param driver
	 */
	public void rightClickoperation(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this method is use to perform click operation
	 * @param driver
	 */
	public void clickOperation(WebDriver driver) {
		Actions act =new Actions(driver);
		act.click().perform();
	}
	/**
	 * this method is use to perform click operation on a particular webElement
	 * @param driver
	 * @param element
	 */
	public void clickOperation(WebDriver driver,WebElement element) {
		Actions act =new Actions(driver);
		act.click(element).perform();
	}
	/**
	 * this method is use to perform double click operation
	 * @param driver
	 */
	public void doubleClickOperation(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * this method is use to perform double click operation on a particular webElement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * this method is use to perform drag and drop operation
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void dragAndDropOperation(WebDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	/**
	 * this method is use to handle slider
	 * @param driver
	 * @param src
	 * @param x
	 * @param y
	 */
	public void dragAndDropSlider(WebDriver driver,WebElement src, int x,int y) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
		
	}
	/**
	 * this method is use to perforn scrolldown operation towords a particular webElement
	 * @param driver
	 * @param elemet
	 */
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element);
	}
	/**
	 * this method is use to perform scroll down operation
	 * @param driver
	 * @param jsValue
	 */
	public void scrollDownOperation(WebDriver driver,String jsValue) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(jsValue);
	}
	//window handling
	/**
	 * this method is use to perform switching operation in between windows
	 * @param driver
	 * @param ParentId
	 */
	public void switchToWindow(WebDriver driver,String ParentId) {
		Set<String>childIds=driver.getWindowHandles();
		Iterator<String> itr=childIds.iterator();
		
		while (itr.hasNext()) {
			String IDS=itr.next();
			String ALLIDS=driver.switchTo().window(IDS).getTitle();
			if (ParentId.contains(ALLIDS)) {
				break;
			}
		}
	}
	/**
	 * this method is use to capture screenshot
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	public String captureScreenShotMethod(WebDriver driver,String screenShotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=".\\ScreenshotFolder\\"+"screenshotname"+".png";
		File dest=new File(path);
		Files.copy(src, dest);
		String finalPath=dest.getAbsolutePath();
		return finalPath;
	}
	/**
	 * customi
	 * @param element
	 * @throws Exception
	 */
	public void customizeClickOnElement(WebElement element) throws Exception {
		int count=1;
		while (count<10) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(3000);
				count++;
			}
		}
	}
}
