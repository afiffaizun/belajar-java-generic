package application;
import data.Pair;
public class PairApp {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("Afif", 31);
		
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());

	}

}
