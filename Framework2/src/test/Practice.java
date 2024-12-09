package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void test1()
	{
		Reporter.log("hi", true);
	}
	@Test(dependsOnMethods = "hello3")
	public void test2()
	{
		Reporter.log("hello", true);
	}
	@Test
	public void hello3()
	{
		Reporter.log("bye", true);
	}
	}


