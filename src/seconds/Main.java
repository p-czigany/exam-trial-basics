package seconds;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 2017.04.11..
 */
public class Main {

  public static void main(String[] args) {
    List<Integer> baseList = new ArrayList<Integer>();
    baseList.add(1);
    baseList.add(2);
    baseList.add(3);
    baseList.add(4);
    baseList.add(5);
    ListTransform transformer = new ListTransform();
    System.out.println(transformer.seconds(baseList));
  }
}
