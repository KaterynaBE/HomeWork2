package gift;

import gift.candies.Candy;
import java.util.*;
import gift.exceptions.ParametersMismatchException;
import gift.exceptions.EmptyGiftException;



/**
 * Class Gift represents created gift containing candies of different types.
 */

public class Gift {

    private List<Candy> candies = new ArrayList<>();

    // ! check all access modificators -> no need on privates almost nowhere
    public void add (Candy candy) {
        candies.add(candy);
    }

    public int calculateGiftWeight() throws EmptyGiftException {
        int weightGift = 0;
        for (Candy candy: candies) {
            weightGift += candy.getWeight();
        }
            if (weightGift == 0) {
                throw new EmptyGiftException("Error: gift is empty!!! Quickly add 58 chocolate candies there! ") ;
            }
        return weightGift;
    }

    // Finding list of candies whose weight corresponds to specified one.
    public List<Candy> findCandy(int minWeight, int maxWeight) throws ParametersMismatchException {
        if (minWeight > maxWeight)
        {
            throw new ParametersMismatchException("Error: minimal weight should be bigger than maximal." ) ;
        }
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

    public void sortCandies() {
        Collections.sort(candies);
    }

    public List<Candy> getCandies() {
        return candies;
    }
}