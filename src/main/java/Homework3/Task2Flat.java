package Homework3;

public class Task2Flat {

    public static void main(String[] args) {
        //Квартира № 1
        Flat flat1 = new Flat("4", "3", "евроремонт", true, 4.457815);
        Room Flat1room1 = new Room(2.5, 2.3, 3.5);
        Room Flat1room2 = new Room(2.5, 2, 2.5);
        Room Flat1room3 = new Room(2.5, 2.3, 3.5);
        Room Flat1room4 = new Room(2.5, 4, 2.5);

        //Квартира № 2
        Flat flat2 = new Flat("3", "7", "косметический", false, 3.45278);
        Room Flat2room1 = new Room(2.5, 2.3, 3.5);
        Room Flat2room2 = new Room(2.5, 2.8, 3.7);
        Room Flat2room3 = new Room(2.5, 2.1, 3);


        // Наличие квартир к продаже
        System.out.println("В продаже по выбранным локациям есть 2 квартиры:");
        System.out.println(
                "* " + flat1.NumberOfRooms + " квартира" + " расположенная на " + flat1.Floor
                        + " с ремонтом " + flat1.Repair + ". В доме лифт " + flat1.Elevator
                        + ". Стоимость квартиры " + flat1.Price + " руб."
                        + "\n Площадь комната 1: " + 2 * (Flat1room1.LengthRoom + Flat1room1.WidthRoom) * Flat1room1.CeilingHeight + " м^2"
                        + "\n Площадь комната 2: " + 2 * (Flat1room2.LengthRoom + Flat1room2.WidthRoom) * Flat1room2.CeilingHeight + " м^2"
                        + "\n Площадь комната 2: " + 2 * (Flat1room3.LengthRoom + Flat1room3.WidthRoom) * Flat1room3.CeilingHeight + " м^2"
                        + "\n Площадь комната 2: " + 2 * (Flat1room4.LengthRoom + Flat1room4.WidthRoom) * Flat1room4.CeilingHeight + " м^2");
        System.out.println(
                "* " + flat2.NumberOfRooms + " квартира" + " расположенная на " + flat2.Floor
                        + " с ремонтом " + flat2.Repair + ". В доме лифт " + flat2.Elevator
                        + ". Стоимость квартиры " + flat2.Price + " руб."
                        + "\n Площадь комната 1: " + 2 * (Flat2room1.LengthRoom + Flat2room1.WidthRoom) * Flat2room1.CeilingHeight + " м^2"
                        + "\n Площадь комната 2: " + 2 * (Flat2room2.LengthRoom + Flat2room2.WidthRoom) * Flat2room2.CeilingHeight + " м^2"
                        + "\n Площадь комната 2: " + 2 * (Flat2room3.LengthRoom + Flat2room3.WidthRoom) * Flat2room3.CeilingHeight + " м^2");
    }
}
