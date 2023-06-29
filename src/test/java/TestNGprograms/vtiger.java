package TestNGprograms;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import genericutilities.propertyFileFetching;
import io.github.bonigarcia.wdm.WebDriverManager;

public class vtiger {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		//Random Class
		Random ran = new Random();
		int r = ran.nextInt(1000);
		
		propertyFileFetching p = new propertyFileFetching();
		//String USERNAME = p.readDataFromPropertyFile("username");
		//PASSWORD = p.readDataFromPropertyFile("password");
		//driver.findElement(By.xpath("")).sendKeys(USERNAME);
		//driver.findElement(By.xpath("")).sendKeys(PASSWORD);
		
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("(//td[@class='tabUnSelected'])[3]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@style='padding-right:0px;padding-left:10px;'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("accenture"+r);
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(4000);
		String value = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(value.contains("accenture")) {
			System.out.println("tc is Passed");
		}
			else {
				System.out.println("tc is Failed");
			}
		Thread.sleep(4000);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		act.moveToElement(img).perform();
		
		
		driver.findElement(By.xpath("//a[@text='Sign Out']")).click();
		
	}

}
