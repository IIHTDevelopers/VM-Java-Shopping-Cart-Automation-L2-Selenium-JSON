package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartAutomationPages extends StartupPage
{
	By shopOption = By.xpath(""); 
	By cartMenuButton = By.xpath(""); 
	By automationPracticeSiteLogo = By.xpath(""); 
	By newArrivalButton = By.xpath(""); 
	By seleniumRubyProduct = By.xpath(""); 
	By thinkingInHtmlProduct = By.xpath(""); 
	By masteringJavaScriptProduct = By.xpath(""); 
	By addToBasketButton = By.xpath(""); 
	By productAddedMessage = By.xpath(""); 
	By viewBasketButton = By.xpath("");  
	By seleniumRubyInsideTheBasketPage = By.xpath(""); 
	By couponcodeField = By.xpath(""); 
	By applyCouponcodeButton = By.xpath("");  
	By priceReadOnyField = By.xpath(""); 
	By quantityField= By.xpath(""); 
	By totalField= By.xpath(""); 
	By removeIcon= By.xpath(""); 
	By removeMessage= By.xpath(""); 
	By proceedToCheckoutButton= By.xpath(""); 
	By priceReadOnlyField = By.xpath(""); 
	By increasedProductInCart= By.xpath(""); 
	By myAccountIcon= By.xpath(""); 
	By usernameTextField= By.id(""); 
	By passwordTextField= By.id(""); 
	By loginButton= By.xpath(""); 
	By emailAddressTextField= By.id(""); 
	By registerButton= By.xpath(""); 
	By passwordTextFieldInRegister=By.id("");	
	By testCasesIcon=By.xpath(""); 
	By atSiteIcon=By.xpath(""); 
	By seleniumText=By.xpath(""); 
	By appiumText=By.xpath(""); 
	By refineByField=By.xpath(""); 
	By homeShopMenu=By.xpath(""); 
	By filterByPriceSlider=By.xpath(""); 
	



	public ShoppingCartAutomationPages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() 
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		return null;
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() 
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : return true if shopOption is present, else false
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		return false;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() 
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : return String if page shop page title is matching
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		return null;

	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() 
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		return null;

	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() 
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : return true if newArrival Button is present, else false
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		return false;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() 
	 * @param : null
	 * @description : Check of â€œArrivalsâ€ section has exactly 3 products enlisted
	 * @return : return true if all three products are  present, else false
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		return false;
	}
	
	/**@Test7
	 * about this method clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() 
	 * @param : null
	 * @description : Check of â€œArrivalsâ€ section has exactly 3 products enlisted
	 * @return : return String if seleniumRuby PageTitle is matching
	 * @author : Yaksha
	 */
	public String clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() throws Exception {
		return null;

	}
	
	/**@Test8
	 * about this method verifyAddBasketButtonIsPresentAndClickOnAddBasket() 
	 * @param : null
	 * @description : verify add basket button is present then click on the Add to basket button
	 * @return : return true if viewBasketButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
		return false;
	}
	/**@Test9
	 * about this method viewBasketButtonIsPresentAndClickOnIt() 
	 * @param : null
	 * @description : verify view basket button is present then click on the view basket button
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean viewBasketButtonIsPresentAndClickOnIt() throws Exception {
		return false;
	}
	
	/**@Test10
	 * about this method userIsNavigateToTheBasketPage() 
	 * @param : null
	 * @description : verify the title of the Basket Page
	 * @return : return String if  PageTitle is matching
	 * @author : Yaksha
	 */
	public String userIsNavigateToTheBasketPage() throws Exception {
		return null;

	}

	
	/* @Test11
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Click On View Basket
	 * @return : return true if proceedToCheckoutButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		return false;
	}
	
	/**@Test12
	 * about this method seleniumRubyProductIsPresent() 
	 * @param : null
	 * @description : verify Selenium ruby product is present or not
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean seleniumrubyProductIsPresent() throws Exception {
		return false;
	}
	
	
	/**@Test13
	 * about this method verifyAllFieldsarePresent() 
	 * @param : null
	 * @description : verify seleniumRubyInsideTheBasketPage,couponcodeField,applyCouponcodeButton,priceReadOnlyField,quantityField,totalFields are present or not
	 * @return : return true if totalField  is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean verifyAllFieldsarePresent() throws Exception {
		return false;
	}
	
	

	/**@Test14
	 * about this method removeIconIsPresentandRemoveTheProductAndValidateTheMessage() 
	 * @param : null
	 * @description : verify removeIcon is present or not then click on remove icon to remove the product and validate the remove message
	 * @return : return string if removeMessage is  matching
	 * @author : Yaksha
	 */
	public String removeIconIsPresentandRemoveTheProductAndValidateTheMessage() throws Exception {
		return null;
	}
	
	/*@Test15
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Verify The Item Is Increased
	 * @return : return string if product is increase to one in cart
	 * @author : Yaksha
	 */
	public String goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenVerifyTheItemIsIncreased() throws Exception {
		return null;
	}
	

	/**@Test16
	 * about this method clickOnMyAccountAndVerifyAllTheFieldsArePresent() 
	 * @param : null
	 * @description : click On My Account And Verify All The Fields Are Present
	 * @return : return true if registerButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickOnMyAccountAndVerifyAllTheFieldsArePresent() throws Exception {
		return false;
	}
	
	/**@Test17
	 * about this method clickonTestCasesItsShouldNavigateToTheTestCasesPages() 
	 * @param : null
	 * @description : click on testcases verify it is navigating to the Testcase page.
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String clickonTestCasesItsShouldNavigateToTheTestCasesPages() throws Exception {
		return null;
	}
	
	
	/**@Test18
	 * about this method verifyTheurlOfTheTestCasesPages() 
	 * @param : null
	 * @description : verify URL of the testcase page
	 * @return : return string if URL is matching
	 * @author : Yaksha
	 */
	public String verifyTheurlOfTheTestCasesPages() throws Exception {
		return null;
	}
	
	
	/**@Test19
	 * about this method clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent() 
	 * @param : null
	 * @description : click On At Site And Verify Selenium And Appium Fields Are Present
	 * @return : return true if seleniumText is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent() throws Exception {
		return false;
	}
	
	/**@Test20
	 * about this method clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() 
	 * @param : null
	 * @description : navigate to the previous page and click on shop and verify refineBy field,home shop menu,filterByPriceSlider are present
	 * @return : return true if filterByPriceSlider is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() throws Exception {
		return false;
	}
	

	
}
