package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourPackIrctc {
	@FindBy (xpath="(//a[@target='_blank'])[5]")
	private WebElement tourpackage;
	
	public TourPackIrctc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void tourPackgeBook() {
		tourpackage.click();
	}

}
//@FindBy (xpath="") private WebElement ;