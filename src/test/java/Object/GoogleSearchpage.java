package Object;

	 import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class GoogleSearchpage {
		
		WebDriver driver;
		
		public GoogleSearchpage (WebDriver driver) {
			
		this.driver = driver;
		

			
		}
		By searchbox =By.xpath("//input[@name='q']");
		
	    By Search_btn = By.xpath("(//input[@name='btnk'])[1])");
	    By Facebook_link = By.xpath("//a//h3[text()='Facebook-Log In or Sign Up']");
	    		
		public void Searchgoogle(String Searchinput)
		{
			try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			driver.findElement(Search_btn).click();
			Thread.sleep(2000);
				
		} catch (Exception e) {
			System.out.println("Exception caught" + e.getMessage());
		}
		}
		public void ClickFacebook() {
			try {
				driver.findElement(Facebook_link).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Exception caught" + e.getMessage());
					
			}
		}
		
	}
	

