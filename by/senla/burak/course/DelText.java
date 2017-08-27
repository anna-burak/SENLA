package by.senla.burak.course;

import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */

public class DelText {

	private String text;

	public void enterValue() {
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine();
	}

	public String getDelNumberText() {
		return text.replaceAll("[0-9]", "");
	}

	// вывод
	public void display() {
		System.out.println(getDelNumberText());
	}
}
