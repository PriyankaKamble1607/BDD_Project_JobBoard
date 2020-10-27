package stepDefinition;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import JobBoard.JobBoard.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ActivityStep4 extends TestBase 
{
	WebDriver driver=base();
	@Given("^Before posting a job$")
	public void job()
	{
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.findElement(By.linkText("Post a Job")).click();
		driver.findElement(By.linkText("Sign in")).click();		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
				
	}
	@When("^Post a job \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")   
	public void postjob(String Post,String Location,String Description,String email,String companyName)
	{
		driver.findElement(By.id("job_title")).sendKeys(Post);
		driver.findElement(By.id("job_location")).sendKeys(Location);
		driver.findElement(By.id("job_description_ifr")).sendKeys(Description);
		driver.findElement(By.id("application")).clear();
		driver.findElement(By.id("application")).sendKeys(email);
		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys(companyName);
		driver.findElement(By.id("company_website")).clear();
		driver.findElement(By.id("company_tagline")).clear();
		driver.findElement(By.id("company_video")).clear();
		driver.findElement(By.name("submit_job")).click();
		driver.findElement(By.id("job_preview_submit_button")).click();
		driver.findElement(By.linkText("click here")).click();
		
	}
	@Then("^Validate the job with \"(.*)\"$")
	public void validation(String Post)
	{
		
		String title=driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
		assertEquals(Post, title);
	}

}
