package com.project.utilities;



//import com.project.teststeps.ID;

public class objectRepository {
		
	public String NEW_IDEA_TAB = "//*[@id='topMenu']/li[1]/a";
	public String USER_NAME_EDIT_BOX = "x-auto-22-input";
	public String PASSWORD_EDIT_BOX = "x-auto-24-input";
	public String SIGN_IN_BUTTON = "//*[@id='x-auto-13']/tbody/tr[2]/td[2]/em/button";
	public String HOME_PAGE = "//*[@id='x-auto-3']";
	public String CPT_ICD_LINK = "CPT ICD Link";
	public String CPT_ICD_PAGE = "//h1[contains(text(), 'CPT ICD Link')]";
	public String INDIVIDUAL_TASKS_TAB = "//*[@id='tabs']/li[1]/a";
	public String GROUP_TASKS_TAB = "//*[@id='tabs']/li[2]/a";
	public String ICD_ARTICLE_SECTION = "//span[contains(text(), 'LCD/Article')]";
	public String ICD_ARTICLE_TITLE = "//span[contains(text(), 'Title')]";
	public String CODE_COMBINATION = "//span[contains(text(), 'Code Combination Count')]";
	public String JURISDICATION = "//span[contains(text(), 'Jurisdiction')]";
	public String TASK_ASSIGNED_WEEK = "//span[contains(text(), 'Task Assigned Week')]";
	public String STATUS = "//span[contains(text(), 'Status')]";
	public String GROUP_TASKS_GRID = "//div[@class ='ui-grid-canvas']";
	public String GROUP_TASKS_ID = "//div[@class = 'left ui-grid-render-container-left ui-grid-render-container ui-grid-render-container']/div/div[@class ='ui-grid-canvas']/div/div[@role ='row']/div";
	public String GROUP_TASKS_ID_ROW2="(//div[@class = 'left ui-grid-render-container-left ui-grid-render-container ui-grid-render-container']/div/div[@class ='ui-grid-canvas']/div/div[@role ='row']/div)[2]";
	public String LCD_TASK = "//*[@id='1486631499777-0-uiGrid-00LO-cell']";
	public String CLAIM_LCD_BUTTON = "//a[@class = 'btn btn-sm btn-primary claim-task pull-right']";
	public String START_REVIEW_BUTTON = "//*[@id='startReview']";	
	public String REVIEW_STATUS =  "//*[@id='reviewcontent']/div[1]/div/ul[1]/li[4]/b";	
    public String SET_AS_APPROIPRIATE_BUTTON = "//*[@id='setAppropriate']";
	public String SET_AS_INAPPROIPRIATE_BUTTON = "//*[@id='setInAppropriate']";
	public String IDCheckBoxPathPrefix = "//div[@class ='ui-grid-canvas']/div/div[@role ='row']/div[@class ='";
	public String IDCheckBoxPathSuffix ="']//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']";
	public String Week_Task_Sorting = "(//div[@class='ui-grid-canvas'])[2]/div";
	public String ID_Checkbox= "//div[@row-render-index='rowRenderIndex']/div/div/div/div";
	public String SpanText = "//span[text()='sValue']";
	
	public String COMPLETE_RA_REVIEW_BUTTON = "//*[@id='completeRAReview']";
	public String RA_REVIEW_WORK_QUEUE = "//a[@id='reviewcontent']/ul/li[1]/a";	
	public String TASK_ID = "//div[@class ='ui-grid-canvas']/div[@class ='ui-grid-row ng-scope']/div[@role ='row']/div[@class ='ui-grid-cell ng-scope ui-grid-coluiGrid-009Z']/div[@class ='ui-grid-cell-contents lcdId ng-binding ng-scope']";

	public String LCD_ID = "//div[@class='ui-grid-render-container ng-isolate-scope ui-grid-render-container-body']/div[@class='ui-grid-viewport ng-isolate-scope']/div[@class='ui-grid-canvas']/div/div[@role='row']/div/div/a";
	public String RA_REVIEW_WORK_QUEUE_LINK = "RA Review WorkQueue";
	public String START_REVIEW_BUTTON_CHECK ="//*[@id='reviewcontent']/ul[@class ='breadcrumb']/div[@class ='row padding-lr-10']/div[@class='col-md-6 voffset1 ull-right no-padding']/button[@id='startReview']";
	public String INDIVIDUAL_TASKS_ID = "//div[@class = 'ui-grid-render-container ng-isolate-scope ui-grid-render-container-body']/div/div[@class ='ui-grid-canvas']/div/div[@role ='row']/div";
	public String VIEW_PARAGRAPH_INFO_BUTTON = "//*[@id='viewParagraphInfo']";	
	public String DOESNOT_SUPPORT_TAB = "Does Not Support";	
	public String SUPPORT_TAB = "Support";	
	public String PARAGRAPH_INFO_SECTIONFRAME= "//*[@id='paragraphinfo']";	

