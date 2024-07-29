package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice01{
	public static void main(String []args) throws InterruptedException {
		
      WebDriver driver= new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      Thread.sleep(3000);
            
//      //By Using Locators 
//      driver.findElement(By.name("username")).sendKeys("Admin");
//      driver.findElement(By.name("password")).sendKeys("admin123");
//      driver.findElement(By.xpath("//button[@type='submit']")).click();
//      
    //By Using Absolute XPath.
//   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
//   driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
//   driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[3]/button")).click();
//   
//   
//   //By Using Relative Xpath
//   driver .findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
//   //By Using and , or in Xpath
//   driver.findElement(By.xpath("//input[@name='username' and @class='oxd-input oxd-input--active']")).sendKeys("Admin");
//   Thread.sleep(3000);
//   driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' or @type='password']")).sendKeys("admin123");
//   Thread.sleep(3000);
//   driver.findElement(By.xpath("//button[@type='submit' or @class='oxd-button']")).click(); 
   
   //Linktest
   //driver.findElement(By.linkText("Forgot your password? ")).click();
   //  driver.findElement(By.partialLinkText("Forgat")).click();
      
      
   
	}
}

