public class NathansTurtle extends Turtle
{
  public NathansTurtle(int x, int y, World wref) 
  { 
    super(x, y, wref); 
  }
  
  public void makeShape()
  {
    this.forward(-100);
    this.turn(90);
    this.forward(100);
  }
}