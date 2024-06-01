package Homework3;

public class Room {

    double CeilingHeight; // высота в см
    double LengthRoom; // длинна в см
    double WidthRoom; // ширина в см



    public Room(double myCeilingHeight, double myLengthRoom, double myWidthRoom){
        CeilingHeight = myCeilingHeight;
        LengthRoom = myLengthRoom;
        WidthRoom = myWidthRoom;


       double Square = (double) (2 * (myLengthRoom + myWidthRoom) * myCeilingHeight);
    }
}
