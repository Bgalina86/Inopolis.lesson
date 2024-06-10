package Honeworl5;

public class Car {

    String brend;
    String modek;
    String plateNumber;
    String color;
    int currentSpeed = 0;

    public Car(String brend, String modek, String plateNumber, String color, int currentSpeed) {
        this.brend = brend;
        this.modek = modek;
        this.plateNumber = plateNumber;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {return this.currentSpeed;}
    public void speedUp(int currentSpeedIncrease) {this.currentSpeed=this.currentSpeed+currentSpeedIncrease;}
    public void breakCurrentSpeed(){
        if (this.currentSpeed <=10){this.currentSpeed=0;}
        this.currentSpeed=this.currentSpeed-10;}
}
