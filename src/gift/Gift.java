package gift;

import gift.candies.Candy;
import java.util.*;


/**
 * Class Gift represents created gift containing candies of different types.
 */

public class Gift {

    private List<Candy> candies = new ArrayList<>();

    // ! check all access modificators -> no need on privates almost nowhere
    public void add (Candy candy) {
        candies.add(candy);
    }

    public String toString() {
        return String.format("%d", calculateGiftWeight());
    }

    public int calculateGiftWeight() {
        int weightGift = 0;
        for (Candy candy: candies) {
            weightGift += candy.getWeight();
        }
        return weightGift;
    }

    // Finding list of candies whose weight corresponds to specified one.
    public List<Candy> findCandy(int minWeight, int maxWeight) { // change min + max weight
        ArrayList<Candy> searchedCandies = new ArrayList();
        Iterator<Candy>  it=candies.iterator();
        while (it.hasNext()) {
            Candy current=it.next();
            if(current.getWeight() >= minWeight && current.getWeight() <= maxWeight) {
                searchedCandies.add(current);
            }
        }
        return searchedCandies;
    }
}