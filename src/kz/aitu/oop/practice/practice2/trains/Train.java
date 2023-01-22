package kz.aitu.oop.practice.practice2.trains;

import kz.aitu.oop.practice.practice2.wagons.Wagon;
import kz.aitu.oop.practice.practice2.wagons.Couchette;
import kz.aitu.oop.practice.practice2.wagons.Coupe;
import kz.aitu.oop.practice.practice2.wagons.Luxury;

import java.util.List;
import java.util.ArrayList;

public class Train extends Locomotive {
    private String locomotive;
    private List<Wagon> wagons;
    private String name;
    private int distance;

    public Train(String locomotive, String name, int distance, int carryingCapacity, int speed) {
        super(speed,carryingCapacity);
        setLocomotive(locomotive);
        setWagons(new ArrayList<>());
        setName(name);
        setDistance(distance);
    }

    public void setLocomotive(String locomotive) {
        this.locomotive = locomotive;
    }

    @Override
    public int getCarryingCapacity() {
        return super.getCarryingCapacity();
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public void addWagon(Wagon wagon) {
        if (wagons.size() < getCarryingCapacity()) {
            wagons.add(wagon);
        } else {
            System.out.println("Stop Geney, Sam budesh tyanut' ostaltalnie wagony");
        }
    }

    public void removeWagon(Wagon wagon) {
        wagons.remove(wagon);
    }
    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Wagon wagon : wagons) {
            if (wagon instanceof Luxury) {
                totalCapacity += ((Luxury) wagon).getCapacity();
            } else if (wagon instanceof Coupe) {
                totalCapacity += ((Coupe) wagon).getCapacity();
            } else if (wagon instanceof Couchette) {
                totalCapacity += ((Couchette) wagon).getCapacity();
            }
        }
        return totalCapacity;
    }

    public int getWagonCount(String wagonType) {
        int count = 0;
        for (Wagon wagon : wagons) {
            if (wagon.getClass().getSimpleName().equals(wagonType)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public int getTravelTime(int distance) {
        return distance / getSpeed();
    }
    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

