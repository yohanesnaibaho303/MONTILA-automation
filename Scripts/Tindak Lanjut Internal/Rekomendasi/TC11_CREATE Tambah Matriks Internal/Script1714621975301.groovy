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

WebUI.callTestCase(findTestCase('Tindak Lanjut Internal/Rekomendasi/TC10_Entri Rekomendasi by ID'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/a_Kepwil II_btn btn-sm btn-warning'))

WebUI.switchToWindowTitle('Lihat Matriks TL Internal')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/button_Tambah matriks internal'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/button_Ok'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/input_Nomor Permasalahan_TblPermasalahanIdP_cbedc7'), 
    '123')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih fungsi yang diaudit'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_Perencanaan Strategis'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/input_Kata Kunci_TblPermasalahanKataKunci'), 
    '456')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih jenis temuan'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_Pelayanan Kesehatan'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih Sub Temuan'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_Primer'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/textarea_Judul Permasalahan_TblPermasalahan_e2f809'), 
    judul1)

not_run: WebUI.comment('test source')

not_run: WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/a_Source'))

not_run: WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/textarea_Remove Format_cke_source cke_reset_28de6e'), 
    '<p style="">&nbsp;</p>\nlorem ipsum adalah sebuah kata default digunakan banyakdeveloper ataupun orang ingin mengisi sebuah form atau display komponen untuk sementara sebelum kata kata sebenarnya ditampilkan, tujuannya hanya untuk testing saja.\n<div id="katalon" style="top: 285px;">\n<div id="katalon-rec_elementInfoDiv" style="display: block;">/html[1]</div>\n</div>\n')

not_run: WebUI.comment('test source')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/p'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/p'), 'lorem Ipsum is simply dummy text of the printing and typesetting industry.')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih PIC Rekomendasi'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_Ambon'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/textarea_Keterangan Tanggapan Awal Auditi_T_c9f157'), 
    'lorem ipsum lorem ipsum lorem ipsum lorem ipsum')

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/input_Nomor Rekomendasi_TblInputGridRekomen_ef3284'), 
    '321')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/input_Batas Waktu Tindak Lanjut_TblInputGri_f6d325'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/td_25'))

WebUI.setText(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/textarea_Rekomendasi_TblInputGridRekomendas_0c8038'), 
    'lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum')

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih PIC Rekomendasi_1'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_Ambon_1'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/span_Pilih PIC Rekomendasi_1_2'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/li_MONEV'))

WebUI.click(findTestObject('Object Repository/Rekomendasi/Entri Rekomendasi/Tambah Matriks Intenal/button_Simpan'))

WebUI.acceptAlert()

