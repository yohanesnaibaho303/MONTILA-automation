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

WebUI.callTestCase(findTestCase('Navigation/to TLI - Surat Tugas - Input Surat Tugas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Input Surat Tugas/input_No Surat Tugas_TblSuratTugasNoSuratTugas'), '123/I.I/456')

WebUI.setText(findTestObject('Object Repository/Input Surat Tugas/input_Tgl Surat Tugas_TblSuratTugasTglSuratTugas'), '04/22/2024')

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/input_Periode Awal Sampling_TblSuratTugasPe_ed0408'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Apr'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/input_Periode Akhir Sampling_TblSuratTugasP_0de5e5'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_May'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/input_Tahun Pemeriksaan_TblSuratTugasTahunP_5328c4'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_2024'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Pilih Jenis Penugasan'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Pemeriksaan Rutin'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Pilih Obrik Pemeriksaan'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Kepwil I'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Nama Penanggung Jawab'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Andi Dharmawan Pribadi - (NPP 02289) -                            (Jabatan Deputi Direksi Bidang WASIN)'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Nama Pengendali Mutu'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Yusuf Sundut Harahap - (NPP 07505) -                            (Jabatan Asisten Deputi PPP)'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Nama Pengendali Teknis'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Aditya Cahya Nugraha - (NPP 07943) -                            (Jabatan Asisten Deputi PPP)'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Nama Ketua Tim'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Andi Dharmawan Pribadi - (NPP 02289) -                            (Jabatan Deputi Direksi Bidang WASIN)'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Jabatan Peran'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Ketua Sub Tim'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Nama Tim Audit'))

WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_KC Denpasar - (NPP 00000) -                            (Jabatan Staf Bidang PEP)'))

WebUI.comment('added new row')

not_run: WebUI.click(findTestObject('Object Repository/Input Surat Tugas/button_Nama dan Jabatan Peran_add-anggota btn btn-success btn-xs'))

not_run: WebUI.click(findTestObject('Object Repository/Input Surat Tugas/span_Jabatan Peran'))

not_run: WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Ketua Sub Tim'))

not_run: WebUI.click(findTestObject('Object Repository/Input Surat Tugas/li_Indra Septiawan Kusumawardhana - (NPP 08104) -                            (Jabatan Staf Bidang PEP)'))

WebUI.click(findTestObject('Input Surat Tugas/button_Simpan'))

WebUI.acceptAlert()

WebUI.closeBrowser()

