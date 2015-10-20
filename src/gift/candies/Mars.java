package gift.candies;

public class Mars extends Candy {

    /**
     * Class Mars represents all candies of type Mars inside package of sweets (Gift).
     */

    public Mars(String name, int count, double weighOfSingleCandy) {
        this.name = name;
        this.count = count;
        this.weightOfSingleCandy = weighOfSingleCandy;
    }

//    public double calculateMarsesWeight() {
//        return this.getWeightOfSingleCandy() * this.getCount();
//    }
}