	public String CLOSE_ICON = "/html/body/div[2]/div/div[3]/div/div/div[1]/div/i[2]";
	public String CPTHCPSCODE_SECTION = "//*[@id='paragraphinfo']/div[@class='cpt-hippcs-codes-grp']/div[@class='group-header']/h4[1]";
	public String ICD10CODE_SECTION = "//*[@id='paragraphinfo']/div[@class='icd10-codes-grp']/div[@class='group-header']/h4[1]";
    public String HPCPT10_PARAGRAPHS  =  	"//*[@id='paragraphinfo']/div[@class='cpt-hippcs-codes-grp']/div[@id='hcpcs-data']/section/div[@class='ng-binding']";
    public String HPCPT10_PARAGRAPHINFO  =  "//*[@id='hcpcs-data']/section/div";
    public String CPTHCPCSCODE_ID = "//div[@class = 'left ui-grid-render-container-left ui-grid-render-container ui-grid-render-container']/div/div[@class ='ui-grid-canvas']/div/div[@role ='row']/div";
    public String COLUMN_SORT =  "//div[@class = 'ui-grid-header ng-scope']/div/div[@class ='ui-grid-header-canvas']/div/div[@role ='ui-grid-header-cell-row']";
    public String CPTHCPCSCOLUMN_NAME = "//span[contains(text(),'CPT/HCPCS Code')]";
    public String CPTHCPCSCODEGROUPCOLUMN_NAME = "//span[contains(text(),'CPT/HCPCS Code Group')]";
    public String ICDCODECOLUMN_NAME = "//span[contains(text(),'ICD Code')]";
    public String ICDCODEGROUPCOLUMN_NAME = "//span[contains(text(),'ICD Code Group')]";
    public String REVIEWDECISION_COLUMN = "//span[contains(text(),'Review Decision')]"; 
    public String REVIEWDECISION_DROPDOWN2 =  "//*[contains(@id,'dropdownlistContentngxDropDownList')]";
    public String ICD10_PARAGRAPH = "//*[@id='supportgrp']/section/div";
    public String ICD10_PARAGRAPH_DONTSUPPORT="//*[@id='dontSupportgrp']/section/div";
    
    public String REVIEWDECISION_DROPDOWN =  "//*[contains(@id,'dropdownlistContentngxDropDownList')]";
    public String REVIEWDECISION_APPROPRIATE_CHKBOX=  "//*[contains(@id,'listitem0innerListBoxngxDropDownList')]/div";
    public String REVIEWDECISION_INAPPROPRIATE_CHKBOX=  "//*[contains(@id,'listitem1innerListBoxngxDropDownList')]/div";
    public String REVIEWDECISION_BLANK_CHKBOX=  "//*[contains(@id,'listitem2innerListBoxngxDropDownList')]/div";
       
    public String CPTHCPCSCODE = "//div[@class = 'ui-grid-cell-contents ng-binding ng-scope']";
    public String CPTHCPCSCODEGROUPVAL= "//DIV[@id='supportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][2]/DIV[1]";
    public String ICDCODEVAL= "//DIV[@id='supportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][3]/DIV[1]";
    public String ICDCODEGROUPVAL= "//DIV[@id='supportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][4]/DIV[1]";
    public String REVIEWDECISIONVAL= "//DIV[@id='supportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][5]/DIV[1]";
    public String REMARKSVAL= "//DIV[@id='supportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][6]/DIV[1]";
    
    public String ICDCODE_TARGETSCREEN = "(//div[@class = 'ui-grid-cell-contents ng-binding ng-scope'])[3]";
        
    
    public String CPTHCPCSCODE_DOESNOTSUPPORTTAB = "//DIV[@id='donotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[1]";
    public String CPTHCPCSCODEGROUPVAL_DOESNOTSUPPORTTAB= "//DIV[@id='donotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][2]/DIV[1]";
    public String ICDCODEVAL_DOESNOTSUPPORTTAB= "//DIV[@id='donotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][3]/DIV[1]";
    public String ICDCODEGROUPVAL_DOESNOTSUPPORTTAB= "//DIV[@id='donotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][4]/DIV[1]";
   
    
    public String CPTHCPCSCODE_EDIT =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div";
    public String CPTHCPCSCODEGROUP_EDIT = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/input";
    public String ICDCODE_EDIT = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[3]/div[2]/div[2]/div/div/input";
    public String ICDCODEGROUP_EDIT= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[4]/div[2]/div[2]/div/div/input";
    
           
    
    public String ADMINISTRATION_SECTION = "//span[contains(text(),'Administration')]";     
    public String CPT_ICD_ADMIN_LINK = "CPT ICD Link - Admin";
    public String ID_COLUMN_NAME = "//span[contains(text(),'ID')]";
    public String TITLE_COLUMN_NAME = "//span[contains(text(),'Title')]";
    public String LCDARTICLE_COLUMN_NAME = "//span[contains(text(),'LCD/Article')]";
    public String STATUS_COLUMN_NAME = "//span[contains(text(),'Status')]";    
    public String ASSIGNEE_COLUMN_NAME = "//span[contains(text(),'Assignee')]";
    public String JURSIDICTION_COLUMN_NAME = "//span[contains(text(),'Jurisdiction')]";
    public String CODECOMBINATIONCOUNT_COLUMN_NAME = "//span[contains(text(),'Code Combination Count')]";
    public String TASKASSIGNEDWEEK_COLUMN_NAME = "//span[contains(text(),'Task Assigned Week')]";    
    public String REASSIGN_BUTTON = "//*[@id='Reassign']";    											
	public String CPTLINKADMINTASK_CHKBOX= "//div[@class = 'left ui-grid-render-container-left ui-grid-render-container ui-grid-render-container']/div/div[@class ='ui-grid-canvas']/div/div[@role ='row']/div";	
	public String CPTLINKADMINTASK_ID = "//div[@class='ui-grid-render-container ng-isolate-scope ui-grid-render-container-body']/div[@class='ui-grid-viewport ng-isolate-scope']/div[@class='ui-grid-canvas']/div/div[@role='row']/div/div/a";	
	public String CPTICDRAUSERS_DROPDOWN = "//*[@id='dropdownlistContentngxDropDownList0']";
	public String NONADMIN_MESSAGE = "//DIV[@role='presentation'][1]/DIV[@role='presentation'][1]/DIV[@role='presentation'][1]/DIV[@role='presentation'][1]/DIV[2]/SPAN[1]";
	public String NONADMIN_MESSAGE_POPUP = "//div[@id='x-auto-199']";	
	public String NONADMIN_MESSAGE_OKBUTTON =  "//*[contains(text(),'OK')]";
						
