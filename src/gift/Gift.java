package gift;

import gift.candies.Candy;
// ? import gift.candies.*;

import java.util.ArrayList;
import java.util.List;

public class Gift {

    public List<Candy> candies = new ArrayList<>();

    public void add (Candy candy) {
        candies.add(candy);
    }

    public Candy getObject(int i) {
        return candies.get(i);
    }

    public double calculateGiftWeight() {
        double weightGift = 0.0;
        for (int i = 0; i < candies.size(); i++) {
            weightGift += candies.get(i).getWeightOfSingleCandy() * candies.get(i).getCount();
        }
        return weightGift;
    }

//    public double calculateGiftWeight() {
//        double giftWeight = 0.0;
//        giftWeight += ??.calculateToffeesWeight() + ??.calculateGiftWeight() +??.calculateMarsesWeight()
//        return giftWeight;
//        }
}