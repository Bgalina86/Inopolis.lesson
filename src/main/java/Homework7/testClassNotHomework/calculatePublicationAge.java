package Homework7.testClassNotHomework;

public class calculatePublicationAge {

    public calculatePublicationAge(long ageInMinutes)
    {
        if (ageInMinutes <= 60) {
            if ((((ageInMinutes > 5) && (ageInMinutes < 10)) || ((ageInMinutes > 11) && (ageInMinutes < 20))) && (ageInMinutes % 10
                == 1)) {
                System.out.println(ageInMinutes + " минуту назад");
            } else if ((((ageInMinutes > 1) && (ageInMinutes < 5)) || (ageInMinutes > 20)) && ((ageInMinutes % 10 == 2) || (
                ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
                System.out.println(ageInMinutes + " минуты назад");
            } else {
                System.out.println(ageInMinutes + " минут назад");
            }
        } else if ((ageInMinutes > 60) && (ageInMinutes <= 1440)) {
            ageInMinutes = ageInMinutes / 60;
            if ((((ageInMinutes > 5) && (ageInMinutes < 10)) || ((ageInMinutes > 11) && (ageInMinutes < 20))) && (ageInMinutes % 10
                == 1)) {
                System.out.println(ageInMinutes + " час назад");
            } else if ((((ageInMinutes > 1) && (ageInMinutes < 5)) || (ageInMinutes > 20)) && ((ageInMinutes % 10 == 2) || (
                ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
                System.out.println(ageInMinutes + " часа назад");
            } else {
                System.out.println(ageInMinutes + " часов назад");
            }

        } else if ((ageInMinutes > 1440) && (ageInMinutes <= 527040)) {
            ageInMinutes = ageInMinutes / 24 / 60;
            if ((ageInMinutes % 10 == 1)) {
                System.out.println(ageInMinutes + " день назад");
            } else if ((((ageInMinutes > 1) && (ageInMinutes < 5)) || (ageInMinutes > 20)) && ((ageInMinutes % 10 == 2) || (
                ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
                System.out.println(ageInMinutes + " дня назад");
            } else {
                System.out.println(ageInMinutes + " дней назад");
            }
        }

    }


    public static void main(String[] args) {


    }


}
