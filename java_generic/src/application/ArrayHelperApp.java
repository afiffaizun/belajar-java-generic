package application;

import util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        
        String[] names = {"Muhammad", "Afif", "Faizun"};
        Integer[] numbers = {1, 2, 4, 3, 5};
        
        System.out.println("Number of names: " + ArrayHelper.count(names));
        System.out.println("Number of numbers: " + ArrayHelper.count(numbers));
    }
}