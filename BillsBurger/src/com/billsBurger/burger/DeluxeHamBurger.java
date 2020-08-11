package com.billsBurger.burger;

public class DeluxeHamBurger extends BaseHamBurger {

	private int chips;
	private int drinks;
	private int deluxePrice;

	public DeluxeHamBurger() {

	}

	public DeluxeHamBurger( int deluxePrice) {
		this.chips = 20;
		this.drinks = 50;
		this.deluxePrice = deluxePrice;
	}

	public int getChips() {
		return chips;
	}

	public void setChips(int chips) {
		this.chips = chips;
	}

	public int getDrinks() {
		return drinks;
	}

	public void setDrinks(int drinks) {
		this.drinks = drinks;
	}

	public int getDeluxePrice() {
		return deluxePrice;
	}

	public void setDeluxePrice(int deluxePrice) {
		this.deluxePrice = deluxePrice;
	}

}
