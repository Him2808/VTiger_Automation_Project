package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPagePom {
	@FindBy(xpath = "//img[@title='Create Product...']")
	WebElement createproduct;
	//Constructor

	public CreateProductPagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters

	public WebElement getCreateproduct() {
		return createproduct;
	}
	//Business Library
	public void ClickOncreateProduct() {
		getCreateproduct().click();
		
	}

}
