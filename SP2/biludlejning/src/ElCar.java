public class ElCar extends Car{
    private int batteryCapacityKWh;
    private int maxKm;

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrkm() {
        return whPrkm;
    }

    public void setWhPrkm(int whPrkm) {
        this.whPrkm = whPrkm;
    }

    @Override
    public String toString() {
        return "This Elcar has a battery capacity of: " + batteryCapacityKWh +" it drives a maximum of " + maxKm + " kilometres. And it uses " + whPrkm + "wh per kilometer it drives";

    }

    private int whPrkm;

    public ElCar(int regNo, String brand, String model, int year, int numberOfDoors, int batteryCapacityKWh, int maxKm, int whPrkm) {
        super(regNo, brand, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrkm = whPrkm;
    }

    @Override
    protected double calculateGreenTax() {
        int charge;
        double whPrkmCalculator = 100/(this.whPrkm/91.25);
        if (whPrkmCalculator < 5) {
            charge = 10470;
        } else if (whPrkmCalculator >= 5 && whPrkmCalculator < 10) {
            charge = 5500;
        } else if (whPrkmCalculator >= 10 && whPrkmCalculator < 15) {
            charge = 2340;
        } else if (whPrkmCalculator >= 15 && whPrkmCalculator < 20) {
            charge = 1050;
        } else if (whPrkmCalculator >= 20 && whPrkmCalculator < 50) {
            charge = 330;
        } else { charge = 0;}
        return charge;
    }
}
