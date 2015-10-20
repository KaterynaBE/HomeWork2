import gift.candies.*;
import gift.Gift;

public class App {
    public static void main(String[] arg) {

        // Created  few candies objects.
        // ? or just ars candy1 = new Mars();
        Mars candies1 = new Mars("Mars", 10, 15.2);
        Lollipop candies2 = new Lollipop("Lollipop", 8, 10.2);
        Toffee candies3 = new Toffee("Toffee", 14, 8.7);

        // Create gift ?
        Gift gift1 = new Gift();
        gift1.add(candies1);
        gift1.add(candies2);
        gift1.add(candies3);


    }
}