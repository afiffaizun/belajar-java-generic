package application;
import java.util.Arrays;
import data.Person;

public class ComparableApp {

	public static void main(String[] args) {
		
		Person[] people = {
				new Person("Afif", "Indonesia"),
				new Person("Alex", "Amerika"),
				new Person("Budi","Indonesia")
		};
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));

	}

}
