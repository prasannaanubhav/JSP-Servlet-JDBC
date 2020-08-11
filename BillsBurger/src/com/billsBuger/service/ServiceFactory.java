package com.billsBuger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.billsBuger.main.BillsBurgerMain;
import com.billsBurger.burger.BaseHamBurger;
import com.billsBurger.burger.DeluxeHamBurger;
import com.billsBurger.burger.HealthyHamBurger;

public class ServiceFactory {

	private List<String> burgerMenu() {

		List<String> hamburgerList = new ArrayList<>();
		hamburgerList.add("HamBurger");
		hamburgerList.add("Healthy Hamburger");
		hamburgerList.add("Deluxe Hamburger");
		return hamburgerList;

	}

	public void burgerRates() {

		BaseHamBurger bhb = new BaseHamBurger("breadRolls", "ChickenMeat", 215);
		HealthyHamBurger hhb = new HealthyHamBurger();
		hhb.setPrice(100);
		hhb.setHealthyPrice(bhb.getPrice() + hhb.getPrice());
		DeluxeHamBurger dhb = new DeluxeHamBurger();
		dhb.setPrice(150);
		dhb.setDeluxePrice(bhb.getPrice() + dhb.getPrice());
		System.out.println();
		List<String> list = burgerMenu();
		System.out.println(list.get(0) + " = " + bhb.getPrice());
		System.out.println(list.get(1) + " = " + hhb.getHealthyPrice());
		System.out.println(list.get(2) + " = " + dhb.getDeluxePrice());
		System.out.println("Additional Materials will cost additional costs");
		System.out.println();
		BillsBurgerMain.mainMenu();
	}

	public void orderBurger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your Burgers and Quantity");
		List<String> list = burgerMenu();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		int value = sc.nextInt();
		sc.nextLine();
		switch (value) {
		case 0:
			hamburger();
			break;
		case 1:
			healthyHamBurger();
			break;
			
		case 2:
			deluxeHamBurger();

		default:
			break;
		}
		sc.close();

	}

	private void hamburger() {

		int price = 0;
		Scanner sc = new Scanner(System.in);
		BaseHamBurger bhb = new BaseHamBurger("breadRolls", "meat", 215);

		System.out.println("Add additionals to continue or exit for basic");
		System.out.println("1: Carrot");
		System.out.println("2: Lettuce");
		System.out.println("3: Tomato");
		System.out.println("4: Exit");

		int value = sc.nextInt();
		if (value == 1) {
			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			price = bhb.getPrice() + (quantity * bhb.getCarrot());
			System.out.println("Total Amount  = " + price);
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}
		if (value == 2) {

			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			price = bhb.getPrice() + (quantity * bhb.getLettuce());
			System.out.println("Total Amount  = " + price);
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}

		if (value == 3) {
			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			price = bhb.getPrice() + (quantity * bhb.getTomato());
			System.out.println("Total Amount  = " + price);
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}

		if (value == 4) {
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}
		sc.close();

	}

	private void healthyHamBurger() {

		int price = 0;
		Scanner sc = new Scanner(System.in);
		BaseHamBurger bhb = new BaseHamBurger("breadRolls", "meat", 215);
		System.out.println("Add additionals to continue or exit for basic");
		System.out.println("1: BrownRoll");
		System.out.println("2: Extra Meat");
		System.out.println("3: Exit");
		int value = sc.nextInt();
		sc.nextLine();
		if (value == 1) {
			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			HealthyHamBurger hhb = new HealthyHamBurger(bhb.getPrice() + 100);
			price = hhb.getHealthyPrice() + (quantity * hhb.getBrownRoll());
			System.out.println("Total Amount = " + price);
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}
		if (value == 2) {
			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			HealthyHamBurger hhb = new HealthyHamBurger(bhb.getPrice() + 100);
			price = hhb.getHealthyPrice() + (quantity * hhb.getExtraMeat());
			System.out.println("Total Amount = " + price);
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}
		if(value==3) {
			BillsBurgerMain.mainMenu();
			sc.nextLine();
		}
		sc.close();

	}
	
	private void deluxeHamBurger() {
		
		int price = 0;
		Scanner sc = new Scanner(System.in);
		BaseHamBurger bhb = new BaseHamBurger("breadRolls", "meat", 215);
		DeluxeHamBurger dhb = new DeluxeHamBurger(bhb.getPrice()+150);
		price = dhb.getDeluxePrice()+dhb.getChips()+dhb.getDrinks();
		System.out.println("Total Amount= "+price);
		System.out.println("Chips And Drinks Are Attached to this Combo Enjoy the meal");
		BillsBurgerMain.mainMenu();
		sc.nextLine();
		sc.close();
	}
}
