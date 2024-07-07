package Homework9_IntermediateCertification;

public class Task3MaxTwo {

    private static void SortArray(String[] numberCharsArray) {
        int[] numbers = new int[numberCharsArray.length];
        try {
            for (int i = 0; i < numberCharsArray.length;
                i++) {   //перемещаем массив строк в массив чисел
                numbers[i] = Integer.parseInt(numberCharsArray[i]);
            }
        } catch (NumberFormatException n) {
            System.out.println("Введена неккоректная строка");
        }
        int largest = 0;
        int preLargest = 0;

        for (int number : numbers) {
            if (number > largest) {
                preLargest = largest;
                largest = number;
            } else if (number > preLargest && number != largest) {
                preLargest = number;
            }
        }
        System.out.println("Второй по величине элемент массива: " + preLargest);
    }

    public static void main(String[] args) {
        //тестовые данные
        String[] sortArrayTwoMax1 = {"1", "5", "7", "6", "4", "3", "5"};//6
        String[] sortArrayTwoMax2 = {"9", "5", "7", "6", "4", "3", "8"};//8
        String[] sortArrayTwoMax3 = {"1", "5", "7", "6", "4", "8", "5"};//7
        String[] sortArrayTwoMax4 = {"1", "8", "7", "6", "4", "9", "5"};//8

        //Обработка массива
        SortArray(sortArrayTwoMax1);
        SortArray(sortArrayTwoMax2);
        SortArray(sortArrayTwoMax3);
        SortArray(sortArrayTwoMax4);
    }
}
