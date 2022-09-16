package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		//maximizing the tab 
		driver.manage().window().maximize();
		// find the identifier then send the my email
		driver.findElement(By.id("identifierId")).sendKeys("rvexs123@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		//the reference title (the actual title) 
		String at = driver.getTitle();
		//expected title
		String et = "gmail";
		//close the tab after executing
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("System Successful");
			
	}else {
		System.out.println("Test Failed");
	}

}
	
}