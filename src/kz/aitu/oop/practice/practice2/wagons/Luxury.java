package kz.aitu.oop.practice.practice2.wagons;

public class Luxury extends Wagon {
    private int capacity = 5;

    public Luxury(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
