package countas;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Created by peter on 2017.04.11..
 */
public class LetterCounter {

  public int countLetters(String fileName, char letter) {
    FileHandler handler = new FileHandler();
    List<String> baseLines = handler.readFromFile(Paths.get(fileName));
    int count = 0;
    for (String line :
            baseLines) {
      for (int i = 0; i < line.length(); i++) {
        if (line.toLowerCase().charAt(i) == letter) {
          count++;
        }
      }
    }
    return count;
  }
}
