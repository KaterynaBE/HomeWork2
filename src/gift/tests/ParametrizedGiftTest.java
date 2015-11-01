package gift.tests;

import gift.Gift;
import gift.candies.Candy;
import gift.candies.Lollipop;
import gift.candies.Mars;
import gift.candies.Toffee;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Before;

/**
 * Parametrized Find candies test.
 */

@RunWith(value = Parameterized.class)
public class ParametrizedGiftTest {

    private int minWeight;
    private int maxWeight;
    private int quantityOfCandies;

    Gift gift = new Gift();

    @Before
    public void addCandiesToGift() {
        gift.add(new Mars("Mars", 15, 20.5));
        gift.add(new Lollipop("Lollipop", 23, 30.12));
        gift.add(new Toffee("Toffee", 11, 18.56));
        gift.add(new Toffee("Toffee", 31, 14));
        gift.add(new Toffee("Mars", 25, 12));
        gift.add(new Toffee("Lollipop", 40, 16));

    }

    //parameters pass via this constructor
    public ParametrizedGiftTest(int minWeight, int maxWeight, int quantityOfCandies) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.quantityOfCandies = quantityOfCandies;
    }

    @Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { 3, 12, 1 },
                { 6, 15, 2 },
                { 19, 25, 2 },
                { 9, 41, 6 },
                { 24, 40, 3 }
        });
    }

    @Test
    public void testFindCandies() {
        List<Candy> actualCandies = gift.findCandies(minWeight, maxWeight);
        assertEquals(quantityOfCandies, actualCandies.size());

    }
}