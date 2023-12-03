package com.stepdefinitions;

import com.global.Objects;

import io.cucumber.java.en.Given;

public class CreatingSecondOrder extends Objects {

	@Given("the user click on the bag")
	public void the_user_click_on_the_bag() {
		prod.clkbag();
	

	}

	@Given("the user moving the proceed page")
	public void the_user_moving_the_proceed_page() {
		cartpage.bagCart();
		cartpage.clksecondorderCart();

	}

	@Given("the user selecting checkout")
	public void the_user_selecting_checkout() {
		yourcart.checkout();

	}

	@Given("the user enters the addressfirstname {string}")
	public void the_user_enters_the_addressfirstname(String f1name) {
		shpage.enterfirstname(f1name);
		

	}

	@Given("the user enters the addresslastname {string}")
	public void the_user_enters_the_addresslastname(String s1name) {
		shpage.enterlastname(s1name);

	}

	@Given("the user enters the postaddress {string}")
	public void the_user_enters_the_postaddress(String p1postal) {
          shpage.enterpostalcode(p1postal);
	}

	@Given("the user hits the continue button")
	public void the_user_hits_the_continue_button() {
		shpage.continueBtn();
		

	}

	@Given("the user click on the shoppingfinish")
	public void the_user_click_on_the_shoppingfinish() {
		finishpage.clkfinish();

	}

}
