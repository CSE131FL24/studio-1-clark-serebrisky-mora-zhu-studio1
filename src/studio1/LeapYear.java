package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Is your year a leap year? ");
		int inputYear = in.nextInt();
		boolean LeapYearStatus = (inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0);
		System.out.println(inputYear + " is a leap year: " + LeapYearStatus);
	}

}
