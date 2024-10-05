package com.CGI.Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

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

public class CGI_Admin {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Admin User is navigating to CGI URL is {string}")
	public void to_check_admin_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Admin User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Admin")
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

	@Then("close the Admin Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the admin button")
	public void click_the_admin_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
		ele = driver.findElement(By.xpath("//span[text()='Admin']"));
		ele.click();
	}

	@And("Click view user button")
	public void click_view_user_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='View Users']")));
		ele = driver.findElement(By.xpath("//span[text()='View Users']"));
		ele.click();
	}

	@Then("Select valid status type {string}")
	public void select_valid_status_type(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/span[2]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/span[2]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@Then("Select valid user type {string}")
	public void select_valid_user_type(String userType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/span[2]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/span[2]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(userType);
	}

	@Then("Enter valid username {string} in the search box")
	public void enter_valid_username_in_the_search_box(String userName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/input")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/input"));
		ele.sendKeys(userName);
	}

	@And("Check name is displayed or not in view user")
	public void check_name_is_displayed_or_not_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]/div/div/a")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]/div/div/a"));
		if (ele.isDisplayed()) {
			System.out.println("Username is dispalyed in the table");
		} else {
			System.out.println("Username is not displayed");
		}
	}

	@Then("Click add button in view user")
	public void click_add_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@Then("Click action button in view user")
	public void click_action_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@And("Click back button in add user")
	public void click_back_button_in_add_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@And("Click save button in add user")
	public void click_save_button_in_add_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Save']")));
		ele = driver.findElement(By.xpath("//div[text()='Save']"));
		ele.click();
	}

	@Then("Check the alert message details")
	public void check_the_alert_message_details() {
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

	@And("Enter all valid details in all field")
	public void enter_all_valid_details_in_all_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("FirstName")));
		// Firstname
		ele = driver.findElement(By.name("FirstName"));
		ele.sendKeys("Test");
		// Lastname
		wait.until(ExpectedConditions.elementToBeClickable(By.name("LastName")));
		ele1 = driver.findElement(By.name("LastName"));
		ele1.sendKeys("T");
		// Email
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Email")));
		ele2 = driver.findElement(By.name("Email"));
		ele2.sendKeys("0211thiru@gmail.com");
		// User role
		wait.until(ExpectedConditions.elementToBeClickable(By.name("userRole")));
		ele3 = driver.findElement(By.name("userRole"));
		ele3.sendKeys("Testing");
		// User type
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[5]/div[2]/div/select")));
		ele4 = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[5]/div[2]/div/select"));
		Select sel = new Select(ele4);
		sel.selectByVisibleText("Product Support Team");
		// Payment type(Click all checkbox)
		wait.until(ExpectedConditions.elementToBeClickable(By.name("LTF")));
		driver.findElement(By.name("LTF")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("MAN")));
		driver.findElement(By.name("MAN")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("PRE")));
		driver.findElement(By.name("PRE")).click();
		// Enter phone number
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Phone")));
		ele5 = driver.findElement(By.name("Phone"));
		ele5.sendKeys("Testing");
	}

	@Then("Click action button in add user")
	public void click_action_button_in_add_user() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@And("Click clear button in add user")
	public void click_clear_button_in_add_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Clear']")));
		ele = driver.findElement(By.xpath("//div[text()='Clear']"));
		ele.click();
	}

	@Then("Click edit button in view user")
	public void click_edit_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[8]/div/div/a")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/table/tbody/tr/td[8]/div/div/a"));
		ele.click();
	}

	@And("Click action button in edit user")
	public void click_action_button_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}

	@And("Click back button in edit user")
	public void click_back_button_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}

	@Then("Click edit user button in action button")
	public void click_edit_user_button_in_action_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Edit User']")));
		ele = driver.findElement(By.xpath("//div[text()='Edit User']"));
		ele.click();
	}

	@Then("Click clear button in edit user")
	public void click_clear_button_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Clear']")));
		ele = driver.findElement(By.xpath("//div[text()='Clear']"));
		ele.click();
	}

	@Then("Remove the first name field in edit user")
	public void remove_the_first_name_field_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("FirstName")));
		ele = driver.findElement(By.name("FirstName"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}

	@Then("Click update button in edit user")
	public void click_update_button_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Update']")));
		ele = driver.findElement(By.xpath("//div[text()='Update']"));
		ele.click();
	}

	@And("Check and accept the confirmation page in edit user")
	public void check_and_accept_the_confirmation_page_in_edit_user() throws InterruptedException {
		Thread.sleep(2000);
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

	@Then("Modify the details in edit user")
	public void modify_the_details_in_edit_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("FirstName")));
		ele = driver.findElement(By.name("FirstName"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.name("FirstName")));
		ele1 = driver.findElement(By.name("FirstName"));
		ele1.sendKeys(text);
	}

	@And("Click profile button in view user")
	public void click_profile_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblImage")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblImage"));
		ele.click();
	}

	@Then("Click upload button in view user")
	public void click_upload_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Upload']")));
		ele = driver.findElement(By.xpath("//button[text()='Upload']"));
		ele.click();
	}

	@And("Check the alert message in view user")
	public void check_the_alert_message_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message displayed like: " + text);
	}

	@And("Upload valid file in profile photo page")
	public void upload_valid_file_in_profile_photo_page() throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]"));
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

	@And("Click the edit button in email field")
	public void click_the_edit_button_in_email_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/img")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/img"));
		ele.click();
	}

	@Then("Click close button in the update email address")
	public void click_close_button_in_the_update_email_address() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click update button in the update email address")
	public void click_update_button_in_the_update_email_address() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@And("Check the alert message details in the update email address")
	public void check_the_alert_message_details_in_the_update_email_address() {
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

	@Then("Enter valid new email id in the update email address")
	public void enter_valid_new_email_id_in_the_update_email_address() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[1]/span[2]")));
		ele = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[1]/span[2]"));
		String text = ele.getText();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/input")));
		ele1 = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/div[1]/input"));
		ele1.sendKeys(text);
	}

	@Then("Enter valid OTP details in the update email address")
	public void enter_valid_otp_details_in_the_update_email_address() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[3]/input")));
		ele = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[3]/input"));
		ele.sendKeys("123456");
	}

	@And("Click the edit button in Password field")
	public void click_the_edit_button_in_password_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/div[3]/img")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/div[3]/img"));
		ele.click();
	}

	@Then("Click close button in the update Password")
	public void click_close_button_in_the_update_password() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click reset button in the update Password")
	public void click_reset_button_in_the_update_password() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Reset']")));
		ele = driver.findElement(By.xpath("//button[text()='Reset']"));
		ele.click();
	}

	@And("Check the alert message details in the update Password")
	public void check_the_alert_message_details_in_the_update_password() {
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

	@Then("Enter valid new Password {string} in the update Password")
	public void enter_valid_new_password_in_the_update_password(String NewPass) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[1]/input")));
		ele = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[1]/input"));
		ele.sendKeys(NewPass);
	}

	@Then("Enter valid confirm Password {string} in the update Password")
	public void enter_valid_confirm_password_in_the_update_password(String CnfrmPass) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/input")));
		ele = driver
				.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[2]/input"));
		ele.sendKeys(CnfrmPass);
	}

	@And("Click the edit button in status field")
	public void click_the_edit_button_in_status_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/div[3]/img")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/div[3]/img"));
		ele.click();
	}

	@Then("Click close button in status field")
	public void click_close_button_in_status_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click no radio button in status field")
	public void click_no_radio_button_in_status_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("no")));
		ele = driver.findElement(By.name("no"));
		ele.click();
	}

	@And("Click update button in status field")
	public void click_update_button_in_status_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check the alert message in status field")
	public void check_the_alert_message_in_status_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message displayed like: " + text);
	}

	@And("Click the edit button in Two FA field")
	public void click_the_edit_button_in_two_fa_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div/div[3]/div[3]/img")));
		ele = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[3]/div/div[3]/div[3]/img"));
		ele.click();
	}

	@Then("Click close button in Two FA field")
	public void click_close_button_in_two_fa_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click no radio button in Two FA field")
	public void click_no_radio_button_in_two_fa_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='radioOption'][@value='Y']")));
		ele = driver.findElement(By.xpath("//input[@name='radioOption'][@value='Y']"));
		ele.click();
	}

	@And("Click update button in Two FA field")
	public void click_update_button_in_two_fa_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check the alert message in Two FA field")
	public void check_the_alert_message_in_two_fa_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message displayed like: " + text);
	}

	@And("Click access rights button in view user")
	public void click_access_rights_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Access Rights']")));
		ele = driver.findElement(By.xpath("//span[text()='Access Rights']"));
		ele.click();
	}

	@Then("Click the check all button in access rights")
	public void click_the_check_all_button_in_access_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Check All']")));
		ele = driver.findElement(By.xpath("//a[text()='Check All']"));
		ele.click();
	}

	@Then("Click submit button in access rights")
	public void click_submit_button_in_access_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Submit']")));
		ele = driver.findElement(By.xpath("//div[text()='Submit']"));
		ele.click();
	}

	@Then("Click the clear all button in access rights")
	public void click_the_clear_all_button_in_access_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clear All']")));
		ele = driver.findElement(By.xpath("//a[text()='Clear All']"));
		ele.click();
	}

	@Then("Select a checkbox in access rights")
	public void select_a_checkbox_in_access_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("TKS")));
		ele = driver.findElement(By.name("TKS"));
		if (!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		} else {
			System.out.println("Checkbox is already selected");
		}
	}

	@And("Click Email Notification button in view user")
	public void click_email_notification_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Email Notifications']")));
		ele = driver.findElement(By.xpath("//a[text()='Email Notifications']"));
		ele.click();
	}

	@Then("Click the check all button in Email Notification")
	public void click_the_check_all_button_in_email_notification() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Check All']")));
		ele = driver.findElement(By.xpath("//a[text()='Check All']"));
		ele.click();
	}

	@Then("Click the clear all button in Email Notification")
	public void click_the_clear_all_button_in_email_notification() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Clear All']")));
		ele = driver.findElement(By.xpath("//a[text()='Clear All']"));
		ele.click();
	}

	@Then("Select a checkbox in Email Notification")
	public void select_a_checkbox_in_email_notification() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("1")));
		ele = driver.findElement(By.name("1"));
		if (!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		} else {
			System.out.println("Checkbox is already selected");
		}
	}

	@And("Click Time Sheet Access button in view user")
	public void click_time_sheet_access_button_in_view_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Timesheet Access']")));
		ele = driver.findElement(By.xpath("//a[text()='Timesheet Access']"));
		ele.click();
	}

	@Then("Click enable button in Time Sheet Access")
	public void click_enable_button_in_time_sheet_access() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("yes")));
		ele = driver.findElement(By.name("yes"));
		ele.click();
	}

	@And("Select valid option reporting to dropdown")
	public void select_valid_option_reporting_to_dropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/select")));
		ele = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/select"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Vignesh S");
	}

	@And("Click Bank setup button")
	public void click_bank_setup_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Bank Setup']")));
		ele = driver.findElement(By.xpath("//span[text()='Bank Setup']"));
		ele.click();
	}

	@Then("Select valid status type {string} in bank user")
	public void select_valid_status_type_in_bank_user(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@And("Check status is updated in the table in bank user")
	public void check_status_is_updated_in_the_table_in_bank_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='ENABLED']")));
		ele = driver.findElement(By.xpath("//div[text()='ENABLED']"));
		String ExpectedStatus = "ENABLED";
		String ActualStatus = ele.getText();
		if (ActualStatus.equals(ExpectedStatus)) {
			System.out.println("Status is displayed as per selection");
		} else {
			System.out.println("Status is not displayed as per selection");
		}
	}

	@Then("Enter valid bank name {string} in search field in bank user")
	public void enter_valid_bank_name_in_search_field_in_bank_user(String BankName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search-txt")));
		ele = driver.findElement(By.id("search-txt"));
		ele.sendKeys(BankName);
	}

	@And("Check bank name is updated in the table in bank user")
	public void check_bank_name_is_updated_in_the_table_in_bank_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Testing bank 456']")));
		ele = driver.findElement(By.xpath("//a[text()='Testing bank 456']"));
		String ExpectedStatus = "Testing bank 456";
		String ActualStatus = ele.getText();
		if (ActualStatus.equals(ExpectedStatus)) {
			System.out.println("Status is displayed as per selection");
		} else {
			System.out.println("Status is not displayed as per selection");
		}
	}

	@Then("Click add button in bank user")
	public void click_add_button_in_bank_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@And("Click save button in add bank details")
	public void click_save_button_in_add_bank_details() {
//		ele = driver.findElement(By.xpath("//button[text()='Save']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].ScrollIntoView(true);", ele);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check the alert message in add bank details")
	public void check_the_alert_message_in_add_bank_details() {
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

	@And("Enter valid bank name {string} in add bank details")
	public void enter_valid_bank_name_in_add_bank_details(String BankName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("bankName")));
		ele = driver.findElement(By.id("bankName"));
		ele.sendKeys(BankName);
	}

	@Then("Enter valid account number {string} in add bank details")
	public void enter_valid_account_number_in_add_bank_details(String AccNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("AccountNumber")));
		ele = driver.findElement(By.name("AccountNumber"));
		ele.sendKeys(AccNum);
	}

	@And("Select valid account group in add bank details")
	public void select_valid_account_group_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownValue")));
		ele = driver.findElement(By.id("dropdownValue"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Test Group");
	}

	@Then("Enter valid location in add bank details")
	public void enter_valid_location_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Location")));
		ele = driver.findElement(By.name("Location"));
		ele.sendKeys("Test");
	}

	@And("Click enable radio button in add bank details")
	public void click_enable_radio_button_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='radioOption'][@value='Y']")));
		ele = driver.findElement(By.xpath("//input[@name='radioOption'][@value='Y']"));
		ele.click();
	}

	@Then("Click yes radio button in authorize .net in add bank details")
	public void click_yes_radio_button_in_authorize_net_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='dropdownValuenew'][@value='N']")));
		ele = driver.findElement(By.xpath("//input[@name='dropdownValuenew'][@value='N']"));
		ele.click();
	}

	@And("Click clear button in add bank details")
	public void click_clear_button_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset")));
		ele = driver.findElement(By.id("reset"));
		ele.click();
	}

	@And("Click close button in add bank details")
	public void click_close_button_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@Then("Click edit button in bank user")
	public void click_edit_button_in_bank_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@And("Click close button in edit bank details")
	public void click_close_button_in_edit_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}

	@And("Click clear button in edit bank details")
	public void click_clear_button_in_edit_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset")));
		ele = driver.findElement(By.id("reset"));
		ele.click();
	}

	@Then("Click update button in edit bank details")
	public void click_update_button_in_edit_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Check the alert toast in add bank details")
	public void check_the_alert_toast_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message is displayed like: " + text);
	}

	@Then("Modify valid details in edit bank details")
	public void modify_valid_details_in_edit_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("BankName")));
		ele = driver.findElement(By.name("BankName"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.name("BankName")));
		ele1 = driver.findElement(By.name("BankName"));
		ele1.sendKeys(text);
	}

	@And("Click add account group button in add bank details")
	public void click_add_account_group_button_in_add_bank_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-1 pb-2'][1]")));
		ele = driver.findElement(By.xpath("//div[@class='col-md-1 pb-2'][1]"));
		ele.click();
	}

	@Then("Click save button in add account group")
	public void click_save_button_in_add_account_group() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[2]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[2]"));
		ele.click();
	}

	@And("Check alert message in add account group")
	public void check_alert_message_in_add_account_group() {
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

	@And("Enter valid account group name in add account group")
	public void enter_valid_account_group_name_in_add_account_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("AccountGroup")));
		ele = driver.findElement(By.name("AccountGroup"));
		ele.sendKeys("Testing");
	}

	@Then("Click clear button in add account group")
	public void click_clear_button_in_add_account_group() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[1]")));
		ele = driver.findElement(
				By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button[1]"));
		ele.click();
	}

	@And("Click Authorized .Net button")
	public void click_authorized_net_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Authorized .Net']")));
		ele = driver.findElement(By.xpath("//span[text()='Authorized .Net']"));
		ele.click();
	}

	@Then("Select valid status {string} in Authorized .Net")
	public void select_valid_status_in_authorized_net(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@Then("Enter valid name {string} in search field in Authorized .Net")
	public void enter_valid_name_in_search_field_in_authorized_net(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search-txt")));
		ele = driver.findElement(By.id("search-txt"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in Authorized .Net")
	public void click_add_button_in_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@And("Click save button in Authorized .Net")
	public void click_save_button_in_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}

	@Then("Check the mandatory message in add Authorized .Net")
	public void check_the_mandatory_message_in_add_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
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
	}

	@And("Enter valid name {string} in add Authorized .Net")
	public void enter_valid_name_in_add_authorized_net(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Name")));
		ele = driver.findElement(By.name("Name"));
		ele.sendKeys(Name);
	}

	@Then("Enter valid Transaction Key {string} in add Authorized .Net")
	public void enter_valid_transaction_key_in_add_authorized_net(String TKey) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("TransactionKey")));
		ele = driver.findElement(By.name("TransactionKey"));
		ele.sendKeys(TKey);
	}

	@And("Enter valid Login ID {string} in add Authorized .Net")
	public void enter_valid_login_id_in_add_authorized_net(String LoginID) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("LoginID")));
		ele = driver.findElement(By.name("LoginID"));
		ele.sendKeys(LoginID);
	}

	@Then("Enter valid Notes {string} in add Authorized .Net")
	public void enter_valid_notes_in_add_authorized_net(String Notes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Notes")));
		ele = driver.findElement(By.name("Notes"));
		ele.sendKeys(Notes);
	}

	@And("Click clear button in Authorized .Net")
	public void click_clear_button_in_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Check the success message in add Authorized .Net")
	public void check_the_success_message_in_add_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message displayed like: " + text);
	}

	@And("Click back button in Authorized .Net")
	public void click_back_button_in_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Back ']")));
		ele = driver.findElement(By.xpath("//a[text()='Back ']"));
		ele.click();
	}

	@And("Click back button in edit Authorized .Net")
	public void click_back_button_in_edit_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Back']")));
		ele = driver.findElement(By.xpath("//a[text()='Back']"));
		ele.click();
	}

	@Then("Click edit button in Authorized .Net")
	public void click_edit_button_in_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}

	@Then("Click update button in edit Authorized .Net")
	public void click_update_button_in_edit_authorized_net() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}

	@Then("Modify valid details in edit Authorized .Net")
	public void modify_valid_details_in_edit_authorized_net() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Name")));
		ele = driver.findElement(By.name("Name"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Name")));
		ele1 = driver.findElement(By.name("Name"));
		ele1.sendKeys(text);
	}

	@And("Click IP Whitelist button")
	public void click_ip_whitelist_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='IP Whitelist']")));
		ele = driver.findElement(By.xpath("//span[text()='IP Whitelist']"));
		ele.click();
	}

	@Then("Select valid status {string} in IP Whitelist")
	public void select_valid_status_in_ip_whitelist(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(Status);
	}

	@Then("Enter valid name {string} in search field in IP Whitelist")
	public void enter_valid_name_in_search_field_in_ip_whitelist(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("search-txt")));
		ele = driver.findElement(By.id("search-txt"));
		ele.sendKeys(Name);
	}

	@Then("Click add button in IP Whitelist")
	public void click_add_button_in_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		ele = driver.findElement(By.xpath("//button[text()='Add']"));
		ele.click();
	}

	@And("Click save button in IP Whitelist")
	public void click_save_button_in_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele1 = driver.findElement(By.xpath("//button[text()='Save']"));
		ele1.click();
	}

	@Then("Check the mandatory message in add IP Whitelist")
	public void check_the_mandatory_message_in_add_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Ok, got it!']")));
		ele = driver.findElement(By.xpath("//button[text()='Ok, got it!']"));
		if (ele.isDisplayed()) {
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
	}

	@And("Enter valid IP Address {string} in add IP Whitelist")
	public void enter_valid_ip_address_in_add_ip_whitelist(String IPAddress) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ipAddress")));
		ele = driver.findElement(By.id("ipAddress"));
		ele.sendKeys(IPAddress);
	}

	@Then("Enter valid Responsible Person {string} in add IP Whitelist")
	public void enter_valid_responsible_person_in_add_ip_whitelist(String ResPerson) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("ResponsiblePerson")));
		ele = driver.findElement(By.name("ResponsiblePerson"));
		ele.sendKeys(ResPerson);
	}

	@And("Enter valid IP Location {string} in add IP Whitelist")
	public void enter_valid_ip_location_in_add_ip_whitelist(String IPLoc) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("IPLocation")));
		ele = driver.findElement(By.name("IPLocation"));
		ele.sendKeys(IPLoc);
	}

	@Then("Enter valid Notes {string} in add IP Whitelist")
	public void enter_valid_notes_in_add_ip_whitelist(String Notes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Notes")));
		ele = driver.findElement(By.name("Notes"));
		ele.sendKeys(Notes);
	}

	@And("Click clear button in IP Whitelist")
	public void click_clear_button_in_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reset1")));
		ele = driver.findElement(By.id("reset1"));
		ele.click();
	}
	
	@Then("Check the success message in add IP Whitelist")
	public void check_the_success_message_in_add_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		String text = ele.getText();
		System.out.println("Alert message displayed like: " + text);
	}
	
	@And("Click close button in IP Whitelist")
	public void click_close_button_in_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	
	@Then("Click edit button in IP Whitelist")
	public void click_edit_button_in_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']")));
		ele = driver.findElement(By.xpath(
				"//a[@class='text-hover-primary fs-6  justify-content-center btn-bg-light btn-active-color-primary btn-md cursor-pointer']"));
		ele.click();
	}
	@And("Click close button in edit IP Whitelist")
	public void click_close_button_in_edit_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	
	@And("Modify valid details in edit IP Whitelist")
	public void modify_valid_details_in_edit_ip_whitelist() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ipAddress")));
		ele = driver.findElement(By.id("ipAddress"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ipAddress")));
		ele1 = driver.findElement(By.id("ipAddress"));
		ele1.sendKeys(text);
		
	}
	
	@Then("Click update button in edit IP Whitelist")
	public void click_update_button_in_edit_ip_whitelist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}
	
	@And("Click User Log button")
	public void click_user_log_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='User log']")));
		ele = driver.findElement(By.xpath("//span[text()='User log']"));
		ele.click();
	}
	
	@Then("Enter valid user name {string} in search box in user log")
	public void enter_valid_user_name_in_search_box_in_user_log(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-white w-250px ps-14 h-40px']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-white w-250px ps-14 h-40px']"));
		ele.sendKeys(Name);
	}
	
	@Then("Click view button in user log")
	public void click_view_button_in_user_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' fs-6 btn  btn-sm']")));
		ele = driver.findElement(By.xpath("//a[@class=' fs-6 btn  btn-sm']"));
		ele.click();
	}
	
	@And("Click back button in user log")
	public void click_back_button_in_user_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}
	
	@And("Click view button in user log in user log")
	public void click_view_button_in_user_log_in_user_log() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/table/tbody/tr/td[8]/span/a")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/table/tbody/tr/td[8]/span/a"));
		ele.click();
	}
	@Then("Click close button in user log in user log")
	public void click_close_button_in_user_log_in_user_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	
	@And("Click Event Log button")
	public void click_event_log_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Event log']")));
		ele = driver.findElement(By.xpath("//span[text()='Event log']"));
		ele.click();
	}
	
	@Then("Enter valid user name {string} in search box in Event log")
	public void enter_valid_user_name_in_search_box_in_event_log(String Name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-white w-250px ps-14 h-40px']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-white w-250px ps-14 h-40px']"));
		ele.sendKeys(Name);
	}
	
	@Then("Click view button in Event log")
	public void click_view_button_in_event_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' fs-6 btn  btn-sm']")));
		ele = driver.findElement(By.xpath("//a[@class=' fs-6 btn  btn-sm']"));
		ele.click();
	}
	@Then("Click close button in Event log")
	public void click_close_button_in_event_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	
	@And("Click Exception Log button")
	public void click_exception_log_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Exception log']")));
		ele = driver.findElement(By.xpath("//span[text()='Exception log']"));
		ele.click();
	}
	
	@Then("Select valid from date in Exception Log")
	public void select_valid_from_date_in_exception_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/input")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/div/input"));
		ele.sendKeys("01-01-2024");
	}
	
	@Then("Enter valid name {string} in search field in Exception Log")
	public void enter_valid_name_in_search_field_in_exception_log(String Name) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/span[2]/div/input")));
		ele = driver.findElement(By.id("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div/span[2]/div/input"));
		ele.click();
		ele.sendKeys(Name);
	}
	
	@Then("Click view button in Exception log")
	public void click_view_button_in_exception_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' fs-6 btn  btn-sm']")));
		ele = driver.findElement(By.xpath("//a[@class=' fs-6 btn  btn-sm']"));
		ele.click();
	}
	
	@Then("Click close button in Exception log")
	public void click_close_button_in_Exception_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
}