import java.util.ArrayList;

public class Garage {
    ArrayList < Car  > CarGarage = new ArrayList<>();

    @Override
    public String toString() {
        return "This garage contains ";
    }

    public void addCarToGarage(Car car) {
        CarGarage.add(car);
       }

    public double calculateTotalGreenTax() {
        double totalGreenTax = CarGarage.size();
        for (Car c : CarGarage) {
            totalGreenTax += c.calculateGreenTax();
        }
        return  totalGreenTax;
    }

}
