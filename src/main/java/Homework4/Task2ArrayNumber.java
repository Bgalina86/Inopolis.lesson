package Homework4;

// Задача про массив чисел
//     Создайте массив
//     Массив хранит 3 дробных числа.
//     Положите в массив значение чисел Пи, е и единицу
//     Дробные числа с точностью в 5 знаков после запятой
public class Task2ArrayNumber {

    public static void main(String[] args) {
        // Организация массива из 5 элементов
        String[] ArrayOfDoubleNumder = new String[3];

        //Заполнение массива данными
        String valuePi = String.format("%.5f", Math.PI);
        ArrayOfDoubleNumder[0] = valuePi;
        String valueE = String.format("%.5f", Math.E);
        ArrayOfDoubleNumder[1] = valueE;
        String value1 = String.format("%.5f", 1.00000000000000);
        ArrayOfDoubleNumder[2] = value1;

        // Вывод данных на экран
        System.out.println(ArrayOfDoubleNumder[0]);
        System.out.println(ArrayOfDoubleNumder[1]);
        System.out.println(ArrayOfDoubleNumder[2]);
    }
}
