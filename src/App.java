import gift.candies.*;
import gift.Gift;

import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] arg) {

        // Created  few candies objects.
        Mars mars = new Mars("Mars", 15, 20.5);
        Lollipop lollipop = new Lollipop("Lollipop", 10, 30.12);
        Toffee toffee = new Toffee("Toffee", 8, 18.56);

        // Create gift.
        Gift gift = new Gift();
        gift.add(mars);
        gift.add(lollipop);
        gift.add(toffee);

        // where should this be placed?
//        class WeightComparator implements Comparator<Candy> {
//
//            @Override
//            public int compare(Candy c1, Candy c2) {
//                if (c1.getWeight() < c2.getWeight()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        }

        // not clear why it does not accept 'candies'
        Collections.sort(candies, new WeigthComparator());
        System.out.println("Sorted list entries: ");
        for(Candy c: candies){
            System.out.println(c);
    }
}