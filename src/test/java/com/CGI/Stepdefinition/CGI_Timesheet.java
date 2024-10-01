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

public class CGI_Timesheet {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait;

	@Given("To Check Timesheet User is navigating to CGI URL is {string}")
	public void to_check_Timesheet_user_is_navigating_to_cgi_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=old");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Timesheet User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		ele1 = driver.findElement(By.name("email"));
		ele1.clear();
		ele1.sendKeys(UserName);
		ele2 = driver.findElement(By.name("password"));
		ele2.clear();
		ele2.sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");

	}

	@And("click the Signin button To Check Timesheet")
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

	@Then("Close the Timesheet Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");

	}

	@Then("Click the Timesheet button")
	public void click_the_Timesheet_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Timesheet']")));
		ele = driver.findElement(By.xpath("//span[text()='Timesheet']"));
		ele.click();
	}

	@And("Click My Timesheet button")
	public void click_My_Timesheet_button() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='My Timesheet']")));
		ele = driver.findElement(By.xpath("//span[text()='My Timesheet']"));
		ele.click();
	}
	
	@Then("Click unregistered date in the calendar")
	public void click_unregistered_date_in_the_calendar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='01']")));
		ele = driver.findElement(By.xpath("//label[text()='01']"));
		ele.click();
	}
	@And("Click save button in add timesheet")
	public void click_save_button_in_add_timesheet() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	@Then("Check alert message is displayed or not in add timesheet")
	public void check_alert_message_is_displayed_or_not_in_add_timesheet() {
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
	
	@And("Select valid start time in add timesheet")
	public void select_valid_start_time_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("starttime")));
		ele = driver.findElement(By.name("starttime"));
		ele.sendKeys("10:00 AM");
		ele.sendKeys(Keys.ENTER);
	}
	@Then("Select valid end time in add timesheet")
	public void select_valid_end_time_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("Endtime")));
		ele = driver.findElement(By.name("Endtime"));
		ele.sendKeys("14:00 PM");
		ele.sendKeys(Keys.ENTER);
	}
	@And("Select valid task type in add timesheet")
	public void select_valid_task_type_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("tasktype")));
		ele = driver.findElement(By.id("tasktype"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Test task");
	}
	@Then("Enter valid description in add timesheet")
	public void enter_valid_description_in_add_timesheet() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@name='description']")));
		ele = driver.findElement(By.xpath("//textarea[@name='description']"));
		ele.sendKeys("Test");
	}
	@And("Click clear button in add timesheet")
	public void click_clear_button_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}

	@Then("Check success message is displayed or not in add timesheet")
	public void check_success_message_is_displayed_or_not_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]")));
		ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]"));
		if(ele.isDisplayed()) {
			String text = ele.getText();
			System.out.println("Alert message displayed like: "+text);
		}
		else {
			System.out.println("No success message is displayed");
		}
	}
	
	@Then("Click close button in add timesheet")
	public void click_close_button_in_add_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='ant-modal-close']")));
		ele = driver.findElement(By.xpath("//button[@class='ant-modal-close']"));
		ele.click();
	}
	@Then("Click actions button in timesheet")
	public void click_actions_button_in_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Actions']")));
		ele = driver.findElement(By.xpath("//button[text()='Actions']"));
		ele.click();
	}
	@And("Click back button in timesheet")
	public void click_back_button_in_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Back']")));
		ele = driver.findElement(By.xpath("//div[text()='Back']"));
		ele.click();
	}
	
	@Then("Click add timesheet button in timesheet")
	public void click_add_timesheet_button_in_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add Timesheet']")));
		ele = driver.findElement(By.xpath("//div[text()='Add Timesheet']"));
		ele.click();
	}
	
	@Then("Click registered date in the calendar")
	public void click_registered_date_in_the_calendar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='01']")));
		ele = driver.findElement(By.xpath("//label[text()='01']"));
		ele.click();
	}
	
	@Then("Click edit button in the calendar")
	public void click_edit_button_in_the_calendar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='cursor-pointer']")));
		ele = driver.findElement(By.xpath("//td[@class='cursor-pointer']"));
		ele.click();
	}
	
	@Then("Click clear button in edit timesheet")
	public void click_clear_button_in_edit_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Clear']")));
		ele = driver.findElement(By.xpath("//button[text()='Clear']"));
		ele.click();
	}
	
	@Then("Click save button in edit timesheet")
	public void click_save_button_in_edit_timesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
		ele = driver.findElement(By.xpath("//button[text()='Save']"));
		ele.click();
	}
	
	@Then("Modify valid details in edit timesheet")
	public void modify_valid_details_in_edit_timesheet() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@name='description']")));
		ele = driver.findElement(By.xpath("//textarea[@name='description']"));
		String text = ele.getAttribute("value");
		System.out.println(text);
		int length = text.length();
		for (int i = 0; i < length; i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}
		ele.sendKeys(text);
	}
	
	@Then("Click Group Timesheet button")
	public void click_group_timesheet_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Group TimeSheet']")));
		ele = driver.findElement(By.xpath("//span[text()='Group TimeSheet']"));
		ele.click();
	}
	


}