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

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Input Nominal Faskes'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Ok'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/icon button pengembalian faskes pertama'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/input_Keterangan lampiran_TblPermasalahanKe_6f118f'), 
    'tiga tiga')

WebUI.uploadFile(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/Upload_input pengembalian faskes'), 
    'C:\\Users\\yohan\\Katalon Studio\\dummy\\dummy-data-faskes.xlsx')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Ok (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/icon button pengembalian faskes kedua'))

WebUI.scrollToElement(findTestObject('Cari Surat Tugas/Upload ST/button_Upload'), 0)

WebUI.uploadFile(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/input_Browse_TblPermasalahanfile_migrasi'), 
    'C:\\Users\\yohan\\Katalon Studio\\dummy\\migrasi-data-faskes.xlsx')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Upload'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Input Nominal Faskses/button_Ok'))