	public String APPLOGOUT_LINK = "//TD/EM/BUTTON[normalize-space()='Sign Out']";
	public String RA_DROPDOWN_BUTTON = "//div[@class ='ngx-scrollbar-button-state-normal ngx-rc-b']";
	public String ROWHEADER_CHECKBOX = "//div[@class ='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']";
	public String GRID_DATA=  "//div[@class ='ui-grid-canvas']";
	public String NEXT_PAGE= "//button[@class='ui-grid-pager-next']";
	public String DROPDOWN_INPUTBOX ="//*[@id='innerListBoxngxDropDownList0']/div/div/div[1]/input"; 	
	public String ADMINTASKID = "//a[contains(text(),'33448')]";	
	public String PAGEITEMS_DROPDOWN_SUPPORTTAB = "//*[@id='supportCombinationsGrid']/div[3]/div[1]/div[2]/select";
	public String PAGEITEMS_DROPDOWN_DOESNOTSUPPORTTAB = "//*[@id='donotSupportGrid']/div[3]/div[1]/div[2]/select";	
	public String REVIEWPROCESS_COMPLETEMSG = "//DIV[@role='dialog'][1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/p[1]";
	public String REVIEWPROCESS_COMPLETEOKBTN= "//DIV/BUTTON[normalize-space()='OK']";
	
	public String ID_COLUMN_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/input";	
	public String TITLE_COLUMN_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/input";	
	public String LCD_ARTICLE_COLUMN_INDIVIDUALTASK= "//*[@id='dropdownlistArrowlcdOrArticle']";
		
	
	public String LCD_ARTICLE_COLUMN_LCD_CHECKBOX= "//*[@id='listitem0innerListBoxlcdOrArticle']";
	public String LCD_ARTICLE_COLUMN_ARTICLE_CHECKBOX= "//*[@id='listitem1innerListBoxlcdOrArticle']";
	
	
	public String JURISDICTION_COLUMN_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/input";	
	public String CODECOMBINATIONCOUNT_COLUMN_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/input";
	public String CODECOMBINATIONCOUNT_COLUMN_GRPTASK =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/input";
	
	public String STATUS_COLUMN_INDIVIDUALTASK= "//*[@id='dropdownlistContentngxDropDownList0']";	
	public String STATUS_COLUMN_NOTSTARTED_CHECKBOX= "//*[@id='listitem0innerListBoxngxDropDownList0']/div/div";
	public String STATUS_COLUMN_STARTED_CHECKBOX= "//*[@id='listitem1innerListBoxngxDropDownList0']/div/div";

	public String STATUS_COLUMN_FILTETVAL_INPUTBOX= "//*[@id='filterinnerListBoxngxDropDownList0']/input";	
	public String TASKASSIGNEDWEEK_COLUMN_INDIVIDUALTASK= "//*[@id='dropdownlistContentngxDropDownList1']";	
	public String TASKASSIGNEDWEEK_COLUMN_FILTETVAL_INPUTBOX= "//*[@id='filterinnerListBoxngxDropDownList1']/input";
	
	public String TASKASSIGNEDWEEK_COLUMN_GROUPTASK_NEW="//*[@id='dropdownlistContentngxDropDownList2']";
	
	public String TASKASSIGNEDWEEK_COLUMN_FILTETVAL_CHECKBOX= "//*[@id='listitem0innerListBoxngxDropDownList1']/div/div";
	
	public String TASKASSIGNEDWEEK_COLUMN_GROUPTASK= "//*[@id='dropdownlistContentngxDropDownList2']/span";
	public String TASKASSIGNEDWEEK_COLUMN_FILTETVAL_CHECKBOX_GRPTASK= "//*[@id='listitem0innerListBoxngxDropDownList2']/div/div";
	public String TASKASSIGNEDWEEK_COLUMN_WEEK_FILTETVAL_CHECKBOX_GRPTASK="//*[@id='listitem8innerListBoxngxDropDownList2']";
	
	public String ID_COLUMN_REMOVEFILTERICON_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/div/i";															
	public String TITLE_COLUMN_REMOVEFILTERICON_INDIVIDUALTASK="//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/i";
	public String JURISDICTION_COLUMN_REMOVEFILTERICON_INDIVIDUALTASK="//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/div/i";
	public String CODECOMBINATIONCNT_REMOVEFILTER_INDIVIDUALTASK= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/div/i";	
	public String CODECOMBINATIONCNT_REMOVEFILTER_GRPTASK=  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/div/i";
			
	public String CPTHCPCCODE_COLUMN_REMOVEFILTERICON= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/div/i";
	public String CPTHCPCCODEGROUP_COLUMN_REMOVEFILTERICON= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/i";
	public String ICDCODE_COLUMN_REMOVEFILTERICON= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[3]/div[2]/div[2]/div/div/div/i";
	public String ICDCODEGROUP_COLUMN_REMOVEFILTERICON= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[4]/div[2]/div[2]/div/div/div/i";
	
	

