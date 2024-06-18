package Homework5;

import java.util.Random;

public class Task3IfEvenOrOdd2 {
//    ●	Доработайте решение второго задания:
//        ○	если число четное И делится на 4 без остатка, напишите "Четное число. Кратно четырем"
//        ○	если число нечетное И делится на 3 без остатка, напишите "Нечетное число. Кратно трем."


    public static void main(String[] args) {

        // Организация случайного числа
        int EvenOrOdd = new Random().nextInt(30);

        //Проверка на четность и кратность 4
        if ((EvenOrOdd % 2 == 0) && (EvenOrOdd % 4 == 0)) {
            System.out.println(EvenOrOdd);
            System.out.println("Четное число. Кратно четырем");
        } else {
            //Вывод всех четных не относящихся к кратности 4
            if ((EvenOrOdd % 2 == 0)) {
                System.out.println(EvenOrOdd);
                System.out.println("Четное число.");
            } else {
                //Нечетные и кратные 3
                if ((EvenOrOdd % 2 == 1) && (EvenOrOdd % 3 == 0)) {
                    System.out.println(EvenOrOdd);
                    System.out.println("Нечетное число. Кратно трем");
                } else {
                    //Все остальные числа
                    System.out.println(EvenOrOdd);
                    System.out.println("Нечетное число");
                }
            }
        }
    }

}
