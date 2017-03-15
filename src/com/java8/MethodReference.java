package com.java8;
import java.util.ArrayList;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Naveen");
		names.add("Praveen");
		names.add("Aditya");
		names.add("Mahesh");
		names.add("Bala");
		
		names.forEach(System.out::println);
	}

}
