package com.project.utilities;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import oracle.jdbc.OracleTypes;

public  class DBUtils {	
	
	projectVariables CPT_ICD_PROJ_VAR = new projectVariables();
	genericUtils Generic = new genericUtils();
	private static WebDriver driver;
	
	
	public static String executeSQLQuery(String sqlQuery) throws Exception
	{
		int rows = 0;
		String queryResultValue= "";

		Connection con = null;
		try {

			Class.forName(projectVariables.DB_DRIVER_NAME);
			String sPassword = genericUtils.decode(projectVariables.DB_PASSWORD);		
			
			con = DriverManager.getConnection(projectVariables.DB_CONNECTION_URL,projectVariables.DB_USERNAME,sPassword);
			if(con!=null) {
				System.out.println("Connected to the Database...");
			}else {
				System.out.println("Database connection failed ");
			}

			Statement st = con.createStatement();	        		
			ResultSet rs =st.executeQuery(sqlQuery);        	

			while(rs.next())
			{
				if (rs.getString(1) != null) {
					queryResultValue = rs.getString(1).toString();
				}
				else {
					System.out.println("No value obtained from this specific query");
					return "";
				}         
			} 

			

			

		}catch (SQLException e) {
			e.printStackTrace();}

		catch (NullPointerException err) {
			System.out.println("No Records obtained for this specific query");
		}        

		catch (ClassNotFoundException e1) {     		  		
		}finally{
			if(!(con==null))
			con.close();
		}

		return queryResultValue;


	}   
			
	public ResultSet executeOracleQuery(String sqlQuery) throws Exception
	{
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String sPassword = genericUtils.decode(projectVariables.DB_PASSWORD);		
			
			Connection con = DriverManager.getConnection(projectVariables.DB_CONNECTION_URL,projectVariables.DB_USERNAME,sPassword);
			
			if(con!=null) {
				System.out.println("Connected to the Database...");
				System.out.println(sqlQuery);
				Statement st = con.createStatement();	        		
				ResultSet rs =st.executeQuery(sqlQuery);  
				
				return rs;
				
				
			}else {
				System.out.println("Database connection failed ");
				return null;
			}
		}catch(SQLException e){
		System.out.println(e);
		}
				
			
			
