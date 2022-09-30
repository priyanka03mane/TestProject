package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageirctc {
	@FindBy (xpath="(//button[@type='submit'])[1]")
	private WebElement ok;
	@FindBy (xpath="//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13')]") 
	private WebElement cancle;
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement from;
	@FindBy (xpath="(//li[@role='option'])[2]") 
	private WebElement kalyan;
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[2]")
	private WebElement to;
	@FindBy (xpath="(//li[@role='option'])[2]")
	private WebElement ludhi;
	@FindBy (xpath="(//div[@style='width: 100%;'])[2]") 
	private WebElement general ;
	@FindBy (xpath="//li[@aria-label='LADIES']") 
	private WebElement ladies ;
	@FindBy (xpath="(//input[@type='text'])[3]") 
	private WebElement date;
	@FindBy (xpath="//a[text()='25']")
	private WebElement twentyfive;
	@FindBy (xpath="(//div[@style='width: 100%;'])[1]") 
	private WebElement all ;
	@FindBy (xpath="((//div[@style='width: 100%;'])//li)[3]") 
	private WebElement ac ;
	@FindBy (xpath="//button[@type='submit']") 
	private WebElement search  ;
	
	@FindBy (xpath="//span[@class='allcircle circletwo']")
	private WebElement hotels;
	
	public HomePageirctc(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void okbutton() {
		ok.click();
	}
	public void canclebutton() {
		cancle.click();
	}
	
	public void ticketbooking() {
		
		from.click();
		kalyan.click();
		to.click();
		ludhi.click();
		general.click();
		ladies.click();
		date.click();
		twentyfive.click();
		all.click();
		ac.click();
		search.click();
	}
	public void searchHotel() throws InterruptedException {
		Thread.sleep(3000);
		hotels.click();
	}
	
	
	
	
	
	
}
//@FindBy (xpath="") private WebElement ;