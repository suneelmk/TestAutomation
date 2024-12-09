package qsp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo4 {
	@Test
	public void test6()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.id("month"));
		Select s=new Select(ele);
		ArrayList<String> l=new ArrayList<String>();
		List<WebElement> opt=s.getOptions();
		for(WebElement we:opt)
		{
			String text =we.getText();
			l.add(text);
		}
	Collections.sort(l);
	for(String l1:l)
	{
		System.out.println(l1);
	}
	driver.quit();
	}

}
