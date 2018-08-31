package com.project.driver;
import java.lang.reflect.Field;


import com.project.utilities.ExcelUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.runtime.junit.ExecutionUnitRunner;
import cucumber.runtime.junit.JUnitReporter;



public class CucumberHooks{
	


	@After
    public void cleanUp(Scenario sScenario) throws Exception{ 
    	
		Field f = sScenario.getClass().getDeclaredField("reporter");
        f.setAccessible(true);
        JUnitReporter reporter =(JUnitReporter) f.get(sScenario);
        
         Field executionRunnerField = reporter.getClass().getDeclaredField("executionUnitRunner");
         executionRunnerField.setAccessible(true);
         ExecutionUnitRunner executionUnitRunner =(ExecutionUnitRunner) executionRunnerField.get(reporter);
        
         String sScenarioOutline =executionUnitRunner.getDescription().getDisplayName();
        /* 
         Field sfield = sScenario.getClass().getDeclaredField("stepResults");
         sfield.setAccessible(true);
          ArrayList<Result> sResults = (ArrayList<Result>) sfield.get(sScenario);
          
          Field execution = sResults.getClass().getDeclaredField("elementData");
          execution.setAccessible(true);
           ArrayList<E> xecutionUnitRunner = (ArrayList<E>) execution.get(sResults);
         
          System.out.println(sResults.get(0).getError().getMessage());
          */
          
       /*  sResults.
         Field executionRunnerField = reporter.getClass().getDeclaredField("executionUnitRunner");
          executionRunnerField.setAccessible(true);
          ExecutionUnitRunner executionUnitRunner =(ExecutionUnitRunner) executionRunnerField.get(reporter);
         
          String sScenarioOutline =executionUnitRunner.getDescription().getDisplayName();*/
        
    	String sStatus = sScenario.getStatus();
    	
    	String sTCname = sScenario.getName()+sScenarioOutline;
    	String sFeatureName = sScenario.getId().split(";")[0].replace("-", " ");

    	if (sStatus.equalsIgnoreCase("failed")){   		
    		//pages.getDriver().quit();
    	}    
	    
    	String sDirectory = System.getProperty("user.dir");
    	String sDriverPath = sDirectory+"\\src\\test\\resources\\Data";
		String sExcelPath = sDirectory+"\\src\\test\\resources\\Data\\Mail.xlsm";
    	  
	    int iScenarioCount = ExcelUtils.SetCellDataXlsm(sFeatureName,sTCname,sStatus,sExcelPath);

    	if (iScenarioCount % 20 == 0)
    		Runtime.getRuntime().exec(new String[] { "wscript.exe", sDriverPath+"\\Trigger.vbs",sExcelPath}); 
 
    }


}
