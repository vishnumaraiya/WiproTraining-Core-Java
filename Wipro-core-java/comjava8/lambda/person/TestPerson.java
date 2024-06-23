package comjava8.lambda.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(
				new Person("tom","john",23),
				new Person("marry","bob",24),
				new Person("Alex","vishnu",22));
		
		//sort the list by lastname
		Collections.sort(personList,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.lastName.compareTo(p1.lastName);
			}
		});
		
		//print all records without lambda
		System.out.println("Display person list without lambda");
		for(Person p : personList) {
			System.out.println(p);
		}
		
		//sprint all records with lambda
		System.out.println("Display person list with lambda");
		personList.forEach((p) -> System.out.println(p.getFirstName()+ " " + p.getAge()) );

	}

}
