package gift.candies;

public class Candy {

    /**
     * Class Candy represents candies of single type in Gift (eg. all Toffees inside package of sweets).
     */

    // looks like we can remove 'private' - as we need to see it in package + subclasses -? replace with protected

    protected String name;
    protected double weightOfSingleCandy;
    // that's count of candies of this particular type in a gift
    protected int count;

    public String getName() {
        return name;
    }

    public double getWeightOfSingleCandy() {
        return weightOfSingleCandy;
    }

    public int getCount() {
        return count;
    }

//    public Candy(String name, int count, double weighOfSingleCandy) {
//        this.name = name;
//        this.count = count;
//        this.weighOfSingleCandy = weighOfSingleCandy;
//    }

//    public double calculateCandiesWeight() {
//        return this.getWeightOfSingleCandy() * this.getCount();
//        }
}
