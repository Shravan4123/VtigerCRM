package TestNGprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApachePoi {
	@Test
	public void dataDriven () throws IOException, InterruptedException {
		String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\tk.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("tk");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//input[@id='password']"));
		jse.executeScript("arguments[0].scrollIntoView();",ele);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(sheet.getRow(2).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
		driver.findElement(By.xpath("//button[@id='register']")).click();
		
		
		
	}

}