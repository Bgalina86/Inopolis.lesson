package Homework4;

// Задача про массив чисел
//     Создайте массив
//     Массив хранит 3 дробных числа.
//     Положите в массив значение чисел Пи, е и единицу
//     Дробные числа с точностью в 5 знаков после запятой
public class Task2ArrayNumber {

    public static void main(String[] args) {
        // Организация массива из 5 элементов
        double[] ArrayOfDoubleNumder = new double[3];

        //Заполнение массива данными
        ArrayOfDoubleNumder[0] = Math.PI;
        ArrayOfDoubleNumder[1] = Math.E;
        ArrayOfDoubleNumder[2] = 1.000000000;

        //Вывод на экран элементов из массива с точностью до 5 знака после запятой
        System.out.printf("Пи: " + "%.5f", ArrayOfDoubleNumder[0]);
        System.out.printf("\n E: " + "%.5f", ArrayOfDoubleNumder[1]);
        System.out.printf("\n 1: " + "%.5f", ArrayOfDoubleNumder[2]);
        System.out.println("\n////");
        String ArrayString;

        ArrayString = String.valueOf(
            "Pi = " + ArrayOfDoubleNumder[0] +" E = "+ ArrayOfDoubleNumder[1] + " 1 = " + ArrayOfDoubleNumder[2]);
System.out.printf(ArrayString);
    }


}
