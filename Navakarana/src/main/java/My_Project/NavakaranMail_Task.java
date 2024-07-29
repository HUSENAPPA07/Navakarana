package My_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavakaranMail_Task {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(50));
	
	driver.get("https://www.navakaranatech.com:2096");
	driver.manage().window().maximize();
	  
	
	driver.findElement(By.id("user")).sendKeys("husenappa@navakaranatech.com");
	driver.findElement(By.id("pass")).sendKeys("MADIWAL@12345");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	driver.findElement(By.xpath("//a[@id='rcmbtn107']")).click();
	WebElement obj=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='rcmbtn107']")));
	obj.click();
//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("kavya@navakaranatech");
	WebElement obj1=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
	obj1.sendKeys("kavya@navakaranatech.com");
	WebElement obj2=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='compose-subject']")));
	obj2.sendKeys("Automation");
	WebElement obj3=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='composebody']")));
	obj3.sendKeys("Hi mam Good Evening");
	WebElement obj4=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
	obj4.click();
	driver.quit();
	
	}

}
