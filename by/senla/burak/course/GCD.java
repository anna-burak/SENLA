package by.senla.burak.course;

import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */

public class GCD {

	Integer numberOne;
	Integer numberTwo;
	
	public void setLimit() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введдите число:");
		numberOne = scanner.nextInt();
		System.out.print("Введдите число:");
		numberTwo = scanner.nextInt();
	}

	public Integer getGCD(Integer numberOne, Integer numberTwo) {
		return numberTwo.equals(0) ? numberOne : getGCD(numberTwo, numberOne % numberTwo);
	}

	// вывод
	public void display() {
		System.out.println("НОД(" + numberOne+ ", " + numberTwo + ") = " + getGCD(numberOne, numberTwo));
	}
}
