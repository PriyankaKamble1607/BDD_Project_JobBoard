package stepDefinition;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import JobBoard.JobBoard.TestBase;
import io.cucumber.java.en.Given;

public class ActivityStep2 extends TestBase
{

	WebDriver driver=base();
	@Given("^alchemy log in$")
	public void searchJob()
	{
	driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	driver.findElement(By.id("user_login")).sendKeys("root");
	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("wp-submit")).click();
	driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Job Listings')]")).click();
	driver.findElement(By.id("post-search-input")).sendKeys("test engineer");
	driver.findElement(By.id("search-submit")).click();
	List<WebElement> abc=driver.findElements(By.xpath("//table/tbody/tr//*[contains(text(),'Full Time')]//ancestor::tr/td[1]/div/a"));
	for(int i=0;i<=abc.size();i++)
	{
	System.out.println(abc.get(i).getText());
    }
	}
	
	/*
	 * public void addByName(String name) { List<WebElement> rows =
	 * driver.findElements(By.tagName("tr")); for (WebElement row : rows) {
	 * List<WebElement> cells = row.findElements(By.tagName("td")); if
	 * (cells.get(1).getText().equals(name)) {
	 * cells.get(3).findElement(By.linkText("Add Quote")).click(); return; } }
	 */
	
}