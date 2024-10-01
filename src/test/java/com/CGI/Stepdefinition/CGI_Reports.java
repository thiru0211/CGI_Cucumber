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

public class CGI_Reports {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Reports User is navigating to CGI URL is {string}")
	public void to_check_Reports_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Reports User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Reports")
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

	@Then("Close the Reports Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Reports button")
	public void click_the_Timesheet_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Reports']")));
		ele = driver.findElement(By.xpath("//span[text()='Reports']"));
		ele.click();
	}

	@And("Click OS Report button")
	public void click_OS_Report_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='OS Report']")));
		ele = driver.findElement(By.xpath("//span[text()='OS Report']"));
		ele.click();
	}

	@Then("Select valid from month in OS Reports page")
	public void select_valid_from_month_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Select valid installer name {string} in OS Reports page")
	public void select_valid_installer_name_in_os_reports_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[3]/select")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[3]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid payment method {string} in OS Reports page")
	public void select_valid_payment_method_in_os_reports_page(String PaymentMethod) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[4]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[4]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentMethod);
	}

	@Then("Select valid payment status {string} in OS Reports page")
	public void select_valid_payment_status_in_os_reports_page(String PaymentStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[5]/select")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[5]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentStatus);
	}

	@Then("Enter valid customer name {string} in OS Reports page")
	public void enter_valid_customer_name_in_os_reports_page(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid  ps-14']"));
		ele.sendKeys(CustomerName);
	}

	@Then("Click view button of the customer in OS Reports page")
	public void click_view_button_of_the_customer_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[@class='svg-icon svg-icon-2 svg-icon-danger']")));
		ele = driver.findElement(By.xpath("//span[@class='svg-icon svg-icon-2 svg-icon-danger']"));
		ele.click();
	}

	@Then("Click export button in OS Reports page")
	public void click_export_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary  btn-sm ']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary  btn-sm ']"));
		ele.click();
	}

	@Then("Click view log button in OS Reports page")
	public void click_view_log_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='View Log']")));
		ele = driver.findElement(By.xpath("//a[text()='View Log']"));
		ele.click();
	}

	@Then("Click close button in view log report")
	public void click_close_button_in_view_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click action button in OS Reports page")
	public void click_action_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click add recieved payments button in OS Reports page")
	public void click_add_recieved_payments_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Recieved Payments']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Recieved Payments']"));
		ele.click();
	}

	@Then("Click action button in Add Received Payments")
	public void click_action_button_in_add_received_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click add payment option in Add Received Payments")
	public void click_add_payment_option_in_add_received_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Payment']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Payment']"));
		ele.click();
	}

	@Then("Click close button in Add Received Payments popup")
	public void click_close_button_in_add_received_payments_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click submit button in Add Received Payments popup")
	public void click_submit_button_in_add_received_payments_popup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		ele = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele.click();
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Add Received Payments")
	public void check_mandatory_message_is_displayed_or_not_in_add_received_payments() throws InterruptedException {
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

	@Then("Select valid due month in Add Received Payments popup")
	public void select_valid_due_month_in_add_received_payments_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
		String previousMonthString = currentDate.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
		ele.sendKeys(Keys.ENTER);
	}

	@Then("Select valid transcation date in Add Received Payments popup")
	public void select_valid_transcation_date_in_add_received_payments_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("TransactionDate")));
		ele = driver.findElement(By.name("TransactionDate"));
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = currentDate.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Enter valid Transaction Description {string} in Add Received Payments popup")
	public void enter_valid_transaction_description_in_add_received_payments_popup(String TransactionDescription) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Transactiondescription")));
		ele = driver.findElement(By.name("Transactiondescription"));
		ele.sendKeys(TransactionDescription);
	}

	@Then("Enter valid amount {string} in Add Received Payments popup")
	public void enter_valid_amount_in_add_received_payments_popup(String Amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Amount")));
		ele = driver.findElement(By.name("Amount"));
		ele.sendKeys(Amount);
	}

	@Then("Select valid payment option {string} in Add Received Payments popup")
	public void select_valid_payment_option_in_add_received_payments_popup(String PaymentOption) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("credit")));
		ele = driver.findElement(By.name("credit"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentOption);
	}

	@Then("Select valid mode of payment {string} in Add Received Payments popup")
	public void select_valid_mode_of_payment_in_add_received_payments_popup(String ACHdropdown) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ACHdropdown")));
		ele = driver.findElement(By.name("ACHdropdown"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(ACHdropdown);
	}

	@Then("Click clear button in Add Received Payments popup")
	public void click_clear_button_in_add_received_payments_popup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in Add Received Payments")
	public void check_success_message_is_displayed_or_not_in_add_received_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click edit button in Add Received Payments")
	public void click_edit_button_in_add_received_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center cursor-pointer']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center cursor-pointer']"));
		ele.click();
	}

	@Then("Check description details is cleared or not in edit Received Payments popup")
	public void check_description_details_is_cleared_or_not_in_edit_received_payments_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Transactiondescription")));
		ele = driver.findElement(By.name("Transactiondescription"));
		String Text = ele.getAttribute("value");
		if (Text.isEmpty()) {
			System.out.println("Data is cleared in the textbox");
		} else {
			System.out.println("Data is not cleared in the textbox");
		}
	}

	@Then("Click submit button in edit Received Payments popup")
	public void click_update_button_in_edit_received_payments_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		ele = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele.click();
		ele.click();
	}

	@Then("Click submit button in edit Received Payment popup")
	public void click_update_button_in_edit_received_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
		ele = driver.findElement(By.xpath("//button[text()='Submit']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in edit Received Payments")
	public void check_mandatory_message_is_displayed_or_not_in_edit_received_payments() {
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

	@Then("Modify valid details in edit Received Payments popup")
	public void modify_valid_details_in_edit_received_payments_popup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Transactiondescription")));
		ele = driver.findElement(By.name("Transactiondescription"));
		String Text = ele.getAttribute("value");
		int length = Text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(Text);
	}

	@Then("Check success message is displayed or not in edit Received Payments popup")
	public void check_success_message_is_displayed_or_not_in_edit_received_payments_popup()
			throws InterruptedException {
		Thread.sleep(2000);
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

	@Then("Click delete button in add recieved payments")
	public void click_delete_button_in_add_recieved_payments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center cursor-pointer']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center cursor-pointer']"));
		ele.click();
	}

	@Then("Click Add Manual Pay button in OS Reports page")
	public void click_add_manual_pay_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Manual Pay']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Manual Pay']"));
		ele.click();
	}

	@Then("Click close button in manual payment popup")
	public void click_close_button_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click save button in manual payment popup")
	public void click_save_button_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check error toast is displayed or not in manual payment popup")
	public void check_error_toast_is_displayed_or_not_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@style='color: red;']")));
		ele = driver.findElement(By.xpath("//div[@style='color: red;']"));
		String text = ele.getText();
		System.out.println("Error Message is displayed like : " + text);
	}

	@Then("Select valid due month in manual payment popup")
	public void select_valid_due_month_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-lg form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-lg form-control-solid']"));
		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Calculate the next month
		LocalDate nextMonth = currentDate.plusMonths(1);

		// Format the next month in the desired format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
		String formattedNextMonth = nextMonth.format(formatter);

		System.out.println("Next month: " + formattedNextMonth);
		ele.sendKeys(formattedNextMonth);
	}

	@Then("Enter valid monthly pay {string} in manual payment popup")
	public void enter_valid_monthly_pay_in_manual_payment_popup(String Monthlypay) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Monthlypay")));
		ele = driver.findElement(By.name("Monthlypay"));
		ele.sendKeys(Monthlypay);
	}

	@Then("Enter valid reason {string} in manual payment popup")
	public void enter_valid_reason_in_manual_payment_popup(String Reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Reason")));
		ele = driver.findElement(By.name("Reason"));
		ele.sendKeys(Reason);
	}

	@Then("Check success message is displayed or not in manual payment popup")
	public void check_success_message_is_displayed_or_not_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}

	@Then("Click edit button in manual payment popup")
	public void click_edit_button_in_manual_payment_popup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td[12]")));
		ele = driver.findElement(
				By.xpath("html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[3]/td[12]"));
		ele.click();
	}

	@Then("Modify valid details in manual payment popup")
	public void modify_valid_details_in_manual_payment_popup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Monthlypay")));
		ele = driver.findElement(By.name("Monthlypay"));
		String text = ele.getAttribute("value");
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		ele.sendKeys(text);
	}

	@Then("Click update button in manual payment popup")
	public void click_update_button_in_manual_payment_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
		ele.click();
	}

	@Then("Click delete button in manual payment")
	public void click_delete_button_in_manual_payment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}

	@Then("Click back button in OS Reports page")
	public void click_back_button_in_os_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@And("Click Tape Report button")
	public void click_Tape_Report_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tape Report']")));
		ele = driver.findElement(By.xpath("//span[text()='Tape Report']"));
		ele.click();
	}

	@Then("Select valid from month in Tape Reports page")
	public void select_valid_from_month_in_tape_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Select valid installer name {string} in Tape Reports page")
	public void select_valid_installer_name_in_tape_reports_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[3]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[3]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid group name {string} in Tape Reports page")
	public void select_valid_group_name_in_tape_reports_page(String GroupName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[4]/select")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[4]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(GroupName);
	}

	@Then("Select valid sort by name {string} in Tape Reports page")
	public void select_valid_sort_by_name_in_tape_reports_page(String SortName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[5]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div[5]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(SortName);
	}

	@Then("Click run report button in Tape Reports page")
	public void click_run_report_button_in_tape_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnRunReport")));
		ele = driver.findElement(By.id("btnRunReport"));
		ele.click();
	}

	@Then("Click download report button in Tape Reports page")
	public void click_download_report_button_in_tape_reports_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Download Report']")));
		ele = driver.findElement(By.xpath("//button[text()='Download Report']"));
		ele.click();
	}

	@Then("Click ACH Transaction button")
	public void click_ach_transaction_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH Transaction']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH Transaction']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in ACH Transaction page")
	public void select_valid_installer_name_in_ach_transaction_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid payment status {string} in ACH Transaction page")
	public void select_valid_payment_status_in_ach_transaction_page(String PaymentStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentStatus);
	}

	@Then("Select valid from month in ACH Transaction page")
	public void select_valid_from_month_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1).withDayOfMonth(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Click the actions button in ACH Transaction page")
	public void click_the_actions_button_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click the excel export button in ACH Transaction page")
	public void click_the_excel_export_button_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Excel Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Excel Export']"));
		ele.click();
	}

	@Then("Click back button in ACH Transaction page")
	public void click_back_button_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click the file log button in ACH Transaction page")
	public void click_the_file_log_button_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='File log']")));
		ele = driver.findElement(By.xpath("//div[text()='File log']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in ACH Scheduler Log page")
	public void select_valid_installer_name_in_ach_scheduler_log_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid from month in ACH Scheduler Log page")
	public void select_valid_from_month_in_ach_scheduler_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1).withDayOfMonth(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Click view button in ACH Scheduler Log page")
	public void click_view_button_in_ach_scheduler_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}

	@Then("Enter valid customer name {string} in ACH Transaction page")
	public void enter_valid_customer_name_in_ach_transaction_page(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid w-300px ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-300px ps-14']"));
		ele.sendKeys(CustomerName);
	}

	@Then("Click view button in ACH Transaction page")
	public void click_view_button_in_ach_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}

	@Then("Click back button in Transaction details page")
	public void click_back_button_in_transaction_details_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("achback")));
		ele = driver.findElement(By.id("achback"));
		ele.click();
	}

	@Then("Click Returned Transaction button")
	public void click_returned_transaction_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Returned ACH']")));
		ele = driver.findElement(By.xpath("//span[text()='Returned ACH']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in Returned Transaction page")
	public void select_valid_installer_name_in_returned_transaction_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid payment status {string} in Returned Transaction page")
	public void select_valid_payment_status_in_returned_transaction_page(String PaymentStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentStatus);
	}

	@Then("Select valid from month in Returned Transaction page")
	public void select_valid_from_month_in_returned_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1).withDayOfMonth(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Click actions button in Returned Transaction page")
	public void click_actions_button_in_returned_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click excel export button in Returned Transaction page")
	public void click_excel_export_button_in_returned_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Excel Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Excel Export']"));
		ele.click();
	}

	@Then("Click back button in Returned Transaction page")
	public void click_back_button_in_returned_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Enter valid customer name {string} in Returned Transaction page")
	public void enter_valid_customer_name_in_returned_transaction_page(String CustomerName)
			throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-250px ps-14']"));
		ele.sendKeys(CustomerName);
	}

	@Then("Click view button in Returned Transaction page")
	public void click_view_button_in_returned_transaction_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}

	@Then("Click Invoice Log button")
	public void click_invoice_log_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Invoice Log']")));
		ele = driver.findElement(By.xpath("//span[text()='Invoice Log']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in Invoice Log page")
	public void select_valid_installer_name_in_invoice_log_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid payment status {string} in Invoice Log page")
	public void select_valid_payment_status_in_invoice_log_page(String PaymentStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(PaymentStatus);
	}

	@Then("Select valid from month in Invoice Log page")
	public void select_valid_from_month_in_invoice_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1).withDayOfMonth(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Enter valid customer name {string} in Invoice Log page")
	public void enter_valid_customer_name_in_invoice_log_page(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid w-200px ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid w-200px ps-14']"));
		ele.sendKeys(CustomerName);
	}

	@Then("Click export button in Invoice Log page")
	public void click_export_button_in_invoice_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Export']")));
		ele = driver.findElement(By.xpath("//button[text()='Export']"));
		ele.click();
	}

	@Then("Click view button in Invoice Log page")
	public void click_view_button_in_invoice_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}

	@Then("Click actions button in Transaction Details page")
	public void click_actions_button_in_transaction_details_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click resend invoice button in Transaction Details page")
	public void click_resend_invoice_button_in_transaction_details_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/div/div")));
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[1]/div/div/div"));
		ele.click();
	}

	@Then("Click old copy radio button in Resend Invoice popup")
	public void click_old_copy_radio_button_in_resend_invoice_popup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']")));
