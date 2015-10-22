package gift.candies;

/**
 * Class Mars represent one candy of type Mars inside package of sweets (Gift).
 */

public class Mars extends Candy {

    private double chocolatePercentage;

    public Mars(String name, int weight, double chocolatePercentage) {
        super(name, weight);
        this.chocolatePercentage = chocolatePercentage;

        if (isPercentagePositive(chocolatePercentage)) {
            throw new IllegalArgumentException("Percentage of chocolate can not be negative number.");
        }
    }

    public double getChocolatePercentage() {
        return chocolatePercentage;
    }
}
