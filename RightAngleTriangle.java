import java.lang.Math;
import java.util.Scanner;

public class RightAngleTriangle extends Triangle{
  public RightAngleTriangle(double side1, double side2){
    super(side1,side2,-1,90,-1,-1);
  }

  @Override
  protected String getName() {
    return "Right Angle Triangle";
  }
  @Override
  protected void calculateProperties() {
    this.side3 = Math.sqrt(Math.pow(this.side1, 2) + Math.pow(side2,2));
    this.angle3 = (int)Math.toDegrees(Math.atan(this.side2/this.side1));
    this.angle2 = 90 - this.angle3;
    
  }


  public static Triangle instance(){
    Scanner input = new Scanner(System.in);
    double side1;
    double side2;
    while (true){
      try{
        System.out.print("Enter the length of side 1: ");
        String side1String = input.next();
        side1 = Double.parseDouble(side1String);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }
    while (true){
      try{
        System.out.print("Enter the length of side 2: ");
        String side2String = input.next();
        side2 = Double.parseDouble(side2String);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }
    input.close();
    return new RightAngleTriangle(side1,side2);
  }
}