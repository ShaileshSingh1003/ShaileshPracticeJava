package main;

import java.util.Scanner;

class Calculator{
	
	public double sum(double a, double b) {	
		return a+b;
	}
	
	public double substraction(double a, double b) {	
		return a-b;
	}
	
	public double multiply(double a, double b) {	
		return a*b;
	}
	
	public double divide(double a, double b) {	
		return a/b;
	}
	
	
	
	public static void main (String args[]) {
		Calculator a1= new Calculator();
		Scanner sc = new Scanner(System.in);
		int i=0;
		while (i==0) {
		System.out.println("Enter first number");
		double a = sc.nextDouble();
		
		System.out.println("Enter Second number");
		double b = sc.nextDouble();
		
		System.out.println("Enter operation, press 1 for sum, 2 for substraction, 3 for multiply and 4 to divide");
		int c = sc.nextInt();
		
		switch (c) {
		case 1: System.out.println(a1.sum(a,b));
				break;
		case 2: System.out.println(a1.substraction(a,b));
				break;
		case 3: System.out.println(a1.multiply(a, b));
				break;
		case 4: System.out.println(a1.divide(a, b));
				break;
		}
		System.out.println("To continue press 0, else press 1 to exit");
		i = sc.nextInt();
		
		}
	}


}