package seconds;

import java.util.ArrayList;
import java.util.List;

public class ListTransform {

  public ListTransform() {

  }

  public List<Integer> seconds(List<Integer> selectFrom) {
    List<Integer> everySecond = new ArrayList<>();
    for (int i = 0; i < selectFrom.size(); i++) {
      if (i % 2 != 0) {
        everySecond.add(selectFrom.get(i));
      }
    }
    return everySecond;
  }
}
