import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//// Define the location of your project manually
//String userDir = '/Users/nasmahna/git/katalon-taskmobile-ami' // Replace with your actual project path
//
//Mobile.comment('current user directory: ' + userDir)
//
//// Use it as a value/variable to map the installation file path
//String filePath = userDir + '/APK/APIDemos-2023.apk'
//
//Mobile.comment('file path install: ' + filePath)
//// Launch the application
//Mobile.startApplication("/Users/nasmahna/git/katalon-taskmobile-ami/APK/APIDemos-2023.apk", true)
// Define the location of your project manually
// Launch the application
Mobile.startApplication("/Users/nasmahna/Documents/Katalon-GITS/katalon-mobile-p2024/APK/APIDemos.apk", true)

//---------START TEST CASE----------
Mobile.tap(findTestObject('ObjSpy/App-Alarm/bttn_app'), 0)

Mobile.tap(findTestObject('ObjSpy/App-Alarm/bttn_alarm'), 0)

Mobile.tap(findTestObject('ObjSpy/App-Alarm/bttn_alarm-services'), 0)

Mobile.tap(findTestObject('ObjSpy/App-Alarm/bttn_start-alarm'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('ObjSpy/App-Alarm/bttn_stop-alarm'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

