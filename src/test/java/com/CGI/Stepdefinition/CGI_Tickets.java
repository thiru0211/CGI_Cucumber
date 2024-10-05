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

public class CGI_Tickets {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Tickets User is navigating to CGI URL is {string}")
	public void to_check_Tickets_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Tickets User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Tickets")
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

	@Then("Close the Tickets Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click Tickets button")
	public void click_the_Tickets_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tickets']")));
		ele = driver.findElement(By.xpath("//span[text()='Tickets']"));
		ele.click();
	}
	@Then("Select valid month in tickets page")
	public void select_valid_month_in_tickets_page() {
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
	@Then("Select valid installer {string} in tickets page")
	public void select_valid_installer_in_tickets_page(String InstallerName) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[3]/div[2]/select")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[3]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}
	@Then("Select valid status {string} in tickets page")
	public void select_valid_status_in_tickets_page(String status) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[4]/div[2]/select")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[4]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(status);
	}
	@Then("Select valid reason {string} in tickets page")
	public void select_valid_reason_in_tickets_page(String reason) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/select")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[5]/div[2]/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(reason);
	}
	@Then("Enter valid customer name {string} in tickets page")
	public void enter_valid_customer_name_in_tickets_page(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid  ps-14']"));
		ele.sendKeys(CustomerName);
	}
	@Then("Click view button in the grid in tickets page")
	public void click_view_button_in_the_grid_in_tickets_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='text-center']"));
		ele.click();
	}
	@Then("Click actions button in ticket page")
	public void click_actions_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary btn btn-primary btn-sm show menu-dropdown  css-1ujsas3']")));
		ele = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary btn btn-primary btn-sm show menu-dropdown  css-1ujsas3']"));
		ele.click();
	}
	@Then("Click back button in ticket page")
	public void click_back_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}
	@Then("Click add comments button in ticket page")
	public void click_add_comments_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Comments']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Comments']"));
		ele.click();
	}
	@Then("Click close button in add comments page")
	public void click_close_button_in_add_comments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click save button in add comments page")
	public void click_save_button_in_add_comments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in add comments page")
	public void check_mandatory_message_is_displayed_or_not_in_add_comments_page() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, Got It']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, Got It']"));
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
	@Then("Enter valid message {string} in add comments page")
	public void enter_valid_message_in_add_comments_page(String message) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//textarea[@class='form-control form-control-solid']"));
		ele.sendKeys(message);
	}
	@Then("Check success message is displayed or not in add comments page")
	public void check_success_message_is_displayed_or_not_in_add_comments_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast-container Toastify__toast-container--top-right']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast-container Toastify__toast-container--top-right']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}
	@Then("Click send mail button in ticket page")
	public void click_send_mail_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Send Mail']")));
		ele = driver.findElement(By.xpath("//div[text()='Send Mail']"));
		ele.click();
	}
	@Then("Click close button in send mail page")
	public void click_close_button_in_send_mail_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click send button in send mail page")
	public void click_send_button_in_send_mail_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/button")));
		ele = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[4]/button"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in send mail page")
	public void check_mandatory_message_is_displayed_or_not_in_send_mail_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, Got It']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, Got It']"));
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
	@Then("Clear the mail id in send mail page")
	public void clear_the_mail_id_in_send_mail_page() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-transparent border-0']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-transparent border-0']"));
		String text = ele.getAttribute("value");
		int length = text.length();
		Thread.sleep(2000);
		for(int i=0;i<length;i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}
	@Then("Enter valid mail id {string} in send mail page")
	public void enter_valid_mail_id_in_send_mail_page(String MailId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-transparent border-0']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-transparent border-0']"));
		ele.sendKeys(MailId);
	}
	@Then("Enter valid subject {string} in send mail page")
	public void enter_valid_subject_in_send_mail_page(String subject) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-transparent fw-bold fs-3']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-transparent fw-bold fs-3']"));
		ele.sendKeys(subject);
	}
	@Then("Enter valid message {string} in send mail page")
	public void enter_valid_message_in_send_mail_page(String message) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='ql-editor ql-blank mt-10']")));
		ele = driver.findElement(By.xpath("//textarea[@class='ql-editor ql-blank mt-10']"));
		ele.sendKeys(message);
	}

	@Then("Click Close Tickets button in ticket page")
	public void click_close_tickets_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Close Ticket']")));
		ele = driver.findElement(By.xpath("//div[text()='Close Ticket']"));
		ele.click();
	}
	@Then("Click close button in Close Tickets page")
	public void click_close_button_in_close_tickets_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click save button in Close Tickets page")
	public void click_save_button_in_close_tickets_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in Close Tickets page")
	public void check_mandatory_message_is_displayed_or_not_in_close_tickets_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, Got It']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, Got It']"));
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
	@Then("Enter valid description {string} in Close Tickets page")
	public void enter_valid_description_in_close_tickets_page(String description) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//textarea[@class='form-control form-control-solid']"));
		ele.sendKeys(description);
	}
	@Then("Click clear button in Close Tickets page")
	public void click_clear_button_in_close_tickets_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Clear']")));
		ele = driver.findElement(By.xpath("//div[text()='Clear']"));
		ele.click();
	}
	@Then("Check success message is displayed or not in Close Tickets page")
	public void check_success_message_is_displayed_or_not_in_close_tickets_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='Toastify__toast-container Toastify__toast-container--top-right']")));
		ele = driver.findElement(By.xpath(
				"//div[@class='Toastify__toast-container Toastify__toast-container--top-right']"));
		if (ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: " + text);
		} else {
			System.out.println("No success message is displayed");
		}
	}
	@Then("Click View Payment History button in ticket page")
	public void click_view_payment_history_button_in_ticket_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='View Payment History']")));
		ele = driver.findElement(By.xpath("//div[text()='View Payment History']"));
		ele.click();
	}
	@Then("Click close button in View Payment History page")
	public void click_close_button_in_view_payment_history_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
}