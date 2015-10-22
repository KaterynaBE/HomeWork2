package gift.candies;

import java.lang.IllegalArgumentException;

/**
 * Class Lollipop represent one candy of type Lollipop inside package of sweets (Gift).
 */

public class Lollipop extends Candy {

    private double sugarPercentage;

    public Lollipop(String name, int weight, double sugarPercentage) {
//        if (!textHasContent(name)) {
//            throw new IllegalArgumentException("Name has no content.");
//        }
        super(name, weight);
        this.sugarPercentage = sugarPercentage;
    }

    // ? not yet used on any place
    public double getSugarPercentage() {
        return sugarPercentage;
    }
//    private boolean textHasContent(String text) {
//        String EMPTY_STRING = "";
//        return (text != null) && (!text.trim().equals(EMPTY_STRING));
//    }
}
