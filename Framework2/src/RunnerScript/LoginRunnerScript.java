package RunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PomScript.Login;

public class LoginRunnerScript
{
  @Test
  public void Fb()
  {
	  System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  Login log=new Login(driver);
	  log.user("selenium");
	  log.password("123");
	  log.button();
  }
  
}
