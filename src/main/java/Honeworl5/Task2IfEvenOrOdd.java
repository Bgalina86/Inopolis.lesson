package Honeworl5;
//●	Создайте переменную типа int и присвойте ей любое значение
//    ●	Если число четное (делится на 2 без остатка), напишите "Четное число."
//    ●	Если число нечетное, напишите "Нечетное число."
//    Чтобы проверить, что число четное, нужно выяснить, делится ли оно на 2 без остатка. Для этого существует оператор % – он возвращает остаток от деления. Например:
//// в переменную запишется 1. Потому что 16:3 = 5 и один в остатке.
//    int result = 16 % 3;
//
//// в переменную запишется 0. Потому что 16:4 = 4 и ноль в остатке.
//    int result = 16 % 4;
//
//// в переменную запишется 0. Потому что 10:2 = 5 и ноль в остатке.
//    int result = 10 % 2;
//
//// в переменную запишется 1. Потому что 11:2 = 5 и один в остатке.
//    int result = 11 % 2;


import java.util.Random;

public class Task2IfEvenOrOdd {

    public static void main(String[] args) {
        int EvenOrOdd = new Random().nextInt(30);
        if (EvenOrOdd % 2 == 0) {
            System.out.println(EvenOrOdd);
            System.out.println("Четное число");
        } else {
            System.out.println(EvenOrOdd);
            System.out.println("Нечетное число");
        }
    }

}