//		ele = driver.findElement(By.xpath("//button[text()='Yes']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sendOldCopy")));
		ele = driver.findElement(By.id("sendOldCopy"));
		ele.click();
	}

	@Then("Click submit button in Resend Invoice popup")
	public void click_submit_button_in_resend_invoice_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btneSendInvoiceSubmit")));
		ele = driver.findElement(By.id("btneSendInvoiceSubmit"));
		ele.click();
	}

	@Then("Click generate new radio button in Resend Invoice popup")
	public void click_generate_new_radio_button_in_resend_invoice_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("generateNewInvoice")));
		ele = driver.findElement(By.id("generateNewInvoice"));
		ele.click();
	}

	@Then("Click void invoice button in Transaction Details page")
	public void click_void_invoice_button_in_transaction_details_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/div/div")));
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[2]/div/div/div"));
		ele.click();
	}

	@Then("Click no button in Resend Invoice popup")
	public void click_no_button_in_resend_invoice_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='No']")));
		ele = driver.findElement(By.xpath("//button[text()='No']"));
		ele.click();
	}

	@Then("Click yes button in Resend Invoice popup")
	public void click_yes_button_in_resend_invoice_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Yes']")));
		ele = driver.findElement(By.xpath("//button[text()='Yes']"));
		ele.click();
	}

	@Then("Check mandatory message is displayed or not in Resend Invoice popup")
	public void check_mandatory_message_is_displayed_or_not_in_resend_invoice_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("1")));
		ele = driver.findElement(By.id("1"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Mandatory alert message is displayed like : " + text);
		} else {
			System.out.println("Mandatory alert message is not displayed");
		}
	}

	@Then("Enter valid confirmation details {string} in confirmation popup")
	public void enter_valid_confirmation_details_in_confirmation_popup(String Reason) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Remarks")));
		ele = driver.findElement(By.name("Remarks"));
		ele.sendKeys(Reason);
	}

	@Then("Click download invoice button in Transaction Details page")
	public void click_download_invoice_button_in_transaction_details_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/div/div")));
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[3]/div/div/div"));
		ele.click();
	}

	@Then("Click back button in Invoice Log page")
	public void click_back_button_in_invoice_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/div")));
		ele = driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li[4]/div/div"));
		ele.click();
	}

	@Then("Click Activity Report button")
	public void click_activity_report_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Activity Report']")));
		ele = driver.findElement(By.xpath("//span[text()='Activity Report']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in Activity Report page")
	public void select_valid_installer_name_in_activity_report_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div/div[1]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid from month in Activity Report page")
	public void select_valid_from_month_in_activity_report_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate = LocalDate.now();
		LocalDate previousMonth = currentDate.minusMonths(1).withDayOfMonth(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}

	@Then("Click view button in Activity Report page")
	public void click_view_button_in_activity_report_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center cursor-pointer']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center cursor-pointer']"));
		ele.click();
	}

	@Then("Click close button in View Event Log page")
	public void click_close_button_in_view_event_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click Audit Report button")
	public void click_audit_report_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Customer Audit Report']")));
		ele = driver.findElement(By.xpath("//span[text()='Customer Audit Report']"));
		ele.click();
	}

	@Then("Select valid installer name {string} in Audit Report page")
	public void select_valid_installer_name_in_audit_report_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[1]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}

	@Then("Select valid status {string} in Audit Report page")
	public void select_valid_status_in_audit_report_page(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div[2]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@Then("Click the export button in Audit Report page")
	public void click_the_export_button_in_audit_report_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Export']")));
		ele = driver.findElement(By.xpath("//button[text()='Export']"));
		ele.click();
	}

	@Then("Enter valid customer name {string} in Audit Report page")
	public void enter_valid_customer_name_in_audit_report_page(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid  ps-14']"));
		ele.sendKeys(CustomerName);
	}

	@Then("Click view button in ACH Account column in Audit Report page")
	public void click_view_button_in_ach_account_column_in_audit_report_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/table/tbody/tr/td[10]/i")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/table/tbody/tr/td[10]/i"));
		ele.click();
	}

	@Then("Click close button in View Account Number pop up")
	public void click_close_button_in_view_account_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click cancel button in View Account Number pop up")
	public void click_cancel_button_in_view_account_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light mt-6 me-3']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light mt-6 me-3']"));
		ele.click();
	}
	@Then("Click submit button in View Account Number pop up")
	public void click_submit_button_in_view_account_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary mt-6']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-6']"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in Audit Report page")
	public void check_mandatory_message_is_displayed_or_not_in_audit_report_page() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message is displayed like: "+text);
	}
	@Then("Enter valid soft token number {string} in View Account Number pop up")
	public void enter_valid_soft_token_number_in_view_account_number_pop_up(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid ps-14']"));
		ele.sendKeys(CustomerName);
	}
	@Then("Click view button in ACH Routing column in Audit Report page")
	public void click_view_button_in_ach_routing_column_in_audit_report_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/table/tbody/tr/td[11]/i")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div/table/tbody/tr/td[11]/i"));
		ele.click();
	}
	@Then("Click close button in View Routing Number pop up")
	public void click_close_button_in_view_routing_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click cancel button in View Routing Number pop up")
	public void click_cancel_button_in_view_routing_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light mt-6 me-3']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light mt-6 me-3']"));
		ele.click();
	}
	@Then("Click submit button in View Routing Number pop up")
	public void click_submit_button_in_view_routing_number_pop_up() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary mt-6']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-6']"));
		ele.click();
	}
	@Then("Enter valid soft token number {string} in View Routing Number pop up")
	public void enter_valid_soft_token_number_in_view_routing_number_pop_up(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid ps-14']"));
		ele.sendKeys(CustomerName);
	}

	
}