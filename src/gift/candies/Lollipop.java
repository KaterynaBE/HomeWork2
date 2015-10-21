package gift.candies;


/**
 * Class Lollipop represent one candy of type Lollipop inside package of sweets (Gift).
 */

public class Lollipop extends Candy {

    protected double sugarPercentage;

    public Lollipop(String name, int weight, double sugarPercentage) {
        this.name = name;
        this.weight = weight;
        // super(name, weight); - 'super' is red. how to make it work and is it
        this.sugarPercentage = sugarPercentage;
    }

    // ? not yet used on any place
    public double getSugarPercentage() {
        return sugarPercentage;
    }

}
