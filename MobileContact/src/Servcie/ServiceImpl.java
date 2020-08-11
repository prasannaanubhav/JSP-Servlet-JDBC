package Servcie;

import java.util.ArrayList;
import java.util.List;
import Model.Contact;

public class ServiceImpl {

	private static List<Contact> list = new ArrayList<Contact>();

	public static void getContactList() {

		if (list.size() == 0) {
			System.out.println("No contacts were found");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + " " + list.get(i).getName() + " -> " + list.get(i).getNumber());
			}
		}

	}

	public static void addContacts(String name, String number) {
		Contact contact = new Contact();
		contact.setName(name);
		contact.setNumber(number);
		list.add(contact);

	}

	public static void updateNameContacts(int pos, String name) {

		if (list.get(pos).getName() == null) {
			System.out.println("Contact with this name" + name + "not found");
		} else {
			list.get(pos).setName(name);
			System.out.println("Name Successfully  updated");
		}

	}

	public static void updateNumberContact(int pos, String number) {

		if (list.get(pos).getNumber() == null) {
			System.out.println("Contact with this name" + number + "not found");
		} else {
			list.get(pos).setNumber(number);
			System.out.println("Number Successfully  updated");
		}

	}

	public static void removeContacts(int pos) {

		if (list.get(pos) == null) {
			System.out.println("Contact with this position not available please try again!!");
		} else {
			list.remove(pos);
			System.out.println("Successfully Removed");
		}
	}

	public static void queryNameContact(String name) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println("Contact with name " + name + " found");
			} else
				System.out.println("Contact with name " + name + " Not found");
		}
	}

	public static void queryNumberContact(String number) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNumber().equals(number)) {
				System.out.println("Contact with name " + number + " found");
			} else {
				System.out.println("Contact with name " + number + " Not found");
			}
		}

	}

}
