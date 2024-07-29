package My_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_in_Excel {

	public static void main(String[] args) throws Exception {
    
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String path = "C:\\Users\\Husenappa.M\\OneDrive\\Desktop\\Test_Data.xlsx";
		
	int rows=CsvFile02.getRowCount(path, "Sheet1");
	 
	for (int i = 1; i < rows; i++) {
		
	String uid=	CsvFile02.getCellData(path, "Sheet1", i,0);
	String pwd=	CsvFile02.getCellData(path, "Sheet1", i,1);
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys(uid);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
    String text=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
	 
	if(text.equalsIgnoreCase("Dashboard")) {
		System.out.println("Test Passed");
		CsvFile02.setCellData(path, "Sheet1", i, 2, "Test passed");
	}
	else {
		System.out.println("Test Failed");
		CsvFile02.setCellData(path, "Sheet1", i, 2, "Test Failed");
	}
	driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	}
	
	 
	
	System.out.println("Successful completed ");
		
	
		
	
	}
}

