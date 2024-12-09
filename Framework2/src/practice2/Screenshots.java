package practice2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots 
{
	public static void app(WebDriver driver) throws IOException
	{
	String s="./pics/";
	Date d=new Date();
	String s1=d.toString();
	String s2=s1.replaceAll(":", "-");
	TakesScreenshot t=(TakesScreenshot)driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dst=new File(s+s2+"p.jpeg");
	FileHandler.copy(src, dst);
	}
}
