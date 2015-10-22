package gift.candies;

/**
 * Class Toffee represent one candy of type Toffee inside package of sweets (Gift).
 */

public class Toffee extends Candy {

    protected double gluconatPercentage;

    public Toffee(String name, int weight, double gluconatPercentage) {
        super(name, weight);
        this.gluconatPercentage = gluconatPercentage;
    }

    public double getGluconatePercentage() {
        return gluconatPercentage;
    }
}
