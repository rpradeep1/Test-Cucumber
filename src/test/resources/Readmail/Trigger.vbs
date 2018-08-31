
sSubject = WScript.Arguments(0)
ExcelPath = WScript.Arguments(1)
TextFilePath= WScript.Arguments(2)

Trigger = fnTrigger(sSubject,ExcelPath)

Function fnTrigger(sSubject,ExcelPath)
	Set xlApp = CreateObject("Excel.Application")
	xlApp.DisplayAlerts = False
	xlApp.visible = False
	Set xlBook = xlApp.Workbooks.Open(ExcelPath)
	sVal = xlApp.Run ("GetMailBodyforUnreadMailforGivenSubject",sSubject)
	'msgbox sVal
	AddBodytoFile(sVal)
	xlApp.Quit
	Set xlBook = Nothing
	Set xlApp = Nothing
End Function

Function AddBodytoFile(sMailBody)

	Set FSO = CreateObject("Scripting.FileSystemObject")
	Set fs = FSO.OpenTextFile(TextFilePath,2,True)
	fs.Writeline (sMailBody)
	fs.close
End Function

