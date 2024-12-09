package practice1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner extends Generic1
{
    @Test 
    public void run()
    {
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suneelk");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("suneel");
    	driver.findElement(By.xpath("//button[@name='login']")).click();
    } 
    
    
    
    @Test 
    public void run2()
    {
    	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suneelk");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("suneel");
    	driver.findElement(By.xpath("//button[@name='login']")).click();
    } 
} 
