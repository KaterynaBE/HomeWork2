package gift;

import gift.candies.Candy;

import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;


/**
 * Class Gift represents created gift containing candies of different types.
 */

public class Gift {

    public List<Candy> candies = new ArrayList<>();

    public void add (Candy candy) {
        candies.add(candy);
    }

    public double calculateGiftWeight() {
        double weightGift = 0.0;
        for (Candy candy: candies) {
            weightGift += candy.getWeight();
        }
        return weightGift;
    }

    // Finding list of candies whose weight corresponds to specified one.
    public List<Candy> findCandy(int searchedWeight, List<Candy> candies) {
        ArrayList<Candy> searchedCandies = new ArrayList();
        Iterator<Candy>  it=candies.iterator();
        while (it.hasNext()) {
            Candy current=it.next();
            if(current.getWeight() >= searchedWeight) {
                searchedCandies.add(current);
            }
        }
        return searchedCandies;
    }

    // This does not work -> can not import what I want to import, why?
//    Collection<Candy> filteredList = CollectionUtils.select(candies, new Predicate() {
//        public boolean evaluate(Object o) {
//            Candy c = (Candy) o;
//            return c.getWeight().equals(8)
//                    || c.getWeight().equals(17);
//        }
//    });

    // where should this be placed? Now it's on App (uncommented)
    class WeigthComparator implements Comparator<Candy> {

        @Override
        public int compare(Candy c1, Candy c2) {
            if (c1.getWeight() < c2.getWeight()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}