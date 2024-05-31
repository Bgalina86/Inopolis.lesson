package Homework4;

public class Task1NambeCart {

    public static void main(String[] args) {
        // На вход подается
        String cartNumber = "1234 5678 9012 3456";

        // Убираем пробелы из записи и записываем в переменную cartNumberWithoutSpaces
        String cartNumberWithoutSpaces = cartNumber.replace(" ", "");

        //Вывод на экран
        System.out.println("Маскировка номера карты с пробелами: " + " **** **** **** " + cartNumber.substring(cartNumber.length()-4));
		System.out.println("Маскировка номера карты без пробелов: " + " **** **** **** " + cartNumberWithoutSpaces.substring(cartNumberWithoutSpaces.length()-4));
    }
}
