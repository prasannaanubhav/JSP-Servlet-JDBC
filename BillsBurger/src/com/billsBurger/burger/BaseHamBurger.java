package com.billsBurger.burger;

public class BaseHamBurger {

	private String breadRolls;
	private String meat;
	private int price;
	private int tomato;
	private int carrot;
	private int lettuce;

	public BaseHamBurger() {

	}

	public BaseHamBurger(String breadRolls, String meat, int price) {
		this.breadRolls = breadRolls;
		this.meat = meat;
		this.price = price;
		this.tomato = 20;
		this.carrot = 10;
		this.lettuce = 15;
	}
		
	public String getBreadRolls() {
		return breadRolls;
	}

	public void setBreadRolls(String breadRolls) {
		this.breadRolls = breadRolls;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTomato() {
		return tomato;
	}

	public void setTomato(int tomato) {
		this.tomato = tomato;
	}

	public int getCarrot() {
		return carrot;
	}

	public void setCarrot(int carrot) {
		this.carrot = carrot;
	}

	public int getLettuce() {
		return lettuce;
	}

	public void setLettuce(int lettuce) {
		this.lettuce = lettuce;
	}

}
