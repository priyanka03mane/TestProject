package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruiseBook {
	@FindBy (xpath="(//label[@class='check-box'])[2]") 
	private WebElement cruise;
	@FindBy (xpath="(//a[text()='Book Now '])[1]")
	private WebElement booknow;
	
	public CruiseBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonbooknow() {
		cruise.click();
		booknow.click();
	}

}
