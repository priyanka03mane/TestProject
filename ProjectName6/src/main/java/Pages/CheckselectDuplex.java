package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckselectDuplex {
	@FindBy (xpath="//select[@name='country']") private WebElement select;
	@FindBy (xpath="//input[@type='radio']") private WebElement rediobutton ;
	
	public CheckselectDuplex(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectthedrop() throws InterruptedException {
		Thread.sleep(3000);
		select.click();
	}
	public void selectrediobutton() {
		rediobutton.click();
	}
}
