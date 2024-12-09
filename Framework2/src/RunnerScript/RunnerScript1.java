package RunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PomScript.PomScript1;

public class RunnerScript1 {
	@Test
	public void validData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		PomScript1 p=new PomScript1(driver);
		p.passData();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.passData();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.passData();
	}

}
