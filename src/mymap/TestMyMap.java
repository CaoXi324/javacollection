package mymap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMyMap {

    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        myMap.put(1, "apple");
        myMap.put("3", 3);
        myMap.put(3, "cat");
        System.out.println(myMap.size);
        myMap.replace(2, "rbanana");
        System.out.println(myMap.get(2));
        System.out.println(myMap.get(1));
        System.out.println(myMap.get("3"));
        System.out.println(myMap.containsValue("apple"));
        System.out.println(myMap.containsKey(2));

    }
}
