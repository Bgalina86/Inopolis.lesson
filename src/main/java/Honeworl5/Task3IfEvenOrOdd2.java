package Honeworl5;

import java.util.Random;

public class Task3IfEvenOrOdd2 {
//    ●	Доработайте решение второго задания:
//        ○	если число четное И делится на 4 без остатка, напишите "Четное число. Кратно четырем"
//        ○	если число нечетное И делится на 3 без остатка, напишите "Нечетное число. Кратно трем."


    public static void main(String[] args) {

        int EvenOrOdd = new Random().nextInt(30);
        if ((EvenOrOdd % 2 == 0) && (EvenOrOdd % 4 == 0)) {
            System.out.println(EvenOrOdd);
            System.out.println("Четное число. Кратно четырем");
        } else {
            if ((EvenOrOdd % 2 == 0)) {
                System.out.println(EvenOrOdd);
                System.out.println("Четное число.");
            } else {
                if ((EvenOrOdd % 2 == 1) && (EvenOrOdd % 3 == 0)) {
                    System.out.println(EvenOrOdd);
                    System.out.println("Нечетное число. Кратно трем");
                } else {
                    System.out.println(EvenOrOdd);
                    System.out.println("Нечетное число");
                }
            }
        }
    }

}
