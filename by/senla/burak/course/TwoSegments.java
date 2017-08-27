package by.senla.burak.course;

import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */
public class TwoSegments {

	private Double x1;
	private Double x2;
	private Double x3;
	private Double x4;

	private Double y1;
	private Double y2;
	private Double y3;
	private Double y4;

	public void setLimit() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите координаты первого отрезка:");

		System.out.print("Введите x1:");
		x1 = scanner.nextDouble();
		System.out.print("Введите y1:");
		y1 = scanner.nextDouble();
		System.out.print("Введите x2:");
		x2 = scanner.nextDouble();
		System.out.print("Введите y2:");
		y2 = scanner.nextDouble();

		System.out.println("Введите координаты второго отрезка:");
		System.out.print("Введите x3:");
		x3 = scanner.nextDouble();
		System.out.print("Введите y3:");
		y3 = scanner.nextDouble();
		System.out.print("Введите x4:");
		x4 = scanner.nextDouble();
		System.out.print("Введите y4:");
		y4 = scanner.nextDouble();
	}

	public boolean isIntersectionSegments() {

		Double v1 = (x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3);
		Double v2 = (x4 - x3) * (y1 - y3) - (y4 - y3) * (x2 - x3);
		Double v3 = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
		Double v4 = (x2 - x1) * (y4 - y1) - (y2 - y1) * (x4 - x1);

		return v1 * v2 < 0 && v3 * v4 < 0;
	}

	public void display() {
		System.out.println("Пересекаются?" + (isIntersectionSegments() ? "Да" : "Нет"));
	}
}
