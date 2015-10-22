package gift.candies;

import java.util.*;


/**
 * Class Candy represents one candy of single type in Gift.
 */

public class Candy implements Comparable<Candy>{

    protected String name;
    protected int weight;

    public Candy(String name, int weight) {
        this.name = name;
        this.weight = weight;

        if (!textHasContent(name)) {
            throw new IllegalArgumentException("Name has no content.");
        }
    }

    public String toString() {
          return "Name=" + name + " " + "Weight=" + weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int compareTo(Candy compareCandy) {

        int compareWeight = ((Candy) compareCandy).getWeight();

        //ascending order
        return this.weight - compareWeight;
    }

    private boolean textHasContent(String text) {
        String EMPTY_STRING = "";
        return (text != null) && (!text.trim().equals(EMPTY_STRING));
    }
}