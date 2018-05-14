package maven.fmwork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pageobjects extends driverfactory {

	@FindBy(id="btn2")
	public WebElement skipsignin_BTN;
	
	@FindBy(linkText="SwitchTo")
	public WebElement SwitchTo_TAB;
	
	@FindBy(linkText="Frames")
	public WebElement Frames_BTN;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement textbox_TXT;
	
public pageobjects(){

        //this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
	
}

