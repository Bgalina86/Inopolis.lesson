package Homework9_IntermediateCertification.Task2WateringACactus;

public class DateTimeLogic {

    /**
     * Проверка на отношение к временному промежутку минуты, часы, дни
     *
     * @return
     */
    public static long checkDateTime(long ageInMinutes) {
        if (ageInMinutes <= 60) {
            return checkMinut(ageInMinutes);
        } else if ((ageInMinutes > 60) && (ageInMinutes <= 1440)) {
            return checkHour(ageInMinutes);
        } else if ((ageInMinutes > 1440) && (ageInMinutes <= 527040)) {
            return checkDates(ageInMinutes);
        }
        return 0;
    }

    //Склонение по минутам
    private static long checkMinut(long ageInMinutes) {
        if ((((ageInMinutes == 1) || ((ageInMinutes > 5) && (ageInMinutes < 10))) || (
            (ageInMinutes > 11) && (ageInMinutes < 20))) && (ageInMinutes % 10
            == 1)) {
            System.out.print(ageInMinutes + " минуту ");
        } else if ((((ageInMinutes > 1) && (ageInMinutes < 5)) || (ageInMinutes > 20)) && (
            (ageInMinutes % 10 == 2) || (
                ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
            System.out.print(ageInMinutes + " минуты ");
        } else {
            System.out.print(ageInMinutes + " минут ");
        }
        return ageInMinutes;
    }

    //Склонение по часам и с переходом на минуты
    private static long checkHour(long ageInMinutes) {
        long remainder = ageInMinutes % 60;
        ageInMinutes = ageInMinutes / 60;

        //Переход на минуты
        if ((remainder) != 0) {
            checkMinut(remainder);
        }
        if ((((ageInMinutes == 1) || ((ageInMinutes > 5) && (ageInMinutes < 10))) || (
            (ageInMinutes > 11) && (ageInMinutes < 20))) && (ageInMinutes % 10
            == 1)) {
            System.out.print(ageInMinutes + " час ");
        } else if ((((ageInMinutes < 5)) || (ageInMinutes > 20)) && ((ageInMinutes % 10 == 2) || (
            ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
            System.out.print(ageInMinutes + " часа ");
        } else {
            System.out.print(ageInMinutes + " часов ");
        }

        return ageInMinutes;
    }

    //Склонение дней с переходом на часы и минуты
    private static long checkDates(long ageInMinutes) {
        long remainder = ageInMinutes % 1440;
        ageInMinutes = ageInMinutes / 24 / 60;

        //Переход на чаты
        if (!(remainder == 0) && (remainder > 60)) {
            checkHour(remainder);
        }//Переход на минуты
        if (!(remainder == 0) && (remainder < 60)) {
            checkMinut(remainder);
        }
        if ((ageInMinutes % 10 == 1)) {
            System.out.print(ageInMinutes + " день ");
        } else if ((((ageInMinutes > 1) && (ageInMinutes < 5)) || (ageInMinutes > 20)) && (
            (ageInMinutes % 10 == 2) || (
                ageInMinutes % 10 == 3) || (ageInMinutes % 10 == 4))) {
            System.out.print(ageInMinutes + " дня ");
        } else {
            System.out.print(ageInMinutes + " дней ");
        }

        return ageInMinutes;
    }

    public static void main(String[] args) {
        /**
         * Тесты
         */
        System.out.println("Test 40 min: " + checkDateTime(40));//минут
        System.out.println("Test 44 min: " + checkDateTime(44));//минуты
        System.out.println("Test 21 min: " + checkDateTime(21));//минуту
        System.out.println("Test 70 min: " + checkDateTime(70));//час
        System.out.println("Test 140 min: " + checkDateTime(140));//часа
        System.out.println("Test 660 min: " + checkDateTime(660));//часов
        System.out.println("Test 1445 min: " + checkDateTime(1875));//день
        System.out.println("Test 2880 min: " + checkDateTime(2886));//дня
        System.out.println("Test 7200 min: " + checkDateTime(7205));//дней

    }


}
