package TestNGprograms;

import org.testng.annotations.Test;

public class TestAttributes {
	@Test
	public void a() {
		System.out.println("am a method");
	}
		@Test(description="am a method,priority=1")
		public void b() {
			System.out.println("am b method");
		}
		@Test(priority = 4, enabled = false)
		public void c() {
			System.out.println("am c method");
	}
		@Test
		public void d() {
			System.out.println("am d method");
		}	
}