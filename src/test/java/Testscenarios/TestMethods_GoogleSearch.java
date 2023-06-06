package Testscenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.GoogleSearchpage;

public class TestMethods_GoogleSearch {


	WebDriver driver;
	
	GoogleSearchpage objectrepo;
	@BeforeTest
	public void beforetest() {
		
		WebDriver 
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
	}
	@Test
	public void Searchoperation() {
		GoogleSearchpage page = new GoogleSearchpage(driver);
		page.Searchgoogle("facebook");
		
	}
	
	@Test
	public void verifyandAccessFacebook() {
		objectrepo = new GoogleSearchpage(driver);
		objectrepo.ClickFacebook();
	}
	@AfterTest
	public void aftertest() {
		driver.quit();
}
	}