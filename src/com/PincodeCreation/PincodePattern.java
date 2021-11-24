package com.PincodeCreation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PincodePattern {
	Scanner sc = new Scanner(System.in);

	public void pincodeUc1() {
		System.out.println("Enter the pincode for uc1 :");
		String pin = sc.nextLine();
		String pattern = "\\d{6}";
		boolean b3 = Pattern.matches(pattern, pin);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-1");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-1");
		}
	}

	public void pincodeUc2() {
		System.out.println("Enter the pincode for uc1 :");
		String pin = sc.nextLine();
		String pattern = "^[0-9]{3}[0-9]{3}$";
		boolean b3 = Pattern.matches(pattern, pin);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-2");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-2");
		}
	}
	
	public void pincodeUc3() {
		System.out.println("Enter the pincode for uc1 :");
		String pin = sc.nextLine();
		String pattern = "^[0-9]{3}(\\s)?[0-9]{3}$";
		boolean b3 = Pattern.matches(pattern, pin);
		if (b3) {
			System.out.println(b3 + "->" + " Match found for condition-3");
		} else {
			System.out.println(b3 + "->" + "Match not found condition-3");
		}
	}
}
