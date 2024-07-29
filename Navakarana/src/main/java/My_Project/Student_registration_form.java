package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_registration_form {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.id("name")).sendKeys("Navakaran");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("test@123gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("7760220915");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).sendKeys("10/07/2024");
		Thread.sleep(2000);
		driver.findElement(By.id("subjects")).sendKeys("Science");
		Thread.sleep(2000);
		driver.findElement(By.id("hobbies")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='input-group']")).sendKeys("C:\\Users\\Husenappa.M\\OneDrive\\Desktop\\Test_Data.xlsx");
		driver.findElement(By.id("picture")).sendKeys("Madhapur,Beside Benz Showroom,500081");

	}

}
