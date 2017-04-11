package countas;

public class ACounter extends LetterCounter {

  public ACounter() {
  }

  public int countAs (String fileName) {
    return countLetters(fileName, 'a');
  }
}
