import java.lang.Math;
import java.lang.*;

public class IsoscelesTriangle extends Triangle{
  public IsoscelesTriangle(double matchingSide, int innerAngle){
    
    
    super(matchingSide,matchingSide,Triangle.UNKNOWN_SIDE,innerAngle,Triangle.UNKOWN_ANGLE,Triangle.UNKOWN_ANGLE);
  }

  @Override
  protected void calculateProperties(){

      this.side3 = Math.sqrt(2 * Math.pow(this.side1,2) - 2 * Math.pow(this.side1,2) * Math.cos(this.angle1));
      this.angle2 = (180 - this.angle1)/2;
      this.angle3 = (180 - this.angle1)/2;
    }

}