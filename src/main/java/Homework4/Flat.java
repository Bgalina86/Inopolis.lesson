package Homework4;

public class Flat {

    String NumberOfRooms; // кол-во комнат
    String Floor; // этаж
    String Repair; //тип ремонта
    boolean Elevator; // лифт
    double Price;

    public Flat(String myNumberOfRooms, String myFloor, String myRepair, boolean myElevator, double myPrice) {
        NumberOfRooms = myNumberOfRooms;
        Floor = myFloor;
        Repair = myRepair;
        Elevator = myElevator;
        Price = myPrice;

        String ElevatorTextTrue = "есть";
        String ElevatorTextFalse = "нет";
        String Elevator1 = Elevator;
        if ("true" == Elevator) {
            System.out.println(ElevatorTextTrue);
        } else {System.out.println(ElevatorTextFalse);}
   }

}
