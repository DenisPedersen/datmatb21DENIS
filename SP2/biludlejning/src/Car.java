public abstract class Car {
    private int regNo;

    public int getRegNo() {
        return regNo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    private String brand;
    private String model;

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    private int year;
    private int numberOfDoors;

    public Car(int regNo, String brand, String model, int year, int numberOfDoors) {
        this.regNo = regNo;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }
    abstract protected double calculateGreenTax();


}
