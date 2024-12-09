package RunnerScript;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PomScript.FlipkartPurchase;

public class Flipkartrunner {
  @Test
  public void flip() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");	  
	  FlipkartPurchase f=new FlipkartPurchase(driver);
	  f.p();
	  Thread.sleep(5000);
	  
	  Set<String> ele = driver.getWindowHandles();
	  String pid = driver.getWindowHandle();
	  ele.remove(pid);
    for(String ele1:ele)
    {
    	driver.switchTo().window(ele1);
    }
    Thread.sleep(5000);
 
	  f.ac();
	  Thread.sleep(2000);
	  f.o();
	  
	   }
}
