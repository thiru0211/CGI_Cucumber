package com.CGI.Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

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

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CGI_Customers {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Customers User is navigating to CGI URL is {string}")
	public void to_check_Timesheet_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Customers User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Customers")
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

	@Then("Close the Customers Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Customers button")
	public void click_the_Customers_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Customers']")));
		ele = driver.findElement(By.xpath("//span[text()='Customers']"));
		ele.click();
	}

	@And("Click List button")
	public void click_List_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='List']")));
		ele = driver.findElement(By.xpath("//span[text()='List']"));
		ele.click();
	}

	@Then("Select valid {string} payment status in customer list page")
	public void select_valid_payment_status_in_customer_list_page(String PayStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("type")));
		ele = driver.findElement(By.name("type"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PayStatus);
	}

	@Then("Select valid {string} customer status in customer list page")
	public void select_valid_customer_status_in_customer_list_page(String CustStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  '][@name='status']")));
		ele = driver.findElement(
				By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  '][@name='status']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CustStatus);
	}

	@Then("Enter valid customer name {string} in customer list page")
	public void enter_valid_customer_name_in_customer_list_page(String Name) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("searchtxt")));
		ele = driver.findElement(By.id("searchtxt"));
		ele.sendKeys(Name);
	}

	@Then("Click actions button in customer list page")
	public void click_actions_button_in_customer_list_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click add button in customer list page")
	public void click_add_button_in_customer_list_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add']")));
		ele = driver.findElement(By.xpath("//div[text()='Add']"));
		ele.click();
	}

	@Then("Click save button in customer list page")
	public void click_save_button_in_customer_list_page() throws InterruptedException {
		Thread.sleep(1000);
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in add list page")
	public void check_mandatory_message_is_displayed_or_not_in_add_list_page() throws InterruptedException {
		Thread.sleep(2000);
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

	@Then("Check mandatory message is displayed or not in customer portfolio tab")
	public void check_mandatory_message_is_displayed_or_not_in_customer_portfolio_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it']"));
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

	@Then("Click add button in customer portfolio tab")
	public void click_add_button_in_customer_portfolio_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer']")));
		ele = driver.findElement(By.xpath("//div[@class='col-md-1 pb-2 cursor-pointer']"));
		ele.click();
	}

	@Then("Select valid installer {string} in add list page")
	public void select_valid_installer_in_add_list_page(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("client")));
		ele = driver.findElement(By.id("client"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Click save button in add portfolio popup")
	public void click_save_button_in_add_portfolio_popup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/button[2]")));
		ele = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/button[2]"));
		ele.click();
	}

	@Then("Check error toast message is displayed or not in add portfolio popup")
	public void check_error_toast_message_is_displayed_or_not_in_add_portfolio_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Portfolio is required']")));
		ele = driver.findElement(By.xpath("//div[text()='Portfolio is required']"));
		String text = ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Error toast displayed like: " + text);
		} else {
			System.out.println("Error toast is not displayed");
		}
	}

	@Then("Enter valid details {string} in add portfolio popup")
	public void enter_valid_details_in_add_portfolio_popup(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("addPortfolio")));
		ele = driver.findElement(By.name("addPortfolio"));
		ele.sendKeys(Name);
	}

	@Then("Click clear button in add portfolio popup")
	public void click_clear_button_in_add_portfolio_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light me-6 btn-md']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light me-6 btn-md']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in add list page")
	public void check_success_message_is_displayed_or_not_in_add_list_page() {
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

	@Then("Select valid Customer Portfolio {string} in add list page")
	public void select_valid_customer_portfolio_in_add_list_page(String CustomerPortfolio) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("portfolio")));
		ele = driver.findElement(By.id("portfolio"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Click edit button in customer portfolio tab")
	public void click_edit_button_in_customer_portfolio_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-1 pb-2']")));
		ele = driver.findElement(By.xpath("//div[@class='col-md-1 pb-2']"));
		ele.click();
	}

	@Then("Modify valid details in add portfolio popup")
	public void modify_valid_details_in_add_portfolio_popup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("portfolio")));
		ele = driver.findElement(By.id("portfolio"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click actions button in add list page")
	public void click_actions_button_in_add_list_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in add list page")
	public void click_back_button_in_add_list_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Enter valid customer ID in add list page")
	public void enter_valid_customer_id_in_add_list_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CustomerId")));
		ele = driver.findElement(By.name("CustomerId"));
		ele.sendKeys("Test123");

	}

	@Then("Enter valid customer name in add list page")
	public void enter_valid_customer_name_in_add_list_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CustomerName")));
		ele = driver.findElement(By.name("CustomerName"));
		Faker faker = new Faker();
		String fullName = faker.name().fullName();
		System.out.println(fullName);
		ele.sendKeys(fullName);
	}

	@Then("Select the installer {string} in add list page")
	public void select_the_installer_in_add_list_page(String client) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("client")));
		ele = driver.findElement(By.id("client"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(client);
	}

	@Then("Click clear button in add list page")
	public void click_clear_button_in_add_list_page() {
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Clear']")));
		ele = driver.findElement(By.xpath("//div[text()='Clear']"));
		ele.click();
	}

	@Then("Check data is cleared or not in customer name tab")
	public void check_data_is_cleared_or_not_in_customer_name_tab() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.name("CustomerName"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CustomerName")));
		ele = driver.findElement(By.name("CustomerName"));
		String text = ele.getAttribute("value");
		if (text.isEmpty()) {
			System.out.println("Data is cleared");
		} else {
			System.out.println("Data is not cleared");
		}
	}

	@Then("Enter valid monthly payment {string} in add list page")
	public void enter_valid_monthly_payment_in_add_list_page(String Monthlypayment) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Monthlypayment")));
		ele = driver.findElement(By.name("Monthlypayment"));
		ele.sendKeys(Monthlypayment);
	}

	@Then("Enter valid total years {string} in add list page")
	public void enter_valid_total_years_in_add_list_page(String Totalyears) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Totalyears")));
		ele = driver.findElement(By.name("Totalyears"));
		ele.sendKeys(Totalyears);
	}

	@Then("Enter valid escalation {string} in add list page")
	public void enter_valid_escalation_in_add_list_page(String Escalation) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Escalation")));
		ele = driver.findElement(By.name("Escalation"));
		ele.sendKeys(Escalation);
	}

	@Then("Enter valid total contract amount {string} in add list page")
	public void enter_valid_total_contract_amount_in_add_list_page(String TotalContrcatAmount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("TotalContrcatAmount")));
		ele = driver.findElement(By.name("TotalContrcatAmount"));
		ele.sendKeys(TotalContrcatAmount);
	}

	@Then("Enter valid phone number {string} in add list page")
	public void enter_valid_phone_number_in_add_list_page(String PhoneNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Phone")));
		ele = driver.findElement(By.name("Phone"));
		ele.sendKeys(PhoneNum);
	}

	@Then("Enter valid mail ID {string} in add list page")
	public void enter_valid_mail_id_in_add_list_page(String MailID) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Email")));
		ele = driver.findElement(By.name("Email"));
		ele.sendKeys(MailID);
	}

	@Then("Check success message is displayed or not in customer list page")
	public void check_success_message_is_displayed_or_not_in_customer_list_page() {
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

	@Then("Select valid installer {string} in customer list page")
	public void select_valid_installer_in_customer_list_page(String client) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("installer")));
		ele = driver.findElement(By.name("installer"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(client);
	}

	@Then("Click edit button in customer list page")
	public void click_edit_button_in_customer_list_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click actions button in customer view page")
	public void click_actions_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click edit customers button in customer view page")
	public void click_edit_customers_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit Customers']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit Customers']"));
		ele.click();
	}

	@Then("Click actions button in edit customer page")
	public void click_actions_button_in_edit_customer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click clear button in edit customer page")
	public void click_clear_button_in_edit_customer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()=' Clear']")));
		ele = driver.findElement(By.xpath("//div[text()=' Clear']"));
		ele.click();
	}

	@Then("Click update button in edit customer page")
	public void click_update_button_in_edit_customer_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Update']")));
		ele = driver.findElement(By.xpath("//div[text()='Update']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in edit customer page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_customer_page() {
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

	@Then("Click back button in edit customer page")
	public void click_back_button_in_edit_customer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Modify valid details in edit customer page")
	public void modify_valid_details_in_edit_customer_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("CustomerName")));
		ele = driver.findElement(By.name("CustomerName"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Check success message is displayed or not in edit customer page")
	public void check_success_message_is_displayed_or_not_in_edit_customer_page() {
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

	@Then("Click edit Payment Schedule button in customer view page")
	public void click_edit_payment_schedule_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit Payment Schedule']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit Payment Schedule']"));
		ele.click();
	}

	@Then("Click update button in edit Payment Schedule")
	public void click_update_button_in_edit_payment_schedule() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Click back button in edit Payment Schedule page")
	public void click_back_button_in_edit_payment_schedule_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click Merge Customer button in customer view page")
	public void click_merge_customer_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Merge Customer']")));
		ele = driver.findElement(By.xpath("//div[text()='Merge Customer']"));
		ele.click();
	}

	@Then("Click the checkbox in Merge Customer")
	public void click_the_checkbox_in_merge_customer() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input cursor-pointer']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input cursor-pointer']"));
		ele.click();
	}

	@Then("Click merge button in Merge Customer")
	public void click_merge_button_in_merge_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Merge']")));
		ele = driver.findElement(By.xpath("//button[text()='Merge']"));
		ele.click();
	}

	@Then("Check error toast is displayed or not in Merge Customer")
	public void check_error_toast_is_displayed_or_not_in_merge_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Merge to is required']")));
		ele = driver.findElement(By.xpath("//span[text()='Merge to is required']"));
		String text = ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Error toast displayed like: " + text);
		} else {
			System.out.println("Error toast is not displayed");
		}
	}

	@Then("Click back button in Merge Customer page")
	public void click_back_button_in_merge_customer_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click merge to customer tab in Merge Customer")
	public void click_merge_to_customer_tab_in_merge_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select Customer']")));
		ele = driver.findElement(By.xpath("//div[text()='Select Customer']"));
		ele.click();
	}

	@Then("Enter valid customer {string} in Merge Customer")
	public void enter_valid_customer_in_merge_customer(String customer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='filter-input']")));
		ele = driver.findElement(By.xpath("//input[@class='filter-input']"));
		ele.sendKeys(customer);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]")));
		ele1 = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div/div[1]"));
		ele1.click();
	}

	@Then("Check success message is displayed or not in Merge Customer")
	public void check_success_message_is_displayed_or_not_in_merge_customer() {
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

	@Then("Click View Received Payments button in customer view page")
	public void click_view_received_payments_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='View Recieved Payments']")));
		ele = driver.findElement(By.xpath("//div[text()='View Recieved Payments']"));
		ele.click();
	}

	@Then("Click back button in View Received Payments page")
	public void click_back_button_in_view_received_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click Edit Monthly Payments button in customer view page")
	public void click_edit_monthly_payments_button_in_customer_view_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit Monthly Payments']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit Monthly Payments']"));
		ele.click();
	}

	@Then("Click save button in Edit Monthly Payments page")
	public void click_save_button_in_edit_monthly_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Edit Monthly Payments page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_monthly_payments_page() {
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

	@Then("Click actions button in Edit Monthly Payments page")
	public void click_actions_button_in_edit_monthly_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in Edit Monthly Payments page")
	public void click_back_button_in_edit_monthly_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Enter valid amount {string} in monthly pay tab")
	public void enter_valid_amount_in_monthly_pay_tab(String Amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("monthlypay")));
		ele = driver.findElement(By.name("monthlypay"));
		ele.sendKeys(Amount);
	}

	@Then("Select valid date in effective from tab")
	public void select_valid_date_in_effective_from_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		ele.sendKeys("Jan/2024");
	}

	@Then("Enter valid reason {string} in reson tab")
	public void enter_valid_reason_in_reson_tab(String Reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reason")));
		ele = driver.findElement(By.name("reason"));
		ele.sendKeys(Reason);
	}

	@Then("Check success message is displayed or not in Edit Monthly Payments page")
	public void check_success_message_is_displayed_or_not_in_edit_monthly_payments_page() {
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

	@Then("Click OS Double Payments button in customer view page")
	public void click_os_double_payments_button_in_customer_view_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='OS Double Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='OS Double Payment']"));
		ele.click();
	}

	@Then("Click create schedule button in OS Double Payments page")
	public void click_create_schedule_button_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Schedule']")));
		ele = driver.findElement(By.xpath("//button[text()='Create Schedule']"));
		ele.click();
	}

	@Then("Click actions button in OS Double Payments page")
	public void click_actions_button_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in OS Double Payments page")
	public void click_back_button_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click check all button in OS Double Payments page")
	public void click_check_all_button_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Check All']")));
		ele = driver.findElement(By.xpath("//a[text()='Check All']"));
		ele.click();
	}

	@Then("Check checkbox is selected or not in OS Double Payments page")
	public void check_checkbox_is_selected_or_not_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='ms-10']")));
		ele = driver.findElement(By.xpath("//input[@class='ms-10']"));
		if (ele.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}
	}

	@Then("Click clear all button in OS Double Payments page")
	public void click_clear_all_button_in_os_double_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clear All']")));
		ele = driver.findElement(By.xpath("//a[text()='Clear All']"));
		ele.click();
	}

	@Then("Select valid date in effective from calendar")
	public void select_valid_date_in_effective_from_calendar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		ele.sendKeys("Sep/2024");
	}

	@Then("Click Document Setup button in customer view page")
	public void click_document_setup_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Document setup']")));
		ele = driver.findElement(By.xpath("//div[text()='Document setup']"));
		ele.click();
	}

	@Then("Click the checkbox in document setup")
	public void click_the_checkbox_in_document_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input cursor-pointer']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input cursor-pointer']"));
		ele.click();
	}

	@Then("Click save button in document setup")
	public void click_save_button_in_document_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check error message is displayed or not in document setup page")
	public void check_error_message_is_displayed_or_not_in_document_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Choose a File']")));
		ele1 = driver.findElement(By.xpath("//div[text()='Choose a File']"));
		String text = ele1.getText();
		System.out.println("Alert message displayed like: " + text);
	}

	@Then("Click actions button in Document Setup page")
	public void click_actions_button_in_document_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in document setup")
	public void click_back_button_in_document_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click download button in Document Setup page")
	public void click_download_button_in_document_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa-solid fa-eye']")));
		ele = driver.findElement(By.xpath("//i[@class='fa-solid fa-eye']"));
		ele.click();
	}

	@Then("Upload valid file in document setup")
	public void upload_valid_file_in_document_setup() throws InterruptedException, AWTException {
		Thread.sleep(2000);
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

	@Then("Check success message is displayed or not in document setup page")
	public void check_success_message_is_displayed_or_not_in_document_setup_page() {
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

	@Then("Click delete button in Document Setup page")
	public void click_delete_button_in_document_setup_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa-solid fa-xmark fs-2']")));
		ele = driver.findElement(By.xpath("//i[@class='fa-solid fa-xmark fs-2']"));
		ele.click();
	}

	@Then("Click Swap Out button in customer view page")
	public void click_swap_out_button_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Swap Out']")));
		ele = driver.findElement(By.xpath("//div[text()='Swap Out']"));
		ele.click();
	}

	@Then("Click yes button in swap out page")
	public void click_yes_button_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input'][@value='T']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input'][@value='T']"));
		ele.click();
	}

	@Then("Click the checkbox in swap out page")
	public void click_the_checkbox_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input cursor-pointer']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input cursor-pointer']"));
		ele.click();
	}

	@Then("Click save button in swap out page")
	public void click_save_button_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check the error toast is displayed or not in swap out page")
	public void check_the_error_toast_is_displayed_or_not_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Reason is required']")));
		ele = driver.findElement(By.xpath("//div[text()='Reason is required']"));
		String text = ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Error toast displayed like: " + text);
		} else {
			System.out.println("Error toast is not displayed");
		}
	}

	@Then("Click actions button in Swap Out page")
	public void click_actions_button_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in Swap Out page")
	public void click_back_button_in_swap_out_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Enter valid reason {string} in swap out page")
	public void enter_valid_reason_in_swap_out_page(String reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//textarea[@class='form-control form-control-solid mb-4']")));
		ele = driver.findElement(By.xpath("//textarea[@class='form-control form-control-solid mb-4']"));
		ele.sendKeys(reason);
	}

	@Then("Check success message is displayed or not in swap out page")
	public void check_success_message_is_displayed_or_not_in_swap_out_page() {
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

	@Then("Click Monitoring CRM Mapping button in customer view page")
	public void click_monitoring_crm_mapping_button_in_customer_view_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Monitoring CRM Mapping']")));
		ele = driver.findElement(By.xpath("//div[text()='Monitoring CRM Mapping']"));
		ele.click();
	}

	@Then("Click update button in Monitoring CRM Mapping")
	public void click_update_button_in_monitoring_crm_mapping() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Click actions button in Monitoring CRM Mapping page")
	public void click_actions_button_in_monitoring_crm_mapping_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in Monitoring CRM Mapping page")
	public void click_back_button_in_monitoring_crm_mapping_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid CRM name {string} in Monitoring CRM Mapping")
	public void select_valid_crm_name_in_monitoring_crm_mapping(String CRMName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("crm")));
		ele = driver.findElement(By.id("crm"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CRMName);
	}

	@Then("Select valid Name in CRM {string} in Monitoring CRM Mapping")
	public void select_valid_name_in_crm_in_monitoring_crm_mapping(String CRMName) throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("crmname")));
		ele = driver.findElement(By.id("crmname"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Check success message is displayed or not in Monitoring CRM Mapping page")
	public void check_success_message_is_displayed_or_not_in_monitoring_crm_mapping_page() {
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

	@Then("Click Escalation Program button in customer view page")
	public void click_escalation_program_button_in_customer_view_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Escalation Program']")));
		ele = driver.findElement(By.xpath("//div[text()='Escalation Program']"));
		ele.click();
	}

	@Then("Click actions button in Escalation Program page")
	public void click_actions_button_in_escalation_program_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in Escalation Program page")
	public void click_back_button_in_escalation_program_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Check the value in year2 field is changed or not after click the calculate button")
	public void check_the_value_in_year2_field_is_changed_or_not_after_click_the_calculate_button()
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/div/input"));
		String InitialValue = ele.getAttribute("value");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-sm']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/div/input"));
		String FinalValue = ele.getAttribute("value");
		Thread.sleep(2000);
		if (!InitialValue.equals(FinalValue)) {
			System.out.println("Values are changed");
			System.out.println("Initial Value: " + InitialValue);
			System.out.println("Final Value: " + FinalValue);
		} else {
			System.out.println("Values are not changed");
			System.out.println("Initial Value: " + InitialValue);
			System.out.println("Final Value: " + FinalValue);
		}
	}

	@Then("Click add notes in customer view page")
	public void click_add_notes_in_customer_view_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add Notes']")));
		ele = driver.findElement(By.xpath("//a[text()='Add Notes']"));
		ele.click();
	}

	@Then("Click save button in add notes page")
	public void click_save_button_in_add_notes_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Save']")));
		ele = driver.findElement(By.xpath("//div[text()='Save']"));
		ele.click();
	}

	@Then("Check error toast is displayed or not in add notes page")
	public void check_error_toast_is_displayed_or_not_in_add_notes_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@style='color: red; margin-top: 5px;']")));
		ele = driver.findElement(By.xpath("//div[@style='color: red; margin-top: 5px;']"));
		String text = ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Error toast displayed like: " + text);
		} else {
			System.out.println("Error toast is not displayed");
		}
	}

	@Then("Enter valid notes details {string} in add notes page")
	public void enter_valid_notes_details_in_add_notes_page(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//textarea[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//textarea[@class='form-control form-control-solid']"));
		ele.sendKeys("Test");
	}

	@Then("Check success message is displayed or not in add notes page")
	public void check_success_message_is_displayed_or_not_in_add_notes_page() {
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

	@Then("Click download button in Document Setup tab")
	public void click_download_button_in_document_setup_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//i[@class='fa fa-eye text-danger cursor-pointer']")));
		ele = driver.findElement(By.xpath("//i[@class='fa fa-eye text-danger cursor-pointer']"));
		ele.click();
	}

	@Then("Click view all button in Recent Activities tab")
	public void click_view_all_button_in_recent_activities_tab() throws InterruptedException {
		Thread.sleep(1000);
		ele = driver.findElement(By.xpath("//div[text()='View All']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='View All']")));
		ele = driver.findElement(By.xpath("//div[text()='View All']"));
		ele.click();
	}

	@Then("Click view icon button in view all Recent Activities tab")
	public void click_view_icon_button_in_view_all_recent_activities_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' fs-6 btn  btn-sm']")));
		ele = driver.findElement(By.xpath("//a[@class=' fs-6 btn  btn-sm']"));
		ele.click();
	}

	@Then("Click close button in view all Recent Activities tab")
	public void click_close_button_in_view_all_recent_activities_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click view icon button in Recent Activities tab")
	public void click_view_icon_button_in_recent_activities_tab() throws InterruptedException {
		Thread.sleep(1000);
		ele = driver.findElement(By.xpath("//i[@class='fa fa-eye text-danger cursor-pointer']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//i[@class='fa fa-eye text-danger cursor-pointer']")));
		ele = driver.findElement(By.xpath("//i[@class='fa fa-eye text-danger cursor-pointer']"));
		ele.click();
	}

	@Then("Click close button in Recent Activities tab")
	public void click_close_button_in_recent_activities_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click ACH Form button")
	public void click_ach_form_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH Form']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH Form']"));
		ele.click();
	}

	@Then("Select valid form type {string} in ACH Form")
	public void select_valid_form_type_in_ach_form(String Type) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("type")));
		ele = driver.findElement(By.name("type"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Type);
	}

	@Then("Select valid form status {string} in ACH Form")
	public void select_valid_form_status_in_ach_form(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("status")));
		ele = driver.findElement(By.name("status"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}

	@Then("Select valid installer name {string} in ACH Form")
	public void select_valid_installer_name_in_ach_form(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("installer")));
		ele = driver.findElement(By.name("installer"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Enter valid username {string} in searchbox in ACH Form")
	public void enter_valid_username_in_searchbox_in_ach_form(String Username) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Username);
	}

	@Then("Click edit button in ACH Form")
	public void click_edit_button_in_ach_form() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click view log button in ACH Form")
	public void click_view_log_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='View Log']")));
		ele = driver.findElement(By.xpath("//span[text()='View Log']"));
		ele.click();
	}

	@Then("Click close button in ACH Form")
	public void click_close_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click actions button in ACH Form")
	public void click_actions_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click edit ACH Form in ACH Form")
	public void click_edit_ach_form_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit ACH Form']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit ACH Form']"));
		ele.click();
	}

	@Then("Click update button in edit ACH form details")
	public void click_update_button_in_edit_ach_form_details() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Click robot checkbox in ACH Form")
	public void click_robot_checkbox_in_ach_form() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[1]/div/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[1]/div/div/div/input"));
		ele.click();
	}

	@Then("Click agree checkbox in ACH Form")
	public void click_agree_checkbox_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[2]/div/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[2]/div/div/div/input"));
		ele.click();
	}

	@Then("Click ACH payment checkbox in ACH form")
	public void click_ach_payment_checkbox_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[3]/div/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[3]/div/div/div/input"));
		ele.click();
	}

	@Then("Click update button in ACH form")
	public void click_update_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check mandatory alert message displayed or not in ACH Form")
	public void check_mandatory_alert_message_displayed_or_not_in_ach_form() {
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

	@Then("Click back button in ACH form")
	public void click_back_button_in_ach_form() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[text()='Back']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Back']")));
		ele = driver.findElement(By.xpath("//button[text()='Back']"));
		ele.click();
	}

	@Then("Enter valid bank name {string} in ACH Form")
	public void enter_valid_bank_name_in_ach_form(String BankName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("bankname")));
		ele = driver.findElement(By.name("bankname"));
		ele.sendKeys(BankName);
	}

	@Then("Enter valid bank account number {string} in ACH Form")
	public void enter_valid_bank_account_number_in_ach_form(String bankaccountnumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("bankaccountnumber")));
		ele = driver.findElement(By.name("bankaccountnumber"));
		ele.sendKeys(bankaccountnumber);
	}

	@Then("Enter valid bank routing number {string} in ACH Form")
	public void enter_valid_bank_routing_number_in_ach_form(String bankroutingnumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("bankroutingnumber")));
		ele = driver.findElement(By.name("bankroutingnumber"));
		ele.sendKeys(bankroutingnumber);
	}

	@Then("Select valid date in Effective from in ACH Form")
	public void select_valid_date_in_effective_from_in_ach_form() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Effectivefrom")));
		ele = driver.findElement(By.name("Effectivefrom"));
		String text = ele.getAttribute("value");
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
		Thread.sleep(2000);
		// for close the pop up need to click above the pop up
		ele1 = driver.findElement(By.name("banklocation"));
		ele1.click();
	}

	@Then("Click start payment button in action")
	public void click_start_payment_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Start Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Start Payment']"));
		ele.click();
	}

	@Then("Select valid reason {string} in start payments")
	public void select_valid_reason_in_start_payments(String Reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Reason")));
		ele = driver.findElement(By.name("Reason"));
		ele.sendKeys(Reason);
	}

	@Then("Click the checkox in start payments")
	public void click_the_checkox_in_start_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm")));
		ele = driver.findElement(By.name("confirm"));
		ele.click();
	}

	@Then("Click start payment button in start payments")
	public void click_start_payment_button_in_start_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Start Payment']")));
		ele = driver.findElement(By.xpath("//button[text()=' Start Payment']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in start payments")
	public void check_success_message_is_displayed_or_not_in_start_payments() {
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

	@Then("Select valid start from in start payments")
	public void select_valid_start_from_in_start_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Select valid pay date {string} in ACH Form")
	public void select_valid_pay_date_in_ach_form(String PayDate) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("paydate")));
		ele = driver.findElement(By.name("paydate"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PayDate);
	}

	@Then("Select valid CGI Deposit account {string} in ACH Form")
	public void select_valid_cgi_deposit_account_in_ach_form(String depositaccount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("depositaccount")));
		ele = driver.findElement(By.name("depositaccount"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(depositaccount);
	}

	@Then("Click uploaded file in ACH Form")
	public void click_uploaded_file_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cursor-pointer mb-1']")));
		ele = driver.findElement(By.xpath("//div[@class='cursor-pointer mb-1']"));
		ele.click();
	}

	@Then("Click send to customer button in action")
	public void click_send_to_customer_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Send to Customer']")));
		ele = driver.findElement(By.xpath("//div[text()='Send to Customer']"));
		ele.click();
	}

	@Then("Click Send button in send to customer")
	public void click_send_button_in_send_to_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-sm text-end']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm text-end']"));
		ele.click();
	}

	@Then("Click Resend button in send to customer")
	public void click_resend_button_in_send_to_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-sm text-end']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm text-end']"));
		ele.click();
	}

	@Then("Click send to sales person button in action")
	public void click_send_to_sales_person_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Send to Sales Person']")));
		ele = driver.findElement(By.xpath("//div[text()='Send to Sales Person']"));
		ele.click();
	}

	@Then("Click Send button in send to sales person")
	public void click_send_button_in_send_to_sales_person() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[8]/button")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[8]/button"));
		ele.click();
	}

	@Then("Click Resend button in send to sales person")
	public void click_resend_button_in_send_to_sales_person() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[8]/button")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[8]/button"));
		ele.click();
	}

	@Then("Click change pay date button in action")
	public void click_change_pay_date_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Change Pay Date']")));
		ele = driver.findElement(By.xpath("//div[text()='Change Pay Date']"));
		ele.click();
	}

	@Then("Click change pay date button in ACH Form")
	public void click_change_pay_date_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Change Pay Date']")));
		ele = driver.findElement(By.xpath("//button[text()='Change Pay Date']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in change pay date")
	public void check_mandatory_message_is_displayed_or_not_in_change_pay_date() {
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

	@Then("Click actions button in change pay date")
	public void click_actions_button_in_change_pay_date() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in change pay date")
	public void click_back_button_in_change_pay_date() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid date in effective from in change pay date")
	public void select_valid_date_in_effective_from_in_change_pay_date() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Select valid pay date {string} in change pay date")
	public void select_valid_pay_date_in_change_pay_date(String PayDate) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PayDate);
	}

	@Then("Check success message is displayed or not in change pay date")
	public void check_success_message_is_displayed_or_not_in_change_pay_date() {
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

	@Then("Click stop payment button in action")
	public void click_stop_payment_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Stop Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Stop Payment']"));
		ele.click();
	}

	@Then("Click the agree checbox in stop payments")
	public void click_the_agree_checbox_in_stop_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm")));
		ele = driver.findElement(By.name("confirm"));
		ele.click();
	}

	@Then("Click stop payment button in stop payments")
	public void click_stop_payment_button_in_stop_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Stop Payment']")));
		ele = driver.findElement(By.xpath("//button[text()=' Stop Payment']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in stop payments")
	public void check_mandatory_message_is_displayed_or_not_in_stop_payments() {
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

	@Then("Click the action button in stop payments")
	public void click_the_action_button_in_stop_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in stop payments")
	public void click_back_button_in_stop_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid effective from month in stop payments")
	public void select_valid_effective_from_month_in_stop_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("stopsfrom")));
		ele = driver.findElement(By.name("stopsfrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid reason {string} in stop payments")
	public void enter_valid_reason_in_stop_payments(String reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Reason")));
		ele = driver.findElement(By.name("Reason"));
		ele.sendKeys(reason);
	}

	@Then("Check success message is displayed or not in stop payments")
	public void check_success_message_is_displayed_or_not_in_stop_payments() {
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

	@Then("Click skip payment button in action")
	public void click_skip_payment_button_in_action() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Skip Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Skip Payment']"));
		ele.click();
	}

	@Then("Click the agree checbox in skip payments")
	public void click_the_agree_checbox_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm")));
		ele = driver.findElement(By.name("confirm"));
		ele.click();
	}

	@Then("Click skip payment button in skip payments")
	public void click_skip_payment_button_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Skip Payment']")));
		ele = driver.findElement(By.xpath("//button[text()='Skip Payment']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in skip payments")
	public void check_mandatory_message_is_displayed_or_not_in_skip_payments() {
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

	@Then("Click the action button in skip payments")
	public void click_the_action_button_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in skip payments")
	public void click_back_button_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid start month in skip payments")
	public void select_valid_start_month_in_skip_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("startmonth")));
		ele = driver.findElement(By.name("startmonth"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Select valid end month in skip payments")
	public void select_valid_end_month_in_skip_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("endmonth")));
		ele = driver.findElement(By.name("endmonth"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(2);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid reason {string} in skip payments")
	public void enter_valid_reason_in_skip_payments(String reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reason")));
		ele = driver.findElement(By.name("reason"));
		ele.sendKeys(reason);
	}

	@Then("Check success message is displayed or not in skip payments")
	public void check_success_message_is_displayed_or_not_in_skip_payments() {
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

	@Then("Click change monthly pay button in ACH Form")
	public void click_change_monthly_pay_button_in_ach_form() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change Monthly Pay']")));
		ele = driver.findElement(By.xpath("//a[text()='Change Monthly Pay']"));
		ele.click();
	}

	@Then("Enter valid monthly pay {string} in Edit Monthly Payments")
	public void enter_valid_monthly_pay_in_edit_monthly_payments(String monthlypay) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("monthlypay")));
		ele = driver.findElement(By.name("monthlypay"));
		ele.sendKeys(monthlypay);
	}

	@Then("Select valid effective from month in Edit Monthly Payments")
	public void select_valid_effective_from_month_in_edit_monthly_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid reason {string} in Edit Monthly Payments")
	public void enter_valid_reason_in_edit_monthly_payments(String reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reason")));
		ele = driver.findElement(By.name("reason"));
		ele.sendKeys(reason);
	}

	@Then("Click save button in Edit Monthly Payments")
	public void click_save_button_in_edit_monthly_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in Edit Monthly Payments")
	public void check_success_message_is_displayed_or_not_in_edit_monthly_payments() {
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

	@Then("Click ACH Form upload button")
	public void click_ach_form_upload_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH Upload']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH Upload']"));
		ele.click();
	}

	@Then("Click sample file button in ACH Form upload")
	public void click_sample_file_button_in_ach_form_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sample File']")));
		ele = driver.findElement(By.xpath("//a[text()='Sample File']"));
		ele.click();
	}

	@Then("Click ACH form setup button in ACH Form upload")
	public void click_ach_form_setup_button_in_ach_form_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='ACH Form Setup']")));
		ele = driver.findElement(By.xpath("//button[text()='ACH Form Setup']"));
		ele.click();
	}

	@Then("Check page landed to ACH Form page or not")
	public void check_page_landed_to_ach_form_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='ACH Form']")));
		ele = driver.findElement(By.xpath("//li[text()='ACH Form']"));
		String ActualText = ele.getText();
		String ExpectedText = "ACH Form";
		if (ActualText.equals(ExpectedText)) {
			System.out.println("Page landed to ACH Form Page");
		} else {
			System.out.println("Page doesnot landed to ACH Form Page");
		}
	}

	@Then("Click submit button in ACH Form upload")
	public void click_submit_button_in_ach_form_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		ele = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele.click();
	}

	@Then("Check error toast message is displayed or not in ACH Form Upload")
	public void check_error_toast_message_is_displayed_or_not_in_ach_form_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Choose a file']")));
		ele = driver.findElement(By.xpath("//div[text()='Choose a file']"));
		String text = ele.getText();
		if (ele.isDisplayed()) {
			System.out.println("Error toast displayed like: " + text);
		} else {
			System.out.println("Error toast is not displayed");
		}
	}

	@Then("Select valid tail {string} in ACH Form upload")
	public void select_valid_tail_in_ach_form_upload(String Installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("installer")));
		ele = driver.findElement(By.id("installer"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Installer);
	}

	@Then("Upload valid file in ACH Form upload")
	public void upload_valid_file_in_ach_form_upload() throws InterruptedException, AWTException {
		Thread.sleep(2000);
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

	@Then("Check success message is displayed or not in ACH Form Upload")
	public void check_success_message_is_displayed_or_not_in_ach_form_upload() {
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

	@Then("Click download button in ACH Form Upload")
	public void click_download_button_in_ach_form_upload() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center cursor-pointer']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center cursor-pointer']"));
		ele.click();
	}

	@Then("Click Invoice Pay button")
	public void click_invoice_pay_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Invoice Pay']")));
		ele = driver.findElement(By.xpath("//span[text()='Invoice Pay']"));
		ele.click();
	}

	@Then("Select valid type {string} in Invoice pay")
	public void select_valid_type_in_invoice_pay(String type) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("type")));
		ele = driver.findElement(By.name("type"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(type);
	}

	@Then("Select valid installer {string} in Invoice pay")
	public void select_valid_installer_in_invoice_pay(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("installer")));
		ele = driver.findElement(By.name("installer"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Enter valid username {string} in Invoice pay")
	public void enter_valid_username_in_invoice_pay(String Username) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Username);
	}

	@Then("Click edit button in Invoice pay")
	public void click_edit_button_in_invoice_pay() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='text-dark   fs-6 cursor-pointer ']")));
		ele = driver.findElement(By.xpath("//a[@class='text-dark   fs-6 cursor-pointer ']"));
		ele.click();
	}

	@Then("Click actions button in Invoice pay")
	public void click_actions_button_in_invoice_pay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click edit payments in Invoice pay")
	public void click_edit_payments_in_invoice_pay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit Payment']"));
		ele.click();
	}

	@Then("Click back button in edit payments")
	public void click_back_button_in_edit_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Back']")));
		ele = driver.findElement(By.xpath("//button[text()='Back']"));
		ele.click();
	}

	@Then("Clear the customer name in edit payments")
	public void clear_the_customer_name_in_edit_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("customername")));
		ele = driver.findElement(By.name("customername"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
	}

	@Then("Check success message is displayed or not in edit payments")
	public void check_success_message_is_displayed_or_not_in_edit_payments() {
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

	@Then("Click robot checkbox in edit payments")
	public void click_robot_checkbox_in_edit_payments() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[1]/div/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[1]/div/div/div/input"));
		ele.click();
	}

	@Then("Click agree checkbox in edit payments")
	public void click_agree_checkbox_in_edit_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[2]/div/div/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[2]/div/div/div/input"));
		ele.click();
	}

	@Then("Click update button in edit payments")
	public void click_update_button_in_edit_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in edit payments")
	public void check_mandatory_message_is_displayed_or_not_in_edit_payments() {
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

	@Then("Modify valid details in edit payments")
	public void modify_valid_details_in_edit_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("customername")));
		ele = driver.findElement(By.name("customername"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click change invoice date in Invoice pay")
	public void click_change_invoice_date_in_invoice_pay() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Change Invoice Date']")));
		ele = driver.findElement(By.xpath("//div[text()='Change Invoice Date']"));
		ele.click();
	}

	@Then("Click change pay date button in change invoice date")
	public void click_change_pay_date_button_in_change_invoice_date() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Change Pay Date']")));
		ele = driver.findElement(By.xpath("//button[text()='Change Pay Date']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in change invoice date")
	public void check_mandatory_message_is_displayed_or_not_in_change_invoice_date() {
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

	@Then("Click actions button in change invoice date")
	public void click_actions_button_in_change_invoice_date() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in change invoice date")
	public void click_back_button_in_change_invoice_date() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid effective from date in change invoice date")
	public void select_valid_effective_from_date_in_change_invoice_date() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("effectivefrom")));
		ele = driver.findElement(By.name("effectivefrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Select valid pay date {string} in change invoice date")
	public void select_valid_pay_date_in_change_invoice_date(String PayDate) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PayDate);
	}

	@Then("Check success message is displayed or not in change invoice date")
	public void check_success_message_is_displayed_or_not_in_change_invoice_date() {
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

	@Then("Click stop invoice payments in Invoice pay")
	public void click_stop_invoice_payments_in_invoice_pay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Stop Invoice Payments']")));
		ele = driver.findElement(By.xpath("//div[text()='Stop Invoice Payments']"));
		ele.click();
	}

	@Then("Click the checkbox in stop invoice payments")
	public void click_the_checkbox_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm")));
		ele = driver.findElement(By.name("confirm"));
		ele.click();
	}

	@Then("Click Stop Payment button in stop invoice payments")
	public void click_stop_payment_button_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Stop Payment']")));
		ele = driver.findElement(By.xpath("//button[text()='Stop Payment']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in stop invoice payments")
	public void check_mandatory_message_is_displayed_or_not_in_stop_invoice_payments() {
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

	@Then("Click actions button in stop invoice payments")
	public void click_actions_button_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in stop invoice payments")
	public void click_back_button_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Select valid effective from date in stop invoice payments")
	public void select_valid_effective_from_date_in_stop_invoice_payments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("stopsfrom")));
		ele = driver.findElement(By.name("stopsfrom"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		Thread.sleep(2000);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid reason {string} in stop invoice payments")
	public void enter_valid_reason_in_stop_invoice_payments(String reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Reason")));
		ele = driver.findElement(By.name("Reason"));
		ele.sendKeys(reason);
	}

	@Then("Check success message is displayed or not in stop invoice payments")
	public void check_success_message_is_displayed_or_not_in_stop_invoice_payments() {
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

	@Then("Click quick book upload in Invoice pay")
	public void click_quick_book_upload_in_invoice_pay() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Quick Book Upload']")));
		ele = driver.findElement(By.xpath("//div[text()='Quick Book Upload']"));
		ele.click();
	}

	@Then("Click sample file button in invoice log upload")
	public void click_sample_file_button_in_invoice_log_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sample File']")));
		ele = driver.findElement(By.xpath("//a[text()='Sample File']"));
		ele.click();
	}

	@Then("Click submit button in invoice log upload")
	public void click_submit_button_in_invoice_log_upload() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		ele = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed ot not in invoice log upload")
	public void check_mandatory_message_is_displayed_ot_not_in_invoice_log_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No Alert message is displayed");
		}
	}

	@Then("Upload valid file in invoice log upload")
	public void upload_valid_file_in_invoice_log_upload() throws InterruptedException, AWTException {
		Thread.sleep(2000);
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

	@Then("Check success message is displayed ot not in invoice log upload")
	public void check_success_message_is_displayed_ot_not_in_invoice_log_upload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click skip payments in stop invoice payments")
	public void click_skip_payments_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Skip Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Skip Payment']"));
		ele.click();
	}

	@Then("Click agree button checkbox in stop invoice payments")
	public void click_agree_button_checkbox_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("confirm")));
		ele = driver.findElement(By.name("confirm"));
		ele.click();
	}

	@Then("Click skip payment button in stop invoice payments")
	public void click_skip_payment_button_in_stop_invoice_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Skip Payment']")));
		ele = driver.findElement(By.xpath("//button[text()='Skip Payment']"));
		ele.click();
	}

	@Then("Click actions button in skip payments")
	public void click_actions_button_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Enter valid reason in Skip Payments")
	public void enter_valid_reason_in_skip_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("reason")));
		ele = driver.findElement(By.name("reason"));
		ele.sendKeys("Test");
	}

	@Then("Click change pay date in invoice date tab")
	public void click_change_pay_date_in_invoice_date_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change Pay Date']")));
		ele = driver.findElement(By.xpath("//a[text()='Change Pay Date']"));
		ele.click();
	}

	@Then("Check page landed to change pay date page or not")
	public void check_page_landed_to_change_pay_date_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Change Pay Date']")));
		ele = driver.findElement(By.xpath("//h3[text()='Change Pay Date']"));
		String ActualText = ele.getText();
		String ExpectedText = "Change Pay Date";
		if (ActualText.equals(ExpectedText)) {
			System.out.println("Page landed to change pay date page");
		} else {
			System.out.println("Page doesnot landed to change pay date page");
		}
	}

	@Then("Click change monthly pay in invoice date tab")
	public void click_change_monthly_pay_in_invoice_date_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Change Monthly Pay']")));
		ele = driver.findElement(By.xpath("//a[text()='Change Monthly Pay']"));
		ele.click();
	}

	@Then("Click Start Invoice Payments button in action")
	public void click_start_invoice_payments_button_in_action() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Start Invoice Payments']")));
		ele = driver.findElement(By.xpath("//div[text()='Start Invoice Payments']"));
		ele.click();
	}

	@Then("Check page landed to Edit Monthly Payments page or not")
	public void check_page_landed_to_edit_monthly_payments_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[text()='Edit Monthly Payments']")));
		ele = driver.findElement(By.xpath("//h2[text()='Edit Monthly Payments']"));
		String ActualText = ele.getText();
		String ExpectedText = "Change Pay Date";
		if (ActualText.equals(ExpectedText)) {
			System.out.println("Page landed to change pay date page");
		} else {
			System.out.println("Page doesnot landed to change pay date page");
		}
	}

	@Then("Click Create Invoice button")
	public void click_create_invoice_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Invoice']")));
		ele = driver.findElement(By.xpath("//span[text()='Create Invoice']"));
		ele.click();
	}

	@Then("Select valid installer {string} in Create Invoice")
	public void select_valid_installer_in_create_invoice(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("installer")));
		ele = driver.findElement(By.name("installer"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Select valid type {string} in Create Invoice")
	public void select_valid_type_in_create_invoice(String type) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("type")));
		ele = driver.findElement(By.name("type"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(type);
	}

	@Then("Enter valid user name {string} in Create Invoice")
	public void enter_valid_user_name_in_create_invoice(String Username) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-350px ps-14 h-35px']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-350px ps-14 h-35px']"));
		ele.sendKeys(Username);
	}

	@Then("Click edit button in create invoice")
	public void click_edit_button_in_create_invoice() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click outstanding months radio button in create invoice")
	public void click_outstanding_months_radio_button_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input'][@name='yes']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input'][@name='yes']"));
		ele.click();
	}

	@Then("Click the checkbox in create invoice")
	public void click_the_checkbox_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/table/thead/tr/th[5]/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/table/thead/tr/th[5]/div/input"));
		ele.click();
	}

	@Then("Click save button in create invoice")
	public void click_save_button_in_create_invoice() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in create invoice")
	public void check_success_message_is_displayed_or_not_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click the first checkbox in create invoice")
	public void click_the_first_checkbox_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/table/tbody/tr[1]/td[5]/div/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/div[1]/table/tbody/tr[1]/td[5]/div/input"));
		ele.click();
	}

	@Then("Click manual entry radio button in create invoice")
	public void click_manual_entry_radio_button_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input'][@name='no']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input'][@name='no']"));
		ele.click();
	}

	@Then("Click save button in manual entry in create invoice")
	public void click_save_button_in_manual_entry_in_create_invoice() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
		ele = driver.findElement(By.xpath("//span[text()='Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in manual entry in create invoice")
	public void check_mandatory_message_is_displayed_or_not_in_manual_entry_in_create_invoice() {
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

	@Then("Select valid due month in add line item in manual entry")
	public void select_valid_due_month_in_add_line_item_in_manual_entry() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("duemonth")));
		ele = driver.findElement(By.name("duemonth"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid description {string} in add line item in manual entry")
	public void enter_valid_description_in_add_line_item_in_manual_entry(String Username) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='description']")));
		ele = driver.findElement(By.xpath("//input[@name='description']"));
		ele.click();
		ele.sendKeys(Username);
	}

	@Then("Enter valid Amount {string} in add line item in manual entry")
	public void enter_valid_amount_in_add_line_item_in_manual_entry(String amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("amount")));
		ele = driver.findElement(By.name("amount"));
		ele.sendKeys(amount);
	}

	@Then("Click clear button in manual entry in create invoice")
	public void click_clear_button_in_manual_entry_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in manual entry in create invoice")
	public void check_success_message_is_displayed_or_not_in_manual_entry_in_create_invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click delete button in add line items")
	public void click_delete_button_in_add_line_items() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[5]/span/a/img")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[5]/span/a/img"));
		ele.click();
	}

	@Then("Click preview invoice button in add line items")
	public void click_preview_invoice_button_in_add_line_items() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Preview Invoice']")));
		ele = driver.findElement(By.xpath("//button[text()='Preview Invoice']"));
		ele.click();
	}

	@Then("Click edit button in Invoice Month tab in preview invoice page")
	public void click_edit_button_in_invoice_month_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//i[@class='fa fa-edit w-30px ms-5 cursor-pointer'][@title='Click here to change Invoice Name']")));
		ele = driver.findElement(By.xpath(
				"//i[@class='fa fa-edit w-30px ms-5 cursor-pointer'][@title='Click here to change Invoice Name']"));
		ele.click();
	}

	@Then("Click close button in Invoice Month tab in preview invoice page")
	public void click_close_button_in_invoice_month_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click edit button in Due Date tab in preview invoice page")
	public void click_edit_button_in_due_date_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//i[@class='fa fa-edit w-30px ms-5 cursor-pointer'][@title='Click here to change due date']")));
		ele = driver.findElement(By
				.xpath("//i[@class='fa fa-edit w-30px ms-5 cursor-pointer'][@title='Click here to change due date']"));
		ele.click();
	}

	@Then("Click close button in Due Date tab in preview invoice page")
	public void click_close_button_in_due_date_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click send invoice button in preview invoice page")
	public void click_send_invoice_button_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send Invoice']")));
		ele = driver.findElement(By.xpath("//button[text()='Send Invoice']"));
		ele.click();
	}

	@Then("Check confirmation message is displayed or not in preview invoice page")
	public void check_confirmation_message_is_displayed_or_not_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ant-modal-content']")));
		ele = driver.findElement(By.xpath("//div[@class='ant-modal-content']"));
		if (ele.isDisplayed()) {
			System.out.println("Page shows confirmation pop up");
		} else {
			System.out.println("Page doesnot shows confirmation pop up");
		}
	}

	@Then("Click actions button in add line items")
	public void click_actions_button_in_add_line_items() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in add line items")
	public void click_back_button_in_add_line_items() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Clear the details in Invoice Month tab in preview invoice page")
	public void clear_the_details_in_invoice_month_tab_in_preview_invoice_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Notes")));
		ele = driver.findElement(By.name("Notes"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}

	@Then("Click submit button in Invoice Month tab in preview invoice page")
	public void click_submit_button_in_invoice_month_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Submit']")));
		ele = driver.findElement(By.xpath("//div[text()='Submit']"));
		ele.click();
	}

	@Then("CHeck mandatory message is displayed or not in preview invoice page")
	public void c_heck_mandatory_message_is_displayed_or_not_in_preview_invoice_page() {
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

	@Then("Modify valid details in Invoice Month tab in preview invoice page")
	public void modify_valid_details_in_invoice_month_tab_in_preview_invoice_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Notes")));
		ele = driver.findElement(By.name("Notes"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("CHeck success message is displayed or not in preview invoice page")
	public void c_heck_success_message_is_displayed_or_not_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click submit button in Due Date tab in preview invoice page")
	public void click_submit_button_in_due_date_tab_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Submit']")));
		ele = driver.findElement(By.xpath("//div[text()='Submit']"));
		ele.click();
	}

	@Then("Modify valid date in Due Date tab in preview invoice page")
	public void modify_valid_date_in_due_date_tab_in_preview_invoice_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-lg form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-lg form-control-solid']"));
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedTomorrow = tomorrow.format(formatter);
		System.out.println(formattedTomorrow);
		Thread.sleep(2000);
		ele.sendKeys(formattedTomorrow);
	}

	@Then("Click Actions button in preview invoice page")
	public void click_actions_button_in_preview_invoice_page() throws InterruptedException {
		Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click back button in preview invoice page")
	public void click_back_button_in_preview_invoice_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click no button in confirmation page")
	public void click_no_button_in_confirmation_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light']"));
		ele.click();
	}

	@Then("Click yes button in confirmation page")
	public void click_yes_button_in_confirmation_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary ms-2']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary ms-2']"));
		ele.click();
	}

	@Then("Click add line item button in line items")
	public void click_add_line_item_button_in_line_items() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='cursor-pointer']")));
		ele = driver.findElement(By.xpath("//a[@class='cursor-pointer']"));
		ele.click();
	}

	@Then("Click Check Payments button")
	public void click_check_payments_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Check Payments']")));
		ele = driver.findElement(By.xpath("//span[text()='Check Payments']"));
		ele.click();
	}

	@Then("Select valid installer {string} in Check Payments")
	public void select_valid_installer_in_check_payments(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='status']")));
		ele = driver.findElement(By.xpath("//select[@name='status']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Enter valid user name {string} in Check Payments")
	public void enter_valid_user_name_in_check_payments(String Username) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14 fs-7']"));
		ele.sendKeys(Username);
	}

	@Then("Click add button in Check Payments")
	public void click_add_button_in_check_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-sm']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']"));
		ele.click();
	}

	@Then("Click search button in Check Payments")
	public void click_search_button_in_check_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-md']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in filter page")
	public void check_mandatory_message_is_displayed_or_not_in_filter_page() {
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

	@Then("Select valid installer {string} in filter page")
	public void select_valid_installer_in_filter_page(String installer) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(installer);
	}

	@Then("Enter valid customer name {string} in filter page")
	public void enter_valid_customer_name_in_filter_page(String customerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		ele.sendKeys(customerName);
	}

	@Then("Click the robot checkbox in add check payments page")
	public void click_the_robot_checkbox_in_add_check_payments_page() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input cursor-pointer']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input cursor-pointer']"));
		ele.click();
	}

	@Then("Click save button in add check payments page")
	public void click_save_button_in_add_check_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-primary'][@title='Click here to Save']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary'][@title='Click here to Save']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in add check payments page")
	public void check_mandatory_message_is_displayed_or_not_in_add_check_payments_page() {
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

	@Then("Click back button in add check payments page")
	public void click_back_button_in_add_check_payments_page() throws InterruptedException {
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light me-3 btn-md']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-light me-3 btn-md']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light me-3 btn-md']"));
		Thread.sleep(2000);
		ele.click();
	}

	@Then("Upload valid file in attack check tab")
	public void upload_valid_file_in_attack_check_tab() throws InterruptedException, AWTException {
		Thread.sleep(2000);
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

	@Then("Click the attached file in attack check tab")
	public void click_the_attached_file_in_attack_check_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cursor-pointer mb-1 text-primary']")));
		ele = driver.findElement(By.xpath("//div[@class='cursor-pointer mb-1 text-primary']"));
		ele.click();
	}

	@Then("Click add due month button in deposit details tab")
	public void click_add_due_month_button_in_deposit_details_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add due month']")));
		ele = driver.findElement(By.xpath("//a[text()='Add due month']"));
		ele.click();
	}

	@Then("Click add to list button in add due month")
	public void click_add_to_list_button_in_add_due_month() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary bt-sm']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary bt-sm']"));
		ele.click();
	}

	@Then("Click close button in add due month")
	public void click_close_button_in_add_due_month() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in add due month")
	public void check_mandatory_message_is_displayed_or_not_in_add_due_month() {
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

	@Then("Select valid due month in add due month")
	public void select_valid_due_month_in_add_due_month() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
        String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		ele.sendKeys(formattedNextMonth);
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		ele.sendKeys(Keys.TAB);
		String currentYear = String.valueOf(LocalDate.now().getYear());
		System.out.println("Current Year: " + currentYear);
		ele.sendKeys(currentYear);
	}

	@Then("Check success message is displayed or not in add due month")
	public void check_success_message_is_displayed_or_not_in_add_due_month() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}
	@Then("Enter valid number {string} in check number tab in check details")
	public void enter_valid_number_in_check_number_tab_in_check_details(String number) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.name("check")));
		ele = driver.findElement(By.name("check"));
		ele.sendKeys(number);
	}
	@Then("Select valid date in check date tab in check details")
	public void select_valid_date_in_check_date_tab_in_check_details() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='checkdate']")));
		ele = driver.findElement(By.xpath("//input[@name='checkdate']"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedTomorrow = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedTomorrow);
		Thread.sleep(2000);
		ele.sendKeys(formattedTomorrow);
	}
	@Then("Enter valid amount {string} in check amount tab in check details")
	public void enter_valid_amount_in_check_amount_tab_in_check_details(String amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.name("amount")));
		ele = driver.findElement(By.name("amount"));
		ele.sendKeys(amount);
	}
	@Then("Select valid type {string} in account type in bank details")
	public void select_valid_type_in_account_type_in_bank_details(String amounttype) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("amounttype")));
		ele = driver.findElement(By.name("amounttype"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(amounttype);
	}
	@Then("Enter valid name {string} in name on account tab in bank details")
	public void enter_valid_name_in_name_on_account_tab_in_bank_details(String nameaccount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.name("nameaccount")));
		ele = driver.findElement(By.name("nameaccount"));
		ele.sendKeys(nameaccount);
	}
	@Then("Enter valid number {string} in bank account number tab in bank details")
	public void enter_valid_number_in_bank_account_number_tab_in_bank_details(String bankaccountnumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.name("bankaccountnumber")));
		ele = driver.findElement(By.name("bankaccountnumber"));
		ele.sendKeys(bankaccountnumber);
	}
	@Then("Enter valid number {string} in bank routing number tab in bank details")
	public void enter_valid_number_in_bank_routing_number_tab_in_bank_details(String bankroutingnumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.name("bankroutingnumber")));
		ele = driver.findElement(By.name("bankroutingnumber"));
		ele.sendKeys(bankroutingnumber);
	}
	@Then("Select valid account {string} CGI Deposit account in deposit details tab")
	public void select_valid_account_cgi_deposit_account_in_deposit_details_tab(String depositaccount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("depositaccount")));
		ele = driver.findElement(By.name("depositaccount"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(depositaccount);
	}
	@Then("Click the robot checkbox in confirmation tab")
	public void click_the_robot_checkbox_in_confirmation_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-check-input cursor-pointer']")));
		ele = driver.findElement(By.xpath("//input[@class='form-check-input cursor-pointer']"));
		ele.click();
	}
	@Then("Check success message is displayed or not in add check payments page")
	public void check_success_message_is_displayed_or_not_in_add_check_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Toastify__toast-body']")));
		ele = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Success message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}
	@Then("Click back button in edit payments page")
	public void click_back_button_in_edit_payments_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-light me-3 btn-md']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light me-3 btn-md']"));
		ele.click();
	}
	@Then("Click edit button in check payments page")
	public void click_edit_button_in_check_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By
				.xpath("//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}
	@Then("Clear the data in check number field")
	public void clear_the_data_in_check_number_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.name("check")));
		ele = driver.findElement(By.name("check"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		
	}
	@Then("Click update button in edit payments page")
	public void click_update_button_in_edit_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='btn btn-primary'][@title='Click here to Update']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary'][@title='Click here to Update']"));
		ele.click();
	}
	@Then("Click add due month button in check payments page")
	public void click_add_due_month_button_in_check_payments_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add due month']")));
		ele = driver.findElement(By.xpath("//a[text()='Add due month']"));
		ele.click();
	}
	@Then("Select june month in check payments page")
	public void select_june_month_in_check_payments_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate june2024 = LocalDate.of(2024, 6, 1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
        String formattedNextMonth = june2024.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		ele.sendKeys(formattedNextMonth);
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		ele.sendKeys(Keys.TAB);
		String currentYear = String.valueOf(LocalDate.now().getYear());
		System.out.println("Current Year: " + currentYear);
		ele.sendKeys(currentYear);
	}
	@Then("Check error toast message is displayed or not in check payments page")
	public void check_error_toast_message_is_displayed_or_not_in_check_payments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-danger text-center mt-2']")));
		ele = driver.findElement(By.xpath("//div[@class='text-danger text-center mt-2']"));
		String text = ele.getText();
		System.out.println("Error toast displayed like: "+text);
	}
	@Then("Click the uploaded file in attach check tab")
	public void click_the_uploaded_file_in_attach_check_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cursor-pointer mb-1 text-primary']")));
		ele = driver.findElement(By.xpath("//div[@class='cursor-pointer mb-1 text-primary']"));
		ele.click();
	}
	@Then("Modify valid detail in check payments page")
	public void modify_valid_detail_in_check_payments_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("check")));
		ele = driver.findElement(By.name("check"));
		String text = ele.getAttribute("value");
		int length = text.length();
		System.out.println(text);
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

}