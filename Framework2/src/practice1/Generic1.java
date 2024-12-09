package practice1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic1 {
	public WebDriver driver;
   @BeforeMethod
   public void openApp()
   {
	   System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");
   }
   
   @AfterMethod
   public void closeApp() throws IOException
   
   {
	   
	   TakesScreenshot t=(TakesScreenshot)driver;
	   File src=t.getScreenshotAs(OutputType.FILE);
	   File dst=new File("./pics/"+"pi.jpeg");
	   FileHandler.copy(src, dst);
	   driver.close();
   }
   
}
