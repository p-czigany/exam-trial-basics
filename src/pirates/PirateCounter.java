package pirates;

import java.util.ArrayList;
import java.util.*;

public class PirateCounter {

  public List<String> whoIsRichAndPegLegged(List<Pirate> toSort) {
    List<String> richPeglegged = new ArrayList<>();
    for (Pirate examined :
            toSort) {
      if (examined.getGold() > 15 && examined.isPegLegged()) {
        richPeglegged.add(examined.getName());
      }
    }
    return richPeglegged;
  }
}
