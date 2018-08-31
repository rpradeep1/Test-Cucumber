package com.project.driver;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.project.utilities.ExcelUtils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Features",
		glue ={"com.project.teststeps","com.project.driver"},
		tags = {"@Regression"},
		plugin = {"html:target/cucumber-html-report","json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml","json:target/cucumber2.json"}
	)

public class testrunner {	
	
	@BeforeClass
	public static void killExcel() throws Exception{	

		Runtime.getRuntime().exec("taskkill /F /IM EXCEL.EXE");
		String sDirectory = System.getProperty("user.dir");
		String sDriverPath = sDirectory+"\\src\\test\\resources\\Data";
		String sExcelPath = sDirectory+"\\src\\test\\resources\\Data\\Mail.xlsm";
		ExcelUtils.SetPath(7, 2, sDriverPath, sExcelPath);   
		
	}

    @AfterClass
    public static void fn_SendMail() throws IOException{
    	String sDirectory = System.getProperty("user.dir");
    	String sDriverPath = sDirectory+"\\src\\test\\resources\\Data";
		String sExcelPath = sDirectory+"\\src\\test\\resources\\Data\\Mail.xlsm";
    	Runtime.getRuntime().exec(new String[] { "wscript.exe", sDriverPath+"\\Trigger.vbs",sExcelPath});   
    }

	
	
}
