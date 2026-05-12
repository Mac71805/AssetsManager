package org.example;

public class Vehicle extends Asset{
    private int year;
    private String makeModel;
    private int odometer;

    public Vehicle(String description, String dataAcquired, double originalCost) {
        super(description, dataAcquired, originalCost);
        this.year = year;
        this.makeModel = makeModel;
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
