package models;

public class House extends Facility{
    private String standard;
    private int numberOfFloor;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    public House(String standard, int numberOfFloor) {
        this.standard = standard;
        this.numberOfFloor = numberOfFloor;
    }
}
