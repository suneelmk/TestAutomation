package practice2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Generic {
	WebDriver driver;
  @BeforeClass
  public void openApp()
  {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
  }
  @BeforeMethod
  public void perfom()
  {
	  driver.findElement(By.id("email")).sendKeys("suneelkittali@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("suneel689");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();  
  }
  
    @AfterMethod
    public void Screenshot() throws IOException
    {
    	Screenshots.app(driver);
    	
    }
    @AfterClass
    public void close()
    {
    	driver.close();
    }
  
}
     
     
