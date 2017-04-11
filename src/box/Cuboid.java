package box;

public class Cuboid {

  private double edgeA, edgeB, edgeC;

  public Cuboid(double edgeA, double edgeB, double edgeC) {
    this.edgeA = edgeA;
    this.edgeB = edgeB;
    this.edgeC = edgeC;
  }

  public double getSurface() {
    return 2 * ((edgeA * edgeB) + (edgeB * edgeC) + (edgeA * edgeC));
  }

  public double getVolume() {
    return edgeA * edgeB * edgeC;
  }
}
