package com.billsBurger.burger;

public class HealthyHamBurger extends BaseHamBurger {

	private int brownRoll;
	private int extraMeat;
	private int healthyPrice;

	public HealthyHamBurger() {

	}

	public HealthyHamBurger(int healthyPrice) {
		this.brownRoll = 80;
		this.extraMeat = 100;
		this.healthyPrice = healthyPrice;
	}

	public int getBrownRoll() {
		return brownRoll;
	}

	public void setBrownRoll(int brownRoll) {
		this.brownRoll = brownRoll;
	}

	public int getExtraMeat() {
		return extraMeat;
	}

	public void setExtraMeat(int extraMeat) {
		this.extraMeat = extraMeat;
	}

	public int getHealthyPrice() {
		return healthyPrice;
	}

	public void setHealthyPrice(int healthyPrice) {
		this.healthyPrice = healthyPrice;
	}

}
