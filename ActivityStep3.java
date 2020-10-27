package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import JobBoard.JobBoard.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityStep3 extends TestBase
{
	WebDriver driver=base();
	@Given("^before posting a job$")
	public void job()
	{
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.linkText("Post a Job")).click();
		driver.findElement(By.linkText("Sign in")).click();		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
				
	}
	@When("^post a job$")   
	public void postjob(DataTable table) throws Throwable
	{
		List <String> postData= table.asList();
		driver.findElement(By.id("job_title")).sendKeys(postData.get(0));
		driver.findElement(By.id("job_location")).sendKeys(postData.get(1));
		Thread.sleep(2000);
		driver.findElement(By.id("job_description_ifr")).click();
		driver.findElement(By.id("job_description_ifr")).sendKeys(postData.get(2));
		System.out.println(postData.get(2));
		driver.findElement(By.id("application")).clear();
		driver.findElement(By.id("application")).sendKeys(postData.get(3));
		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys(postData.get(4));
		driver.findElement(By.id("company_website")).clear();
		driver.findElement(By.id("company_tagline")).clear();
		driver.findElement(By.id("company_video")).clear();
		driver.findElement(By.name("submit_job")).click();
		driver.findElement(By.id("job_preview_submit_button")).click();
		driver.findElement(By.linkText("click here")).click();
		
	}
	@Then("^validate the job$")
	public void validation(DataTable table)
	{
		List <String> postData= table.asList();
		String title=driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
		assertEquals(postData.get(0), title);
	}
}
