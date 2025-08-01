package PageFactoryPOM;


import static org.testng.Assert.assertEquals;

import java.time.Duration;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin() throws InterruptedException
	{
		Thread.sleep(5000);
		LoginPage ln = new LoginPage(driver);
		ln.setUsername("Admin");
		ln.setPass("admin123");
		ln.setBtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass	
	void tearDown()
	{
		driver.quit();
	}
}
