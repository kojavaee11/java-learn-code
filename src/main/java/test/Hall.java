package test;

import java.util.ArrayList;
import java.util.List;

public class Hall {
	private static List<Person> persons = new ArrayList<Person>();
	
	public static void add(Person person) {
		persons.add(person);
	}
	
	public static Person get(String name) {
		for(Person person : persons) {
			String userName = person.getName();
			if(userName.equalsIgnoreCase(name))
				return person;
		}
		return null;
	}
	
	public static void remove(int index) {
		persons.remove(index);
	}
	
	public static List<Person> getPersons() {
		return persons;
	}
}
