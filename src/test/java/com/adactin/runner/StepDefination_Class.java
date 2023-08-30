package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.File_read_Helper.File_Read_Manager;
import com.adactin.stepdefination.Runner_Class;
import com.base.Base_demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination_Class extends Base_demo{
	
	public static WebDriver driver=Runner_Class.driver;
	
	@Given("user can able to launch the url")
	public void user_can_able_to_launch_the_url() throws Throwable {
		//driver.get("https://adactinhotelapp.com/");
 		String url=File_Read_Manager.getInstanceCR().getInstance().getUrl();
		driver.get(url);
	    	}

	@When("user can able to enter the username in the text box")
	public void user_can_able_to_enter_the_username_in_the_text_box() {
		WebElement username=driver.findElement(By.id("username"));
		//username.sendKeys("RashmiManjunatha15");
		inputValue(username,"RashmiManjunatha15");
	    	}

	@When("user can able to enter the password in the password field")
	public void user_can_able_to_enter_the_password_in_the_password_field() {
		WebElement password = driver.findElement(By.id("password"));
	//	password.sendKeys("RashmiManjunatha");
		inputValue(password,"RashmiManjunatha");
	   	}

	@Then("user can able to click the login button and it will navigate to next page")
	public void user_can_able_to_click_the_login_button_and_it_will_navigate_to_next_page() {
		WebElement login=driver.findElement(By.id("login"));
		login.click(); 
	   	}

	@When("user can able to select the location in the dropdown list")
	public void user_can_able_to_select_the_location_in_the_dropdown_list() {
		WebElement Location=driver.findElement(By.id("location"));
		Select s=new Select(Location);
		s.selectByIndex(5);
	    	}

	@When("user can able to select the hotels name in the dropdown list")
	public void user_can_able_to_select_the_hotels_name_in_the_dropdown_list() {
		WebElement HotelNm=driver.findElement(By.id("hotels"));
		Select s1=new Select(HotelNm);
		s1.selectByIndex(4);
	    	}

	@When("user can able to select the room type in the dropdown list")
	public void user_can_able_to_select_the_room_type_in_the_dropdown_list() {
		WebElement RoomType=driver.findElement(By.id("room_type"));
		Select s2=new Select(RoomType);
		s2.selectByIndex(3);

	    	}

	@When("user can able to select the number of rooms in the dropdown list")
	public void user_can_able_to_select_the_number_of_rooms_in_the_dropdown_list() {
		WebElement NoOfRooms=driver.findElement(By.id("room_nos"));
		Select s3=new Select(NoOfRooms);
		s3.selectByIndex(2);
		//Thread.sleep(5000);
	   	}

	@When("user can able to enter the check in date in the text box")
	public void user_can_able_to_enter_the_check_in_date_in_the_text_box() {
		WebElement CheckIn=driver.findElement(By.id("datepick_in"));
		CheckIn.sendKeys("02/05/2023");
	   	}

	@When("user can able to enter the check out date in the text box")
	public void user_can_able_to_enter_the_check_out_date_in_the_text_box() {
		WebElement CheckOut=driver.findElement(By.id("datepick_out"));
		CheckOut.sendKeys("02/05/2023");
	  	}

	@When("user can able to select the number of adult per room in the dropdown list")
	public void user_can_able_to_select_the_number_of_adult_per_room_in_the_dropdown_list() {
		WebElement AdultsPR=driver.findElement(By.id("adult_room"));
		Select s6=new Select(AdultsPR);
		s6.selectByIndex(2);
	    	}

	@When("user can able to select the number of children per room in the dropdown list")
	public void user_can_able_to_select_the_number_of_children_per_room_in_the_dropdown_list() {
		WebElement ChildPR=driver.findElement(By.id("child_room"));
		Select s7=new Select(ChildPR);
		s7.selectByIndex(3);

	   	}

	@Then("user can able to click the search button and it will navigate to next page")
	public void user_can_able_to_click_the_search_button_and_it_will_navigate_to_next_page() {
		WebElement search=driver.findElement(By.id("Submit"));
		search.click(); 
		//Thread.sleep(5000);
	   	}

	@When("user can able to select the hotel in the radiobutton")
	public void user_can_able_to_select_the_hotel_in_the_radiobutton() {
		WebElement CheckBox=driver.findElement(By.id("radiobutton_0"));
		CheckBox.click();
		//Thread.sleep(5000);
	    	}

	@Then("user can able to click the continue button and it will navigate to next page")
	public void user_can_able_to_click_the_continue_button_and_it_will_navigate_to_next_page() {
		WebElement Continue=driver.findElement(By.id("continue"));
		Continue.click();
	    	}

	@When("user can able to enter the firstname in the text box")
	public void user_can_able_to_enter_the_firstname_in_the_text_box() {
		WebElement FirstName=driver.findElement(By.id("first_name"));
		FirstName.sendKeys("Rashmi");
	    	}
	

	@When("user can able to enter the lastname in the textbox")
	public void user_can_able_to_enter_the_lastname_in_the_textbox() {
		WebElement LastName=driver.findElement(By.id("last_name"));
		LastName.sendKeys("Manjunatha");
	   	}

	@When("user can able to enter the billing address in the text box")
	public void user_can_able_to_enter_the_billing_address_in_the_text_box() {
		WebElement Address=driver.findElement(By.id("address"));
		Address.sendKeys("Bangalore,Karnataka");
	    	}

	@When("user can able to enter the credit card number details in the text box")
	public void user_can_able_to_enter_the_credit_card_number_details_in_the_text_box() {
		WebElement CreditCN=driver.findElement(By.id("cc_num"));
		CreditCN.sendKeys("1234-4567-3452-2334");
	    	}

	@When("user can able to select the credit card type in the dropdown list")
	public void user_can_able_to_select_the_credit_card_type_in_the_dropdown_list() {
		WebElement CreditType=driver.findElement(By.id("cc_type"));
		Select s8=new Select(CreditType);
		s8.selectByIndex(3);
	    	}

	@When("user can able to select the expiry date of month and the year in the dropdown list")
	public void user_can_able_to_select_the_expiry_date_of_month_and_the_year_in_the_dropdown_list() {
		WebElement month=driver.findElement(By.id("cc_exp_month"));
		Select s9=new Select(month);
		s9.selectByIndex(4);
		WebElement year=driver.findElement(By.id("cc_exp_year"));
		Select s10=new Select(year);
		s10.selectByIndex(12);
	    	}

	@When("user can able to enter the cvv number in the text box")
	public void user_can_able_to_enter_the_cvv_number_in_the_text_box() {
		WebElement CvvNum=driver.findElement(By.id("cc_cvv"));
		CvvNum.sendKeys("123");
	//	Thread.sleep(3000);
	    	}

	@Then("user can able to click the book now button and it will navigate to next page")
	public void user_can_able_to_click_the_book_now_button_and_it_will_navigate_to_next_page() throws InterruptedException {
		WebElement BookNow=driver.findElement(By.id("book_now"));
		BookNow.click();
		Thread.sleep(10000);
	    }

	@Then("once the confirmation the user can able to click the logout button from the page")
	public void once_the_confirmation_the_user_can_able_to_click_the_logout_button_from_the_page() {
		WebElement LogOut=driver.findElement(By.id("logout"));
		LogOut.click(); 
	    }
}