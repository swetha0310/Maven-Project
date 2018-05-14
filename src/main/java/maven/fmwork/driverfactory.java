package maven.fmwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class driverfactory {
public WebDriver driver;
public WebDriverWait wait;//defining explicit wait
public void launchbrowser(){
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Swetha\\workspace\\Selenium Jar Files\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
wait=new WebDriverWait(driver,50);	
}
	
}