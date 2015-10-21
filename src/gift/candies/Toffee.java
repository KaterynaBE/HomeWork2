package gift.candies;

/**
 * Class Toffee represent one candy of type Toffee inside package of sweets (Gift).
 */

public class Toffee extends Candy {

    protected double gluconatPercentage;

    public Toffee(String name, int weigh, double gluconatPercentage) {
        this.name = name;
        this.weight = weigh;
        this.gluconatPercentage = gluconatPercentage;
    }

    public double getGluconatePercentage() {
        return gluconatPercentage;
    }
}
