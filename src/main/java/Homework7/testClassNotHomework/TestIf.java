package Homework7.testClassNotHomework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestIf {

    public static void main(String[] args) {
        System.out.print("Введите дату и время публикации: в формате день месяц год час:минут"); //печать сколько прошло времени.
        // Вытащить дату из вводимой в минуты. СДЕЛАТЬ
        String inputD = new Scanner(System.in).nextLine();
        processInputTest(inputD);
       // System.out.println("Finish");
        //System.out.println(input);
    }

    public static void processInputTest(String inputD) {
        try {

           // DateTimeFormatter inputDataTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");

            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm");
            Date inputData = format.parse(inputD);

           //long inputTimeMill = inputData.getTime();
            System.out.println(inputData);

           // System.out.println(inputTimeMill);
//            if (input <= 60) {
//                if ((((input > 5) && (input < 10)) || ((input > 11) && (input < 20))) && (input % 10
//                    == 1)) {
//                    System.out.println(input + " минуту назад");
//                } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
//                    input % 10 == 3) || (input % 10 == 4))) {
//                    System.out.println(input + " минуты назад");
//                } else {
//                    System.out.println(input + " минут назад");
//                }
//            } else if ((input > 60) && (input <= 1440)) {
//                input = input / 60;
//                if ((((input > 5) && (input < 10)) || ((input > 11) && (input < 20))) && (input % 10
//                    == 1)) {
//                    System.out.println(input + " час назад");
//                } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
//                    input % 10 == 3) || (input % 10 == 4))) {
//                    System.out.println(input + " часа назад");
//                } else {
//                    System.out.println(input + " часов назад");
//                }
//
//            } else if ((input > 1440) && (input <= 527040)) {
//                input = input / 24 / 60;
//                if ((input % 10 == 1)) {
//                    System.out.println(input + " день назад");
//                } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
//                    input % 10 == 3) || (input % 10 == 4))) {
//                    System.out.println(input + " дня назад");
//                } else {
//                    System.out.println(input + " дней назад");
//                }
//            }
        }catch (Exception ex){
            System.out.println("ex = " + ex.getMessage());
        }

        }


}