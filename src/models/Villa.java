package models;

public class Villa extends Facility{
    private String standard;
    private double poolSize;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String standard, double poolSize, int numberOfFloor) {
        this.standard = standard;
        this.poolSize = poolSize;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(double poolSize) {
        this.poolSize = poolSize;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
