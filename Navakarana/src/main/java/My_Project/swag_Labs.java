package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag_Labs {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
		//To Addcart
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		Thread.sleep(3000);
		
		//to click to Addcart
        driver.findElement(By.xpath("//*[@fill='currentColor']")).click();
        Thread.sleep(3000);
        
        
        //To Remove in Addcart
        driver.findElement(By.xpath("//button[@class='btn_secondary cart_button'][1]")).click();
        Thread.sleep(3000);
        
        //To continue shopping 
        driver.findElement(By.xpath("//a[@class='btn_secondary']")).click()	;
        
        //To Add Itom
        driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
        
      //to click to Addcart
        driver.findElement(By.xpath("//*[@fill='currentColor']")).click();
        
       //To Click Checkout
        driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
        Thread.sleep(3000);
        
        //To Enter the details
        driver.findElement(By.id("first-name")).sendKeys("Navakaran");
        driver.findElement(By.id("last-name")).sendKeys("Tech");
        driver.findElement(By.id("postal-code")).sendKeys("500081");
        driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
        driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
        
	}

}
