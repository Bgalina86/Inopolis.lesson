package Homework4;

public class Task2Flat {

    public static void main(String[] args) {
        Flat flat1 = new Flat("4", "3", "евроремонт", true, 4.457815);
        Flat flat2 = new Flat("3", "7", "косметический", false, 3.45278);


        // Наличие квартир к продаже
        System.out.println("В продаже по выбранным локациям есть 2 квартиры:");
        System.out.println(
            "* " + flat1.NumberOfRooms + " квартира" + " расположенная на " + flat1.Floor
                + " с ремонтом " + flat1.Repair + ". В доме лифт " + flat1.Elevator
                + ". Стоимость квартиры " + flat1.Price + " руб.");
        System.out.println(
            "* " + flat2.NumberOfRooms + " квартира" + " расположенная на " + flat2.Floor
                + " с ремонтом " + flat2.Repair + ". В доме лифт " + flat2.Elevator
                + ". Стоимость квартиры " + flat2.Price + " руб.");
    }
}
