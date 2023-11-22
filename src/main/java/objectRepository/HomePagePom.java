package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	@FindBy(xpath = "//a[@href='index.php?module=Home&action=index']")
	private WebElement home;
	@FindBy(xpath = "//a[.='More']")
	private WebElement more;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Leads']")
	private WebElement leads;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Organizations']")
	private WebElement organizations;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Contacts']")
	private WebElement contacts;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Opportunities']")
	private WebElement opportunities;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Products']")
	private WebElement products;
	@FindBy(xpath = "//a[@name='Campaigns']")
	private WebElement campaign;
	@FindBy(xpath = "//td[@class='tabUnSelected']//a[.='Calendar']")
	private WebElement calander;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Invoice']")
	private WebElement invoice;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Sales Order']")
	private WebElement sales_order;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Quotes']")
	private WebElement quotes;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Purchase Order']")
	private WebElement purchase_order;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Price Books ']")
	private WebElement price_book;
	@FindBy(xpath = "(//td[@class='small'])[2]")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Sign Out']")
	private WebElement signout;
	@FindBy(xpath = "(//td[@class='small'])[3]")
	private WebElement info;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='Help']") 
	private WebElement help;
	@FindBy(xpath = "(//td[@class='small'])[4]")
	private WebElement settings;
	@FindBy(xpath = "//a[@class='drop_down_usersettings' and .='CRM Settings']")
	private WebElement crm_settings;
	//Constructor
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Getters
	public WebElement getHome() {
		return home;
	}
	public WebElement getMore() {
		return more;
	}
	public WebElement getLeads() {
		return leads;
	}
	public WebElement getOrganizations() {
		return organizations;
	}
	public WebElement getContacts() {
		return contacts;
	}
	public WebElement getOpportunities() {
		return opportunities;
	}
	public WebElement getProducts() {
		return products;
	}
	public WebElement getCampaign() {
		return campaign;
	}
	public WebElement getCalander() {
		return calander;
	}
	public WebElement getInvoice() {
		return invoice;
	}
	public WebElement getSales_order() {
		return sales_order;
	}
	public WebElement getQuotes() {
		return quotes;
	}
	public WebElement getPurchase_order() {
		return purchase_order;
	}
	public WebElement getPrice_book() {
		return price_book;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getInfo() {
		return info;
	}
	public WebElement getHelp() {
		return help;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getCrm_settings() {
		return crm_settings;
	}
	//Business Library
	public void ClickHome() {
		getHome().click();
	}
	public void CLickMore() {
		getMore().click();
	}
	public void ClickLeads() {
		getLeads().click();
	}
	public void ClickOrganizations() {
		getOrganizations().click();
	}
public void ClickContacts() {
		getContacts().click();
	}
	
public void ClickOpportunities() {
	getOpportunities().click();
}

public void ClickProducts() {
	getProducts().click();
}

public void ClickCampaign() {
	getCampaign().click();
}

public void ClickCalendar() {
	getCalander().click();
}

public void ClickInvoice() {
	getInvoice().click();
}

public void ClickSalesOrder() {
	getSales_order().click();
}

public void ClickQuotes() {
	getQuotes().click();
}

public void ClickPurchaseOrder() {
	getPurchase_order().click();	
}

public void ClickPriceBook() {
	getPrice_book().click();
}

public void ClickProfile() {
	getProfile().click();
}

public void ClickSignOut() {
	getSignout().click();
}

public void ClickInfo() {
	getInfo().click();
}

public void ClickHelp() {
	getHelp().click();
}

public void ClickSettins() {
	getSettings().click();
}

public void ClickCRMSettings() {
	getCrm_settings().click();
}
}
