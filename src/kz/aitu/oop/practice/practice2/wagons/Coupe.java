package kz.aitu.oop.practice.practice2.wagons;


public class Coupe extends Wagon {
    private int capacity = 10;

    public Coupe(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
