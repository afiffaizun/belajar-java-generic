package application;

import data.MyData;

public class WildcardApp {

    public static void main(String[] args) {
        
        print(new MyData<Integer>(100));
        print(new MyData<String>("Afif"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static <T> void print(MyData<T> myData) { 
        System.out.println(myData.getData());
    }

}