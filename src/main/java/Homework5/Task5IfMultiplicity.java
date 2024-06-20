package Homework5;

/**
 * Это – классическое задание с собеседования. ●	выведите на экран числа 1 до 100. При этом: ○	если
 * число кратно 3, напечатайте Fizz ○	если число кратно 5, напечатайте Buzz ○	если число кратно и 3,
 * и 5, напечатайте FizzBuzz Результат будет выглядеть так: 1 2 Fizz 4 Buzz ... 13 14 FizzBuzz 16
 * ... 98 Fizz Buzz
 */

public class Task5IfMultiplicity {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
