package by.senla.burak.course;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by burak on 26.08.17.
 */

public class Fibonacci {
    private int limit;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    public void setLimit() {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
    }

    public void getAllFibonacci() {
        if (limit < 2) {
            System.out.println("Число должно быть больше 2!");
        }
        else {
            for (int i = 1; findFibonacciNumber(i) < limit; i++) {
                numbers.add(findFibonacciNumber(i));
            }
        }
    }

    //вывод
    public void display() {
        System.out.println(numbers);
    }

    private int findFibonacciNumber(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return findFibonacciNumber(number - 2) + findFibonacciNumber(number - 1);
        }
    }
}
