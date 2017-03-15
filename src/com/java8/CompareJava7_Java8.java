package com.java8;

import java.util.*;


public class CompareJava7_Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names1 = new ArrayList<String>();
		names1.add("Naveen");
		names1.add("Praveen");
		names1.add("Aditya");
		names1.add("Mahesh");
		names1.add("Bala");
		
		List<String> names2 = new ArrayList<String>();
		names2.add("Naveen");
		names2.add("Praveen");
		names2.add("Aditya");
		names2.add("Mahesh");
		names2.add("Bala");
		
		CompareJava7_Java8 obj = new CompareJava7_Java8();
		
		System.out.println("Sort using Java 7");
		obj.sortUsing7(names1);
		System.out.println(names1);
		
		System.out.println("Sort using Java 8");
		obj.sortUsing8(names2);
		System.out.println(names2);
	}
	
	private void sortUsing7(List<String> names){
		Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		});
	}
	
	private void sortUsing8(List<String> names){
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
