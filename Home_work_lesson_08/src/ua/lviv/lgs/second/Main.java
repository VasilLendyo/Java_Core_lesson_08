package ua.lviv.lgs.second;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		evenOrOdd();
	}
	
	public static void evenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		
		double number = sc.nextDouble();
		
		if(number % 1 == 0) {
			if(number % 2 ==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		}else {
			System.out.println("Not integer");
		}
	}

}
