package stepDefinition;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import JobBoard.JobBoard.TestBase;
import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class ActivityStep1 extends TestBase
{
	
	WebDriver driver=base();
	
	@Given("^create new user$")
	public void Create_New_User() throws Throwable
	{
		
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("//*[@class='wp-menu-name'][contains(text(),'Users')]")).click();
		driver.findElement(By.linkText("Add New")).click();		
		driver.findElement(By.id("user_login")).sendKeys("Priyanka8");
		driver.findElement(By.id("email")).sendKeys("Priyanka8@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Show password')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pass1")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass1")).sendKeys("Priyanka@123456798654");
		Thread.sleep(5000);
		driver.findElement(By.linkText("createusersub")).click();
		driver.findElement(By.id("user-search-input")).sendKeys("Priyanka8");
		driver.findElement(By.id("search-submit")).click();
		String actual=driver.findElement(By.xpath("//*[@class='username column-username has-row-actions column-primary'][contains(text(),'Priyanka8')]")).getText();
		assertEquals("Priyanka8", actual);
		
	}

}
