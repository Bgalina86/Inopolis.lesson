package Homework3;

public class Room {

    double CeilingHeight; // высота в см
    double LengthRoom; // длинна в см
    double WidthRoom; // ширинав см
    //boolean DoubleGlazedWindow; // стеклопакеты / не стеклопакеты


    public Room(double myCeilingHeight, double myLengthRoom, double myWidthRoom){
        CeilingHeight = myCeilingHeight;
        LengthRoom = myLengthRoom;
        WidthRoom = myWidthRoom;
        //DoubleGlazedWindow = myDoubleGlazedWindow;

       double Square = (double) (2 * (myLengthRoom + myWidthRoom) * myCeilingHeight);
    }
}
