package gift.candies;


/**
 * Class Lollipop represent one candy of type Lollipop inside package of sweets (Gift).
 */

public class Lollipop extends Candy {

    private double sugarPercentage;

    public Lollipop(String name, int weight, double sugarPercentage) {
        super(name, weight);
        this.sugarPercentage = sugarPercentage;

        if (isPercentagePositive(sugarPercentage)) {
            throw new IllegalArgumentException("Percentage of sugar can not be negative number.");
        }
    }

    public double getSugarPercentage() {
        return sugarPercentage;
    }
}
