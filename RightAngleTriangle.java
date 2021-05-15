import java.lang.Math;
import java.util.Scanner;

public class RightAngleTriangle extends Triangle{
  public RightAngleTriangle(double side1, double side2){
    super(side1,side2,-1,90,-1,-1);
  }

  @Override
  protected void calculateProperties() {
    this.side3 = Math.sqrt(Math.pow(this.side1, 2) + Math.pow(side2,2));
    this.angle3 = (int)Math.toDegrees(Math.atan(this.side2/this.side1));
    this.angle2 = 90 - this.angle3;
    
  }


  public static Triangle instance(){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the length of side 1: ");
    double side1 = input.nextDouble();

    return new RightAngleTriangle(side1,4);
  }
}