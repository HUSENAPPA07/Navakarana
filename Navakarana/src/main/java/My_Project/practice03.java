package My_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice03 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(3000);
		
	    driver.findElement(By.id("name")).sendKeys("Navakaran");
		driver.findElement(By.id("email")).sendKeys("navakaranatech@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7760229015");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Madhapur oppo Madhapur PS");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("monday")).click();
		
	
		Select obj=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		//obj.selectByIndex(1);
		//or
	    //obj.selectByValue("india");
		//or
		obj.selectByVisibleText("France");
		
		//To find List Elements
//
//          List<WebElement>element=obj.getOptions();
//          for(WebElement elements:element) {
//        	  System.out.println("Number of Country's.."+elements.getText());
		
          driver.findElement(By.xpath("//option[@value='red']")).click();
          driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("(//a[text()='4'])[2]")).click();  
       // driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).click();
        driver.findElement(By.xpath("//a[text()='5']")).click();
        	  

          }
		
		 
	 
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
