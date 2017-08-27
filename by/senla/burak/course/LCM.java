package by.senla.burak.course;

import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */

public class LCM {

	int numberOne;
	int numberTwo;
	
	public void setLimit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введдите число:");
		numberOne = scanner.nextInt();
		System.out.print("Введдите число:");
		numberTwo = scanner.nextInt();
	}

	public Integer getLCM(int numberOne, int numberTwo) {
		GCD gdc = new GCD();
		return numberOne / gdc.getGCD(numberOne, numberTwo) * numberTwo;
	}

	// вывод
	public void display() {
		System.out.println("НОК(" + numberOne+ ", " + numberTwo + ") = " + getLCM(numberOne, numberTwo));
	}
}
