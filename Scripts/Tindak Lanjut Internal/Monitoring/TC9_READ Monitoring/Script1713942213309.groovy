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

WebUI.callTestCase(findTestCase('Auth/TC1_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Navigation/to TLI - Monitoring'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/button_Riwayat pengiriman tindak lanjut Uni_2c9378'))

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Rincian'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/span_DP_glyphicon glyphicon-eye-open'))

WebUI.switchToWindowTitle('Detail Matrik Tindak Lanjut Internal')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/b_Rekomendasi'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/TLI - Monitoring/a_Lihat SLA'), 3)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Lihat SLA'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Tutup'))

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Lihat'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Baca file_btn btn-sm btn-primary'))

WebUI.switchToWindowTitle('Baca Dokumen')

WebUI.verifyElementPresent(findTestObject('Object Repository/TLI - Monitoring/div_Zoom In_viewerContainer'), 0)

WebUI.switchToWindowTitle('Detail Matrik Tindak Lanjut Internal')

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Tutup'))

WebUI.closeWindowTitle('Baca Dokumen')

WebUI.closeWindowTitle('Detail Matrik Tindak Lanjut Internal')

WebUI.switchToWindowTitle('Setujui/Monitoring Lanjut Internal')

WebUI.click(findTestObject('Object Repository/TLI - Monitoring/a_Tutup'))

WebUI.delay(3)

WebUI.closeBrowser()

