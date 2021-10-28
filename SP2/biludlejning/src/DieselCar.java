public class DieselCar extends Car{
    private boolean hasParticleFilter;
    private int kmPrL;

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        if (this.hasParticleFilter) {
            return "This Diesel car has a particlefiler. It drives " + kmPrL + " kilometres per liter";
        } else if (!this.hasParticleFilter) {
            return "This Diesel car has no particlefiler. It drives " + kmPrL + " kilometres per liter";
        }
     return "";
    }

    public DieselCar(int regNo, String brand, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrl) {
        super(regNo, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrl;
    }

    public int particleFilterTax() {
        int hasNoFilter;
            if (hasParticleFilter ==false) {hasNoFilter = 1000; } else {hasNoFilter =0;}
            return hasNoFilter;
    }
    @Override
    protected double calculateGreenTax() {
        int charge;
        int extraCharge1 = 15260;
        int extraCharge2 = 2770;
        int extraCharge3 = 1850;
        int extraCharge4 = 1390;
        int extraCharge5 = 130;

        if (kmPrL < 5) {
            charge = 10470 + extraCharge1 +particleFilterTax();
        } else if (kmPrL >= 5 && kmPrL < 10) {
            charge = 5500 + extraCharge2 + particleFilterTax();
        } else if (kmPrL >= 10 && kmPrL < 15) {
            charge = 2340 + extraCharge3 + particleFilterTax();
        } else if (kmPrL >= 15 && kmPrL < 20) {
            charge = 1050 + extraCharge4 + particleFilterTax();
        } else if (kmPrL >= 20 && kmPrL < 50) {
            charge = 330 + extraCharge5 + particleFilterTax();
        } else { charge = 0;}
        return charge;
    }
}
