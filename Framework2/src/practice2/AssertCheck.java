package practice2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertCheck extends Generic
{
	@Test
	public void runners()
	{
		String title=driver.getTitle();
		System.out.println(title);
//		Assert.assertEquals(title,"Facebook – log in or sign up" );
		//asserttrue
//		Assert.assertTrue(title.contains("Facebook – log in or sign up"));
		SoftAssert s=new SoftAssert();
		s.assertEquals(title,"Facebook – log in or sign up" );
		System.out.println("India");
		s.assertAll();
	}

}
