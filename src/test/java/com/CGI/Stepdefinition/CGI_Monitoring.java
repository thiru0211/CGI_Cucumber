package com.CGI.Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.DataFormatter;
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

public class CGI_Monitoring {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Monitoring User is navigating to CGI URL is {string}")
	public void to_check_Monitoring_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Monitoring User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Monitoring")
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

	@Then("Close the Monitoring Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Monitoring button")
	public void click_Monitoring_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Monitoring']")));
		ele = driver.findElement(By.xpath("//span[text()='Monitoring']"));
		ele.click();
	}

	@And("Click Overall Status button")
	public void click_Overall_Status_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Overall Stats']")));
		ele = driver.findElement(By.xpath("//span[text()='Overall Stats']"));
		ele.click();
	}
	@Then("Select valid installer name {string} in overall status page")
	public void select_valid_installer_name_in_overall_status_page(String installer) throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("status")));
		ele = driver.findElement(By.name("status"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(installer);
	}
	@Then("Select valid month in the overall status page")
	public void select_valid_month_in_the_overall_status_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate=LocalDate.now();
		LocalDate previousMonth=currentDate.minusMonths(1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM, yyyy");
		String previousMonthString=previousMonth.format(formatter);
		System.out.println("Previous Month: "+previousMonthString);
		ele.sendKeys(previousMonthString);
	}
	@Then("Click Production Status button")
	public void click_production_status_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Production Stats']")));
		ele = driver.findElement(By.xpath("//span[text()='Production Stats']"));
		ele.click();
	}
	@Then("Select valid installer name {string} in Production Status page")
	public void select_valid_installer_name_in_production_status_page(String installer) throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/select")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/select"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(installer);
	}
	@Then("Select valid state {string} in Production Status page")
	public void select_valid_state_in_production_status_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[4]/select")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[4]/select"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(status);
	}
	@Then("Select valid status {string} in Production Status page")
	public void select_valid_status_in_production_status_page(String status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/select")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[3]/select"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(status);
	}
	
	@Then("Select valid month in Production Status page")
	public void select_valid_month_in_production_status_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		LocalDate currentDate=LocalDate.now();
		LocalDate previousMonth=currentDate.minusMonths(1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM, yyyy");
		String previousMonthString = previousMonth.format(formatter);
		System.out.println("Previous Month: " + previousMonthString);
		ele.sendKeys(previousMonthString);
	}
	@Then("Click export button in Production Status page")
	public void click_export_button_in_production_status_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Export']")));
		ele = driver.findElement(By.xpath("//button[text()='Export']"));
		ele.click();
	}
	@Then("Select valid production percentage {string} in Production Status page")
	public void select_valid_production_percentage_in_production_status_page(String productionPercentage) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[2]/select")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[2]/select"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(productionPercentage);
	}
	@Then("Enter valid delta percentage {string} in Production Status page")
	public void enter_valid_delta_percentage_in_production_status_page(String percentage) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[3]/input")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[3]/input"));
		ele.sendKeys(percentage);
	}
	@Then("Click apply button in Production Status page")
	public void click_apply_button_in_production_status_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Apply']")));
		ele = driver.findElement(By.xpath("//button[text()='Apply']"));
		ele.click();
	}
	@Then("Enter valid customer name {string} in Production Status page")
	public void enter_valid_customer_name_in_production_status_page(String customerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid  ps-14'][@placeholder='Customer Name']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid  ps-14'][@placeholder='Customer Name']"));
		ele.sendKeys(customerName);
	}
	@Then("Click the customer name in the grid in Production Status page")
	public void click_the_customer_name_in_the_grid_in_production_status_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]/a/div")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/table/tbody/tr[1]/td[2]/a/div"));
		ele.click();
	}
	@Then("Click Customer Status button")
	public void click_customer_status_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Customer Stats']")));
		ele = driver.findElement(By.xpath("//span[text()='Customer Stats']"));
		ele.click();
	}
	@Then("Select valid installer name {string} in filter page")
	public void select_valid_installer_name_in_filter_page(String installer) throws InterruptedException {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@class='form-select form-select-solid form-select-lg']")));
		ele = driver.findElement(By.xpath("//select[@class='form-select form-select-solid form-select-lg']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText(installer);
	}
	@Then("Enter the customer name {string} in filter page")
	public void enter_the_customer_name_in_filter_page(String customerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid']"));
		ele.sendKeys(customerName);
	}
	@Then("Click search button in filter page")
	public void click_search_button_in_filter_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Search']")));
		ele = driver.findElement(By.xpath("//button[text()='Search']"));
		ele.click();
	}
	@Then("Click actions button in customer status")
	public void click_actions_button_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}
	@Then("Click change filter option in customer status")
	public void click_change_filter_option_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Change Filter']")));
		ele = driver.findElement(By.xpath("//div[text()='Change Filter']"));
		ele.click();
	}
	@Then("Click Life Time Statement option in the action button in customer status")
	public void click_life_time_statement_option_in_the_action_button_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Life Time Statement']")));
		ele = driver.findElement(By.xpath("//div[text()='Life Time Statement']"));
		ele.click();
	}
	@Then("Click second option in the action button in customer status")
	public void click_second_option_in_the_action_button_in_customer_status() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='2021']")));
		ele = driver.findElement(By.xpath("//div[text()='2021']"));
		ele.click();
	}
	@Then("Click third option in the action button in customer status")
	public void click_third_option_in_the_action_button_in_customer_status() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='2022']")));
		ele = driver.findElement(By.xpath("//div[text()='2022']"));
		ele.click();
	}
	@Then("Click fourth option in the action button in customer status")
	public void click_fourth_option_in_the_action_button_in_customer_status() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='2023']")));
		ele = driver.findElement(By.xpath("//div[text()='2023']"));
		ele.click();
	}
	@Then("Click fifth option in the action button in customer status")
	public void click_fifth_option_in_the_action_button_in_customer_status() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='2024']")));
		ele = driver.findElement(By.xpath("//div[text()='2024']"));
		ele.click();
	}
	@Then("Click Get Production details option in the action button in customer status")
	public void click_get_production_details_option_in_the_action_button_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Get Production details']")));
		ele = driver.findElement(By.xpath("//div[text()='Get Production details']"));
		ele.click();
	}
	@Then("Click add notes button in customer status")
	public void click_add_notes_button_in_customer_status() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Notes']")));
		ele = driver.findElement(By.xpath("//button[text()='Add Notes']"));
		ele.click();
	}
	@Then("Click close button in add notes in customer status")
	public void click_close_button_in_add_notes_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Enter valid notes {string} in add notes in customer status")
	public void enter_valid_notes_in_add_notes_in_customer_status(String Notes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@class='form-control form-control-solid']")));
		ele = driver.findElement(By.xpath("//textarea[@class='form-control form-control-solid']"));
		ele.sendKeys(Notes);
	}
	@Then("Click clear button in add notes in customer status")
	public void click_clear_button_in_add_notes_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	@Then("Click save button in add notes in customer status")
	public void click_save_button_in_add_notes_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	@Then("Click delete button in add notes in customer status")
	public void click_delete_button_in_add_notes_in_customer_status() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-trash']")));
		ele = driver.findElement(By.xpath("//i[@class='fa fa-trash']"));
		ele.click();
	}
	@Then("Click customer name arrow button in customer status")
	public void click_customer_name_arrow_button_in_customer_status() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-solid fa-caret-down fs-1 show menu-dropdown cursor-pointer pt-1']")));
		ele = driver.findElement(By.xpath("//i[@class='fa fa-solid fa-caret-down fs-1 show menu-dropdown cursor-pointer pt-1']"));
		ele.click();
	}
	@Then("Click Invertor button")
	public void click_invertor_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Invertor']")));
		ele = driver.findElement(By.xpath("//span[text()='Invertor']"));
		ele.click();
	}
	@Then("Enter valid invertor name {string} in invertor page")
	public void enter_valid_invertor_name_in_invertor_page(String InvertorName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid fs-7  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid fs-7  ps-14']"));
		ele.sendKeys(InvertorName);
	}
	@Then("Click add button in Invertor page")
	public void click_add_button_in_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary btn-sm ']")));
		ele = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm ']"));
		ele.click();
	}
	@Then("Click back button in Add Invertor page")
	public void click_back_button_in_add_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn btn-light  btn-sm  ']")));
		ele = driver.findElement(By.xpath("//div[@class='btn btn-light  btn-sm  ']"));
		ele.click();
	}
	@Then("Click save button in Add Invertor page")
	public void click_save_button_in_add_invertor_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in Add Invertor page")
	public void check_mandatory_message_is_displayed_or_not_in_add_invertor_page() throws InterruptedException {
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
	@Then("Enter valid title {string} in Add Invertor page")
	public void enter_valid_title_in_add_invertor_page(String Title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		ele.sendKeys(Title);
	}
	@Then("Enter valid Model {string} in Add Invertor page")
	public void enter_valid_model_in_add_invertor_page(String Model) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Model")));
		ele = driver.findElement(By.name("Model"));
		ele.sendKeys(Model);
	}
	@Then("Enter valid Rating AC {string} in Add Invertor page")
	public void enter_valid_rating_ac_in_add_invertor_page(String Rating) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Ratingac")));
		ele = driver.findElement(By.name("Ratingac"));
		ele.sendKeys(Rating);
	}
	@Then("Click clear button in Add Invertor page")
	public void click_clear_button_in_add_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	@Then("Check success message is displayed or not in Add Invertor page")
	public void check_success_message_is_displayed_or_not_in_add_invertor_page() {
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
	@Then("Click edit button in Invertor page")
	public void click_edit_button_in_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='cursor-pointer text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='cursor-pointer text-center']"));
		ele.click();
	}
	@Then("Click back button in edit Invertor page")
	public void click_back_button_in_edit_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn btn-light  btn-sm  ']")));
		ele = driver.findElement(By.xpath("//div[@class='btn btn-light  btn-sm  ']"));
		ele.click();
	}
	@Then("Click clear button in edit Invertor page")
	public void click_clear_button_in_edit_invertor_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	@Then("Click update button in edit Invertor page")
	public void click_update_button_in_edit_invertor_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
		ele.click();
	}
	@Then("Click update button in edit Invertor pages")
	public void click_update_button_in_edit_invertor_pages() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in edit Invertor page")
	public void check_mandatory_message_is_displayed_or_not_in_edit_invertor_page() throws InterruptedException {
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
	@Then("Modify valid detail in title tab in edit Invertor page")
	public void modify_valid_detail_in_title_tab_in_edit_invertor_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		String text = ele.getAttribute("value");
		int length = text.length();
		for(int i=0;i<length;i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		ele.sendKeys(text);
	}
	@Then("Enter valid Model {string} in edit Invertor page")
	public void enter_valid_model_in_edit_invertor_page(String Model) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Model")));
		ele = driver.findElement(By.name("Model"));
		ele.sendKeys(Model);
	}
	@Then("Enter valid Rating AC {string} in edit Invertor page")
	public void enter_valid_rating_ac_in_edit_invertor_page(String Rating) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Ratingac")));
		ele = driver.findElement(By.name("Ratingac"));
		ele.sendKeys(Rating);
	}
	@Then("Check success message is displayed or not in edit Invertor page")
	public void check_success_message_is_displayed_or_not_in_edit_invertor_page() {
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
	@Then("Click Panel button")
	public void click_panel_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Panel']")));
		ele = driver.findElement(By.xpath("//span[text()='Panel']"));
		ele.click();
	}
	@Then("Enter valid panel name {string} in panel page")
	public void enter_valid_panel_name_in_panel_page(String panelName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid fs-7  ps-14']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid fs-7  ps-14']"));
		ele.sendKeys(panelName);
	}
	@Then("Click add button in panel page")
	public void click_add_button_in_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-primary btn-sm ']")));
		ele = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm ']"));
		ele.click();
	}
	@Then("Click back button in add panel page")
	public void click_back_button_in_add_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn btn-light  btn-sm ']")));
		ele = driver.findElement(By.xpath("//div[@class='btn btn-light  btn-sm ']"));
		ele.click();
	}
	@Then("Click save button in add panel page")
	public void click_save_button_in_add_panel_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
		ele.click();
	}
	
	@Then("Click save button in add panel pages")
	public void click_save_button_in_add_panel_pages() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	@Then("Check mandatory message is displayed or not in add panel page")
	public void check_mandatory_message_is_displayed_or_not_in_add_panel_page() throws InterruptedException {
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
	@Then("Enter valid title {string} in add panel page")
	public void enter_valid_title_in_add_panel_page(String titleName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		ele.sendKeys(titleName);
	}
	@Then("Enter valid Model {string} in add panel page")
	public void enter_valid_model_in_add_panel_page(String Model) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Model")));
		ele = driver.findElement(By.name("Model"));
		ele.sendKeys(Model);
	}
	@Then("Enter valid Watt STC {string} in add panel page")
	public void enter_valid_watt_stc_in_add_panel_page(String WattSTC) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("WattSTC")));
		ele = driver.findElement(By.name("WattSTC"));
		ele.sendKeys(WattSTC);
	}
	@Then("Click clear button in add panel page")
	public void click_clear_button_in_add_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	@Then("Check success message is displayed or not in add panel page")
	public void check_success_message_is_displayed_or_not_in_add_panel_page() {
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
	@Then("Click edit button in panel page")
	public void click_edit_button_in_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='cursor-pointer text-center']")));
		ele = driver.findElement(By.xpath("//td[@class='cursor-pointer text-center']"));
		ele.click();
	}
	@Then("Click clear button in edit panel page")
	public void click_clear_button_in_edit_panel_page() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	@Then("Check data is cleared or not in title tab in edit panel page")
	public void check_data_is_cleared_or_not_in_title_tab_in_edit_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		String text = ele.getAttribute("value");
		int length = text.length();
		for(int i=0;i<length;i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
	}
	@Then("Modify valid details in edit panel page")
	public void modify_valid_details_in_edit_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Title")));
		ele = driver.findElement(By.name("Title"));
		String text = ele.getAttribute("value");
		int length = text.length();
		for(int i=0;i<length;i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		ele.sendKeys(text);
	}
	@Then("Click update button in edit panel pages")
	public void click_update_button_in_edit_panel_pages() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update']")));
		ele = driver.findElement(By.xpath("//button[text()='Update']"));
		ele.click();
	}
	@Then("Check success message is displayed or not in edit panel page")
	public void check_success_message_is_displayed_or_not_in_edit_panel_page() {
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
	@Then("Click back button in edit panel page")
	public void click_back_button_in_edit_panel_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn btn-light  btn-sm ']")));
		ele = driver.findElement(By.xpath("//div[@class='btn btn-light  btn-sm ']"));
		ele.click();
	}
	


}