package gift.tests;

import gift.Gift;
import gift.candies.Candy;
import gift.candies.Lollipop;
import gift.candies.Mars;
import gift.candies.Toffee;

import org.junit.*;

import java.util.List;
import static org.junit.Assert.*;


/**
 * jUnit tests for Gift class.
 */
public class GiftTest {

    public static Gift gift = null;
    
    @Before
    public void setUp() {
        System.out.println("\nSETUP CLASS");

        gift = new Gift();
    }

    @After
    public void tearDown() {
        System.out.println("\nTEARDOWN RUNNING");
    }


    @Test
    public void testCalculateGiftWeight() {
        gift.add(new Mars("Mars", 15, 20.5));
        assertEquals(15, gift.calculateGiftWeight());
        gift.add(new Lollipop("Lollipop", 23, 30.12));
        gift.add(new Toffee("Toffee", 1, 18.56));
        assertEquals(39, gift.calculateGiftWeight());
    }


    @Test(expected=IllegalArgumentException.class)
    public void testAddCandyWithNegativeWeight() {
        Mars mars = new Mars("Mars", -15, 20.5);
        gift.add(mars);
    }

    @Test
    public void testAddCandy() {
        gift.add(new Lollipop("Lollipop", 10, 30.12));
        gift.add(new Toffee("Toffee", 8, 18.56));
        List<Candy> currentCandies = gift.getCandies();
        assertEquals(2, currentCandies.size());
        assertEquals("Toffee", currentCandies.get(1).getName());
        assertEquals("Lollipop", currentCandies.get(0).getName());
    }

    @Test
    public void testFindCandies() {
        gift.add(new Mars("Mars", 15, 20.5));
        gift.add(new Lollipop("Lollipop", 18, 30.12));
        gift.add(new Toffee("Toffee", 11, 18.56));
        List<Candy> actualCandies = gift.findCandies(10, 12);
        assertEquals(1, actualCandies.size());
        assertEquals("Toffee", actualCandies.get(0).getName());
    }

    @Test
    public void testFindNoCandies() {
        gift.add(new Mars("Mars", 15, 20.5));
        gift.add(new Lollipop("Lollipop", 10, 30.12));
        gift.add(new Toffee("Toffee", 8, 18.56));
        List<Candy> actualCandies = gift.findCandies(25, 28);
        assertEquals(0, actualCandies.size());
    }
}