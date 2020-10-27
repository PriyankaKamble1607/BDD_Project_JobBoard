package JobBoard.JobBoard;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase
{
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static WebDriver base() 
	{
	driver=new FirefoxDriver();
	wait=new WebDriverWait(driver,20);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;
   }
	
	public static void closebrowser() 
	{
		driver.quit();
	}

}