package Honeworl5;

import java.util.Scanner;

/**
 * Маскировка карты 2.0 ●	Создайте класс Card ●	У класса должны быть поля: ○	номер ○	срок годности
 * ○	cvv ○	pinCode ●	Поля класса должны задаваться через конструктор ●	Опишите в классе метод,
 * который печатает номер карты в формате "**** **** **** 3456" ●	Опишите в классе метод, который
 * принимает на вход пин-код. Если переданный пин-код совпал с пин-кодом карты, напечатать в консоль
 * номер карты без маски (все цифры) ●	Создайте класс MyProgram + метод psvm ○	В методе создайте
 * новую карту ○	Вызовите сначала метод печати с маской ○	Потом метод печати с пин-кодом
 * ○	Убедитесь, что нельзя получить никакие данные карты напрямую через поля (используйте private)
 */
public class Task1Metod {

    public static void main(String[] args) {
        Card pinCode = new Card("1244 4513 7856 8563", "02.05.2024", "455", "4578");
/**
 * ●	Создайте класс MyProgram + метод psvm
 * ○	В методе создайте новую карту
 * ○	Вызовите сначала метод печати с маской
 * ○	Потом метод печати с пин-кодом
 * ○	Убедитесь, что нельзя получить никакие данные карты напрямую через поля (используйте private)
 */
        pinCode.getCard();
        pinCode.getPinCodeAndNumberCard("4578");


    }

}
