package by.senla.burak.course;

import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */
public class Palindrom {

	private String text;

	public void setLimit() {
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine();
	}

	public boolean isPalindrom() {
		String lowerCaseText = text.toLowerCase();
		String reverseText = new StringBuilder(lowerCaseText).reverse().toString();
		return reverseText.equals(lowerCaseText);
	}

	// вывод
	public void display() {
		System.out.println("Палиндром?" + (isPalindrom() ? "ДА" : "НЕТ"));
	}
}
