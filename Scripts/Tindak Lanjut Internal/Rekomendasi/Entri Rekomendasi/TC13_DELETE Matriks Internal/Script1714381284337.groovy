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

WebUI.callTestCase(findTestCase('Auth/TC1_Login'), [('user1') : '08176', ('pwd1') : 'TWJ6FF3V6ZnhxRAbxL11pQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Navigation/to TLI - Rekomendasi - Entri Rekomendasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Tindak Lanjut Internal/Rekomendasi/Entri Rekomendasi/TC10_Entri Rekomendasi by ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('Lihat Matriks TL Internal')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Delete Rekomendasi/a_Hapus'))

WebUI.verifyTextPresent('Konfirmasi Penghapusan', false)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Delete Rekomendasi/a_Hapus_1'))

WebUI.closeBrowser()

