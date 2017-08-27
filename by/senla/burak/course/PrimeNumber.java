package by.senla.burak.course;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by burak on 25.08.17.
 */
public class PrimeNumber {
    private int limit; //верхняя граница
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    //метод проверки числа на простое
    private boolean isPrime(int num) {
        boolean flag = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //сеттер верхней границы
    public void setLimit() {
        Scanner scanner = new Scanner(System.in);
        limit = scanner.nextInt();
    }

    //получить все числа
    public void getAllPrimes() {
        if (limit < 2) {
            System.out.println("Число должно быть больше 2!");
        }
        else {
            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    numbers.add(i);
                }
            }
        }
    }

    //вывод
    public void display() {
        System.out.println(numbers);
    }

}
