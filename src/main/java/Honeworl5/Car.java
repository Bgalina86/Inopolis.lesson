package Honeworl5;

public class Car {

    String brend;
    String model;
    String plateNumber;
    String color;
    int currentSpeed = 0;

    public Car(String brend, String model) {
        this.brend = brend;
        this.model = model;
        this.plateNumber = plateNumber;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void speedUp(int currentSpeedIncrease) {
        this.currentSpeed = this.currentSpeed + currentSpeedIncrease;
    }

    public void breakCurrentSpeed() {
        if (this.currentSpeed <= 10) {
            this.currentSpeed = 0;
        }
        if (this.currentSpeed >= 10) {
            this.currentSpeed = this.currentSpeed - 10;
        }
    }
}
