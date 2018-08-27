package com.project.utilities;

public class projectVariables {
	
 	
	public String QAURL ="https://qapolicy.ihtech.com/jbpm/#LogInPlace:login";
	
	public String user = "iht_ittest05";	
	
	public String DEVURL ="http://10.36.2.84:8080/CPTICDLinks/home?userid=" +"\""  + user+"\"" +"&isAdmin=false";						  
	
	public String CPT_ICD_TASKS = "https://qajbpm.ihealthtechnologies.com/CPTICDLinks/home?userid=" + user+"&isAdmin=false";
				
	public String USER_NAME = "iht_ittest05";
	
	public String PASSWORD = "Ihealth123";	
	
	public String NONADMINOPS_USERNAME = "iht_ittest07";
	
	public String NONADMINOPS_PASSWORD = "U2VydmljZTEyMw==";
	
	public String NONCPTICDRA_USERNAME = "iht_ittest07";
	
	public static String DB_USERNAME= "LCD";
	
	public  static String DB_PASSWORD = "bGNk";
	
	public static String DB_CONNECTION_URL = "jdbc:Oracle:thin:@vpmtst1.ihtech.com:1521/VPMTST1.iht.com";	

	public static String DB_CONNECTION_URL2 = "jdbc:Oracle:thin:@vpmdev1.ihtech.com:1521/VPMDEV1.iht.com";
	
	public static String DB_DRIVER_NAME= "oracle.jdbc.OracleDriver";
	
	public static String DB_USERNAME2= "APP_MDM";
	
	public  static String DB_PASSWORD2 = "YXBwX21kbQ==";	
	
	public static String CMSData =  "LCD"; 
	
	public static String RA_USER = "iht_ittest01";
	
	
	//BROWSER SYNC TIME VARIABLES
	
	public int MAX_TIME_OUT = 30000;
	
	public int MID_TIME_OUT = 3000;
	
	public int MID_MIN_TIME_OUT = 3000;
	
	public int MIN_TIME_OUT = 500;
	
	public int EXTD_MAX_TIME_OUT = 400000;
	
	public int EXTD_MAX_MED_TIME_OUT=180000;
	
	public static final String File_TestData = "TestData.xlsx";
	
	public static final String Warning_Msg_Dlg_Text_Previous_Task = "Previous Task(s) for this ID is still not completed. This Task cannot be claimed till the review is completed for all the previous weeks review tasks for this LCD/Article ID";
	
	public static final String Alert_Msg_Dlg_Text = "Previous Task(s) for this ID is still not completed. This Task cannot be reassigned till the review is completed for all the previous week(s) review tasks for this LCD/Article ID";
	
	public static final String Warning_Msg_Dlg_Text_FirstWeekStarted_Task = "";
	
	public static final String Warning_Msg_Dlg_Text_FirstWeekCompleted_Task = "Task(s) are reassigned successfully";
	
	public static final String Confirmation_Dlg_Text = "Are you sure you want to assign the task(s)";
	
	public static final String  AutoTest_Comments =  "QA";
	
	public static final String  BulkUpdate_Comments =  "Test123";
	
	public static int proposalCount_BeforeStartReview=0;
	
	public static boolean DateBandingMsgFlag=false;
	
	
	
}
