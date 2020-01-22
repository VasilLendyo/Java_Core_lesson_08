package ua.lviv.lgs.third;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		calculate();
	}
	
	public static void calculate() {
		System.out.println("Enter two integers numbers to add");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double first = sc.nextDouble();
		
		System.out.println("Enter second number");
		double second = sc.nextDouble();
		
		if(first % 1 ==0 && second % 1 == 0) {
			System.out.println("Sum is equal : " + (first + second));
		}else {
			System.out.println("Number entered incorrectly!!!");
		}
		}
	}

