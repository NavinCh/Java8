package com.java8;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExpressions obj = new LambdaExpressions();
		
		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		
		//without type declaration
		MathOperation subtraction = (a, b) -> a - b;
		
		//with return statement and curly braces
		MathOperation multiplication = (int a, int b) -> {return a * b;};
		
		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = " + obj.operate(10, 5, addition));
		System.out.println("10 - 5 = " + obj.operate(10, 5, subtraction));
		System.out.println("10 * 5 = " + obj.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + obj.operate(10, 5, division));
		
		//without paranthesis
		GreetingMessage greet1 = message -> 
		System.out.println("Hello " + message);
		
		//with parenthesis
		GreetingMessage greet2 = (message) ->
		System.out.println("Hello " + message);
		
		greet1.sayMessage("Naveen");
		greet2.sayMessage("Ch");
	}
	
	interface MathOperation{
		int operation(int a, int b);
	}
	
	interface GreetingMessage{
		void sayMessage(String message);
	}
	
	private int operate(int a, int b, MathOperation mathoperation){
		return mathoperation.operation(a, b);
	}
}