	public String ADMIN_FILTER_ID = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/input";
	public String ADMIN_FILTER_TITLE = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/input";
	public String ADMIN_FILTER_LCD_ARTICLE = "//*[@id='dropdownlistContentlcdOrArticle']";
	public String ADMIN_FILTER_LCD_ARTICLE_AFTER = "//*[@id='dropdownlistContentlcdOrArticle']/span";
	public String ADMIN_FILTER_STATUS = "//*[@id='dropdownlistContentngxDropDownList1']/span";
	public String ADMIN_FILTER_ASIGNEE = "//div[@id='listitem6innerListBoxngxDropDownList6']/span";
	public String ADMIN_FILTER_JURISDICATION = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/input";
	public String ADMIN_FILTER_CODE_COMBINATION_COUNT = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/div/input";
	public String ADMIN_TASK_ASSIGNED_WEEK = "//*[@id='dropdownlistContentngxDropDownList3']/span";	
	public String ADMIN_ID_REMOVE_FILTER = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[1]/div[1]/div[2]/div/div/div/i";
	public String ADMIN_TITLE_REMOVE_FILTER = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/i";
	public String SELECT_ARTICLE_CHECKBOX = "//*[@id='listitem1innerListBoxlcdOrArticle']/div/div/div";	
	public String SELECT_LCD_CHECKBOX = "//*[@id='listitem0innerListBoxlcdOrArticle']/div/div/div";
	public String STATUS_NOT_STARTED = "//*[@id='listitem0innerListBoxngxDropDownList1']/div/div/div";
	public String STATUS_STARTED = "//*[@id='listitem1innerListBoxngxDropDownList1']/div/div/div";
	public String STATUS_COMPLETED = "//*[@id='listitem2innerListBoxngxDropDownList1']/div/div/div";
	public String SELECT_TASK_ASSIGNED_WEEK = "//*[@id='listitem0innerListBoxngxDropDownList3']/div/div/div";
	public String ASSINGED_USER = "//*[@id='listitem4innerListBoxngxDropDownList2']/div/div/div";
	public String ASSINGED_USER2 = "//*[@id='listitem5innerListBoxngxDropDownList2']/div/div/div";	
	public String ASSINGED_USER3 = "//div[@id='listitem6innerListBoxngxDropDownList2']/div/div/div";
	public String ADMIN_CODE_COMBINATION_REMOVE = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/div/div/i";
	public String ADMIN_FILTER_DROPDOWN= "//div[@id='dropdownlistContentngxDropDownList2']/span";
	public String AMIN_FILTER_ASSIGNEE_ONE="//div[@id='listBoxContentinnerListBoxngxDropDownList2']/div/div/span";
	
	
	
	public String SELECT_REASON_DROPDOWN = "//div[contains(@id,'dropdownlistContentselectedReason')]";												
	public String SELECT_REASON_APPLY_BUTTON  = "//*[@id='wrapper']/div[1]/div[1]/div[2]/div[2]/a"; 
	

	public String SELECT_REASON_APPLY_BUTTON_OTHER = "//*[@id='wrapper']/div[1]/div/div/div[2]/div[2]/a";
	public String REMARKS_TEXTBOX  =  "//*[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/textarea";
	public String REMARKS_TEXTBOX_REASON =   "//textarea[@id='rejectReasonTextArea']"; 
	public String PLEASE_SELECT_REASON_TEXT = "/html/body/div[6]/div/div/div/div[2]";	
	public String PLEASE_SELECT_REASON_OK_BUTTON= "/html/body/div[8]/div/div/div/div[3]/button";
	public String DECISIONCNFIRMATION_POPUP= "/html/body/div[8]/div/div/div/div[2]";
	public String DECISIONCNFIRMATION_YESBTN= "/html/body/div[8]/div/div/div/div[3]/button[1]";
	public String DECISIONCNFIRMATION_NOBTN= "/html/body/div[8]/div/div/div/div[3]/button[2]";
	
	
	
	//Request For Code Combination Review Screen
	
	public String REMARKS_TEXTBOX_REQUESTFORREVIEW_SCREEN  =  "//*[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/textarea";
	public String RSNFORUPDTDECISION_REQUESTFORREVIEW_SCREEN  =  "//*[@id='wrapper']/div[1]/div[1]/div[2]/div[1]/textarea";
	
	
	public String REQUESTFORCODECOMBINATION_BUTTON =  "//button[@id='requestCodeCombination']";
	public String DOSFROMCOL_EDIT  = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/input";
	public String DOSTOCOL_EDIT    =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/div/input";
	public String REMARKSCOL_EDIT  = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[8]/ul/li[4]/input";
	public String REMARKSCOL_EDIT_TARGETSCREEN= "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[10]/ul/li[4]/input";
	public String RSNFOR_UPDATINGDECISIONCOL_EDIT =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[9]/div[2]/div[2]/div/div/input";
	public String CODECOMBINATIONREVIEWSCREEN = "//span[contains(text(),'Target Table Records')]";
	public String REMARKSCOL_EDIT_RA_REVIEWSCREEN  = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/ul/li[4]/input";
		
