package apartments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Building {

    public int windowsNumber;
    public  boolean hasAGym;
    public  boolean hasAGarage;
    public  boolean hasAGarden;
    public int roomsNumber;
    public int flatsNumber;
    public double area;

    public Building(int windowsNumber, boolean hasAGym, boolean hasAGarage, boolean hasAGarden, int flatsNumber, double area) {
        this.windowsNumber = windowsNumber;
        this.hasAGym = hasAGym;
        this.hasAGarage = hasAGarage;
        this.hasAGarden = hasAGarden;
        this.flatsNumber = flatsNumber;
        this.area = area;
    }
}
