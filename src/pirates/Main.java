package pirates;

import java.util.ArrayList;

/**
 * Created by peter on 2017.04.11..
 */
public class Main {

  public static void main(String... args) {
    ArrayList<Pirate> pirates = new ArrayList<>();

    // Given this list...

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    // Write a function that takes any list that contains pirates as in the example,
    // And returns a list of names containing the pirates that
    // - have wooden leg and
    // - have more than 15 gold

    System.out.println(new PirateCounter().whoIsRichAndPegLegged(pirates));
  }
}
