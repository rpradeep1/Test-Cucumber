package com.project.teststeps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.project.utilities.genericUtils;
import com.project.utilities.objectRepository;
import com.project.utilities.projectVariables;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase1 {
	
	WebDriver driver;
	projectVariables CPT_ICD_PROJ_VAR = new projectVariables();	
	objectRepository CPT_ICD_PROJ_OR = new objectRepository();
	genericUtils Generic = new genericUtils();
	
	
	@Given("^an IU user have role of Admin Ops$")
	public void an_IU_user_have_role_of_Admin_Ops() throws Throwable {
		
		  String Path = System.getProperty("user.dir");	  
		  System.setProperty("webdriver.chrome.driver", Path + "/Browsers/Chrome/chromedriver.exe");
	      DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	      capabilities.setCapability("ignoreProtectedModeSettings",true);                
	      driver = new ChromeDriver(capabilities);         
	      driver.manage().window().maximize(); 	
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get(CPT_ICD_PROJ_VAR.QAURL);	
	      
	}

	@When("^User logs with \"([^\"]*)\" as CPT ICD RA into JBPM Application$")
	public void user_logs_with_as_CPT_ICD_RA_into_JBPM_Application(String arg1) throws Throwable {
		
		try{          
	        
			driver.findElement(By.id(CPT_ICD_PROJ_OR.USER_NAME_EDIT_BOX)).sendKeys(arg1);			
			Thread.sleep(CPT_ICD_PROJ_VAR.MIN_TIME_OUT);
           System.out.println("CPT ICD RA User Name is provided successfully");
  		}  catch(Exception e){
  			 driver.quit();
  			 throw new Exception("User Name Edit Box is not displayed"); 
  			} 
		
		try{          
						
			driver.findElement(By.id(CPT_ICD_PROJ_OR.PASSWORD_EDIT_BOX)).sendKeys(CPT_ICD_PROJ_VAR.PASSWORD);			
			Thread.sleep(CPT_ICD_PROJ_VAR.MIN_TIME_OUT);
           System.out.println("CPT ICD RA Password is provided successfully");
  		} catch(Exception e){
  			 driver.quit();
  	   		 throw new Exception("Password edit box is not displayed");             		      
  		} 	
		
		try{    
			driver.findElement(By.xpath(CPT_ICD_PROJ_OR.SIGN_IN_BUTTON)).click();		
			Thread.sleep(CPT_ICD_PROJ_VAR.MIN_TIME_OUT);
           System.out.println("SIGN IN Button is clicked successfully");
  		} catch(Exception e){
  			 driver.quit();
  	   		  throw new Exception("SIGN IN Button is not displayed");            		      
  		} 	
		
		try{ 				
			Thread.sleep(CPT_ICD_PROJ_VAR.MIN_TIME_OUT);
            System.out.println("Home Page is displayed successfully");
  		}    catch(Exception e){
  			driver.quit();
  			throw new Exception("Home Page is not displayed");             		      
  		} 

	}

	@Then("^They should able to click on CPT ICD Link-Admin link under Adminstration tab$")
	public void they_should_able_to_click_on_CPT_ICD_Link_Admin_link_under_Adminstration_tab() throws Throwable {
		
		Actions action = new Actions(driver);
		//driver.findElement(By.xpath("//*[@id='x-auto-49']")).click();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='x-auto-49']"))).doubleClick().build().perform();
		System.out.println("Administration link is clicked successfully");	
		Generic.highlightElement(driver, driver.findElement(By.linkText(CPT_ICD_PROJ_OR.CPT_ICD_ADMIN_LINK)));	
		action.moveToElement(driver.findElement(By.linkText(CPT_ICD_PROJ_OR.CPT_ICD_ADMIN_LINK))).doubleClick().build().perform();
		System.out.println("CPT ICD Admin link is clicked successfully");
	}

	@Then("^Screen will be opened in a new tab with title CPTICD Links- Admin$")
	public void screen_will_be_opened_in_a_new_tab_with_title_CPTICD_Links_Admin() throws Throwable {
		
		System.out.println("Validate CPT ICD Admin link");
		boolean sVal = driver.findElement(By.xpath("//h1[contains(text(), 'CPT ICD Link-Admin')]")).isDisplayed();
		
		if (sVal) {
			System.out.println("CPT ICD Admin Home screen is displayed");
		}
		

	}

	@When("^RA captures Admin screen data count by executing a Query$")
	public void ra_captures_Admin_screen_data_count_by_executing_a_Query() throws Throwable {

	}

	@Then("^The records count in the Admin screen grid should match with the DB count$")
	public void the_records_count_in_the_Admin_screen_grid_should_match_with_the_DB_count() throws Throwable {

	}

	@Then("^Logout Application$")
	public void logout_Application() throws Throwable {

	}


}
