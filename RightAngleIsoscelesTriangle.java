import java.lang.Math;
import java.util.Scanner;

public class RightAngleIsoscelesTriangle extends RightAngleTriangle{
  public RightAngleIsoscelesTriangle(double matchingSide){
    super(matchingSide,matchingSide);
  }

  @Override
  protected String getName() {
    return "Right Angle Isosceles Triangle";
  }

  public static Triangle instance(){
    Scanner input = new Scanner(System.in);
    double side;
    while (true){
      try{
        System.out.print("Enter the length of the matching sides: ");
        String sideString = input.next();
        side = Double.parseDouble(sideString);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }
    
    
    input.close();
    return new RightAngleIsoscelesTriangle(side);
  }
}