package Homework3;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Task3Item {

    public static void main(String[] args) {
        Item item1 = new Item("1452", 145,50,"пломбир", "2025-08-12");
        Item item2 = new Item("1453", 150,56,"крем-брюле","2024-08-12");
        Item item3 = new Item("1454", 160,45,"черная смородина", "2025-02-12");
        Item item4 = new Item("1455", 170,58,"шоколадное", "2025-02-22");
        Item item5 = new Item("1456", 180,59,"пломбир с суфле и наполнителем \"шоколадный\"", "2025-08-12");

        //Вывод списка товаров на экран
        System.out.println("В наличие мороженное:");
        System.out.println("* Артикул: " + item1.IdProduct + " Наименование: " + item1.NameProduct + " Цена: " + item1.Price
            + "руб. " + item1.QuantityProduct + "шт. Вид: " + item1.CharacteristicProduct + " Срок годности: " + item1.DateProduct);
        System.out.println("* Артикул: " + item2.IdProduct + " Наименование: " + item2.NameProduct + " Цена: " + item2.Price
            + "руб. " + item2.QuantityProduct + "шт. Вид: " + item2.CharacteristicProduct + " Срок годности: " + item2.DateProduct);
        System.out.println("* Артикул: " + item3.IdProduct + " Наименование: " + item3.NameProduct + " Цена: " + item3.Price
            + "руб. " + item3.QuantityProduct + "шт. Вид: " + item3.CharacteristicProduct + " Срок годности: " + item3.DateProduct);
        System.out.println("* Артикул: " + item4.IdProduct + " Наименование: " + item4.NameProduct + " Цена: " + item4.Price
            + "руб. " + item4.QuantityProduct + "шт. Вид: " + item4.CharacteristicProduct + " Срок годности: " + item4.DateProduct);
        System.out.println("* Артикул: " + item5.IdProduct + " Наименование: " + item5.NameProduct + " Цена: " + item5.Price
            + "руб. " + item5.QuantityProduct + "шт. Вид: " + item5.CharacteristicProduct + " Срок годности: " + item5.DateProduct);

//SimpleDateFormat("2025-01-20'T'20:17:46.384'Z'")
    }

}
