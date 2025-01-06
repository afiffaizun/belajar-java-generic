package application;
import data.Person;
import java.util.Comparator;
import java.util.Arrays;
public class ComparatorApp {

	public static void main(String[] args) {
		Person[] people = {
				new Person("Afif", "Indonesia"),
				new Person("Alex", "Amerika"),
				new Person("Budi","Indonesia")
		};
		
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Arrays.sort(people, comparator);
		System.out.println(Arrays.toString(people));

	}

}
