package gift.candies;

/**
 * Class Toffee represent one candy of type Toffee inside package of sweets (Gift).
 */

public class Toffee extends Candy {

    private double gluconatPercentage;

    public Toffee(String name, int weight, double gluconatPercentage) {
        super(name, weight);
        this.gluconatPercentage = gluconatPercentage;

        if (isPercentagePositive(gluconatPercentage)) {
            throw new IllegalArgumentException("Percentage of glukonat can not be negative number.");
        }
    }

    public double getGluconatePercentage() {
        return gluconatPercentage;
    }
}
