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

public class CGI_Schedulers {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Schedulers User is navigating to CGI URL is {string}")
	public void to_check_Timesheet_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Schedulers User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Schedulers")
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

	@Then("Close the Schedulers Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Schedulers button")
	public void click_the_Schedulers_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Schedulers']")));
		ele = driver.findElement(By.xpath("//span[text()='Schedulers']"));
		ele.click();
	}

	@And("Click ACH Scheduler button")
	public void click_ACH_Scheduler_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH Scheduler']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH Scheduler']"));
		ele.click();
	}

	@Then("Select valid installer {string} in ACH Scheduler Log")
	public void select_valid_installer_in_ach_scheduler_log(String Installer) throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("status")));
		ele = driver.findElement(By.name("status"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Installer);
	}

	@Then("Select valid date in start date calendar")
	public void select_valid_date_in_start_date_calendar() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));

		LocalDate currentDate = LocalDate.now();
		LocalDate firstDayOfMonth = currentDate.withDayOfMonth(1);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = firstDayOfMonth.format(formatter);

		System.out.println(formattedDate);
		ele.sendKeys(formattedDate);
	}

	@Then("Click view button in the grid")
	public void click_view_button_in_the_grid() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='text-dark text-hover-primary  fs-6 cursor-pointer ']")));
		ele = driver.findElement(By.xpath("//a[@class='text-dark text-hover-primary  fs-6 cursor-pointer ']"));
		ele.click();
	}

	@Then("Click actions button in ACH Scheduler page")
	public void click_actions_button_in_ach_scheduler_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click file log button in ACH Transaction page")
	public void click_file_log_button_in_ach_transaction_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='File log']")));
		ele = driver.findElement(By.xpath("//div[text()='File log']"));
		ele.click();
	}

	@Then("Click actions button in ACH Scheduler Log page")
	public void click_actions_button_in_ach_scheduler_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@Then("Click scheduler button in ACH Scheduler Log page")
	public void click_scheduler_button_in_ach_scheduler_log_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Scheduler']")));
		ele = driver.findElement(By.xpath("//div[text()='Scheduler']"));
		ele.click();
	}

	@Then("Click add user button in Email Alerts in Registered Users in ACH Scheduler page")
	public void click_add_user_button_in_email_alerts_in_registered_users_in_ach_scheduler_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[1]/div/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[1]/div/a"));
		ele.click();
	}

	@Then("Click the select all checkbox button in Add Received Email Alerts")
	public void click_the_select_all_checkbox_button_in_add_received_email_alerts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/thead/tr/th[5]/input")));
		ele = driver.findElement(
				By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/thead/tr/th[5]/input"));
		ele.click();
	}

	@Then("Click the select all checkbox button in Add Received Email Alerts in No payment page")
	public void click_the_select_all_checkbox_button_in_add_received_email_alerts_in_no_payment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/thead/tr/th[5]/input")));
		ele = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/thead/tr/th[5]/input"));
		ele.click();
	}

	@Then("Click save button in Add Received Email Alerts")
	public void click_save_button_in_add_received_email_alerts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='btn btn-primary btn-sm text-end mb-3']")));
		ele = driver.findElement(By.xpath("//div[@class='btn btn-primary btn-sm text-end mb-3']"));
		ele.click();
	}

	@Then("Check success message is dispalyed or not in ACH Scheduler page")
	public void check_success_message_is_dispalyed_or_not_in_ach_scheduler_page() {
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

	@Then("Click the select any checkbox button in Add Received Email Alerts")
	public void click_the_select_any_checkbox_button_in_add_received_email_alerts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/tbody/tr[1]/td[5]/a/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/tbody/tr[1]/td[5]/a/input"));
		ele.click();
	}

	@Then("Click the select any checkbox button in Add Received Email Alerts in No payment page")
	public void click_the_select_any_checkbox_button_in_add_received_email_alerts_in_no_payment_page()
			throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/tbody/tr[69]/td[5]/a/input")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/table/tbody/tr[69]/td[5]/a/input"));
		ele.click();
	}

	@Then("Click delete button in ACH Scheduler page")
	public void click_delete_button_in_ach_scheduler_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/table/tbody/tr/td[7]/span")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/table/tbody/tr/td[7]/span"));
		ele.click();
	}

	@Then("Click add user button in Email Alerts in External Users in ACH Scheduler page")
	public void click_add_user_button_in_email_alerts_in_external_users_in_ach_scheduler_page()
			throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[1]/div/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[1]/div/a"));
		ele.click();
	}

	@Then("Click add user button in Email Alerts in External Users in No payment page")
	public void click_add_user_button_in_email_alerts_in_external_users_in_no_payment_page()
			throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[1]/div[2]/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[1]/div[2]/a"));
		ele.click();
	}

	@Then("Click save button in Add Received Email Alerts in Email Alerts in External Users")
	public void click_save_button_in_add_received_email_alerts_in_email_alerts_in_external_users() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary btn-sm']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']"));
		ele.click();
	}

	@Then("Check mandatory toast is dispalyed or not in Add Received Email Alerts")
	public void check_mandatory_toast_is_dispalyed_or_not_in_add_received_email_alerts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@style='color: red;']")));
		ele = driver.findElement(By.xpath("//div[@style='color: red;']"));
		String text = ele.getText();
		System.out.println("Alert toast displayed like: " + text);
	}

	@Then("Enter valid Name {string} in Add Received Email Alerts in Email Alerts in External Users")
	public void enter_valid_name_in_add_received_email_alerts_in_email_alerts_in_external_users(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Name")));
		ele = driver.findElement(By.name("Name"));
		ele.sendKeys(Name);
	}

	@Then("Enter valid EmailID {string} in Add Received Email Alerts in Email Alerts in External Users")
	public void enter_valid_email_id_in_add_received_email_alerts_in_email_alerts_in_external_users(String EmailID) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Emailid")));
		ele = driver.findElement(By.name("Emailid"));
		ele.sendKeys(EmailID);
	}

	@Then("Enter valid UserType {string} in Add Received Email Alerts in Email Alerts in External Users")
	public void enter_valid_user_type_in_add_received_email_alerts_in_email_alerts_in_external_users(String usertype) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("usertype")));
		ele = driver.findElement(By.name("usertype"));
		ele.sendKeys(usertype);
	}

	@Then("Click clear button in Add Received Email Alerts in Email Alerts in External Users")
	public void click_clear_button_in_add_received_email_alerts_in_email_alerts_in_external_users() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-light me-3 btn-sm']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-light me-3 btn-sm']"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Name")));
		ele1 = driver.findElement(By.name("Name"));
		String attribute = ele1.getAttribute("value");
		if (attribute.isEmpty()) {
			System.out.println("Entered data is cleared");
		} else {
			System.out.println("Entered data is not cleared");
		}
	}

	@Then("Check success message is dispalyed or not in Add Received Email Alerts")
	public void check_success_message_is_dispalyed_or_not_in_add_received_email_alerts() {
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

	@Then("Click close button in Add Received Email Alerts in Email Alerts in External Users")
	public void click_close_button_in_add_received_email_alerts_in_email_alerts_in_external_users() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click actions button in ACH Scheduler")
	public void click_actions_button_in_ach_scheduler() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[4]/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/div[4]/a"));
		ele.click();
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.click();
	}

	@Then("Click delete button in Email Alerts in External Users")
	public void click_delete_button_in_email_alerts_in_external_users() throws InterruptedException {
		Thread.sleep(6000);
//		WebElement element=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[1]/div[2]/a"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",element);
//		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/span")));
		ele = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/span"));
		ele.click();
	}

	@Then("Select valid email signature in ACH Scheduler page")
	public void select_valid_email_signature_in_ach_scheduler_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("status")));
		ele = driver.findElement(By.name("status"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("thirumaran0828@outlook.com");
	}

	@Then("Click save button in email signature in ACH Scheduler page")
	public void click_save_button_in_email_signature_in_ach_scheduler_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary btn-sm']")));
		ele = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']"));
		ele.click();
	}

	@Then("Click stop button in ACH Scheduler page")
	public void click_stop_button_in_ach_scheduler_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ms-4 action-menu'][text()='Stop']")));
		ele = driver.findElement(By.xpath("//div[@class='ms-4 action-menu'][text()='Stop']"));
		ele.click();
	}

	@Then("Click run button in ACH Scheduler page")
	public void click_run_button_in_ach_scheduler_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Run']")));
		ele = driver.findElement(By.xpath("//div[text()='Run']"));
		ele.click();
	}

	@Then("Click scheduler log button in ACH Scheduler page")
	public void click_scheduler_log_button_in_ach_scheduler_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Scheduler Log']")));
		ele = driver.findElement(By.xpath("//div[text()='Scheduler Log']"));
		ele.click();
	}

	@Then("Click No payment button")
	public void click_no_payment_button() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='No Payment']")));
		ele = driver.findElement(By.xpath("//span[text()='No Payment']"));
		ele.click();
	}

	@Then("Click add user button in Email Alerts in Registered Users in No payment page")
	public void click_add_user_button_in_email_alerts_in_registered_users_in_no_payment_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[1]/div/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div[1]/div/a"));
		ele.click();
	}

}