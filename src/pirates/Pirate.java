package pirates;

/**
 * Created by peter on 2017.04.11..
 */
public class Pirate {

  private String name;
  private boolean hasWoodenLeg;
  private int gold;

  Pirate(String name, boolean hasWoodenLeg, int gold) {
    this.name = name;
    this.hasWoodenLeg = hasWoodenLeg;
    this.gold = gold;
  }

  public String getName() {
    return name;
  }

  public boolean isPegLegged() {
    return hasWoodenLeg;
  }

  public int getGold() {
    return gold;
  }
}
