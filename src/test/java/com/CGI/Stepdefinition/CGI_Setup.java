package com.CGI.Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CGI_Setup {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Setup User is navigating to CGI URL is {string}")
	public void to_check_Setup_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Setup User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Setup")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("kt_sign_in_submit")).click();
		System.out.print("\u001B[1mLogin button clicked\u001B[0m");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}

	}

	@Then("Close the Setup Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Setup button")
	public void click_the_Setup_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Setup']")));
		ele = driver.findElement(By.xpath("//span[text()='Setup']"));
		ele.click();
	}

	@And("Click Installer button")
	public void click_Installer_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Installer']")));
		ele = driver.findElement(By.xpath("//span[text()='Installer']"));
		ele.click();
	}

	@Then("Select valid status {string} in Installer Page")
	public void select_valid_status_in_installer_page(String status) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Enter valid installer name {string} in searchbox in Installer Page")
	public void enter_valid_installer_name_in_searchbox_in_installer_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in Installer Page")
	public void click_add_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@Then("Click save button in add Installer Page")
	public void click_save_button_in_add_installer_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Installer Page")
	public void check_mandatory_message_is_displayed_or_not_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Check mandatory message is displayed or not in edit Installer Page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Check mandatory message is displayed or not in edit investment Page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_investment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Check mandatory message is displayed or not in NSF Setup tab")
	public void check_mandatory_message_is_displayed_or_not_in_NSF_Setup_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Check mandatory message is displayed or not in email notification tab")
	public void check_mandatory_message_is_displayed_or_not_in_email_notification_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Select valid transaction date in add investment page")
	public void select_valid_transaction_date_in_add_investment_page() {
		// Get today's date
		LocalDate today = LocalDate.now();

		// Calculate tomorrow's date
		LocalDate tomorrow = today.plusDays(1);

		// Format the date in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String tomorrowFormatted = tomorrow.format(formatter);
		System.out.println("Tomorrow's date: " + tomorrowFormatted);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Transactiondate")));
		ele = driver.findElement(By.name("Transactiondate"));
		ele.sendKeys(tomorrowFormatted);
	}

	@Then("Enter valid amount in add investment page")
	public void enter_valid_amount_in_add_investment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		ele.sendKeys("10");
	}

	@Then("Enter installer name {string} in add installer page")
	public void enter_installer_name_in_add_installer_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Installer")));
		ele = driver.findElement(By.name("Installer"));
		ele.sendKeys(Name);
	}

	@Then("Select valid country name {string} in add installer page")
	public void select_valid_country_name_in_add_installer_page(String CountryName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CountryName);
	}

	@Then("Select valid state name {string} in add installer page")
	public void select_valid_state_name_in_add_installer_page(String StateName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));
		ele = driver.findElement(By.id("state"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(StateName);
	}

	@Then("Enter valid Address1 name {string} in add installer page")
	public void enter_valid_address1_name_in_add_installer_page(String Address1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Address1")));
		ele = driver.findElement(By.name("Address1"));
		ele.sendKeys(Address1);
	}

	@Then("Enter valid Address2 name {string} in add installer page")
	public void enter_valid_address2_name_in_add_installer_page(String Address2) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Address2")));
		ele = driver.findElement(By.name("Address2"));
		ele.sendKeys(Address2);
	}

	@Then("Enter valid city name {string} in add installer page")
	public void enter_valid_city_name_in_add_installer_page(String City) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("City")));
		ele = driver.findElement(By.name("City"));
		ele.sendKeys(City);
	}

	@Then("Enter valid Zip Code {string} in add installer page")
	public void enter_valid_zip_code_in_add_installer_page(String ZipCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ZipCode")));
		ele = driver.findElement(By.name("ZipCode"));
		ele.sendKeys(ZipCode);
	}

	@Then("Enter valid Phone number {string} in add installer page")
	public void enter_valid_phone_number_in_add_installer_page(String Phone) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Phone")));
		ele = driver.findElement(By.name("Phone"));
		ele.sendKeys(Phone);
	}

	@Then("Enter valid Email {string} in add installer page")
	public void enter_valid_email_in_add_installer_page(String Email) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Email")));
		ele = driver.findElement(By.name("Email"));
		ele.sendKeys(Email);
	}

	@Then("Click clear button in add Installer Page")
	public void click_clear_button_in_add_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset1")));
		ele = driver.findElement(By.id("reset1"));
		ele.click();
	}

	@Then("Check success message is displayed or not in add Installer Page")
	public void check_success_message_is_displayed_or_not_in_add_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click back button in add Installer Page")
	public void click_back_button_in_add_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Back']")));
		ele = driver.findElement(By.xpath("//a[text()='Back']"));
		ele.click();
	}

	@Then("Click edit button in Installer Page")
	public void click_edit_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click actions button in Installer Page")
	public void click_actions_button_in_installer_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click actions button in email notification tab")
	public void click_actions_button_in_email_notification_tab() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click edit installer button in Installer Page")
	public void click_edit_installer_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit Installer']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit Installer']"));
		ele.click();
	}

	@Then("Click back button in edit Installer Page")
	public void click_back_button_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click clear button in edit Installer Page")
	public void click_clear_button_in_edit_installer_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click update button in edit Installer Page")
	public void click_update_button_in_edit_installer_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit Installer Page")
	public void modify_valid_details_in_edit_installer_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Installer")));
		ele = driver.findElement(By.name("Installer"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		ele.sendKeys(text);
	}

	@Then("Check success message is displayed or not in Installer Page")
	public void check_success_message_is_displayed_or_not_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click profile photo button in edit installer page")
	public void click_profile_photo_button_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblImage")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblImage"));
		ele.click();
	}

	@Then("Click save button in profile photo button in edit installer page")
	public void click_save_button_in_profile_photo_button_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Upload']")));
		ele = driver.findElement(By.xpath("//button[text()='Upload']"));
		ele.click();
	}

	@Then("Click close button in profile photo button in edit installer page")
	public void click_close_button_in_profile_photo_button_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Upload valid profile photo in edit installer page")
	public void upload_valid_profile_photo_in_edit_installer_page() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-6']")));
		ele = driver.findElement(By.xpath("//div[@class='col-md-6']"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\CGI_Cucumber_Project\\Files\\Screenshot 2024-08-07 114619.png";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click add investment details in edit installer page")
	public void click_add_investment_details_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Investment Details']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Investment Details']"));
		ele.click();
	}

	@Then("Click close button in add investment page")
	public void click_close_button_in_add_investment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click save button in add investment page")
	public void click_save_button_in_add_investment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Click edit button in investment details in edit installer page")
	public void click_edit_button_in_investment_details_in_edit_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class=' fs-6  justify-content-end btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class=' fs-6  justify-content-end btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click clear button in edit investment page")
	public void click_clear_button_in_edit_investment_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click save button in edit investment page")
	public void click_save_button_in_edit_investment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit investment page")
	public void modify_valid_details_in_edit_investment_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		ele.sendKeys(text);
	}

	@Then("Click bank setup button in installer page")
	public void click_bank_setup_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Bank Setup']")));
		ele = driver.findElement(By.xpath("//a[text()='Bank Setup']"));
		ele.click();
	}

	@Then("Select any checkbox in bank setup tab")
	public void select_any_checkbox_in_bank_setup_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content_container\"]/div[2]/div/div[1]/table/thead/tr/th[5]/input")));
		ele = driver.findElement(
				By.xpath("//*[@id=\"kt_content_container\"]/div[2]/div/div[1]/table/thead/tr/th[5]/input"));
		ele.click();
	}

	@Then("Click update button in bank setup tab")
	public void click_update_button_in_bank_setup_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Update']")));
		ele = driver.findElement(By.xpath("//div[text()='Update']"));
		ele.click();
	}

	@Then("Click NSF setup button in installer page")
	public void click_nsf_setup_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='NSF Setup']")));
		ele = driver.findElement(By.xpath("//a[text()='NSF Setup']"));
		ele.click();
	}

	@Then("Click update button in NSF Setup tab")
	public void click_update_button_in_nsf_setup_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Click no radio button in enable NSF tab")
	public void click_no_radio_button_in_enable_nsf_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='NSFN'][@value='N']")));
		ele = driver.findElement(By.xpath("//input[@name='NSFN'][@value='N']"));
		ele.click();
	}

	@Then("Select number of attempts {string} in NSF Setup tab")
	public void select_number_of_attempts_in_nsf_setup_tab(String attempts) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("attempts")));
		ele = driver.findElement(By.id("attempts"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(attempts);
	}

	@Then("Select number of days {string} in NSF Setup tab")
	public void select_number_of_days_in_nsf_setup_tab(String days) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("intervals")));
		ele = driver.findElement(By.id("intervals"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(days);
	}

	@Then("Click clear button in NSF Setup tab")
	public void click_clear_button_in_nsf_setup_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset1")));
		ele = driver.findElement(By.id("reset1"));
		ele.click();
	}

	@Then("Click yes radio button in enable NSF tab")
	public void click_yes_radio_button_in_enable_nsf_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='NSFN'][@value='N']")));
		ele = driver.findElement(By.xpath("//input[@name='NSFY'][@value='Y']"));
		ele.click();
	}

	@Then("Enter the amount {string} in NSF Setup tab")
	public void enter_the_amount_in_nsf_setup_tab(String Amount) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(Amount);
	}

	@Then("Click Email Notification button in installer page")
	public void click_email_notification_button_in_installer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Email Notification']")));
		ele = driver.findElement(By.xpath("//a[text()='Email Notification']"));
		ele.click();
	}

	@Then("Click check all button in email notification tab")
	public void click_check_all_button_in_email_notification_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Check All']")));
		ele = driver.findElement(By.xpath("//a[text()='Check All']"));
		ele.click();
	}

	@Then("Click clear all button in email notification tab")
	public void click_clear_all_button_in_email_notification_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clear All']")));
		ele = driver.findElement(By.xpath("//a[text()='Clear All']"));
		ele.click();
	}

	@Then("Click udpate button in email notification tab")
	public void click_udpate_button_in_email_notification_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Update']")));
		ele = driver.findElement(By.xpath("//div[text()='Update']"));
		ele.click();
	}

	@Then("Select valid signature option {string} in email notification tab")
	public void select_valid_signature_option_in_email_notification_tab(String signature) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(signature);
	}

	@Then("Enter valid Payment Reminder Days {string} in email notification tab")
	public void enter_valid_payment_reminder_days_in_email_notification_tab(String PaymentReminder) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-lg form-control-solid mt-2']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-lg form-control-solid mt-2']"));
		ele.sendKeys(PaymentReminder);
	}

	@Then("Enter valid host name {string} in email notification tab")
	public void enter_valid_host_name_in_email_notification_tab(String Hostname) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Host Name. Length is Limited to 50']")));
		ele = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Host Name. Length is Limited to 50']"));
		ele.sendKeys(Hostname);
	}

	@Then("Enter valid email address {string} in email notification tab")
	public void enter_valid_email_address_in_email_notification_tab(String EmailID) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Email Address. Length is Limited to 100']")));
		ele = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Email Address. Length is Limited to 100']"));
		ele.sendKeys(EmailID);
	}

	@Then("Enter valid password {string} in email notification tab")
	public void enter_valid_password_in_email_notification_tab(String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Password. Length is Limited to 100']")));
		ele = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Password. Length is Limited to 100']"));
		ele.sendKeys(password);
	}

	@Then("Enter valid port number {string} in email notification tab")
	public void enter_valid_port_number_in_email_notification_tab(String PortNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Port. Length is Limited to 100']")));
		ele = driver.findElement(By.xpath(
				"//input[@class='form-control form-control-lg form-control-solid mt-2'][@title='Enter Port. Length is Limited to 100']"));
		ele.sendKeys(PortNumber);
	}

	@Then("Modify valid details in email notification tab")
	public void modify_valid_details_in_email_notification_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-lg form-control-solid mt-2']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-lg form-control-solid mt-2']"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys("10");
	}

	@Then("Check success message is displayed or not in email notification tab")
	public void check_success_message_is_displayed_or_not_in_email_notification_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click Investor button")
	public void click_investor_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/div/div[2]/div/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"#kt_aside_menu\"]/div[6]/div/div[2]/div/span[2]"));
		ele.click();
	}

	@Then("Select valid status {string} in Investor Page")
	public void select_valid_status_in_investor_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Enter valid Investor name {string} in searchbox in Investor Page")
	public void enter_valid_investor_name_in_searchbox_in_investor_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in Investor Page")
	public void click_add_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@Then("Click save button in add Investor Page")
	public void click_save_button_in_add_investor_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Investor Page")
	public void check_mandatory_message_is_displayed_or_not_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid investor name {string} in investor name field")
	public void enter_valid_investor_name_in_investor_name_field(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Investor")));
		ele = driver.findElement(By.name("Investor"));
		ele.sendKeys(Name);
	}

	@Then("Select valid country name {string} in add investor page")
	public void select_valid_country_name_in_add_investor_page(String CountryName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CountryName);
	}

	@Then("Select valid state name {string} in add investor page")
	public void select_valid_state_name_in_add_investor_page(String StateName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));
		ele = driver.findElement(By.id("state"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(StateName);
	}

	@Then("Click clear button in add Investor Page")
	public void click_clear_button_in_add_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset1")));
		ele = driver.findElement(By.id("reset1"));
		ele.click();
	}

	@Then("Check success message is displayed or not in Investor Page")
	public void check_success_message_is_displayed_or_not_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click back button in add Investor Page")
	public void click_back_button_in_add_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Back']")));
		ele = driver.findElement(By.xpath("//a[text()='Back']"));
		ele.click();
	}

	@Then("Click edit button in Investor Page")
	public void click_edit_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click actions button in edit investor page")
	public void click_actions_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in edit Investor Page")
	public void click_back_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click edit investor button in edit investor page")
	public void click_edit_investor_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' Edit Investor']")));
		ele = driver.findElement(By.xpath("//div[text()=' Edit Investor']"));
		ele.click();
	}

	@Then("Click clear button in edit Investor Page")
	public void click_clear_button_in_edit_investor_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
		ele.click();
	}

	@Then("Click update button in edit Investor Page")
	public void click_update_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit Investor Page")
	public void modify_valid_details_in_edit_investor_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Investor")));
		ele = driver.findElement(By.name("Investor"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click add customer button in edit investor page")
	public void click_add_customer_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Customers']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Customers']"));
		ele.click();
	}

	@Then("Select valid installer {string} in customer tab")
	public void select_valid_installer_in_customer_tab(String StateName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(StateName);
	}

	@Then("Select the checkbox of the customer in customer tab")
	public void select_the_checkbox_of_the_customer_in_customer_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[8]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[8]/input"));
		ele.click();
	}

	@Then("Click save button in edit investor page")
	public void click_save_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Save']")));
		ele = driver.findElement(By.xpath("//div[text()='Save']"));
		ele.click();
	}

	@Then("Click update button in action edit investor page")
	public void click_update_button_in_action_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Update']")));
		ele = driver.findElement(By.xpath("//div[text()='Update']"));
		ele.click();
	}

	@Then("Click edit button in customer tab")
	public void click_edit_button_in_customer_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Enter valid name {string} in the search box of customer tab")
	public void enter_valid_name_in_the_search_box_of_customer_tab(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid  ps-14']"));
		ele.sendKeys(Name);
	}

	@Then("Click select all check box in customer tab")
	public void click_select_all_check_box_in_customer_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/thead/tr/th[8]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/thead/tr/th[8]/input"));
		ele.click();
	}

	@Then("Click unselect the check box in customer tab")
	public void click_unselect_the_check_box_in_customer_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/thead/tr/th[8]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/thead/tr/th[8]/input"));
		if (ele.isSelected()) {
			System.out.println("Check box is already selected");
			ele.click();
		} else {
			System.out.println("Checkbox is not selected");
		}
	}

	@Then("Click one check box in customer tab")
	public void click_one_check_box_in_customer_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/input"));
		ele.click();
	}

	@Then("Click transaction button in Investor Page")
	public void click_transaction_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Transactions']")));
		ele = driver.findElement(By.xpath("//a[text()='Transactions']"));
		ele.click();
	}

	@Then("Click add transaction button in edit investor page")
	public void click_add_transaction_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Transactions']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Transactions']"));
		ele.click();
	}

	@Then("Click back button in edit transaction page")
	public void click_back_button_in_edit_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click clear button in edit transaction page")
	public void click_clear_button_in_edit_transaction_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click save button in add transaction page")
	public void click_save_button_in_add_transaction_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Click save button in add transactions page")
	public void click_save_button_in_add_transactions_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Select valid transaction date in date tab")
	public void select_valid_transaction_date_in_date_tab() {
		// Get today's date
		LocalDate today = LocalDate.now();

		// Calculate tomorrow's date
		LocalDate tomorrow = today.plusDays(1);

		// Format the date in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String tomorrowFormatted = tomorrow.format(formatter);
		System.out.println("Tomorrow's date: " + tomorrowFormatted);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Transactiondate")));
		ele = driver.findElement(By.name("Transactiondate"));
		ele.sendKeys(tomorrowFormatted);
	}

	@Then("Enter valid amount {string} in amount tab")
	public void enter_valid_amount_in_amount_tab(String amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		ele.sendKeys(amount);
	}

	@Then("Upload valid file in the attachement field tab")
	public void upload_valid_file_in_the_attachement_field_tab() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[6]/div[2]/label[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[6]/div[2]/label[2]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[6]/div[2]/label[2]"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\Blank.xlsx";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click clear button in add transaction page")
	public void click_clear_button_in_add_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click back button in add transaction page")
	public void click_back_button_in_add_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Back']")));
		ele = driver.findElement(By.xpath("//a[text()='Back']"));
		ele.click();
	}

	@Then("Click edit transaction button in edit investor page")
	public void click_edit_transaction_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click update button in edit transaction page")
	public void click_update_button_in_edit_transaction_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit transaction page")
	public void modify_valid_details_in_edit_transaction_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click documents button in Investor Page")
	public void click_documents_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Documents']")));
		ele = driver.findElement(By.xpath("//a[text()='Documents']"));
		ele.click();
	}

	@Then("Click add documents button in edit investor page")
	public void click_add_documents_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Documents']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Documents']"));
		ele.click();
	}

	@Then("Enter valid file name {string} in add documents")
	public void enter_valid_file_name_in_add_documents(String Filename) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Filename")));
		ele = driver.findElement(By.name("Filename"));
		ele.sendKeys(Filename);
	}

	@Then("Upload valid file in add documents")
	public void upload_valid_file_in_add_documents() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[3]/div[2]/label[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[3]/div[2]/label[2]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[3]/div[2]/label[2]"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\Blank.xlsx";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click edit documents button in edit investor page")
	public void click_edit_documents_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class=' fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class=' fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click upload button in edit transaction page")
	public void click_upload_button_in_edit_transaction_page() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[3]/div[2]/label[2]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[3]/div[2]/label[2]"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\Blank.xlsx";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Modify valid detail in edit transaction page")
	public void modify_valid_detail_in_edit_transaction_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Filename")));
		ele = driver.findElement(By.name("Filename"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Check mandatory message is displayed or not in add news feeds Page")
	public void check_mandatory_message_is_displayed_or_not_in_add_news_feeds_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div/div/div"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click clear details in edit transaction page")
	public void click_clear_details_in_edit_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Filename")));
		ele = driver.findElement(By.name("Filename"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}

	@Then("Click news feeds button in Investor Page")
	public void click_news_feeds_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='News Feeds']")));
		ele = driver.findElement(By.xpath("//a[text()='News Feeds']"));
		ele.click();
	}

	@Then("Click add news feeds button in edit investor page")
	public void click_add_news_feeds_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add News Feed']")));
		ele = driver.findElement(By.xpath("//div[text()='Add News Feed']"));
		ele.click();
	}

	@Then("Click save button in add news feeds page")
	public void click_save_button_in_add_news_feeds_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Enter valid title name {string} in add news feeds page")
	public void enter_valid_title_name_in_add_news_feeds_page(String Titlename) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		ele.sendKeys(Titlename);
	}

	@Then("Enter valid news feeds {string} in add news feeds page")
	public void enter_valid_news_feeds_in_add_news_feeds_page(String NewsFeeds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("NewsFeeds")));
		ele = driver.findElement(By.name("NewsFeeds"));
		ele.sendKeys(NewsFeeds);
	}

	@Then("Click edit feeds button in edit investor page")
	public void click_edit_feeds_button_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Clear the title details in edit investor page")
	public void clear_the_title_details_in_edit_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}

	@Then("Click upload button in add news feeds page")
	public void click_upload_button_in_add_news_feeds_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit news feeds page")
	public void modify_valid_details_in_edit_news_feeds_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click Investor Representative button in Investor Page")
	public void click_investor_representative_button_in_investor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Investor Representative']")));
		ele = driver.findElement(By.xpath("//a[text()='Investor Representative']"));
		ele.click();
	}

	@Then("Click check all button in Investor Representative page")
	public void click_check_all_button_in_investor_representative_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Check All']")));
		ele = driver.findElement(By.xpath("//a[text()='Check All']"));
		ele.click();
	}

	@Then("Click clear all button in Investor Representative page")
	public void click_clear_all_button_in_investor_representative_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clear All']")));
		ele = driver.findElement(By.xpath("//a[text()='Clear All']"));
		ele.click();
	}

	@Then("Select valid checkbox in Investor Representative page")
	public void select_valid_checkbox_in_investor_representative_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input'][@name='2065']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input'][@name='2065']"));
		ele.click();
	}

	@Then("Click submit button in Investor Representative page")
	public void click_submit_button_in_investor_representative_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Submit']")));
		ele = driver.findElement(By.xpath("//div[text()='Submit']"));
		ele.click();
	}

	@Then("Click Customer Group button")
	public void click_customer_group_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Customer Group']")));
		ele = driver.findElement(By.xpath("//span[text()='Customer Group']"));
		ele.click();
	}

	@Then("Select valid status {string} in Customer Group Page")
	public void select_valid_status_in_customer_group_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Enter valid name {string} in searchbox in Customer Group Page")
	public void enter_valid_name_in_searchbox_in_customer_group_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in Customer Group Page")
	public void click_add_button_in_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@Then("Click close button in Add Customer Group Page")
	public void click_close_button_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click save button in Add Customer Group Page")
	public void click_save_button_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Add Customer Group Page")
	public void check_mandatory_message_is_displayed_or_not_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Select valid installer {string} name in Add Customer Group Page")
	public void select_valid_installer_name_in_add_customer_group_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownValue")));
		ele = driver.findElement(By.id("dropdownValue"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Enter valid group name {string} in Add Customer Group Page")
	public void enter_valid_group_name_in_add_customer_group_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Groupname")));
		ele = driver.findElement(By.name("Groupname"));
		ele.sendKeys(Name);
	}

	@Then("Click clear button in Add Customer Group Page")
	public void click_clear_button_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset1")));
		ele = driver.findElement(By.id("reset1"));
		ele.click();
	}

	@Then("Check group name is clear or not in Add Customer Group Page")
	public void check_group_name_is_clear_or_not_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Groupname")));
		ele = driver.findElement(By.name("Groupname"));
		String text = ele.getAttribute("value");
		if (text.isEmpty()) {
			System.out.println("Tab is empty");
			System.out.println("Clear button is working");
		} else {
			System.out.println("Clear button is not working");
		}
	}

	@Then("Check success message is displayed or not in Add Customer Group Page")
	public void check_success_message_is_displayed_or_not_in_add_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click edit button in Customer Group Page")
	public void click_edit_button_in_customer_group_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='text-dark fs-6 cursor-pointer']")));
		ele = driver.findElement(By.xpath("//a[@class='text-dark fs-6 cursor-pointer']"));
		ele.click();
	}

	@Then("Click clear button in edit Customer Group Page")
	public void click_clear_button_in_edit_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search-txt")));
		ele = driver.findElement(By.id("search-txt"));
		ele.click();
	}

	@Then("Check group name is clear or not in edit Customer Group Page")
	public void check_group_name_is_clear_or_not_in_edit_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Groupname")));
		ele = driver.findElement(By.name("Groupname"));
		String text = ele.getAttribute("value");
		if (text.isEmpty()) {
			System.out.println("Tab is empty");
			System.out.println("Clear button is working");
		} else {
			System.out.println("Clear button is not working");
		}
	}

	@Then("Click update button in edit Customer Group Page")
	public void click_update_button_in_edit_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in edit Customer Group Page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Modify valid details in edit Customer Group Page")
	public void modify_valid_details_in_edit_customer_group_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Groupname")));
		ele = driver.findElement(By.name("Groupname"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Check success message is displayed or not in edit Customer Group Page")
	public void check_success_message_is_displayed_or_not_in_edit_customer_group_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click API Setup button")
	public void click_api_setup_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='API Setup']")));
		ele = driver.findElement(By.xpath("//span[text()='API Setup']"));
		ele.click();
	}

	@Then("Select valid status {string} in API Setup Page")
	public void select_valid_status_in_api_setup_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Enter valid name {string} in searchbox in API Setup Page")
	public void enter_valid_name_in_searchbox_in_api_setup_page(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in API Setup Page")
	public void click_add_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@Then("Click close button in Add CRM Setup Details popup")
	public void click_close_button_in_add_crm_setup_details_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click save button in Add CRM Setup Details popup")
	public void click_save_button_in_add_crm_setup_details_popup() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Add CRM Setup Details popup")
	public void check_mandatory_message_is_displayed_or_not_in_add_crm_setup_details_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Select valid installer {string} name in Add CRM Setup Details popup")
	public void select_valid_installer_name_in_add_crm_setup_details_popup(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownValue")));
		ele = driver.findElement(By.id("dropdownValue"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Select valid CRM name {string} in Add CRM Setup Details popup")
	public void select_valid_crm_name_in_add_crm_setup_details_popup(String CRMName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("crmdropdownValue")));
		ele = driver.findElement(By.id("crmdropdownValue"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CRMName);
	}

	@Then("Upload valid file in Add CRM Setup Details popup")
	public void upload_valid_file_in_add_crm_setup_details_popup() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//label[@class='file-upload-new form-control form-control-solid cursor-pointer']")));
		ele = driver.findElement(
				By.xpath("//label[@class='file-upload-new form-control form-control-solid cursor-pointer']"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\Files\\Blank.xlsx";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.switchTo().defaultContent();
	}

	@Then("Click clear button in Add CRM Setup Details popup")
	public void click_clear_button_in_add_crm_setup_details_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Check group name is clear or not in Add CRM Setup Details popup")
	public void check_group_name_is_clear_or_not_in_add_crm_setup_details_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownValue")));
		ele = driver.findElement(By.id("dropdownValue"));
		String ActualValue = ele.getAttribute("value");
		String ExpectedValue = "Select Installer";
		if (ActualValue.equals(ExpectedValue)) {
			System.out.println("Tab display default value");
			System.out.println("Clear button is working");
		} else {
			System.out.println("Clear button is not working");
		}
	}

	@Then("Check success message is displayed or not in Add CRM Setup Details popup")
	public void check_success_message_is_displayed_or_not_in_add_crm_setup_details_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click add button in CRM name field")
	public void click_add_button_in_crm_name_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer'][@title='click to add account group ']")));
		ele = driver.findElement(
				By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer'][@title='click to add account group ']"));
		ele.click();
	}

	@Then("Click close button in Add CRM name")
	public void click_close_button_in_add_crm_name() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/button")));
		ele = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/button"));
		ele.click();
	}

	@Then("Enter valid CRM Name in CRM name field")
	public void enter_valid_crm_name_in_crm_name_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CRMName")));
		ele = driver.findElement(By.name("CRMName"));
		ele.sendKeys("Test");
	}

	@Then("Click clear button in Add CRM name pop up")
	public void click_clear_button_in_add_crm_name_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset")));
		ele = driver.findElement(By.id("reset"));
		ele.click();
	}

	@Then("Click save button in Add CRM name pop up")
	public void click_save_button_in_add_crm_name_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[2]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[2]"));
		ele.click();
	}

	@Then("Click edit button in CRM name field")
	public void click_edit_button_in_crm_name_field() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer'][@title='click to edit account group']")));
		ele = driver.findElement(
				By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer'][@title='click to edit account group']"));
		ele.click();
	}

	@Then("Modify valid details in edit CRM name field")
	public void modify_valid_details_in_edit_crm_name_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CRMName")));
		ele = driver.findElement(By.name("CRMName"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click save button in edit CRM name pop up")
	public void click_save_button_in_edit_crm_name_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Click edit button in API Setup Page")
	public void click_edit_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/table/tbody/tr[2]/td[9]/a")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[3]/div/table/tbody/tr[2]/td[9]/a"));
		ele.click();
	}

	@Then("Click API Key button in API Setup Page")
	public void click_api_key_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='API Key']")));
		ele = driver.findElement(By.xpath("//div[text()='API Key']"));
		ele.click();
	}

	@Then("Click clear button in API key tab")
	public void click_clear_button_in_api_key_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click update button in API key tab")
	public void click_update_button_in_api_key_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in API key tab")
	public void modify_valid_details_in_api_key_tab() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Username")));
		ele = driver.findElement(By.name("Username"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click Application Login button in API Setup Page")
	public void click_application_login_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Application Login']")));
		ele = driver.findElement(By.xpath("//div[text()='Application Login']"));
		ele.click();
	}

	@Then("Click clear button in Application Login tab")
	public void click_clear_button_in_application_login_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Click update button in Application Login tab")
	public void click_update_button_in_application_login_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Application Login tab")
	public void check_mandatory_message_is_displayed_or_not_in_application_login_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Check mandatory message is displayed or not in API key tab")
	public void check_mandatory_message_is_displayed_or_not_in_api_key_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Modify valid details in Application Login tab")
	public void modify_valid_details_in_application_login_tab() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Username")));
		ele = driver.findElement(By.name("Username"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Check success message is displayed or not in Application Login tab")
	public void check_success_message_is_displayed_or_not_in_application_login_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click Data Refresh button in API Setup Page")
	public void click_data_refresh_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Data Refresh']")));
		ele = driver.findElement(By.xpath("//div[text()='Data Refresh']"));
		ele.click();
	}

	@Then("Clear the details in effective from calendar in Data Refresh")
	public void clear_the_details_in_effective_from_calendar_in_data_refresh() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div/input"));
		ele.sendKeys(Keys.CONTROL);
		ele.sendKeys(Keys.SHIFT);
		ele.sendKeys(Keys.LEFT);
		ele.sendKeys(Keys.BACK_SPACE);
	}

	@Then("Click save button in Data Refresh")
	public void click_save_button_in_data_refresh() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in Data Refresh")
	public void check_success_message_is_displayed_or_not_in_data_refresh() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Modify the details in Data Refresh")
	public void modify_the_details_in_data_refresh() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-lg form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-lg form-control-solid']"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click view log button in data refresh")
	public void click_view_log_button_in_data_refresh() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View Log']")));
		ele = driver.findElement(By.xpath("//a[text()='View Log']"));
		ele.click();
	}

	@Then("Click close button in data refresh")
	public void click_close_button_in_data_refresh() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click Scheduler log button in API Setup Page")
	public void click_scheduler_log_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Scheduler log']")));
		ele = driver.findElement(By.xpath("//div[text()='Scheduler log']"));
		ele.click();
	}

	@Then("Select valid from date in Scheduler log")
	public void select_valid_from_date_in_scheduler_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/input")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/input"));
		ele.click();
		ele.sendKeys("January");
		ele.sendKeys(Keys.TAB);
		ele.sendKeys("2023");
		ele.sendKeys(Keys.ENTER);
	}

	@Then("Click Customers button in API Setup Page")
	public void click_customers_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Customers']")));
		ele = driver.findElement(By.xpath("//div[text()='Customers']"));
		ele.click();
	}

	@Then("Click Sync Customer button in customers")
	public void click_sync_customer_button_in_customers() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sync Customer']")));
		ele = driver.findElement(By.xpath("//a[text()='Sync Customer']"));
		ele.click();
	}

	@Then("Click edit button in customers")
	public void click_edit_button_in_customers() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='text-dark  fs-6 cursor-pointer ']")));
		ele = driver.findElement(By.xpath("//a[@class='text-dark  fs-6 cursor-pointer ']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in Sync Customer")
	public void check_success_message_is_displayed_or_not_in_sync_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Check success message is displayed or not in API key tab")
	public void check_success_message_is_displayed_or_not_in_API_key_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click Deactivate API Call button in customers")
	public void click_deactivate_api_call_button_in_customers() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Deactivate API Call']")));
		ele = driver.findElement(By.xpath("//button[text()='Deactivate API Call']"));
		ele.click();
	}

	@Then("Click close button in confirmation pop up")
	public void click_close_button_in_confirmation_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click yes button in confirmation pop up")
	public void click_yes_button_in_confirmation_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']")));
		ele = driver.findElement(By.xpath("//button[text()='Yes']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Sync Customer")
	public void check_mandatory_message_is_displayed_or_not_in_sync_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
			ele1 = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
			String text = ele1.getText();
			System.out.println("Alert message displayed like: " + text);
			ele.click();
		} else {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid {string} details in first year production")
	public void enter_valid_details_in_first_year_production(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div[1]/div[6]/div[2]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div[1]/div[6]/div[2]/input"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid {string} details in Product Escalation")
	public void enter_valid_details_in_product_escalation(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div[1]/div[7]/div[2]/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div[1]/div[1]/div[7]/div[2]/input"));
		ele.sendKeys("Test");
	}

	@Then("Click no button in confirmation pop up")
	public void click_no_button_in_confirmation_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='No']")));
		ele = driver.findElement(By.xpath("//button[text()='No']"));
		ele.click();
	}
	@Then("Click action button in API Setup Page")
	public void click_action_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}
	@Then("Click back button in API Setup Page")
	public void click_back_button_in_api_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}
}