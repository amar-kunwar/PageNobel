package vcProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://facebook.com/");
		System.out.println("Success");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("amarkunw@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Test@12345");
		//driver.findElement(By.xpath("//button[normalize-space()='Login to NobelPage']")).click();
		

	}

}
