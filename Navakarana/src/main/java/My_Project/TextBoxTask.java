package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTask {

	public static void main(String[] args) throws InterruptedException {

		// TextBox
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// To Enter Details in Texbox
		driver.findElement(By.id("fullname")).sendKeys("Navakaran");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("address")).sendKeys("Beside Benz Showroom,Madhapur,500081");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(4000);
		driver.close();

		// CheckBox
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver1.manage().window().maximize();
		Thread.sleep(3000);

		// To Select Check Box
		driver1.findElement(By.className("plus")).click(); 
		driver1.findElement(By.id("c_bf_1")).click();
		Thread.sleep(4000);
		driver1.findElement(By.className("plus")).click();
		Thread.sleep(4000);
		driver1.close();

		// Radio Button
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver2.manage().window().maximize();
		Thread.sleep(3000);

		// To Click the Redio Button
		driver2.findElement(By.name("tab")).click();

	}

}
