package vcProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
		String month = "March 2023";
				System.setProperty("webdriver.http.factory", "jdk-http-client");
				//ChromeOptions ops = new ChromeOptions();
				//ops.addArguments("--remote-allow-origins=*");
				//System.setProperty("webdriver.http.factory", "jdk-http-client");
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));		
				driver.get("https://nobelpagedev.iworklab.com/");
				driver.manage().window().maximize();
				System.out.println("Title of the page" + driver.getTitle());
				System.out.println("Curret URL is" + driver.getCurrentUrl());
				System.out.println(driver.getPageSource());
				//WebElement CreateAccount= driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/form/div[5]/p/a/span"));
				
				WebElement CreateAccount= driver.findElement(By.xpath("//span[normalize-space()='Create Account']"));	
			
				CreateAccount.click();	
				Thread.sleep(2000);
				 driver.findElement(By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[1]//div[1]//input[1]")).sendKeys("Amar");
				//driver.findElement(By.xpath("//input[@placeholder='--type--'])[1]")).sendKeys("Amar");
				
						
				//Thread.sleep(2000);
				//Last Name
				
				
				driver.findElement(By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[2]//div[1]//input[1]")).sendKeys("Kunwar");
				//driver.findElement(By.xpath("(//input[@placeholder='--type--'])[2]")).sendKeys("Kunwar");
				Thread.sleep(2000);
				//Email Address
				//driver.findelement(by.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[2]/div/input")).sendkeys("amarkunwar03@gmail.com");
				driver.findElement(By.xpath("//input[@type='email']")).sendKeys("amarkunwar10@gmail.com");
				//Thread.sleep(2000);
				//password
				//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[3]/div/input")).sendKeys("Amar@123@");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amar@123@");
				
				Thread.sleep(2000);
				//country dropdown			
				//WebElement drpDownList = (WebElement) 
				
						//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[4]/div/div/div[2]/div")).click();
				driver.findElement(By.xpath("//div[@title='United States: + 1']")).click();
						
						
						List<WebElement> drpDownList =  driver.findElements(By.xpath("//ul[@role='listbox'][1]//li"));
				
				//Select drpList = new Select(drpDownList);
				System.out.println(drpDownList.size());
				
				//List<WebElement> list=  drpList.getOptions();
				for(WebElement list:drpDownList)
				{
					if(list.getText().contains("+91"))
					{
						list.click();	
						
						driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[4]/div/div/input")).sendKeys("9810778037");
						//driver.findElement(By.xpath("//input[@value='+1']")).sendKeys("9810778022");
						break;
						
						
					}
				}
				Thread.sleep(2000);
				
				//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/div/form/div[6]/button")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Join Community']")).click();
				
				//drpList.selectByVisibleText("India +1");
				//Thread.sleep(2000);
				//btnLogin.click();
				
				
				//email.sendkeys("amarkunw@gmail.com");
				// Intro page 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
				driver.findElement(By.xpath("//input[@placeholder='Eg: Co-founder of Biliz technologies']")).sendKeys("QA Executive at Value Coder ");
				driver.findElement(By.xpath("//span[normalize-space()='+ Add new position']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
				String ExpPage = driver.findElement(By.xpath("//h5[normalize-space()='Add Experience']")).getText();   
				System.out.println(ExpPage);
				
				org.testng.Assert.assertEquals("driver.findElement(By.xpath(\"//h5[normalize-space()='Add Experience']\")).getText();   ", "Add Experience");
				
				//h5[normalize-space()='Add Experience']
				//Click on the toggle button
				driver.findElement(By.xpath("//input[@role='switch']")).click();
				driver.findElement(By.xpath("//input[@placeholder='Enter Title']")).sendKeys("Vinove Software solutions Noida Sector 126");
				driver.findElement(By.xpath("//select[@id='type']")).click();
				driver.findElement(By.xpath("//option[@value='Full time']")).click();		
				driver.findElement(By.xpath("//input[@placeholder='Company Name']")).sendKeys("QA Executive at Value Coder ");
				driver.findElement(By.xpath("//input[@placeholder='Location']")).sendKeys("QA Executive at Value Coder ");
				//String OptiontoSelect = "Noida, Uttar Pradesh, India";
				WebElement DrpDown = driver.findElement(By.xpath("input[placeholder='Location']"));
				DrpDown.clear();
				DrpDown.sendKeys("Noida");
				//driver.findElement(By.xpath("input[placeholder='Location']")).clear();
				//driver.findElement(By.xpath("input[placeholder='Location']")).sendKeys("Noida");
				String text;
				
				
				  do { 
					  DrpDown.sendKeys(Keys.ARROW_DOWN);
					  text = DrpDown.getAttribute("value");
					  if(text.equals("Noida, Uttar Pradesh, India"))
					  {
						  DrpDown.sendKeys(Keys.ENTER);
					  }
				  
				  }while (!text.isEmpty());
				  
				  driver.findElement(By.xpath("//input[@placeholder='Pick'])[1]")).click();
				  Thread.sleep(5000);
				  while(true)
				  {
				  String date =  driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
				 if(date.equals(month))
				 {
					 break;
				 }
				 else
				 {
					 driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
					
				 }
				  }
				  
				  
				  
						  
			
				
				
				
				
				
				
				
				
			
				
				
			
				
			}

	

}
