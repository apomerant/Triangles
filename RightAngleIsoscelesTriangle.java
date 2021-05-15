import java.lang.Math;

public class RightAngleIsoscelesTriangle extends Triangle{
  public RightAngleIsoscelesTriangle(double matchingSide){
    super(matchingSide,matchingSide,Triangle.UNKNOWN_SIDE,90,45,45);
  }

  @Override
  protected void calculateProperties() {
    this.side3 = Math.sqrt(2 * Math.pow(this.side1, 2));
  }
}