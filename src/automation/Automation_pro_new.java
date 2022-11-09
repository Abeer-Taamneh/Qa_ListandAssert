package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;


public class Automation_pro_new {

	public static <Webdriver> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\my new driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	        String user_name="standard_user";
        	String password="secret_sauce";
        	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
          	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        	Thread.sleep(3000);
        	
        	 
//      
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//        	driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
//           
//           Thread.sleep(10000);
      	 List < WebElement> Abeer =driver.findElements(By.tagName("button"));
      	 for(int i=0; i<Abeer.size();i++) {
      		 Abeer.get(i).click();
      		 Thread.sleep(1000);
      	 }
      	 
      	
      	 
    
        String actualTitle=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).getText();
         String expectedTitle="3";
     	Assert.assertEquals(actualTitle , expectedTitle);
        	
        	
	}

}
