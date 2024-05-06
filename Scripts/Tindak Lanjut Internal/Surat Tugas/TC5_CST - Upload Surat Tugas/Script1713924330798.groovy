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

WebUI.callTestCase(findTestCase('Navigation/to TLI - Surat Tugas - Cari Surat Tugas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Cari Surat Tugas/Upload ST/Upload ST by ID Icon'))

WebUI.setText(findTestObject('Cari Surat Tugas/Upload ST/textarea_Lokasi Penyimpanan Berkas_TblDokum_3dcce1'), 'Penyimpanan Berkas di Gudang Arsip Serbaguna')

WebUI.setText(findTestObject('Cari Surat Tugas/Upload ST/textarea_Keterangan Singkat_TblDokumentasiA_8df5b0'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Et leo duis ut diam quam. Sagittis purus sit amet volutpat consequat mauris nunc. Malesuada pellentesque elit eget gravida cum sociis natoque penatibus et. Ut diam quam nulla porttitor massa id. Mollis aliquam ut porttitor leo a diam. Hendrerit gravida rutrum quisque non tellus orci. Dignissim cras tincidunt lobortis feugiat vivamus. Sit amet commodo nulla facilisi nullam. Aenean et tortor at risus viverra adipiscing. Vitae ultricies leo integer malesuada nunc vel risus. Urna nunc id cursus metus aliquam eleifend mi. Eget nunc lobortis mattis aliquam faucibus purus in massa tempor. Rhoncus mattis rhoncus urna neque. Donec ultrices tincidunt arcu non sodales neque sodales ut etiam. Risus viverra adipiscing at in tellus integer.')

WebUI.click(findTestObject('Object Repository/Cari Surat Tugas/Upload ST/span_Pilih Jenis Dokumen'))

WebUI.click(findTestObject('Cari Surat Tugas/Upload ST/li_Surat Tugas'))

WebUI.uploadFile(findTestObject('Cari Surat Tugas/Upload ST/input_Browse_TblDokumentasiAuditfile'), 'C:\\Users\\yohan\\Downloads\\laporan.pdf')

WebUI.click(findTestObject('Cari Surat Tugas/Upload ST/button_Upload'))

WebUI.verifyTextNotPresent('hanya file pdf yang bisa diupload', false)

WebUI.comment('Bug masi butuh diperbaiki programmer')

