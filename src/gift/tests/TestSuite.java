package gift.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
// List all test you want to include to this test suite through comma below. Now we have only 1 test class here.
@SuiteClasses({GiftTest.class})
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