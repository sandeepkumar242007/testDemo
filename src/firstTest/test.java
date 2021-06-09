package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("HI chk");
		System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver(); 
	  
	    driver.get("https://login.salesforce.com/?locale=eu");
	    driver.findElement(By.id("username")).sendKeys("sandeep");
	    driver.findElement(By.xpath("//*[@id='Login']")).click();
	    String loginButton = driver.findElement(By.xpath("//*[@id='Login']")).getText();
	 
	    System.out.println(driver.findElement(By.id("error")).getText());
	    
	    
	 
	   // driver.close();
	    


	}

}
