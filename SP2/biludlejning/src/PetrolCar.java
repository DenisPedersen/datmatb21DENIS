public class PetrolCar extends Car {
    private int octaneNo;

    public int getOctaneNo() {
        return octaneNo;
    }

    public void setOctaneNo(int octaneNo) {
        this.octaneNo = octaneNo;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    private int kmPrL;

    @Override
    public String toString() {
        return "This PetrolCar has an octaneNo of: " + octaneNo + "and it drives " + kmPrL + " per liter";
    }

    public PetrolCar(int regNo, String brand, String model, int year, int numberOfDoors, int octaneNo, int kmPrL) {
        super(regNo, brand, model, year, numberOfDoors);
        this.octaneNo = octaneNo;
        this.kmPrL = kmPrL;
    }

    @Override
    protected double calculateGreenTax() {
        int charge;

        if (kmPrL < 5) {
            charge = 10470;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            charge = 5500;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            charge = 2340;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            charge = 1050;
        } else if (kmPrL >= 20 && kmPrL < 50) {
            charge = 330;
        } else { charge = 0;}
        return charge;
    }
}

