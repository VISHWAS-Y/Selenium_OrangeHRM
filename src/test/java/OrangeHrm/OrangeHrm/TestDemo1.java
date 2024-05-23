package OrangeHrm.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo1 {
   
	
	@Parameters("Browser")
	@Test
	public void Test1(String browsername) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browsername.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		
		if(browsername.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver ();
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
	}

	
}
