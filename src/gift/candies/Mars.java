package gift.candies;

/**
 * Class Mars represent one candy of type Mars inside package of sweets (Gift).
 */

public class Mars extends Candy {

    protected double chocolatePercentage;

    public Mars(String name, int weight, double chocolatePercentage) {
        super(name, weight);
        this.chocolatePercentage = chocolatePercentage;
    }

    public double getChocolatePercentage() {
        return chocolatePercentage;
    }
}
