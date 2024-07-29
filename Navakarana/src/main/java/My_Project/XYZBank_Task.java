package My_Project;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XYZBank_Task {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		//Custome Login
		WebElement obj1= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-lg'])[1]")));
		obj1.click();
		
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='userSelect']"));
		
		Select nameselectiondropdown = new Select(dropdown);
		nameselectiondropdown.selectByVisibleText("Harry Potter");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();	
		
		//Deposite
		WebElement deposit=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-class='btnClass2']")));
		deposit.click();
		WebElement amount= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='amount']")));
		amount.sendKeys("1000");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement DepositSuccesmessage=driver.findElement(By.xpath("//span[@class='error ng-binding']"));
		System.out.println(DepositSuccesmessage.getText());
		
		//Withdraw
		driver.findElement(By.xpath("//button[normalize-space()='Withdrawl']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("500");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement Successmessage2 =driver.findElement(By.xpath("//span[@class='error ng-binding']"));
		System.out.println(Successmessage2.getText());
		
		//Transcation
		WebElement Transactions=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-class='btnClass1']")));
		Transactions.click();
		Thread.sleep(5000);
		//Screenshot
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File Source = takescreenshot.getScreenshotAs(OutputType.FILE);
		File path= new File("./ScreenshotImages/transactions.jpg");
		FileUtils.copyFile(Source, path);
		System.out.println("Captured screenshot Succesfully");
		
		driver.quit();
		
	
	}

}