			return null;
		  
	}
		
	public static int executePLSQLProcedure(int ID,String CMSData)
	{		
		int returnValue=0;	
		try {	

			Class.forName(projectVariables.DB_DRIVER_NAME);
			Connection con = DriverManager.getConnection(projectVariables.DB_CONNECTION_URL,projectVariables.DB_USERNAME,projectVariables.DB_PASSWORD);
			CallableStatement stmt = null;
			ResultSet rset = null;		    	 

			String sProcedureName = "";	    		    	

			if(con!=null) {
				System.out.println("Connected to the Database...");
			}else {
				System.out.println("Database connection failed ");
			}

			if (CMSData.equalsIgnoreCase("LCD"))
			{
				stmt = con.prepareCall("{call LCD.LCD_QA_UTIL.QA_DATA_SETUP(?,?,?)}"); // LCDID Data Procedure
			}
			else if (CMSData.equalsIgnoreCase("Article")){	

				stmt = con.prepareCall("{call LCD.addArticle(?)}");   //Article Data Procedure  
			}

			stmt.registerOutParameter(3, OracleTypes.NUMBER);
			stmt.setInt(1,ID);
			//stmt.setString(2,sOperation);	    	
			stmt.execute();				    	
			returnValue =  stmt.getInt(3);			    	
			System.out.println(returnValue);  	 		 
			con.close();

		}catch (SQLException e) {        	
			e.printStackTrace();
		}

		catch (NullPointerException err) {
			System.out.println("No Records obtained for this specific query");
			err.printStackTrace();     
		}        

		catch (ClassNotFoundException e1) {     	 
			e1.printStackTrace();
		}

		return returnValue;
	}
		
	public static ArrayList<String> executeSQLQueryMultipleRows(String sqlQuery) throws Exception
	{
				
		ArrayList<String> resultList = new ArrayList<String>();
	
	try {		
			Class.forName(projectVariables.DB_DRIVER_NAME);
			String sPassword = genericUtils.decode(projectVariables.DB_PASSWORD);
        		
        	Class.forName(projectVariables.DB_DRIVER_NAME);
        	Connection conn = DriverManager.getConnection(projectVariables.DB_CONNECTION_URL,projectVariables.DB_USERNAME,sPassword);
        	
        	  if(conn!=null) {
                  System.out.println("Connected to the Database...");
              }else {
                  System.out.println("Database connection failed ");
              }
        	
        	  
        	 String result;
        	  
        	  Statement st = conn.createStatement();	        		
        	  ResultSet rs =st.executeQuery(sqlQuery);  
        	  
        	  int i = 0;
        	  while (rs.next() && i != 500) {
        	          result = rs.getString(1).toString();
        	          resultList.add(result);
        	          i = i + 1;
        	      }
        	
        	           
        	  if (conn != null) {
      	    	conn.close();} 
   
            
        }catch (SQLException e) {
            e.printStackTrace();}
        
        catch (NullPointerException err) {
            System.out.println("No Records obtained for this specific query");
            err.printStackTrace();              }        
		
	     catch (ClassNotFoundException e1) {     		  		
				e1.printStackTrace();	}
	  
	  return resultList;
        
	}   

	public static ArrayList<String> getQueryResults(String sQuery,String[] dbColumn) throws Exception
    {
      Connection conn=null;      
      ArrayList<String> values = null;  
    
     try {    	   
         // Load the Driver class. 
          Class.forName("oracle.jdbc.OracleDriver");
          // Create the connection using the static getConnection method 
          conn=DriverManager.getConnection("jdbc:Oracle:thin:@vpmtst1.ihtech.com:1521/VPMTST1.iht.com","USER_MASTER_SELECT","USER_MASTER_SELECT");
          //Create a Statement class to execute the SQL statement 
          Statement stmt=conn.createStatement();
          //Execute the SQL statement and get the results in a Resultset 
          ResultSet rs=stmt.executeQuery(sQuery);
          values = new ArrayList<String>();
			while (rs.next()) {
				for (int i = 0; i < dbColumn.length; i++) {					
					values.add(rs.getString(dbColumn[i]));										
				}	
			}
			System.out.println("Stored Data in DB:" +" " +values);
			 if (conn != null) {
			       	conn.close();}
      }
    
      catch(Exception e) {
             
            
      }
       finally{
              try {
                     if(conn != null)
                   conn.close();
              }
               catch(SQLException e)  {
               	 e.printStackTrace();
               	 
               } 
       }
    
	return values;
                     
      }

	public static ArrayList<String> db_GetAllColumnvalues(String sqlQuery, String sColumn) throws Exception {
	       
	       ArrayList<String> resultList = new ArrayList<String>();

	        Connection con=null;
	       try {

	    	    Class.forName(projectVariables.DB_DRIVER_NAME);
				String sPassword = genericUtils.decode(projectVariables.DB_PASSWORD);		
				
				con = DriverManager.getConnection(projectVariables.DB_CONNECTION_URL,projectVariables.DB_USERNAME,sPassword);

	              if (con != null) {
	                     System.out.println("Connected to the Database...");
	              } else {
	                     System.out.println("Database connection failed ");
	              }

	              String result;

	              Statement st = con.createStatement();
	              ResultSet rs = st.executeQuery(sqlQuery);
	              ResultSetMetaData rsmd = rs.getMetaData();

	              int iColCount = rsmd.getColumnCount();
	              System.out.println("Column"+iColCount);
	              
	              while (rs.next()) {
	                     result = rs.getString(sColumn).toString();
	                     System.out.println("Column data "+result);
	                     resultList.add(result);                        
	              }

	              con.close();

	       } catch (SQLException e) {
	              e.printStackTrace();
	       }

	       catch (NullPointerException err) {
	              System.out.println("No Records obtained for this specific query");
	              
	       }

	       catch (ClassNotFoundException e1) {
	              e1.printStackTrace();
	       }

	       return resultList;

	}
	
	   	
public static void main(String[] args) throws Exception {
			
/*ArrayList<String> resultList = new ArrayList<String>();
	
DBUtils db1 = new DBUtils();

String sqlQuery = "SELECT distinct HCPC_CODE,art_id FROM LCD.ART_CPT_ICD_SPRT_DELTA"+ 
" WHERE HCPC_CODE IN (SELECT CPT_CODE FROM LCD.EXCLUDED_CPT_CODES) and ART_id =54666";
resultList = db1.executeSQLQueryMultipleRows(sqlQuery);

//Statement st = con.createStatement();	        		
//ResultSet rs =st.executeQuery(sqlQuery);   

 // for(int j=0;j<resultList.size();j++)
  //{
	  	  System.out.println("Query Result:"+resultList.get(j));
	  
<<<<<<< .mine
=======
	 // System.out.println("Query Result:"+((CallableStatement) resultList).getString(j));
	  
>>>>>>> .r245103
 // }
	 */ 
	  
	
}
	
	
	
	}



