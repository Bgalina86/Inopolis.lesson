package Homework3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Item {
    String NameProduct; // название товара
    String IdProduct; // артикул
    double Price; // цена
    double QuantityProduct; // количество товара
    String CharacteristicProduct; // характеристика
    String DateProduct; // сроки хранения

    public Item(String myIdProduct,  double myPrice, double myQuantityProduct, String myCharacteristicProduct,String myDateProduct){
        IdProduct = myIdProduct;
        NameProduct = "Мороженное";
        Price = myPrice;
        QuantityProduct = myQuantityProduct;
        CharacteristicProduct = myCharacteristicProduct;
        DateProduct = myDateProduct;

    }

}
