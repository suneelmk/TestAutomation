package qsp2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo5 {
	@Test
	public void test8()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/HTML/jumble.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> x=driver.findElements(By.xpath("//input"));
		
		int count=x.size();
		for(int i=0;i<count;i++)
		{
		 
			WebElement x1=x.get(i);
			x1.click();
			
			
		}
		for(int i=count-1;i>=0;i--)
		{
			x.get(i).click();
		}
		driver.quit();
	}

}
