package testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.ShoppingCartAutomationPages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class ShoppingCartAutomationTestCases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	ShoppingCartAutomationPages practiceAutomationInstance;
	LocatorsFactory LocatorsFactoryInstance = new LocatorsFactory(driver);

	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}
		@Test(priority = 1, groups = {"sanity"}, description="Verify navigate to the shopping cart home page")
		public void verifyNavigateTotTheShoppingCartpage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "homepage");
			Assert.assertEquals(practiceAutomationInstance.verifyNavigateTotTheShoppingCartpage(), expectedData.get("homepageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}
		@Test(priority = 2, groups = {"sanity"}, description="Check Shop Menu Option is present or not")
		public void checkShopMenuIsPresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyShopOptionIsPresent(), "shop option menu is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}	
		@Test(priority = 3, groups = {"sanity"}, description="Click on “Shop” Menu Option and validate successfully navigate to the shop page or not")
		public void clickOnShopMenuAndValidateTheTitle() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Shop_page");
			Assert.assertEquals(practiceAutomationInstance.clickOnShopMenuandValidateTheTitle(), expectedData.get("Shop_page_title"));
			Assert.assertTrue(LocatorsFactoryInstance.androidProductCategoryIsPresent(driver).isDisplayed(), "Android category menu is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 4, groups = {"sanity"}, description="Click on the Automation practice site logo Verify navigate to the home page by clicking on the Logo")
		public void clickOnLogoAndVerifyItIsNavigateToTheHomePage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "homepage");
			Assert.assertEquals(practiceAutomationInstance.clickOnLogoandVerifyItIsNavigateToTheHomePage(), expectedData.get("homepageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}	
		@Test(priority = 5, groups = {"sanity"}, description="Check if Home page has a section of new arrivals")
		public void  checkIfHomePageHasASectionOfNewArrivals() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.checkIfHomePageHasSectionOfNewArrivals(),"new arrival button is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.newArrivalButtonIsPresent(driver).isDisplayed(), "new arrival button is not present in the current page, Please check manually");
	}	
		@Test(priority = 6, groups = {"sanity"}, description="Check of “Arrivals” section has exactly 3 products enlisted")
		public void  checkArrivalsSectionHasExactly3ProductsEnlisted() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.checkOfArrivalsSectionhasExactly3ProductsEnlisted(),"3 products are not present in the new arrival section, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyProductIsPresent(driver).isDisplayed(), "Selenium ruby button is not present in the current page, Please check manually");
	}	
		@Test(priority = 7, groups = {"sanity"}, description="Click on Selenium Ruby Product and validate the title of the page")
		public void  clickOnSeleniumRubyProductAndValidateTheTitleOfThisPage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Selenium_Ruby");
			Assert.assertEquals(practiceAutomationInstance.clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage(), expectedData.get("Selenium_Ruby_title"));
			Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyTitleIsPresent(driver).isDisplayed(), "Selenium ruby title is not present in the current page, Please check manually");
	}	
		@Test(priority = 8, groups = {"sanity"}, description="Check product details page has an option ADD TO BASKET and Click on ADD TO BASKET")
		public void  verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyAddBasketButtonIsPresentAndClickOnAddBasket(),"Add basket button is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.viewBasketButtonIsPresent(driver).isDisplayed(), "View basket button is not present in the current page, Please check manually");
	}	
		@Test(priority = 9, groups = {"sanity"}, description="Verify that view basket button is present after click on add to basket and click on View basket")
		public void  viewBasketButtonIsPresentAndClickOnIt() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.viewBasketButtonIsPresentAndClickOnIt(),"view basket button is not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon button is not present in the current page, Please check manually");
	}	
		@Test(priority = 10, groups = {"sanity"}, description="Verify that user is navigate to the  Cart or Basket page")
		public void  userIsNavigateToTheBasketPage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "basket_page");
			Assert.assertEquals(practiceAutomationInstance.userIsNavigateToTheBasketPage(), expectedData.get("basket_page_title"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
	@Test(priority = 11,groups = {"sanity"}, description="This test is for make a flow")
	public void  goHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
		Assert.assertTrue(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket(),"home icon is not present, check manually");
		Assert.assertTrue(LocatorsFactoryInstance.applyCouponcodeButtonIsPresent(driver).isDisplayed(), "ApplyCoupon code is not present in the current page, Please check manually");
}
	
	@Test(priority = 12, groups = {"sanity"}, description="Verify after clicking on View basket the Selenium Ruby  product is present or not.")
	public void  seleniumRubyProductIsPresent() throws Exception {
		practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
		Assert.assertTrue(practiceAutomationInstance.seleniumrubyProductIsPresent(),"Selenium Ruby product is not there, check manually");
		Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyInsideTheBasketPageIsPresent(driver).isDisplayed(), "seleniumRuby product is not present in the current page, Please check manually");
}	
	
		@Test(priority = 13, groups = {"sanity"}, description="Verify Coupon code field and Apply Coupon button is present and Check if we have price defined ,quantity defined,total defined fields are present.")
		public void  verifyAllFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyAllFieldsarePresent(),"Selenium Ruby product is not there, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.proceedToCheckoutButtonIsPresent(driver).isDisplayed(), "proceed To Checkout Button is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 14, groups = {"sanity"}, description="Validate if we have an option to remove an added product or not and remove the product.")
		public void  removeIconIsPresentAndRemoveTheProduct() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "RemoveMessage");
			Assert.assertEquals(practiceAutomationInstance.removeIconIsPresentandRemoveTheProductAndValidateTheMessage(),expectedData.get("Removemessagedetails"));
			Assert.assertTrue(LocatorsFactoryInstance.removeMessageIsPresent(driver).isDisplayed(), "Remove message is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 15, groups = {"sanity"}, description="Go to the Home Icon and click on selenium ruby then click on add to basket and verify the item no is increased to +1 ")
		public void  gotoTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "AddToCart");
			Assert.assertEquals(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenVerifyTheItemIsIncreased(),expectedData.get("IncreaseItem"));
			Assert.assertTrue(LocatorsFactoryInstance.increasedProductInCartIsPresent(driver).isDisplayed(), "item number is not increase in cart, Please check manually");
	}
		
		@Test(priority = 16, groups = {"sanity"}, description="click on My Account and verify all the fields are present or not")
		public void  clickOnMyAccountAndVerifyAllTheFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickOnMyAccountAndVerifyAllTheFieldsArePresent(),"User not able to add product, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.loginButtonIsPresent(driver).isDisplayed(), "LogIn Button is not present in the current page, Please check manually");
	}
		@Test(priority = 17, groups = {"sanity"}, description="click on Test Cases its should navigate to the Test Cases pages and verify the url of the Test Cases pages ")
		public void  clickonTestCasesItsShouldNavigateToTheTestCasesPagesVerifyTheUrlOfTheTestCasesPages() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "TestcasePage");
			Assert.assertEquals(practiceAutomationInstance.clickonTestCasesItsShouldNavigateToTheTestCasesPages(),expectedData.get("TestCasePageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.testCasesIconIsPresent(driver).isDisplayed(), "TestCase icon is not present in the current page, Please check manually");
	}
		@Test(priority = 18, groups = {"sanity"}, description="verify the url of the Test Cases pages ")
		public void  clickOnTestCasesVerifyTheUrlOfTheTestCasesPages() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "TestcasePageUrl");
			Assert.assertEquals(practiceAutomationInstance.verifyTheurlOfTheTestCasesPages(),expectedData.get("UrlTestCasePageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}
		@Test(priority = 19, groups = {"sanity"}, description="click on AT SITE and verify the Selenium and appium fields are present or not ")
		public void  clickOnATSITEAndVerifyTheSeleniumAndAppiumFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent(),"");
			Assert.assertTrue(LocatorsFactoryInstance.toolsIconIsPresent(driver).isDisplayed(), "tools icon is not present in the current page, Please check manually");
	}
		@Test(priority = 20, groups = {"sanity"}, description="click on Shop and verify the Refine By , Home/shop and filter by price  fields are present or not")
		public void  clickOnShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent(),"These fields are not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.filterByPriceSliderIsPresent(driver).isDisplayed(), "filterBy Price Slider is not present in the current page, Please check manually");
	}	

						
		@AfterClass(alwaysRun = true)
		public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
		}
				
		@AfterMethod
		public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
		}
}