package by.senla.burak.course;

/**
 * Created by burak on 25.08.17.
 */
public class Main {
    public static void main(String[] args) {
        PrimeNumber myIsPrime = new PrimeNumber();
        System.out.println("1. Простые числа");
        System.out.print("Введите число: ");
        myIsPrime.setLimit();
        myIsPrime.getAllPrimes();
        System.out.println("Простые числа = ");
        myIsPrime.display();

        Fibonacci fib = new Fibonacci();
        System.out.println("2. Числа Фибоначи");
        System.out.print("Введите число: ");
        fib.setLimit();
        fib.getAllFibonacci();
        System.out.println("Простые числа = ");
        fib.display();
        
        TwoSegments segments = new TwoSegments();
        System.out.println("3. Пересечение отрезков");
        segments.setLimit();
        segments.display();

        System.out.println("4. НОД");
        GCD gcd = new GCD();
        gcd.setLimit();
        gcd.display();

        System.out.println("5. НОК");
        LCM lcm = new LCM();
        lcm.setLimit();
        lcm.display();
        
        Palindrom palindrom = new Palindrom();
        System.out.println("6. Палиндром");
        System.out.print("Введите текст: ");
        palindrom.setLimit();
        palindrom.display();
        
        DelText delText = new DelText();
        System.out.println("7. Удаление из текста числа");
        System.out.print("Введите текст: ");
        delText.enterValue();
        delText.getDelNumberText();
        delText.display();
    }

}
