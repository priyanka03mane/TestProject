package Pack6;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.CheckselectDuplex;
import Pages.CruiseBook;
import Pages.HomePageirctc;
import Pages.TourPackIrctc;


public class TestClassIrctc {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions otp = new ChromeOptions();
		otp.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(otp);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		HomePageirctc homepageirctc = new HomePageirctc(driver);
		homepageirctc.okbutton();
		homepageirctc.ticketbooking();
		Thread.sleep(5000);
		driver.navigate().back();
		homepageirctc.searchHotel();
		Thread.sleep(3000);
		ArrayList<String> add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(1));
		TourPackIrctc tourpackirctc = new TourPackIrctc(driver);
		tourpackirctc.tourPackgeBook();
		
		add = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add.get(2));
		CruiseBook cruisebook = new CruiseBook(driver);
		cruisebook.clickonbooknow();
		
		CheckselectDuplex  checkselect = new CheckselectDuplex (driver);
		checkselect.selectthedrop();
		checkselect.selectrediobutton();
		
		
	}

}
