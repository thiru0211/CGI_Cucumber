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

public class CGI_Dashboard {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Dashboard User is navigating to CGI URL is {string}")
	public void to_check_Dashboard_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Dashboard User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Dashboard")
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

	@Then("Close the Dashboard Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Dashboard button")
	public void click_the_Dashboard_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Dashboard']")));
		ele = driver.findElement(By.xpath("//span[text()='Dashboard']"));
		ele.click();
	}

	@And("Click ACH button")
	public void click_ACH_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH']"));
		ele.click();
	}
	@Then("Select valid installer name {string} in the ACH Page")
	public void select_valid_installer_name_in_the_ach_page(String InstallerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']")));
		ele = driver
				.findElement(By.xpath("//select[@class='form-select form-select-solid fs-7 w-125px  ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}
	@Then("Select valid month in the ACH Page")
	public void select_valid_month_in_the_ach_page() {
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
		ele.sendKeys(Keys.ENTER);
	}
	@Then("Click the total due button in the ACH Page")
	public void click_the_total_due_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div/div/div[2]/span[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[1]/div/div/div[2]/span[2]"));
		ele.click();
	}
	@Then("Click the paid button in the ACH Page")
	public void click_the_paid_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/span[1]"));
		ele.click();
	}
	@Then("Click close button in Total ACH Page")
	public void click_close_button_in_total_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click export button in Total ACH Page")
	public void click_export_button_in_total_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Export']"));
		ele.click();
	}
	@Then("Click the Paid ACH button in the ACH Page")
	public void click_the_paid_ach_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div[2]/span[1]"));
		ele.click();
	}
	@Then("Click close button in Paid ACH Page")
	public void click_close_button_in_paid_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click export button in Paid ACH Page")
	public void click_export_button_in_paid_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Export']"));
		ele.click();
	}
	@Then("Click the MTD OS button in the ACH Page")
	public void click_the_mtd_os_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div[2]/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div[2]/span[1]"));
		ele.click();
	}
	@Then("Click close button in Today Outstanding popup")
	public void click_close_button_in_today_outstanding_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click export button in Today Outstanding popup")
	public void click_export_button_in_today_outstanding_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Export']"));
		ele.click();
	}
	@Then("Click the MTD Outstanding OS button in the ACH Page")
	public void click_the_mtd_outstanding_os_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div[2]/span[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div[2]/span[2]"));
		ele.click();
	}
	@Then("Click close button in MTD Outstanding popup")
	public void click_close_button_in_mtd_outstanding_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click export button in MTD Outstanding popup")
	public void click_export_button_in_mtd_outstanding_popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Export']"));
		ele.click();
	}
	@Then("Click the Today OS button in the ACH Page")
	public void click_the_today_os_button_in_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/a/div/div/div/div[2]/span[1]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/a/div/div/div/div[2]/span[1]"));
		ele.click();
	}
	@Then("Click close button in Today Outstanding popup in Today OS tab")
	public void click_close_button_in_today_outstanding_popup_in_today_os_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click export button in Today Outstanding popup in Today OS tab")
	public void click_export_button_in_today_outstanding_popup_in_today_os_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Export']")));
		ele = driver.findElement(By.xpath("//div[text()='Export']"));
		ele.click();
	}
	@Then("Click the calendar button in last six month stats the ACH Page")
	public void click_the_calendar_button_in_last_six_month_stats_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-md-10']")));
		ele = driver.findElement(By.xpath("//div[@class='col-md-10']"));
		ele.click();
	}
	@Then("Click close button in last six month stats the ACH Page")
	public void click_close_button_in_last_six_month_stats_the_ach_page() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click ACH Returned button")
	public void click_ach_returned_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ACH Returned']")));
		ele = driver.findElement(By.xpath("//span[text()='ACH Returned']"));
		ele.click();
	}
	@Then("Select valid installer name {string} in the ACH Returned")
	public void select_valid_installer_name_in_the_ach_returned(String InstallerName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.name("status")));
		ele = driver
				.findElement(By.name("status"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InstallerName);
	}
	@Then("Select valid month in the ACH Returned")
	public void select_valid_month_in_the_ach_returned() {
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
		ele.sendKeys(Keys.ENTER);
	}
	@Then("Click the issue button in issue stats")
	public void click_the_issue_button_in_issue_stats() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='text-dark  text-hover-primary fs-6']")));
		ele = driver.findElement(By.xpath("//label[@class='text-dark  text-hover-primary fs-6']"));
		ele.click();
	}
	@Then("Click the close button in issue stats")
	public void click_the_close_button_in_issue_stats() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click show all button in ACH Returned")
	public void click_show_all_button_in_ach_returned() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='card-toolbar cursor-pointer fs-5']")));
		ele = driver.findElement(By.xpath("//a[@class='card-toolbar cursor-pointer fs-5']"));
		ele.click();
	}
	@Then("Click the customer name in Issue Stats")
	public void click_the_customer_name_in_issue_stats() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' text-primary fs-6']")));
		ele = driver.findElement(By.xpath("//a[@class=' text-primary fs-6']"));
		ele.click();
	}
	@Then("Select valid investor name {string} in Investor")
	public void select_valid_installer_name_in_investor(String InvestorName) throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.name("status")));
		ele = driver
				.findElement(By.name("status"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(InvestorName);
	}
	@Then("Click search button in Investor")
	public void click_search_button_in_investor() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary px-4 py-2']")));
		ele = driver.findElement(By.xpath("//button[@class='btn btn-primary px-4 py-2']"));
		ele.click();
	}
	@Then("Enter valid customer name {string} in search field")
	public void enter_valid_customer_name_in_search_field(String CustomerName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-control-solid fs-7 ps-10']")));
		ele = driver.findElement(By.xpath("//input[@class='form-control form-control-solid fs-7 ps-10']"));
		ele.sendKeys(CustomerName);
	}
	@Then("Click the customer name in Investor")
	public void click_the_customer_name_in_investor() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=' text-primary fs-6']")));
		ele = driver.findElement(By.xpath("//a[@class=' text-primary fs-6']"));
		ele.click();
	}
	@Then("Click show all button in the documents field")
	public void click_show_all_button_in_the_documents_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='text-primary fs-4']")));
		ele = driver.findElement(By.xpath("//h3[@class='text-primary fs-4']"));
		ele.click();
	}
	@Then("Click download button in the documents field")
	public void click_download_button_in_the_documents_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='fa fa-file-pdf']")));
		ele = driver.findElement(By.xpath("//a[@class='fa fa-file-pdf']"));
		ele.click();
	}
	@Then("Click show all button in the News Feed field")
	public void click_show_all_button_in_the_news_feed_field() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='text-primary fs-5']")));
		ele = driver.findElement(By.xpath("//div[@class='text-primary fs-5']"));
		ele.click();
	}
	@Then("Click Investor button in dashboard")
	public void click_investor_button_in_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Investor']")));
		ele = driver.findElement(By.xpath("//span[text()='Investor']"));
		ele.click();
	}
}