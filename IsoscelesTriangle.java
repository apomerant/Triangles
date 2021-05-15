import java.lang.Math;
import java.lang.*;
import java.util.Scanner;

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
  
  @Override
  protected String getName() {
    return "Isosceles Triangle";
  }

  public static Triangle instance(){
    Scanner input = new Scanner(System.in);
    double side;
    int angle;
    while (true){
      try{
        System.out.print("Enter the matching side lengths: ");
        String sideString = input.next();
        side = Double.parseDouble(sideString);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }
    while (true){
      try{
        System.out.print("Enter the inner angle, rounded to the nearest degree: ");
        String angleString = input.next();
        angle = Integer.parseInt(angleString);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }

    input.close();
    return new IsoscelesTriangle(side,angle);
  }


}