package Honeworl5;

import java.io.InputStream;
import java.util.Scanner;

public class Card {
    String numberCard;
    String bestBeforeDate;
    String cvv;
    String pinCode;

    public Card(String numberCard, String bestBeforeDate, String cvv, String pinCode) {
        this.numberCard = numberCard;
        this.bestBeforeDate = bestBeforeDate;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }

     public void getCard(){

        // Убираем пробелы из записи и записываем в переменную cartNumberWithoutSpaces
        String cartNumberWithoutSpaces = numberCard.replace(" ", "");

        //Вывод на экран
        System.out.println( " **** **** **** " + numberCard.substring(numberCard.length()-4)); // шаблон "1234 5678 9012 3456";
        System.out.println( " **** **** **** " + cartNumberWithoutSpaces.substring(cartNumberWithoutSpaces.length()-4)); // удалили пробелы
    }

    public void getPinCodeAndNumberCard(){
        /**
         * ●	Опишите в классе метод, который принимает на вход пин-код. Если переданный пин-код совпал с пин-кодом карты, напечатать в консоль номер карты без маски (все цифры)
         */
        String userPinCode = "Qwfr1@";
        Scanner scanner = new Scanner(System.in);
        String pinCode = scanner.nextLine();
        //String pass = scanner.nextLine();
        if (userPinCode.equals(pinCode)){
            System.out.println("Верный");
        } else {
            System.out.println("Неверный");
        }
    }
}
