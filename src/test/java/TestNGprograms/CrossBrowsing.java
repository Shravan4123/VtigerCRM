package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {

	WebDriver driver;
	@Parameters("Bro")
	@Test
	public void browserlaunch(String Bro) {
		if (Bro.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			
		}
		else if (Bro.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			System.out.println("ABCD");
		}
	}
		@Test
		public void url() {
			
		
		driver.get("https://www.google.com/");
		
		
	}
}
