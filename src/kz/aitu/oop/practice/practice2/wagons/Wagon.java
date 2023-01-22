package kz.aitu.oop.practice.practice2.wagons;

public abstract class Wagon {
    private String id;

    public Wagon(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
