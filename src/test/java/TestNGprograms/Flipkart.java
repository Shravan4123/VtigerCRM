package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
	System.out.println("Boss I am from Github modified by Team Leader");	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple 14pro max");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
	driver.getTitle();
	System.out.println("flipkart Title =");
	
}
}
