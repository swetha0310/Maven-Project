package maven.fmwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main",//path
        glue = {"maven.frmwork"},//package name
        tags = {"@tag1"},//no of tags used
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class cucumberrunnertest extends AbstractTestNGCucumberTests {
	
//@BeforeSuite
	
	public static WebDriver driver;
	public WebDriverWait wait;//defining explicit wait
	public void launchbrowser(){
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Swetha\\workspace\\Selenium Jar Files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	wait=new WebDriverWait(driver,50);	
	
	}

	
	

	
	
	
}
