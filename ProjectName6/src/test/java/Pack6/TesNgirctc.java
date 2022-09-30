package Pack6;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.CheckselectDuplex;
import Pages.CruiseBook;
import Pages.HomePageirctc;
import Pages.TourPackIrctc;
import setupirctc.BaseIrctc;

public class TesNgirctc extends BaseIrctc {
	private WebDriver driver;
	private HomePageirctc homepageirctc;
	private TourPackIrctc tourpackirctc;
	private CruiseBook cruisebook;
	private CheckselectDuplex  checkselect;
	private ArrayList<String> add;
	@Parameters("browser")
	@BeforeTest
		public void openBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			driver= openChromeBrowser();
		}
		
		if(browserName.equals("Firefox")) {
			driver=openFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		driver.get("https://www.irctc.co.in/");
		homepageirctc = new HomePageirctc(driver);
		cruisebook = new CruiseBook(driver);
		tourpackirctc = new TourPackIrctc(driver);
		checkselect = new CheckselectDuplex (driver);
		homepageirctc.okbutton();
	}
	@BeforeMethod
	public void beformethod() throws InterruptedException {
		
		Thread.sleep(3000);
		homepageirctc.ticketbooking();
		Thread.sleep(5000);
		driver.navigate().back();
		homepageirctc.searchHotel();
		add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		tourpackirctc.tourPackgeBook();
		add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(2));
		cruisebook.clickonbooknow();
	}
	@Test
	public void verifyselectdropdown() throws InterruptedException {
		checkselect.selectthedrop();
	}
	@Test
	public void verifyrediobutton() {
		checkselect.selectrediobutton();
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		driver.close();
		driver.switchTo().window(add.get(1));
		driver.close();
		driver.switchTo().window(add.get(0));
		
		
		
	}
	@AfterClass
	public void closeobject() {
		homepageirctc = null;
		add = null;
		add = null;
		cruisebook = null;
		tourpackirctc = null;
		checkselect = null;
		
	}
	@AfterTest
	public void aftertest() {
		driver.close();
		driver=null;
		System.gc();
	}
	
	
}
