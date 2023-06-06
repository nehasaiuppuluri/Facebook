package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook{
private WebDriver driver;

public Facebook (WebDriver driver){ 
	this.driver = driver;
}



By Username_editbox= By.xpath("//input[@id='email']");

By password_editbox = By.id("pass");

By Login_Btn = By.name ("login");

public void EnterUsername() throws InterruptedException {
	
	
	driver.findElement (Username_editbox).clear(); driver.findElement (Username_editbox).sendKeys("Testuser");
}

public void EnterPassword() {

driver.findElement (password_editbox).clear(); driver.findElement (password_editbox).sendKeys("Tester123"); }

public void VerifyLogin() {

driver.findElement (Login_Btn).click();
String title = driver.getTitle();
assertEquals(title, "Facebook log in or sign up");
}

private void assertEquals(String title, String string) {
	// TODO Auto-generated method stub
	
}
}