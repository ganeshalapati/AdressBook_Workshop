package AdressssBook_WorkShop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
/*
 * Purpose : adding data from contact.java
 */
public class AddressBook {
	static AddressBook addressbook = new AddressBook();

	public boolean addContact(ArrayList<Contact> contact) {
		try {
			if (addressbook.readFile(contact)) {
				System.out.println("person is added in file");
			}
			return true;
		} catch (IOException e) {
			System.out.println("person not added in file");
		}
		return false;
	}
}
	