	public String DOSFROM_REMOVEFLTR =   "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/div/i";	
	public String DOSTO_REMOVEFLTR =    "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/div/div/i";	
	public String REMARKS_REMOVEFLTR =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[8]/ul/li[5]/div/i";	
	public String UPDTDECSRSN_REMOVEFLTR =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[9]/div[2]/div[2]/div/div/div/i";
	
		
	 public String DOSFROM_COLUMN_NAME = "//span[contains(text(),'DOS From')]";  	 
	 public String DOSTO_COLUMN_NAME = "//span[contains(text(),'DOS To')]";	 
	 public String REMARKS_COLUMN_NAME = "//span[contains(text(),'Remarks')]";	 
	 public String RSNFRUPDTNGDES_COLUMN_NAME = "//span[contains(text(),'Reason for Updating Decision')]"; 
		 
	 
	 public String CPTHCPCSCODEVAL_REQCODCMBREVIEWSCRN = "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[1]";
	 public String CPTHCPCSCODEGROUPVAL_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][2]/DIV[1]";
	 public String ICDCODEVAL_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][3]/DIV[1]";
	 public String ICDCODEGROUPVAL_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][4]/DIV[1]";
	 public String REVEWDECSVAL_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][5]/DIV[1]";
	 public String DOSFROMVAL_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][6]/DIV[1]";
	 public String DOSTOVAL_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][7]/DIV[1]";
	 public String REMARKSVAL_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][8]/DIV[1]";
	 public String RSNFRUPDTNGVAL_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][9]/DIV[1]";
	 
	 
	 public String ICDCODEVALTWO_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][4]/DIV[1]";
	 public String ICDCODEGROUPVALTWO_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][5]/DIV[1]";
	 public String REVEWDECSVALTWO_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][7]/DIV[1]";
	 public String DOSFROMVALTWO_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][8]/DIV[1]";
	 public String DOSTOVALTWO_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][9]/DIV[1]";
	 public String REMARKSVALTWO_REQCODCMBREVIEWSCRN= "//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][10]/DIV[1]";
	 public String RSNFRUPDTNGVALTWO_REQCODCMBREVIEWSCRN="//DIV[@id='targetSupportCombinationsGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][11]/DIV[1]";
	 
	 public String CPTDESCRVAL_REQCODCMBREVIEWSCRN= "(//textarea[@id='cptDescTxt'])[1]";
	 public String ICDDESCRVAL_REQCODCMBREVIEWSCRN= "(//textarea[@id='icdDescTxt'])[1]";
	 
		 
	 public String CPTHCPCSCODEVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN = "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[1]";
	 public String CPTHCPCSCODEGROUPVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[2]";
	 public String ICDCODEVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[3]";
	 public String ICDCODEGROUPVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[4]";
	 public String REVEWDECSVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[5]";
	 public String DOSFROMVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[6]";
	 public String DOSTOVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[7]";
	 public String REMARKSVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[8]";
	 public String RSNFRUPDTNGVAL_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][1]/DIV[9]";
	 
	 public String CPTHCPCSCODEGROUPVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][2]/DIV[1]";
	 public String ICDCODEVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][4]/DIV[1]";
	 public String ICDCODEGROUPVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][5]/DIV[1]";
	 public String REVEWDECSVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][7]/DIV[1]";
	 public String DOSFROMVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][8]/DIV[1]";
	 public String DOSTOVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][9]/DIV[1]";
	 public String REMARKSVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN= "//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][10]/DIV[1]";
	 public String RSNFRUPDTNGVALTWO_DSNTSPRTTAB_REQCODCMBREVIEWSCRN="//DIV[@id='targetDoesnotSupportGrid']/DIV[2]/DIV[@role='grid'][1]/DIV[@role='rowgroup'][2]/DIV[1]/DIV[1]/DIV[@role='row'][1]/DIV[@role='gridcell'][11]/DIV[1]";
	 
	 
	 
	 	
	 public String UPDATE_DECISION  =  "//button[@id='updateDecision']";
	 
	 public String ApplyFilterBtn  =  "//button[@id='applyFilter']";
	 
	 public String ClearAllFiltersBtn  =  "//button[@id='clearFilter']";
	 
	 public String PageItemsCount  =  "//div[@id='supportCombinationsGrid']/DIV[@role='contentinfo'][1]/DIV[2]/DIV[1]/SPAN[1]";
	 
	 public String PageItemsCount_IndividualTask = "//*[@id='mytasksgrid']/div[3]/div[2]/div/span";
	 
	 public String PageItemsCount_GroupTask = "//*[@id='grouptasksgrid']/div[3]/div[2]/div/span";
	 
	 public String PageItemsCount_AdminScreen = "//*[@id='admintasksgrid']/div[3]/div[2]/div/span";
	
	 public String PageItemsCount_AdminScreen_SupportTab  =  "//*[@id='supportCombinationsGrid']/div[3]/div[2]/div/span[1]";
	 
	 public String PageItemsCount_AdminScreen_TargetData  =  "//*[@id='targetCombigrid']/div[3]/div[2]/div/span";
	 
	 public String CPTHCPCSCODEGROUP_DROPDOWN = "//div[@id='dropdownlistContenthcpccode-group-drop-down']";
	 
	 public String ICDCODEGROUP_DROPDOWN = "//div[@id='dropdownlistContenticd10-group-drop-down']";
	 
	 public String REVIEWDECISION_DROPDOWN3  =  "//div[@id='dropdownlistContentappropriate_10-drop-down']";	
	 
	 public String REVIEWDECISION_ACCEPT = "//div[@id='listitem0innerListBoxappropriate_10-drop-down']";
	 
	 public String REVIEWDECISION_REJECT = "//div[@id='listitem1innerListBoxappropriate_10-drop-down']";
	 
	 public String REVIEWDECISION_BLANK = "//div[@id='listitem2innerListBoxappropriate_10-drop-down']";
	
	
	 public String REMARKS_COL  = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/ul/li[4]/input";
	 
	 public String TARGETTABLE_ITEMSCOUNT = "//DIV[@id='targetSupportCombinationsGrid']/DIV[@role='contentinfo']/DIV/DIV[1]/SPAN[1]";
	 
	 public String TARGETTABLE_ITEMSCOUNT_DSNOTSUPPORT = "//DIV[@id='targetDoesnotSupportGrid']/DIV[@role='contentinfo']/DIV/DIV[1]/SPAN[1]";
		 
	 
	 public String ICDCODEGROUP_DROPDOWN_TARGET = "//*[@id='dropdownlistContenticd-group-drop-down']";
	 
	 public String REVIEWDECISION_DRPDWN_TARGET  =  "//div[@id='dropdownlistContentreview-decision-drop-down']";
	 
	 public String RVIEWDCISN_ACCEPT_CHKBOX_TARGET=  "//*[contains(@id,'listitem0innerListBoxreview-decision-drop-down')]/div";
	 
	 public String RVIEWDCISN_REJECT_CHKBOX_TARGET=  "//*[contains(@id,'listitem1innerListBoxreview-decision-drop-down')]/div";	 
	 
	 public String REQSTLCD_ARTICLE_REVIEWBTN =  "//*[@id='content']/div[1]/a";
	 
	 public String  REQSTLCD_ARTICLE_REVIEW_POPUP ="/html/body/div[7]/div/div";
	 
	 public String  REQSTLCD_ARTICLE_REVIEW_POPUP_Tittle ="/html/body/div[7]/div/div/div/div[1]";
	 
	 public String REQSTLCD_ARTICLE_REVIEWDRPDWN_LABLE  = "/html/body/div[7]/div/div/div/div[2]/div/div[1]/label";
	 
	 public String REQSTLCD_ARTICLE_REVIEWDRPDWN = "//div[@id='dropdownlistContentrequestReview']";
	 
	 public String LCD_VALUE =  "//DIV[@id='listitem0innerListBoxrequestReview']";
	 
	 public String ARTICLE_VALUE =  "//DIV[@id='listitem1innerListBoxrequestReview']";
	 
	 public String TEXTBOX_LABEL = "/html/body/div[7]/div/div/div/div[2]/div/div[2]/label";
	 
	 public String REQSTLCD_ARTICLE_TEXTBOX =  "/html/body/div[7]/div/div/div/div[2]/div/div[2]/div/input";	  
	 
	 public String REQSTLCD_ARTICLE_SUBMITBTN = "/html/body/div[7]/div/div/div/div[3]/button";
	 
	 public String REMARKSCOL_CHEKBOX   =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[8]/ul/li[2]/input";
	 
	 public String REMARKSCOL_CHEKBOX_TARGETSCREEN  =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[10]/ul/li[2]/input";
	 
	 public String REMARKSCOL_CHEKBOX_TARGETSCREEN_New =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[11]/ul/li[2]/input";
	 
	 public String REMARKSCOL_CHEKBOX_TARGETSCREEN_SUPPORT_TAB  =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[8]/ul/li[2]/input";
	 
	 public String REMARKSCOL_CHEKBOX_TARGETSCREEN_SUPPORT_TAB_New  ="//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[9]/ul/li[2]/input";
	 	 
	 public String REMARKSEDIT_CHEKBOX    =  "//div[@id,'-grid-container']/div[1]/div/div/div/div/div/div[8]/ul/li[4]/input";
	 
	 public String ACCEPT_REJECT_CHKBOX = "(//div[@class='ui-grid-row ng-scope']//div[@class='ng-isolate-scope']/div[5]/div[contains(text(),'Accept')]/../../../../../../../..//div[@class ='ui-grid-disable-selection ng-scope'])[2]//div[@class='ui-grid-selection-row-header-buttons ui-grid-icon-ok ng-scope']";
	 
	 public String DECISION_UPDATE_MESSAGE =    "/html/body/div[6]/div/div/div/div[2]/p";
	 
	// public String DECISION_UPDATE_MESSAGE_NEW =    "/html/body/div[7]/div/div/div/div[2]/p";
	 
	 public String DECISION_UPDATE_MESSAGE_NEW = "/html/body/div[8]/div/div/div/div[2]/p";
	 
	 public String ACCEPT_REJECT_BUTTONS_AT_TOP = "//*[@id='setInAppropriate']";
	
	 public String REMARKS = "//*[@id='remarks']";
	 
	 public String RSNFORUPDATINGDECISION = "//*[@id='duReason']";
	 
	 public String OKBUTTON = "/html/body/div[6]/div/div/div/div[3]/button";
	 
	 //public String OKBUTTONNEW = "/html/body/div[7]/div/div/div/div[3]/button";
	 
	 public String OKBUTTONNEW = "/html/body/div[8]/div/div/div/div[3]/button";
	 
	 public String REMARKSCOL_CHEKBOX_RASCREEN  =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[6]/ul/li[2]/input";
	 
	 public String SELECTRSN_APPLYBTN_TARGETSCREEN  = "//*[@id='wrapper']/div[1]/div/div/div[2]/div[2]/a"; 
	 
	 public String SELECTRSN_BULKDECISION_APPLYBTN_TARGETSCREEN  = "//*[@id='wrapper']/div[1]/div[1]/div/div[2]/div[3]/a"; 
	 
	 public String CPTDESCRIPTION ="(//textarea[@id='cptDescTxt'])[1]";
		
	 public	String ICDDESCRIPTION ="(//textarea[@id='icdDescTxt'])[1]";
	 
	 public String CPTDescriptionXpath="(//textarea[@id='cptDescTxt'])";
	 
	 public String ICDDescriptionXpath="(//textarea[@id='icdDescTxt'])";
	 
	 public String CPTDESCIPTIONCOLUMN_NAME= "//span[contains(text(),'CPT Description')]"; 	 
	 
	 public String CPTHCPCCODECOLUMN_NAME= "//span[contains(text(),'CPT/HCPCS Code')]";
	 	 
	 public String ICDDESCRIPTIONCOLUMN_NAME =  "//span[contains(text(),'ICD Description')]";
	 
	 public String RA_ReviewScreen_LongViewRadioBtn =  "//*[@id='wrapper']/div[2]/label[1]/input";
	 
	 public String RA_ReviewScreen_ShortViewRadioBtn =  "//*[@id='wrapper']/div[2]/label[2]/input";
	 
	 public String RA_ReviewScreen_LongViewRadioBtn_Label = "//*[@id='wrapper']/div[2]/label[2]";

	 public String RA_ReviewScreen_ShortViewRadioBtn_Label =  "//*[@id='wrapper']/div[2]/label[1]";
	 
	 public String REMARKS_COL_TargeTablePage  = "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[11]/ul/li[4]/input";
		
	 public String REMARKSCOL_CHEKBOX_TargeTablePage  =  "//div[contains(@id,'-grid-container')]/div[1]/div/div/div/div/div/div[11]/ul/li[2]/input";
	 
	 public String DIALOG_BOX_TEXT = "//div[@class='modal-dialog modal-sm']//div[@class='modal-body ng-binding']";
	 
	 public String DIALOG_BOX_YES_Btn = "//div[@class='modal-dialog modal-sm']//button[text()='Yes']";
	
	 //public String WARNING_POPUP = "/html/body/div[7]/div/div/div";
	 
	 public String WARNING_POPUP = "/html/body/div[8]/div/div/div";
     
     //public String WARNING_COMPLETEMSG = "/html/body/div[7]/div/div/div/div[2]";
     
     public String WARNING_COMPLETEMSG = "/html/body/div[8]/div/div/div/div[2]";
     
     //public String WARNING_COMPLETEOKBTN= "/html/body/div[7]/div/div/div/div[3]/button";     
     
     public String WARNING_COMPLETEOKBTN= "/html/body/div[8]/div/div/div/div[3]/button";       

     public String PageItemsCount_DoesNotSupportTab  =  "//div[@id='donotSupportGrid']/DIV[@role='contentinfo'][1]/DIV[2]/DIV[1]/SPAN[1]";
     
     public String CPD_ICD_HOME_PAGE = "//h1[text()='CPT ICD Link']";
     
     public String ADMIN_HOME_PAGE = "//h1[text()='CPT ICD Link-Admin']";
     
     public String BULKDECISION_REASONFOR_UPDATE= "//*[@id='reasonForUpdateTextArea']";
           
     public String UPDATE_DECISION_BUTTON = "//*[@id='updateDecision']";
     
     public String TARGETRECORDSSCREEN_BREADCRUMB = "//*[@id='reviewcontent']/ul";
     
     public String TARGETRECORDSSCREEN_RAREVIEWWORKQUEUEELEMENT = "//*[@id='reviewcontent']/ul/li[1]/a";
     
     public String TARGETRECORDSSCREEN_TARGETTABLERECORDSELEMENT = "//*[@id='reviewcontent']/ul/li[3]/a";
     
     public String TARGETRECORDSSCREEN_ID =  "//*[@id='reviewcontent']/ul/li[2]/a";
     
     public String CODECOMBINATIONSSCREEN_RAREVIEWWORKQUEUEELEMENT = "//*[@id='reviewcontent']/ul/li[1]/a";
     
     public String CODECOMBINATIONSSCREEN_BREADCRUMB = "//*[@id='reviewcontent']/div[1]/div/ul[1]";
     
     public String ADMINSCREEN_REVIEWCONTENT = "//*[@id='reviewcontent']/ul/li[2]/a";
     
 	 public String ADMINWORKQUEUE_ELEMENT = "//*[@id='reviewcontent']/ul/li[1]/a"; 
 		
 	 public String  IDSTATUS =	"(//div[@class='ui-grid-row ng-scope']//div[@class='ng-isolate-scope']/div[4])[1]";	
	  
 	 public String  TITLE =      "(//div[@class='ui-grid-row ng-scope']//div[@class='ng-isolate-scope']/div[2])[1]";
 	 
 	 public String ADMINWORKQUEUE_TITLE = "//*[@id='reviewcontent']/div[1]/div/ul[2]/li[2]";
 	 
 	 public String ADMINRAREVIEW =   "//*[@id='reviewcontent']/div[1]/div/ul[1]/li[6]/b"; 	 
 
	 public String ADMINSCREEN_ID = "//*[@id='reviewcontent']/div[1]/div/ul[1]/li[2]/b"; 
	 
	 public String RAREVIEWWORKQUEUE_LINK = " RA Review WorkQueue";
	 
	 public String INDIVIDUALTASK_TAB = "//*[@id='tabs']/li[1]/a";
    	 
     public String REQUESTLCDARTICLE_MESSAGE = "html/body/div[9]/div/div/div/div[2]";
     
     public String REQUESTLCDARTICLE_MESSAGE_POPUP="/html/body/div[9]/div/div/div";
     
     public String YES_BUTTON_XPATHNEW = "/html/body/div[6]/div/div/div/div[3]/button[1]";
     
     public String ADMIN_REASSIGN_DROPDOWN= "//*[@id='dropdownlistArrowngxDropDownList0']/div";
     
     public String ADMIN_REASSIGN_DROPDOWN_VALUES = "//*[@id='innerListBoxngxDropDownList0']/div/div/div[2]/div/div";
     
     public String REJECT_REASON = "//div[@id='listitem3innerListBoxselectedReason']/span";
     
     public String DROPDOWN_BLANK_VAL_CHKBOX=  "//div[@id='listitem2innerListBoxappropriate_10-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String DROPDOWN_BLANK_REVIEWDECISION_VAL = "//div[@id='listitem2innerListBoxappropriate_10-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String SELECTED_REASON_DROPDOWN_CONTENT=  "//*[@id='listBoxContentinnerListBoxselectedReason']";
     
     public String SELECTED_REASON_DROPDOWN_VALS=  "//div[@id='listBoxContentinnerListBoxselectedReason']/div/div";
     
     public String SELECTED_REASON_DROPDOWN_DRPDWNVALS="//div[@id='listBoxContentinnerListBoxselectedReason']/div/div/span";
     
     public String SELECTED_REASON_SCROLLDOWN_BUTTON="//div[@id='ngxScrollBtnDownverticalScrollBarinnerListBoxselectedReason']//div[@class='ngx-reset ngx-icon-arrow-down']";
     
     public String REVIEWDECISION_REJECT_STATUS=  "//div[contains(text(),'Reject')]"; 
     
     public String RVIEWDCISN_ACCEPT_CHKBOX=  "//*[@id='listitem0innerListBoxreview-decision-drop-down']";
     
     public String RVIEWDCISN_REJECT_CHKBOX= "//*[@id='listitem1innerListBoxreview-decision-drop-down']";
     
     //public String NO_BUTTON_XPATH = "/html/body/div[7]/div/div/div/div[3]/button[2]";    
     
     public String NO_BUTTON_XPATH = "/html/body/div[8]/div/div/div/div[3]/button[2]";
     
   //  public String YES_BUTTON_XPATH = "/html/body/div[7]/div/div/div/div[3]/button[1]";
     
     public String YES_BUTTON_XPATH = "/html/body/div[8]/div/div/div/div[3]/button[1]";
     
     public String CHKBOXPATH = "//div[@class ='ui-grid-canvas']/div/div[@role ='row']/div[@class ='";
     
     public String CPTHCPCSCODEGROUP_DROPDOWN_VAL= "//div[@id='listitem0innerListBoxhcpccode-group-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String CPTHCPCSCODEGROUP_DROPDOWN_VAL2=	"//div[@id='listitem0innerListBoxhcpccode-group-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String ICD10GROUP_DRPDWN_CHKBOX = "//div[@id='listitem0innerListBoxicd10-group-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String ICD10GROUP_DRPDWN_VAL = "//div[@id='listitem0innerListBoxicd10-group-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_CHKBOX= "//div[@id='listitem0innerListBoxappropriate_10-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_VAL=   "//div[@id='listitem0innerListBoxappropriate_10-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_REJECT_CHKBOX= "//div[@id='listitem1innerListBoxappropriate_10-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_REJECT_VAL= "//div[@id='listitem1innerListBoxappropriate_10-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_BLANK_CHKBOX= "//div[@id='listitem2innerListBoxappropriate_10-drop-down']//div[@class='ngx-checkbox-default ngx-fill-state-normal ngx-rc-all']";
     
     public String REVIEWDECISION_DRPDWN_BLANK_VAL= "//div[@id='listitem2innerListBoxappropriate_10-drop-down']/span[@class='ngx-listitem-state-normal ngx-item ngx-rc-all']";
     
     public String PREVIOUSTASKS_EXISTS_MESSAGE ="/html/body/div[6]/div/div/div/div[2]";
     
     public String btn_START_REVIEW= "//button[@id='startReview']";
     
     public String btn_OK="//button[contains(text(),'OK')]";
     
     public String tbl_CPT_HCPS="//div[@role='gridcell'][1]";
     
     public String tbl_ICD_CODE= "//div[@role='gridcell'][3]";
     
     public String tbl_RD="//div[@role='gridcell'][5]";
     
     public String tbl_chbk="//div[@role='rowheader'][1]/div/div";
     
     public String DECISION_CHECKBOX="(//div[@role='rowheader'][1]/div/div)";
     
     public String tbl_remarks= "//div[@role='gridcell'][6]";
     
     public String TARGET_SCREEN_REMARKS_COL = "//div[@role='gridcell'][10]";
     
     public String TARGET_SCREEN_REMARKS_COL_SUPPORT_TAB = "//div[@role='gridcell'][8]";
     
     public String TARGET_SCREEN_RSNFORUPDTNG_DECISION_COL = "//div[@role='gridcell'][11]";
     
     public String TARGET_SCREEN_RSNFORUPDTNG_DECISION_COL_SUPPORT_TAB = "//div[@role='gridcell'][9]";
     
     public String TARGET_SCREEN_REVIEWDECISION_COL = "//div[@role='gridcell'][7]";
     
     public String RAREVIEWWORKQUEUE_SCREEN_REMARKS_COL = "//div[@role='gridcell'][6]";
         
     public String RAREVIEWWORKQUEUE_SCREEN_REVIEWDECISION_COL = "//div[@role='gridcell'][5]";
     
     public String  DATEBANDING_MESSAGE_POPUP = "/html/body/div[9]/div/div/div/div[2]";

     public String  DATEBANDING_MESSAGE_OKBTN =	 "/html/body/div[9]/div/div/div/div[3]/button";
     
     public String TARGET_TABLE_SCREEN_ICD_CODE= "//div[@role='gridcell'][4]";
     
     public String CATEGORYDROPDOWN_ADMINVIEW = "//*[@id='dropdownlistContentcategory-drop-down']";
     
     public String SUPPORTVALUE_CATEGORY=  "//*[@id='listitem0innerListBoxcategory-drop-down']";
     
     public String DOESNOTSUPPORTVALUE_CATEGORY=  "//*[@id='listitem1innerListBoxcategory-drop-down']"; 
     
     public String TARGETDATA_TAB = "//a[contains(text(),'Target Data')]";
     
     
     public String DECISIONDROPDOWN_ADMINVIEW = "//div[@id='dropdownlistContentappropriate_10-drop-down']";
     
     public String ACCEPTVALUE_DECISION=  "//div[@id='listitem0innerListBoxappropriate_10-drop-down']";
     
     public String REJECTVALUE_DECISION=  "//div[@id='listitem1innerListBoxappropriate_10-drop-down']";
     
     public String ADMIN_TAB = "//a[contains(text(),'Admin')]";      
     
     public String CPTGROUP_DROPDOWN ="//div[@id='dropdownlistContentngxDropDownList4']";     
     
     public String ICDGROUP_DROPDOWN = "//div[@id='dropdownlistContentngxDropDownList5']";
        
     public String CPTGROUP_DROPDOWNVALUES = "//div[@id='listBoxContentinnerListBoxngxDropDownList4']/div/div/div[1]"; 
     
     public String ICDGROUP_DROPDOWNVALUES = "//div[@id='listBoxContentinnerListBoxngxDropDownList5']/div/div/div[1]"; 
          
     public String sPageLoading = "//div[@id='spinner' and @class='ng-hide']";
     
     public String AssigneeDrpDownSearchBox = "//div[@id='filterinnerListBoxngxDropDownList2']/input";
     
     public String AssigneeNameTag = "//span[contains(text(),'sValue')]";	
     
     
}

