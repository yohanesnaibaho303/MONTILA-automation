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

WebUI.callTestCase(findTestCase('Navigation/to TLI - Rekomendasi Pengembalian Faskes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Pengembalian Faskes Internal/button_Tampillkan Filter'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Pengembalian Faskes Internal/input_Surat Tugas_FormCariMatriksTahun'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Pengembalian Faskes Internal/span_2023'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Pengembalian Faskes Internal/button_Cari'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Pengembalian Faskes Internal/iconActionButtonDetail'))

WebUI.switchToWindowTitle('Detail Matrik Tindak Lanjut Internal')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/a_Rekomendasi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/a_Pengembalian Faskes'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/button_Pengembalian Kerugian (Data Awal LHA_6e1c7b'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/i_Pengembalian Kerugian (Sisa Pengembalian)_ab5d56'))

WebUI.scrollToElement(findTestObject('Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/Header_riwayat progres tindak lanjut'), 
    0)

WebUI.delay(3)

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/i_Lampiran Pengembalian Kerugian (Data Awal_c673c0'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Pengembalian Faskes/Page_Detail Matrik Tindak Lanjut Internal/span_datalapse_bima.xlsx_glyphicon glyphico_8fca99'))

WebUI.delay(3)

WebUI.comment('Bug, Fungsi download file tidak berjalan, tetapi system menuju ke homepage')

WebUI.closeBrowser()

