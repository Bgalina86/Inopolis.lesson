package Homework7.testClassNotHomework;

public class DeclinationDateTime {

    public static void main(Integer input) {
        if (input <= 60) {
            if ((((input > 5) && (input < 10)) || ((input > 11) && (input < 20))) && (input % 10
                == 1)) {
                System.out.println(input + " минуту назад");
            } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
                input % 10 == 3) || (input % 10 == 4))) {
                System.out.println(input + " минуты назад");
            } else {
                System.out.println(input + " минут назад");
            }
        } else if ((input > 60) && (input <= 1440)) {
            input = input / 60;
            if ((((input > 5) && (input < 10)) || ((input > 11) && (input < 20))) && (input % 10
                == 1)) {
                System.out.println(input + " час назад");
            } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
                input % 10 == 3) || (input % 10 == 4))) {
                System.out.println(input + " часа назад");
            } else {
                System.out.println(input + " часов назад");
            }

        } else if ((input > 1440) && (input <= 527040)) {
            input = input / 24 / 60;
            if ((input % 10 == 1)) {
                System.out.println(input + " день назад");
            } else if ((((input > 1) && (input < 5)) || (input > 20)) && ((input % 10 == 2) || (
                input % 10 == 3) || (input % 10 == 4))) {
                System.out.println(input + " дня назад");
            } else {
                System.out.println(input + " дней назад");
            }
        }
    }


}
