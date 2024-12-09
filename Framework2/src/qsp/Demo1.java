package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		Reporter.log("hello", true);
		
	}
	@Test
	public void test2()
	{
		Reporter.log("world", true);
		
	}
    @Test
    public void test3()
    {
    	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.quora.com/");
		WebElement ele=driver.findElement(By.xpath("//a[.='Careers']"));
		String t=ele.getText();
		System.out.println(t);
		driver.quit();
    }
     

}
