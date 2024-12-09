package qsp1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void test5() 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//select[@title='Month']"));
        Select s=new Select(ele);
        List<WebElement> l=s.getOptions();
        ArrayList<String> a=new ArrayList<String>();
        for(WebElement l1:l)
        {
        	String x=l1.getText();
        	a.add(x);
        }
        boolean b=a.contains("Nov");
       
        if(b)
        {
        	System.out.println("true");
        }
        else
        {
        	System.out.println("no");
        }
        driver.quit();
	}

}
