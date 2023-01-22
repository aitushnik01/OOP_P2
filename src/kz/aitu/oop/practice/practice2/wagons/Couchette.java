package kz.aitu.oop.practice.practice2.wagons;


public class Couchette extends Wagon {
    private int capacity = 60;

    public Couchette(String id, int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
