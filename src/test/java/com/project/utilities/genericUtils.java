package com.project.utilities;

import java.awt.Robot;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;

public class genericUtils {
	
	
    public  void highlightElement(WebDriver driver, WebElement element) {

        for (int i = 0; i < 50; i++) 
        {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: green; border: 2px solid green;");
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");      
       }

    }
         
    public boolean enterValueToFilter(WebDriver driver, WebElement element,String sCode) {      
        
      try {

            element.click();
            Thread.sleep(1000); 
            JavascriptExecutor js = (JavascriptExecutor) driver;  
            js.executeScript("arguments[0].value=arguments[1];", element, sCode);   
            Robot robot = new Robot();  
            robot.keyPress(java.awt.event.KeyEvent.VK_SPACE);
             
        }catch (Exception e) {
         System.out.println("Element not present: " + element);
         System.err.println(e);
         driver.close();
         return false; 
       }
       
      return true;  
     }
        
    /*public boolean enterValue(java.util.List<WebElement>  columnList, int columnNo,String sCode)
    {
    	
    	// WebDriver driver = appUtils.getDriver();
    	 
    	 try{
    		columnList.get(columnNo).click();
	         Thread.sleep(1000);
	         System.out.println("size:="+columnList.size());		              
	         System.out.println("IS DISPLAYED:="+columnList.get(columnNo).isDisplayed());
	         JavascriptExecutor js=(JavascriptExecutor) driver;
	         js.executeScript("arguments[0].value=arguments[1];", columnList.get(columnNo),sCode);	              
	
	         Robot robot = new Robot();  
	         robot.keyPress(java.awt.event.KeyEvent.VK_SPACE);
    	 }
    	   catch (Exception e) {
           System.out.println("Element not present");
           System.err.println(e);
           driver.close();
           return false; 
           }
    	 
    	 return true;
    	
    }*/
      
    public boolean isPresent(WebDriver driver, String webElName, String method) {
        List<WebElement> appButtons = new ArrayList<WebElement>();
        try {
               if  (method.equals("name")) {
                      appButtons = driver.findElements(By.name(webElName));
               } else if (method.equals("xpath")) {
                      appButtons = driver.findElements(By.xpath(webElName));
               } else if (method.equals("id")) {
                      appButtons = driver.findElements(By.id(webElName));
               } else if (method.equals("css")) {
                      appButtons = driver.findElements(By.cssSelector(webElName));
               } else if (method.equals("class")) {
                      appButtons = driver.findElements(By.className(webElName));
               } else if (method.equals("link")) {
                      appButtons = driver.findElements(By.linkText(webElName));
               } else if (method.equals("partialLink")) {
                      appButtons = driver.findElements(By.partialLinkText(webElName));
               } else if (method.equals("tag")) {
                      appButtons = driver.findElements(By.tagName(webElName));
               } 
               
               if (appButtons.size() > 0) {
                      return true;
               } else {
                      return false;
               }
        } catch (Exception e) {
                      System.out.println("Element not present: " + webElName);
                      System.err.println(e);
                      driver.close();
                      return false;
               }
     }   
    
	public void setAttribute(WebElement element, String attributeName, String value)
	{
		WrapsDriver wd = (WrapsDriver) element;
		JavascriptExecutor driver = (JavascriptExecutor)wd.getWrappedDriver();
		driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);
	}
		
	public boolean chkalphabetical_order(LinkedList<String> payer_names){

	    String previous = ""; // empty string

	    for (final String current: payer_names) {
	        if (current.compareTo(previous) < 0)
	            return false;
	        previous = current;
	    }
	    return true;
	}
	
	public static String decode(String value) throws Exception {		 
	     byte[] decodedValue = Base64.getDecoder().decode(value); 
	     return new String(decodedValue, StandardCharsets.UTF_8);
	  }
	
    public boolean gfn_BUTTON_CLICK(WebDriver driver,String sButtonid){
            
            //Variables Declaration
            String sBtnXpath="//button[@id='"+sButtonid+"']";
            boolean blnResult=false;
            int iTimer=0;
            try{
                   do{
                         List<WebElement> sList = driver.findElements(By.xpath(sBtnXpath));
                         if(sList.size()>0){
                                for(int i=0;i<sList.size();i++){
                                       
                                       if ((sList.get(i).isDisplayed()) && (sList.get(i).isEnabled())) {
                                              highlightElement(driver,sList.get(i));
                                              sList.get(i).click();
                                              blnResult=true;
                                              Thread.sleep(1000);
                                              fn_ReportEvent("Button clicked sucessfully:="+sButtonid,"PASSED");
                                              break;
                                              
                                       }
                                }
                         }
                         
                         iTimer=iTimer+1;
                   } while ((blnResult!=true) && (iTimer!=10));
                   
                   //if Button is not found 
                   if(blnResult!=true){
                         fn_ReportEvent("Object not found:="+sButtonid,"FAILED");
                         blnResult=false;
                   }
                   
            }
            catch(Exception e){
                   
                   System.out.println("Failed For :="+e.getMessage());
                   driver.quit();
                   
            }
            return blnResult;
     }

    public static void fn_ReportEvent(String StepDetails,String sStatus){
            if (sStatus.equalsIgnoreCase("PASSED")){
                   System.out.println(StepDetails+":="+sStatus);
            }else{
                   System.out.println(StepDetails+":="+sStatus);
            }
     }
     
    public void fn_Loading(WebDriver driver) throws InterruptedException{

      boolean blnFlag = false;
      String strXpath = "//span[contains(text(),'Loading')]";

      Thread.sleep(1000);
      int i=1;
      try{   
             do{
                   blnFlag = false;
                   if (driver.findElement(By.xpath(strXpath)).isDisplayed()){
                          blnFlag = true;
                   }
                   i++;
                   Thread.sleep(1000);
             }while ((i<=100) && (blnFlag == true));

      }   catch(Exception e){
             System.out.println("Screen Loaded Successfully" );
      } 

}
      
    public  boolean gfn_CLICK_OBJECT_BY_XPATH(WebDriver driver,String sXpath){
            
            //Variables Declaration
            
            boolean blnResult=false;
            int iTimer=0;
            try{
                   do{
                         List<WebElement> sList = driver.findElements(By.xpath(sXpath));
                         if(sList.size()>0){
                                for(int i=0;i<sList.size();i++){
                                       
                                       if ((sList.get(i).isDisplayed()) && (sList.get(i).isEnabled())) {
                                              highlightElement(driver,sList.get(i));
                                              sList.get(i).click();
                                              blnResult=true;
                                              Thread.sleep(1000);
                                              fn_ReportEvent("Button clicked sucessfully:="+sXpath,"PASSED");
                                              break;
                                              
                                       }
                                }
                         }
                         
                         iTimer=iTimer+1;
                   } while ((blnResult!=true) && (iTimer!=10));
                   
                   //if Button not found
                   if(blnResult!=true){
                         fn_ReportEvent("Object not found:="+sXpath,"FAILED");
                         blnResult=false;
                   }
                   
            }
            catch(Exception e){
                   
                   System.out.println("Failed For :="+e.getMessage());
                   driver.quit();
                   
            }
            return blnResult;
     }
	 
	  
	 
	
	
}