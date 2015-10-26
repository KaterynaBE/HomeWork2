import gift.candies.*;
import gift.Gift;
import gift.exceptions.EmptyGiftException;
import gift.exceptions.InputCommandException;
import gift.exceptions.ParametersMismatchException;

import java.util.Scanner;
import java.util.*;


public class App {
    public static void main(String[] arg) throws InputCommandException, EmptyGiftException, ParametersMismatchException {

        // Created  few candies objects.
        Mars mars = new Mars("Mars", 15, 20.5);
        Lollipop lollipop = new Lollipop("Lollipop", 10, 30.12);
        Toffee toffee = new Toffee("Toffee", 8, 18.56);

        // Create gift.
        Gift gift = new Gift();
        gift.add(mars);
        gift.add(lollipop);
        gift.add(toffee);


    //Creating Scanner instance to scan console for User input
    Scanner in = new Scanner(System.in);
    System.out.println("Type 1 followed by <Enter> to see Gift weight, type 2 + Enter to see list of " +
            "candies which corresponds to particular weight range, type 0 + Enter to Exit.");
    int number = in.nextInt();
        if (number == 1) {
            System.out.println(gift.calculateGiftWeight());
            //System.out.println(Arrays.sort(gift, candy.compareTo());
        } else if (number == 2) {
            System.out.println(gift.findCandy(10, 12));
        } else if (number == 3) {
            gift.sortCandies();
            System.out.println(gift.getCandies());
        } else if (number == 0) {
            return;
        } else {
            throw new InputCommandException("Error. Input should be 1, 2, 3 or 0 only.");
        }
    }
}