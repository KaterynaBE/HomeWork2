package gift.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)

@SuiteClasses({GiftTest.class, ParametrizedGiftTest.class})
public class TestSuite {

    @AfterClass
    public static void tearDown() {
        System.out.println("tearing down");
    }

    @BeforeClass
    public static void setUp() {
        System.out.println("setting up");
    }
}