package countas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by peter on 2017.04.11..
 */

public class FileHandler {

  public List<String> readFromFile(Path fileLocation) {
    try {
      return Files.readAllLines(fileLocation);
    } catch (IOException ex) {
      return null;
    }
  }
}
