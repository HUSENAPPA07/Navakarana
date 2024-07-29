package My_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XYZBank_Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		
		//Manager Login
		WebElement ManagerLogin= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-lg'])[2]")));
		ManagerLogin.click();
		
		//Add Customer
		WebElement Addcustomer= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='addCust()']")));
		Addcustomer.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("NavakaranTech");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("All");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("500081");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Open Account
		WebElement OpenAcct= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='openAccount()']")));
		OpenAcct.click();
		Thread.sleep(3000);
		//Customer
		WebElement Dropdown=driver.findElement(By.xpath("//select[@id='userSelect']"));
		Select nameselectiondropdown= new Select(Dropdown);
		nameselectiondropdown.selectByVisibleText("NavakaranTech All");
		
		//Currency
		WebElement Dropdown2=driver.findElement(By.xpath("//select[@id='currency']"));
		Select nameselectiondropdown2= new Select(Dropdown2);
		nameselectiondropdown2.selectByVisibleText("Rupee");
		Thread.sleep(3000);
		
		//Process
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//To Open Customer page
		WebElement OpenCustomer= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='showCust()']")));
		OpenCustomer.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("NavakaranTech");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@ng-click='deleteCust(cust)']")).click();
		System.out.println("Account Deleted Successfully");
		
		driver.quit();	
	}

}
