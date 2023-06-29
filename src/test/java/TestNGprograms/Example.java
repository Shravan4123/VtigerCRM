package TestNGprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
		
		@Test(priority = 1)
		public void login () {
			String exp = "shravan";
			String act = "shravan";
			Assert.assertEquals(exp, act);
		}
		
		@Test(priority = 2, dependsOnMethods = "login")
		public void homepage() {
			System.out.println("hello.. shravan");
		}	
	}