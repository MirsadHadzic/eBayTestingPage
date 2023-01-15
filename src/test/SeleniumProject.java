package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class SeleniumProject {

	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anes\\Documents\\ChromeWebDriver\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.ebay.com/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// 1st test, open web site, test url

	
	  @Test 
	  void openWebsitetest() throws InterruptedException {
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000); String currentUrl = webDriver.getCurrentUrl();
	  System.out.println("Current URL: " + currentUrl);
	  assertEquals("https://www.ebay.com/", currentUrl); webDriver.close(); }
	 

	// 2nd test, create a business account

	
	  /*@Test 
	  void createTest() throws InterruptedException {
	  
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  Thread.sleep(10000);
	  
	  // Click on the Create Account Button 
	  webDriver.findElement(By.xpath(
	  "/html/body/header/div/ul[1]/li[1]/span/span/a")).click();
	  Thread.sleep(2000);
	  
	  Thread.sleep(30000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div[1]/fieldset/span[2]/span[1]/span/input")).click
	  (); Thread.sleep(2000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div/div[4]/form/div[1]/span/span[1]/span/input")).
	  click(); Thread.sleep(2000);
	  
	  
	  webDriver.findElement(By.name("businessName")).sendKeys("Mirsad");
	  webDriver.findElement(By.name("businessEmail")).sendKeys(
	  "mirsad.hadzic.666666666@gmail.com");
	  webDriver.findElement(By.name("bizPassword")).sendKeys("ocu366m8");
	  Thread.sleep(2000); Thread.sleep(30000);
	  
	  Select country = new Select(webDriver.findElement(By.id("businessCountry")));
	  country.selectByVisibleText("Bosnia and Herzegovina"); Thread.sleep(2000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div/div[4]/form/span/span/input")).click();
	  
	  Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div/div[4]/form/div[6]/div/span/button")).click();
	  
	  Thread.sleep(5000);
	  
	  
	  }*/
	 

	// 3d test, create a personal account

	
	  /*@Test
	  
	  void createPersonalAccountTest() throws InterruptedException {
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  // Click on the Create Account Button 
	  webDriver.findElement(By.xpath(
	  "/html/body/header/div/ul[1]/li[1]/span/span/a")).click();
	  Thread.sleep(2000);
	 
	  Thread.sleep(30000);
	  webDriver.findElement(By.name("firstname")).sendKeys("Mirsad");
	  webDriver.findElement(By.name("lastname")).sendKeys("Hadzic");
	  webDriver.findElement(By.name("Email")).sendKeys("mirsad.hadzic2@gmail.com");
	  // ovaj thread je radi captche 
	  Thread.sleep(30000);
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div[2]/div/div/div[1]/div/form/div[4]/div[1]/div/span/span/input"
	  )).click(); Thread.sleep(20000);
	  webDriver.findElement(By.name("password")).sendKeys("ocu366m8");
	  Thread.sleep(2000); webDriver.findElement(By.xpath(
	  "/html/body/div[2]/div[3]/div[2]/div/div/div[1]/div/form/div[6]/div/span/button"
	  )).click(); Thread.sleep(6000);
	  
	  
	  }*/
	 

	// 4th test, click on the Help & Contact link/button

	
	  /*@Test 
	  void helpContactTest() throws InterruptedException{
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  // Find the "Help % Contact" button and click it 
	  WebElement contactButton =
	  webDriver.findElement(By.xpath("/html/body/header/div/ul[1]/li[3]/a"));
	  contactButton.click(); Thread.sleep(5000); // 5 seconds
	  
	  WebElement buyingButton = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[2]/div[1]/div[1]/div[4]/div/ul/li[1]/a/span"));
	  buyingButton.click(); Thread.sleep(2000); // 2 seconds
	  
	  WebElement buying2Button = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[2]/a/div[1]"));
	  buying2Button.click(); Thread.sleep(2000); // 2 seconds
	  
	  WebElement thumbsDown = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[2]/div[1]/div[3]/div/div/div[2]/div/div[4]/div/div/div[1]/div[1]/div/div[2]/div[1]"
	  )); thumbsDown.click(); Thread.sleep(2000); // 2 seconds
	  
	  WebElement notEnoughInfo = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[2]/div[1]/div[3]/div/div/div[2]/div/div[4]/div/div/div[1]/div[1]/div[2]/fieldset/div[1]/input"
	  )); notEnoughInfo.click(); Thread.sleep(2000); // 2 seconds
	  
	  WebElement goToSignInPage = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a"));
	  goToSignInPage.click(); Thread.sleep(2000); }
	 */

	// 5th test sign in

	
	  /*@Test
	  
	  void signInTest() throws InterruptedException { webDriver.get(baseUrl);
	  webDriver.manage().window().maximize(); Thread.sleep(1000);
	  
	  // Find the "Sign In" button and sign in
	  webDriver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).
	  click(); Thread.sleep(2000);
	  
	  Thread.sleep(30000);
	  
	  webDriver.findElement(By.id("userid")).click();
	  webDriver.findElement(By.id("userid")).sendKeys("wc"); Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000); //webDriver.findElement(null)
	  webDriver.navigate().refresh(); Thread.sleep(2000);
	  webDriver.findElement(By.id("userid")).click();
	  webDriver.findElement(By.id("userid")).sendKeys("mirsad.hadzic1@gmail.com");
	  Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[4]/main/div[1]/form[1]/div[5]/a")).click();
	  Thread.sleep(10000);
	  
	  WebElement signInInput =
	  webDriver.findElement(By.id("pass"));//.sendKeys("ocu366m8");
	  signInInput.sendKeys("ocu366m8"); Thread.sleep(2000); 
	  //assertEquals(pass, "ocu366m8");
	  
	  Thread.sleep(20000);
	  
	  webDriver.findElement(By.id("sgnBt")).click();
	  
	  String pageSource = webDriver.getPageSource(); if
	  (pageSource.contains("Oops, that's not a match.")) {
	  System.out.println("Password is incorrect"); } else {
	  System.out.println("Password is correct"); }
	  
	  // ovo su samo komentari, vazna su dva thread-a ispod
	  
	  //System.out.println(signInInput); 
	  Thread.sleep(20000);
	  
	  //webDriver.findElement(By.id("#sgnBt")).click();
	  
	  //webDriver.findElement(By.xpath(
	  //"/html/body/div[4]/main/div[1]/form[1]/div[5]/label[1]/span/input")).click();
	  Thread.sleep(2000);
	 
	  }*/
	 

	// 6th test, test title

	
	  /*@Test
	  
	  void testTitle() throws InterruptedException { webDriver.get(baseUrl);
	  webDriver.manage().window().maximize(); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).
	  click(); Thread.sleep(1000);
	  
	  String title = webDriver.getTitle(); //System.out.println("Title: " + title);
	  if (title.contains("Sign in or Register | eBay")) {
	  System.out.println("Title really is: " + title); }else {
	  System.out.println("Title is not this one."); }
	  
	  //assertEquals("Sign in or Register | eBay", title); 
	  Thread.sleep(2000);
	  
	  //Sign in or Register | eBay 
	  
	  }*/
	 

	// 7th test, search test

	
	  /*@Test
	  
	  void searchTest() throws InterruptedException { webDriver.get(baseUrl);
	  webDriver.manage().window().maximize(); Thread.sleep(1000);
	  
	  // Find search box element and click it 
	  WebElement searchField =
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"
	  ));
	  
	  searchField.sendKeys("xiaomi"); Thread.sleep(1000);
	  webDriver.findElement(By.cssSelector("#gh-btn")).click();
	  
	  Thread.sleep(1000);
	  
	  // Check if correct search results are displayed 
	  String pageSource =
	  webDriver.getPageSource(); if (pageSource.contains("xiaomi")) {
	  System.out.println("Search results are correct"); } else {
	  System.out.println("Search results are incorrect"); } }
	 */

	// 8th test, test the purchase option, testing the purchase option to see
	// if the "add to cart" and "go to checkout" options are working properly

	
	 /* @Test 
	  void testPurchase() throws InterruptedException {
	  webDriver.get(baseUrl); 
	  webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  // Find search box element and click it 
	  WebElement searchField =
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"
	  ));
	  
	  searchField.sendKeys("xiaomi"); Thread.sleep(1000);
	  webDriver.findElement(By.cssSelector("#gh-btn")).click(); Thread.sleep(1000);
	  
	  // get the original tab's handle 
	  String handle1 =
	  webDriver.getWindowHandle();
	  
	  // click on the first element in search results and open a new tab 
	  WebElement
	  firstItem = webDriver.findElement(By.xpath(
	  "/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a"));
	  firstItem.click(); Thread.sleep(8000);
	  
	  for (String handle: webDriver.getWindowHandles()) { if
	  (!handle.equals(handle1)) { webDriver.switchTo().window(handle); break; } }
	  
	  Thread.sleep(5000);
	  
	  // add to cart 
	  WebElement addToCart = webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a"
	  )); addToCart.click(); Thread.sleep(2000);
	 
	  // Go to cart and click checkout button 
	  WebElement checkoutButton =
	  webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div/div[4]/div/div[1]/button")); checkoutButton.click();
	  Thread.sleep(8000);
	  
	  // Continue as Guest 
	  WebElement purchaseButton =
	  webDriver.findElement(By.xpath(
	  "/html/body/div[7]/div/div[5]/div/div[2]/div[3]/button[2]"));
	  purchaseButton.click(); Thread.sleep(2000);
	  
	  // captcha 
	  Thread.sleep(20000);
	  
	  // select country 
	  Select country = new
	  Select(webDriver.findElement(By.id("country")));
	  country.selectByVisibleText("Bosnia and Herzegovina"); Thread.sleep(2000);
	  
	  // select quantity 
	  Select quantity = new Select(webDriver.findElement(By.id(
	  "qty-BId-ItemId=224821452784;Domain-ebay;LId-420002")));
	  quantity.selectByVisibleText("1"); Thread.sleep(5000);
	  
	  // first name 
	  // /html/body/div[3]/div/div[4]/div[3]/div/div[1]/section[2]/div[3]/div/div/div/div[2]/div[1]/form/section/div/div[2]/div[1]/div/div[1]/input 
	  WebElement
	  firstName = webDriver.findElement(By.cssSelector("#firstName"));
	  firstName.sendKeys("Mirsad"); //firstName.click(); 
	  Thread.sleep(2000);
	  
	  // last name 
	  WebElement lastName =
	  webDriver.findElement(By.cssSelector("#lastName"));
	  lastName.sendKeys("Hadzic"); Thread.sleep(1000);
	  
	  WebElement address = webDriver.findElement(By.cssSelector("#addressLine1"));
	  address.sendKeys("Fr. Revolucije br. 53"); Thread.sleep(1000);
	  
	  WebElement address2 = webDriver.findElement(By.cssSelector("#addressLine2"));
	  address2.sendKeys("Bakije Cikma br.11"); Thread.sleep(1000);
	  
	  WebElement city = webDriver.findElement(By.cssSelector("#city"));
	  city.sendKeys("Sarajevo"); Thread.sleep(1000);
	  
	  WebElement state = webDriver.findElement(By.cssSelector("#stateOrProvince"));
	  state.sendKeys("Kanton Sarajevo"); Thread.sleep(1000);
	  
	  WebElement zip = webDriver.findElement(By.cssSelector("#postalCode"));
	  zip.sendKeys("71000"); Thread.sleep(1000);
	  
	  WebElement email = webDriver.findElement(By.cssSelector("#email"));
	  email.sendKeys("mirsad.hadzic.01@gmail.com"); Thread.sleep(1000);
	  
	  WebElement emailConfirm =
	  webDriver.findElement(By.cssSelector("#emailConfirm"));
	  emailConfirm.sendKeys("mirsad.hadzic.01@gmail.com"); Thread.sleep(1000);
	  
	  WebElement phoneNumber =
	  webDriver.findElement(By.cssSelector("#phoneNumber"));
	  phoneNumber.sendKeys("61378500"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[3]/div/div[4]/div[3]/div/div[1]/section[2]/div[2]/div/div/div/div[2]/div[1]/form/div/div/div/button"
	  )).click(); Thread.sleep(10000);
	  
	  webDriver.findElement(By.cssSelector("#selectable-render-summary4")).click();
	  Thread.sleep(5000);
	  
	  // closing the 2nd tab 
	  webDriver.close();
	  
	  // go back to the original tab via "handle1"
	  
	  webDriver.switchTo().window(handle1); Thread.sleep(10000); }
	 */

	// 9th test, verify that "Contact Seller" feature is working correctly

	/*
	  @Test void testContactSeller() throws InterruptedException {
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  // Find search box element and click it 
	  WebElement searchField =
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"
	  ));
	  
	  searchField.sendKeys("xiaomi"); Thread.sleep(1000);
	  webDriver.findElement(By.cssSelector("#gh-btn")).click(); Thread.sleep(1000);
	  
	  // get the original tab's handle 
	  String handle1 =
	  webDriver.getWindowHandle();
	  
	  // click on the first element in search results and open a new tab 
	  WebElement
	  firstItem = webDriver.findElement(By.xpath(
	  "/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a"));
	  firstItem.click(); Thread.sleep(8000);
	  
	  for (String handle: webDriver.getWindowHandles()) { if
	  (!handle.equals(handle1)) { webDriver.switchTo().window(handle); break; } }
	  
	  Thread.sleep(5000);
	  
	  // click on the "Contact Seller" option 
	  WebElement contactSeller =
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/ul/li[2]/a/span"
	  )); contactSeller.click(); Thread.sleep(4000);
	  
	  webDriver.findElement(By.id("userid")).sendKeys(
	  "mirsad.hadzic.982111@gmail.com"); Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  
	  WebElement signInInput =
	  webDriver.findElement(By.id("pass"));//.sendKeys("ocu366m8");
	  signInInput.sendKeys("ocu366m8"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.id("sgnBt")).click(); Thread.sleep(20000);
	  */
	  // Ovaj dio je ustvari forma koja izleti kada hoces nesto kupiti prvi put na EBAY-u, pa upises svoje podatke, 
	  // dolazi samo jednom pa sam je zato izkomentarisao
	  
	  /* webDriver.findElement(By.xpath(
	  "/html/body/div[1]/div[1]/div[4]/form/div[3]/div[2]/div[1]/div/div/input"))
	  .sendKeys("Cekalusa br. 39"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[1]/div[1]/div[4]/form/div[3]/div[4]/div[1]/div/div/input"))
	  .sendKeys("Sarajevo"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[1]/div[1]/div[4]/form/div[3]/div[5]/span/div/div/input"))
	  .sendKeys("Kanton Sarajevo"); Thread.sleep(000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[1]/div[1]/div[4]/form/div[3]/div[5]/div/div/div/input"))
	  .sendKeys("71000"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.cssSelector("#phoneFlagComp1"))
	  .sendKeys("61 222 700"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[1]/div[1]/div[4]/form/div[6]/input")).click();
	  Thread.sleep(10000);
	 */
	// ovdje izbrisati komentare
	/*
	  webDriver.findElement(By.xpath(
	  "/html/body/div[4]/div[1]/div[2]/form/div/div/a[2]")).click();
	  Thread.sleep(4000);
	  
	  webDriver.findElement(By.cssSelector("#msg_cnt_cnt"))
	  .sendKeys("ne valja Vam zaomi"); Thread.sleep(2000);
	  
	  // send a copy to my email 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div[5]/input"
	  )).click(); Thread.sleep(4000);
	  
	  // confirm by clicking on "Send message" 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[2]/div[6]/button[1]"
	  )).click(); Thread.sleep(4000);
	  
	  // Check if the message was sent by looking for the "Your message has been sent" message
	  
	  String pageSource = webDriver.getPageSource(); // String messageText =messageSent.getText(); 
	  if
	  (pageSource.contains("Your message has been sent!")) {
	  System.out.println("Test passed: message was sent"); } else {
	  System.out.println("Test failed: message was not sent"); }
	  
	  Thread.sleep(2000); // closing the 2nd tab 
	  webDriver.close();
	  
	  // go back to the original tab via "handle1"
	  
	  webDriver.switchTo().window(handle1); Thread.sleep(10000); }
	 */

	// 10th test, discussion board

	
	 /*@Test void discussionBoardTest() throws InterruptedException {
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(1000);
	  
	  webDriver.findElement(By.
	  cssSelector("#gf-BIG > table > tbody > tr > td:nth-child(5) > ul:nth-child(4) > li:nth-child(2) > a"
	  )).click(); Thread.sleep(10000);
	  
	  // click on the "start a conversation" 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/center/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div/section/header/div[1]/div/a"
	  )).click(); Thread.sleep(5000);
	  
	  //radi captcha 
	  Thread.sleep(15000);
	  
	  webDriver.findElement(By.id("userid")).sendKeys("haremare@gmail.com");
	  Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  
	  WebElement signInInput =
	  webDriver.findElement(By.id("pass"));//.sendKeys("ocu366m8");
	  signInInput.sendKeys("ocu366m8"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.id("sgnBt")).click(); //radi captcha
	  Thread.sleep(15000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) webDriver;
	  
	  // click on the "start a conversation" 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/center/div[1]/div/div/div/div[1]/div[3]/div[1]/div/div/section/header/div[1]/div/a"
	  )).click(); Thread.sleep(1000);
	  
	  // Choose a board 
	  Select board = new
	  Select(webDriver.findElement(By.id("lia-board")));
	  board.selectByVisibleText("Android App"); Thread.sleep(2000);
	  
	  js.executeScript("window.scrollBy(0, 600)"); Thread.sleep(2000);
	  
	  // Enter a subject 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/center/div[1]/div/div/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div[2]/input"
	  )) .sendKeys("Cekalusa br. 39"); Thread.sleep(1000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/div[2]/center/div[1]/div/div/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div[2]/div/div/span[1]/input[2]"
	  )).click(); Thread.sleep(9000);
	  
	  String pageSource = webDriver.getPageSource(); // String messageText =messageSent.getText(); 
	  if (pageSource.contains("Cekalusa br. 39")) {
	  System.out.println("Test passed: comment was sent"); } else {
	  System.out.println("Test failed: comment was not sent"); } }
	 */

	// 11th test, verify that the "Buy it now" feature is working correctly:

	
	  /*@Test
	  
	  void buyItNowTest() throws InterruptedException { webDriver.get(baseUrl);
	  webDriver.manage().window().maximize(); Thread.sleep(5000);
	  
	  // Find search box element and click it 
	  WebElement searchField =
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"
	  ));
	  
	  searchField.sendKeys("xiaomi"); Thread.sleep(5000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input")).
	  click(); Thread.sleep(2000);
	  
	  // get the original tab's handle 
	  String handle1 =
	  webDriver.getWindowHandle();
	  
	  // click on the first element in search results and open a new tab 
	  WebElement
	  firstItem = webDriver.findElement(By.xpath(
	  "/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a"));
	  firstItem.click(); Thread.sleep(8000);
	  
	  for (String handle: webDriver.getWindowHandles()) { if
	  (!handle.equals(handle1)) { webDriver.switchTo().window(handle); break; } }
	  
	  Thread.sleep(5000);
	  
	  WebElement buyButton = webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[1]/div/a"
	  )); buyButton.click(); Thread.sleep(4000);
	  
	  WebElement guestCheckOut = webDriver.findElement(By.xpath(
	  "/html/body/div[6]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[1]/div/div/div/div[2]/div[3]/div/div/div[2]/div[2]/a"
	  )); guestCheckOut.click(); Thread.sleep(4000);
	  
	  // Check if the purchase page is displayed by looking for the "Continue to purchase" button
	  
	  WebElement purchaseButton = webDriver.findElement(By.xpath(
	  "/html/body/div[3]/div/div[4]/div[3]/div/div[2]/div[1]/section/div[2]/form/div/button"
	  )); String buttonText = purchaseButton.getText();
	  
	  if (buttonText.equals("Confirm and pay")) {
	  System.out.println("Test passed: purchase page is displayed"); } else {
	  System.out.println("Test failed: purchase page is not displayed"); } }
	 */

	// 12th test, "Add to wish list"
	
	 /* @Test
	  
	  void testAdd() throws InterruptedException {
	  
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  // Find search box element and click it 
	  WebElement searchField =
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]"
	  ));
	  
	  searchField.sendKeys("xiaomi"); Thread.sleep(5000);
	  
	  webDriver.findElement(By.xpath(
	  "/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input")).
	  click(); Thread.sleep(2000);
	  
	  // get the original tab's handle 
	  String handle1 =
	  webDriver.getWindowHandle();
	  
	  // click on the first element in search results and open a new tab 
	  WebElement
	  firstItem = webDriver.findElement(By.xpath(
	  "/html/body/div[8]/div[4]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a"));
	  firstItem.click(); Thread.sleep(8000);
	  
	  for (String handle: webDriver.getWindowHandles()) { if
	  (!handle.equals(handle1)) { webDriver.switchTo().window(handle); break; } }
	  
	  Thread.sleep(5000);
	  
	  // click the "Add to Watchlist" Button 
	  WebElement add =
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[3]/div/div/div/div/div/span/a"
	  )); add.click(); Thread.sleep(20000);
	  
	  webDriver.findElement(By.id("userid")).click();
	  webDriver.findElement(By.id("userid")).sendKeys("mirsad.hadzic1@gmail.com");
	  Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  
	  //webDriver.findElement(By.xpath("/html/body/div[4]/main/div[1]/form[1]/div[5]/a")).click();
	  Thread.sleep(1000);
	  
	  WebElement signInInput =
	  webDriver.findElement(By.id("pass"));//.sendKeys("ocu366m8");
	  signInInput.sendKeys("ocu366m8"); Thread.sleep(2000); //assertEquals(pass, "ocu366m8");
	  
	  Thread.sleep(2000);
	  
	  webDriver.findElement(By.id("sgnBt")).click(); Thread.sleep(20000);
	  
	  // click the "Add to Watchlist" Button
	  WebElement add2 =
	  webDriver.findElement(By.cssSelector("#vi-atl-lnk-99 > button"));
	  add2.click(); Thread.sleep(8000);
	  
	  // Wait for the watch list to update 
	  WebDriverWait wait = new
	  WebDriverWait(webDriver, Duration.ofSeconds(10)); // 10 seconds timeout
	  WebElement watchListLink =
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div/a"
	  )));
	  
	  Thread.sleep(5000);
	  
	  // Check if the item was added to the wish list by looking for the "Wish list" link 
	  String linkText = watchListLink.getText(); if
	  (linkText.equals("Watch list")) {
	  System.out.println("Test passed: item was added to the wish list"); } else {
	  System.out.println("Test failed: item was not added to the wish list"); } }
	 */

	// 13th test, Verify that the "Remove" feature is working correctly:

	
	  /*@Test
	  
	  void testRemove() throws InterruptedException {
	  
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  JavascriptExecutor js = (JavascriptExecutor) webDriver;
	  
	  WebElement cb = webDriver.findElement(By.
	  cssSelector("#items_list1 > div.hl-card-header > div > div.hl-card-header__title > h2 > a"
	  )); js.executeScript("arguments[0].scrollIntoView(true);", cb);
	  Thread.sleep(6000);
	  
	  // klik na kuhalo za vodu, xbox 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[6]/div[2]/div/div/div/div/ul/li[3]/a")).click();
	  
	  // klik na "Add to cart" 
	  webDriver.findElement(By.xpath(
	  "/html/body/div[5]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div/div[1]/div[2]/ul/li[2]/div/a"
	  )).click(); Thread.sleep(2000);
	  
	  // klik na "Remove" 
	  webDriver.findElement(By.
	  cssSelector("#mainContent > div > div.left-section > div.app-cart > div > ul > li > div > div > div > div.line-item-foot > span:nth-child(3) > button"
	  )).click(); Thread.sleep(6000);
	  
	  String pageSource = webDriver.getPageSource();
	  
	  if (pageSource.contains(" was removed from your cart.")) {
	  System.out.println("Test passed: item was removed."); } else {
	  System.out.println("Test failed: item was not removed."); }
	  
	  }*/
	 

	// 14th test, check if the messages page is displayed correctly

	
	  /*@Test void testMessagesDisplaying() throws InterruptedException {
	  
	  webDriver.get(baseUrl); webDriver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  webDriver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).
	  click(); Thread.sleep(30000);
	  
	  // sign in 
	  webDriver.findElement(By.id("userid")).click();
	  webDriver.findElement(By.id("userid")).sendKeys("haremare@gmail.com");
	  Thread.sleep(3000);
	  webDriver.findElement(By.name("signin-continue-btn")).click();
	  Thread.sleep(2000);
	  
	  WebElement signInInput =
	  webDriver.findElement(By.id("pass"));//.sendKeys("ocu366m8");
	  signInInput.sendKeys("ocu366m8"); Thread.sleep(2000); //assertEquals(pass,"ocu366m8");
	  
	  Thread.sleep(2000);
	  
	  webDriver.findElement(By.id("sgnBt")).click();
	  
	  Thread.sleep(30000); // captch-a
	  
	  // Click on the "My eBay" dropdown menu 
	  WebElement myEbayDropdown =
	  webDriver.findElement(By.id("gh-eb-My")); myEbayDropdown.click();
	  
	  // Wait for the dropdown menu to appear 
	  Thread.sleep(5000); // 5 seconds
	  
	  // Click on the "Messages" 
	  WebElement messages = webDriver.findElement(By.
	  cssSelector("#mainContent > div:nth-child(3) > div > div > div > div.m-top-nav__bottom > div > div > ul > li:nth-child(2) > a"
	  )); messages.click();
	  
	  // Wait for the messages page to load 
	  Thread.sleep(5000); // 5 seconds
	  
	  // Verify that the correct page is displayed by looking for the "Messages" heading 
	  WebElement messagesHeading =
	  webDriver.findElement(By.cssSelector("#mainH1")); String headingText =
	  messagesHeading.getText(); if (headingText.equals("My eBay: Messages")) {
	  System.out.println("Test passed: Messages page was displayed"); } else {
	  System.out.println("Test failed: Messages page was not displayed"); } }
	 
	 */

	// 15th test, deleting messages

	/*@Test
	void testMessagesDisplaying2() throws InterruptedException {

		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(5000);

		webDriver.findElement(By.xpath("/html/body/header/div/ul[1]/li[1]/span/a")).click();
		Thread.sleep(30000);

		// sign in
		webDriver.findElement(By.id("userid")).click();
		webDriver.findElement(By.id("userid")).sendKeys("haremare@gmail.com");
		Thread.sleep(3000);
		webDriver.findElement(By.name("signin-continue-btn")).click();
		Thread.sleep(2000);

		WebElement signInInput = webDriver.findElement(By.id("pass"));// .sendKeys("ocu366m8");
		signInInput.sendKeys("ocu366m8");
		Thread.sleep(2000);
		// assertEquals(pass, "ocu366m8");

		Thread.sleep(2000);

		webDriver.findElement(By.id("sgnBt")).click();

		Thread.sleep(30000); // captch-a

		// Click on the "My eBay" dropdown menu
		WebElement myEbayDropdown = webDriver.findElement(By.id("gh-eb-My"));
		myEbayDropdown.click();

		// Wait for the dropdown menu to appear
		Thread.sleep(5000); // 5 seconds

		// Click on the "Messages"
		WebElement messages = webDriver.findElement(By.cssSelector(
				"#mainContent > div:nth-child(3) > div > div > div > div.m-top-nav__bottom > div > div > ul > li:nth-child(2) > a"));
		messages.click();

		// Wait for the messages page to load
		Thread.sleep(5000); // 5 seconds

		webDriver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/div/div[2]/div[4]/div/div[2]/table/tbody/tr/td[2]/div/div[2]/div[4]/div/div[2]/span[1]/input"))
				.click();

		webDriver.findElement(By.xpath(
				"/html/body/div[2]/div/div[2]/div/div[2]/div[4]/div/div[2]/table/tbody/tr/td[2]/div/div[2]/div[4]/div/div[2]/span[2]/span[1]/span/button"))
				.click();

		Thread.sleep(5000);

		String pageSource = webDriver.getPageSource();

		if (pageSource.contains("You do not have any messages.")) {
			System.out.println("Test passed: message was deleted");
		} else {
			System.out.println("Test failed: message was not deleted");
		}

	}*/
}
