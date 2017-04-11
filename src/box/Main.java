package box;

/**
 * Created by peter on 2017.04.11..
 */
public class Main {

  public static void main(String[] args) {
    Cuboid myBody = new Cuboid(3, 4, 5);
    System.out.println("Surface is: " + myBody.getSurface());
    System.out.println("Volume is: " + myBody.getVolume());
  }
}
