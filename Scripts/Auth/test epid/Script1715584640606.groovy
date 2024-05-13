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

WebUI.openBrowser('https://qc167.bpjs-kesehatan.go.id/eppid/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/button_Permohonan Informasi'))

WebUI.setText(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/input_Login_form-control no-border ng-prist_d3ebd2'), 
    '0001261000012')

WebUI.setEncryptedText(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/input_Login_form-control no-border ng-prist_d3ebd2_1'), 
    'vp8R5W7gCamLdpFHxeRWqw==')

WebUI.setText(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/input_Login_col-sm-6 form-control ng-pristi_b90dab'), 
    'asdas')

WebUI.click(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/test doang loh/Page_ePPID BPJS Kesehatan/center_Selamat Datang di Layanan ePPID BPJS_98198e'), 
    0)

