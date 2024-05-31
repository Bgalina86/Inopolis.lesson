package Homework4;

public class Room {

    double CeilingHeight; // высота
    double LengthRoom; // длинна
    double WidthRoom; // ширина
    boolean DoubleGlazedWindow; // стеклопакеты / не стеклопакеты
    boolean Repair; // Ремонт

    public Room(double myCeilingHeight, double myLengthRoom, double myWidthRoom,boolean myDoubleGlazedWindow,boolean myRepair){
        myCeilingHeight =CeilingHeight;
        myLengthRoom = LengthRoom;
        myWidthRoom = WidthRoom;
        myDoubleGlazedWindow = DoubleGlazedWindow;
        myRepair=Repair;

    }
}
