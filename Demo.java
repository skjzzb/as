

import java.util.Set; 
import java.util.concurrent.TimeUnit; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

 
public class Demo { 
 
 public static void main(String args[]) throws InterruptedException { 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\group015\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

  WebDriver driver = new ChromeDriver(); 

  driver.get("https://www.limeroad.com/"); 
   
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
   

   
  driver.manage().window().maximize(); 
   
  Thread.sleep(5000);
  driver.findElement(By.id("shopMen")).click();
  Thread.sleep(4000);
  driver.findElement(By.id("5df8b0f2d171002c9df45893")).click();

  Thread.sleep(4000);
  driver.findElement(By.id("16406449")).click();
  Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@id=\"alSz\"]/div[2]")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[3]/div[3]/div[2]")).click();
  Thread.sleep(2000);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

   
   

   

  
 } 
 
 
} 