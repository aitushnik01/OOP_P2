package kz.aitu.oop.practice.practice2.trains;

public class Locomotive {
    private int speed;
    private int carryingCapacity;

    public Locomotive(int speed, int carryingCapacity){
        setSpeed(speed);
        setCarryingCapacity(carryingCapacity);
    }
    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
