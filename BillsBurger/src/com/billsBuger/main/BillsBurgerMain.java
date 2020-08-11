package com.billsBuger.main;

import java.util.Scanner;

import com.billsBuger.service.ServiceFactory;

public class BillsBurgerMain {

	public static void mainMenu() {

		System.out.println(
				"Hello Welcome to BillsBurger Shop Choose the following number to proceed to order your HamBurgers");
		System.out.println();

		System.out.println("1: BurgerMenu ");
		System.out.println("2: OrderBurger");
		System.out.println("3: Exit");
		mainMenuDetails();

	}

	public static void mainMenuDetails() {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();

		ServiceFactory sf = new ServiceFactory();

		switch (a) {
		case 1:
			sf.burgerRates();
			break;

		case 2:
			sf.orderBurger();
			break;

		case 3:
			mainMenu();
			break;

		}
		sc.nextLine();
		mainMenu();
		sc.close();

	}

	public static void main(String[] args) {

		mainMenu();
	}
}
