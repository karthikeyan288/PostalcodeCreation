package com.PincodeCreation;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		PincodePattern pincode = new PincodePattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the condition for 1:UC1 2:UC2");
		int condition = sc.nextInt();
		switch (condition) {
		case 1:
			pincode.pincodeUc1();
			break;
		case 2:
			pincode.pincodeUc2();
			break;
		case 3:
			pincode.pincodeUc3();
			break;
		case 4:
			pincode.pincodeUc4();
			break;
		default:
			System.out.println("Enter the valid data");
			break;
		}
	}
}
