package qsp2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo6 {
	@Test
	public void test10() throws AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	    Set<String> allwh = driver.getWindowHandles();
	    ArrayList<String> l=new ArrayList<String>(allwh);
	    String z = l.get(1);
	    String x=l.get(0);
	    
	    driver.switchTo().window(z);
	    driver.switchTo().window(x);
	    driver.quit();
	}

}
