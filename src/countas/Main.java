package countas;

/**
 * Created by peter on 2017.04.11..
 */
public class Main {

  public static void main(String[] args) {
    ACounter myAcounter = new ACounter();
    System.out.println(myAcounter.countAs("countas/afile.txt"));
    System.out.println(myAcounter.countAs("not-a-file"));
  }
}
