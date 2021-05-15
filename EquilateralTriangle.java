import java.util.Scanner;

public class EquilateralTriangle extends Triangle{
  public EquilateralTriangle(double side){
    super(side,side,side,60,60,60);
  }
  
  @Override
  protected String getName() {
    return "Equilateral Triangle";
  }
    
  public static Triangle instance(){
    Scanner input = new Scanner(System.in);
    double side;
    while (true){
      try{
        System.out.print("Enter the side length: ");
        String sideString = input.next();
        side = Double.parseDouble(sideString);
        break;
      } catch (NumberFormatException e){
        System.out.println("Not a valid number.");
      }
    }

    input.close();
    return new EquilateralTriangle(side);
  }
}