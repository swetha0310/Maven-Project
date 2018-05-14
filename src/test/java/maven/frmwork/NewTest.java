package maven.frmwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import maven.fmwork.driverfactory;
import maven.fmwork.pageobjects;

public class NewTest {
driverfactory driverobj;
pageobjects pageobj;
public NewTest(){ //superclass
//instantiated driverfactory class 		
driverobj=new driverfactory();
//instantiated pageobjects class 
pageobj=new pageobjects();
}

  @Test
  @Given("^demo automationtesting is launched$")
  public void demo_automationtesting_is_launched() throws Throwable {
  //Write code here that turns the phrase above into concrete actions
  driverobj.driver.get("http://demo.automationtesting.in/");  
  }

  @Then("^click on skip sign in button$")
  public void click_on_skip_sign_in_button() throws Throwable {
  //Write code here that turns the phrase above into concrete actions
	  
  boolean skipsignin=driverobj.wait.until(ExpectedConditions.elementToBeSelected(pageobj.skipsignin_BTN));  
  Assert.assertTrue(skipsignin); //validation statement
  pageobj.skipsignin_BTN.click();  
  }

  @When("^Automation Demo Site title is appeared$")
  public void automation_Demo_Site_title_is_appeared() throws Throwable {
  //Write code here that turns the phrase above into concrete actions
  Assert.assertEquals(driverobj.driver.getTitle(), "Register");    
  }

  @Then("^click on Switch to tab$")
  public void click_on_Switch_to_tab() throws Throwable {
  //Write code here that turns the phrase above into concrete actions
  pageobj.SwitchTo_TAB.click();    
  }

  @Then("^select Frames from drop down$")
  public void select_Frames_from_drop_down() throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  pageobj.Frames_BTN.click();    
  }

  @Then("^enter text in text-box$")
  public void enter_text_in_text_box() throws Throwable {
  // Write code here that turns the phrase above into concrete actions
  pageobj.textbox_TXT.sendKeys("Swetha");   
  }


  
}
