import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('Application/DevOps/GetDevOpslog'))

WS.verifyResponseStatusCode(response, 200)




WS.verifyElementPropertyValue(response, '[0].Active', null)
WS.verifyElementPropertyValue(response, '[0].CompanyId', null)
WS.verifyElementPropertyValue(response, '[0].projectId', "ac1351c1-2c28-491c-abb6-e1e02cb53bfb")
WS.verifyElementPropertyValue(response, '[0].IdDevOps', null)
WS.verifyElementPropertyValue(response, '[0].stage', "Staging")
WS.verifyElementPropertyValue(response, '[0].Action', null)
WS.verifyElementPropertyValue(response, '[0].StartTime', null)
WS.verifyElementPropertyValue(response, '[0].EndTime', null)
