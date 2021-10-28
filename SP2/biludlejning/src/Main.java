public class Main {
    public static void main(String[] args) {
        //Car car1 = new DieselCar(1, "Ford", "Taunus", 1920, 1, false,20);
        //System.out.println(car1);
        //System.out.println(car1.calculateGreenTax());
        Garage garage = new Garage();
        Car tesla = new ElCar(3, "Tesla", "New model", 2009, 5, 200, 250, 500);
        Car fiat500 = new DieselCar(2, "Fiat", "500", 2017, 4, false, 10);
        Car fordTaunus = new PetrolCar(1, "Ford", "Taunus", 1920, 1, 92, 10);
        garage.addCarToGarage(tesla);
        garage.addCarToGarage(fiat500);
        garage.addCarToGarage(fordTaunus);

            System.out.println(garage);
        for (Car c  : garage.CarGarage) {
            System.out.println(c);
        }
        System.out.println("The total green tax for all the cars in the garage is " + garage.calculateTotalGreenTax());

    }
}
