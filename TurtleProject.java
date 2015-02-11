public class TurtleProject
{
  public static void main(String[] a)
  {
    World wref = new World();
    NathansTurtle nathan = new NathansTurtle(25, 25, wref);
    OtherTurtle other = new OtherTurtle(100, 100, wref);
    nathan.makeShape();
    other.makeShape();
  }
}