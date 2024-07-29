package My_Project;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad_Task {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//
//		Instant startTime = Instant.now();
//		System.out.println(startTime.toString());
//		driver.get("https://www.ebay.com/");
//		Instant endTime = Instant.now();
//		System.out.println(endTime.toString());
//
//		Duration duration = Duration.between(startTime, endTime);
//		System.out.println("page Load Time:" + duration.toMillis() + "Milli Seconds");

		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		Instant starttime = Instant.now();
		System.out.println(starttime.toString());
		
		driver.get("https://navakarana.com/");
		
		Instant endtime = Instant.now();
		System.out.println(endtime.toString());
		
		Duration duration = Duration.between(starttime, endtime);
		System.out.println("Page Load Time: " +duration.toMillis() + " Milli Seconds");
		
		driver.quit();
		
		
	}

}
