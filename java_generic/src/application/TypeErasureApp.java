package application;
import data.MyData;
public class TypeErasureApp {

	public static void main(String[] args) {
		
		MyData myData = new MyData("Afif");
		
		MyData<Integer> integerMyData = (MyData<Integer>) myData;
		Integer integer = integerMyData.getData();

	}

}
