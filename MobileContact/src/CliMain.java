import java.util.Scanner;

import Servcie.ServiceImpl;

public class CliMain {

	private static Scanner sc = new Scanner(System.in);

	public static void printAction() {
		System.out.println("Starting Mobile...");
		System.out.println("1: List Of Contacts");
		System.out.println("2: Add new Contact");
		System.out.println("3: Update existing contact");
		System.out.println("4: remove an existing contact");
		System.out.println("5:Query contact");
		System.out.println("6: Shut Down");
		
		printActionFunction();

	}

	public static void listOfContacts() {
		ServiceImpl.getContactList();
	}

	public static void addContacts() {

		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter number:");
		String number = sc.nextLine();
		ServiceImpl.addContacts(name, number);
	}

	public static void updateContacts() {
		System.out.println("Enter the position to update the record");
		int pos = sc.nextInt();
		sc.nextLine();
		System.out.println("1: Change Name");
		System.out.println("2 :Change Number");
		int action = sc.nextInt();
		sc.nextLine();
		switch (action) {
		case 1:
			System.out.println("Enter name");
			String name = sc.nextLine();
			ServiceImpl.updateNameContacts(pos, name);
			break;

		case 2:
			System.out.println("Enter number");
			String number = sc.nextLine();
			ServiceImpl.updateNumberContact(pos, number);
			break;
		}
	}

	public static void removeContacts() {
		System.out.println("Enter the position to remove the contact");
		int pos = sc.nextInt();
		ServiceImpl.removeContacts(pos);
	}

	public static void queryContac() {
		System.out.println("Enter your choice");
		System.out.println("1: Query contact with name");
		System.out.println("2: Query contact with number");
		int option = sc.nextInt();
		sc.nextLine();
		if (option == 1) {
			System.out.println("Enter name");
			String name = sc.nextLine();
			ServiceImpl.queryNameContact(name);
		}
		if (option == 2) {
			System.out.println("Enter number");
			String number = sc.nextLine();
			ServiceImpl.queryNumberContact(number);
		}
	}

	public static void printActionFunction() {
		System.out.println("Enter your choice to proceed");
		int options = sc.nextInt();
		sc.nextLine();

		switch (options) {
		case 1:
			listOfContacts();
			break;

		case 2:
			addContacts();
			break;

		case 3:
			updateContacts();
			break;

		case 4:
			removeContacts();
			break;

		case 5:
			queryContac();
			break;

		case 6:
			System.out.println("Shutting down...");
			break;
		}
		sc.nextLine();
		printAction();
	}

	public static void main(String[] args) {

		printAction();

	}

}
