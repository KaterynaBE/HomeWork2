package gift.tests;

import gift.Gift;
import gift.candies.Candy;
import gift.candies.Lollipop;
import gift.candies.Mars;
import gift.candies.Toffee;
import org.junit.*;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;


/**
 * jUnit tests for Gift class.
 */
public class GiftTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nSETUP CLASS RUNNING");
        Gift gift = new Gift();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("\nTEARDOWN CLASS RUNNING");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("\nSETUP IS RUNNING");
        Gift gift = new Gift();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("\nTEARDOWN IS RUNNING");
    }


    @Test
    public void testCalculateGiftWeight() throws Exception {
        Gift gift = new Gift();
        //this may be just added inline to adds
        Mars mars = new Mars("Mars", 15, 20.5);
        gift.add(mars);
        assertEquals(15, gift.calculateGiftWeight());
        Lollipop lollipop = new Lollipop("Lollipop", 23, 30.12);
        Toffee toffee = new Toffee("Toffee", 1, 18.56);
        gift.add(lollipop);
        gift.add(toffee);
        assertEquals(39, gift.calculateGiftWeight());
    }


    @Test(expected=IllegalArgumentException.class)
    public void testAddCandyWithNegativeWeight() {
        Gift gift = new Gift();
        Mars mars = new Mars("Mars", -15, 20.5);
        gift.add(mars);
    }

    @Test
    public void testAddCandy() {
        Gift gift = new Gift();
        gift.add(new Lollipop("Lollipop", 10, 30.12));
        gift.add(new Toffee("Toffee", 8, 18.56));
        List<Candy> currentCandies = gift.getCandies();
        assertEquals(2, currentCandies.size());
        assertEquals("Toffee", currentCandies.get(1).getName());
        assertEquals("Lollipop", currentCandies.get(0).getName());
    }

    @Test
    public void testFindCandies() throws Exception {
        Gift gift = new Gift();
        gift.add(new Mars("Mars", 15, 20.5));
        gift.add(new Lollipop("Lollipop", 18, 30.12));
        gift.add(new Toffee("Toffee", 11, 18.56));
        List<Candy> actualCandies = gift.findCandies(10, 12);
        assertEquals(1, actualCandies.size());
        assertEquals("Toffee", actualCandies.get(0).getName());
    }

    @Test
    public void testFindNoCandies() throws Exception {
        Gift gift = new Gift();
        gift.add(new Mars("Mars", 15, 20.5));
        gift.add(new Lollipop("Lollipop", 10, 30.12));
        gift.add(new Toffee("Toffee", 8, 18.56));
        List<Candy> actualCandies = gift.findCandies(25, 28);
        assertEquals(0, actualCandies.size());
    }
}