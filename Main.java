import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Right angle triangle: 1");
    System.out.println("Equilateral triangle: 2 (default)");
    System.out.println("Isosceles triangle: 3");
    System.out.println("Right angle isosceles triangle: 4");
    int type = 2;
    
    try{
      System.out.println("What type of triangle do you want? ");
      String typeString = input.next();
      type = Integer.parseInt(typeString);
    } catch (NumberFormatException e){
      System.out.println("Unexpected entry. Defaulting to equilateral triangle.");
    }

    // what type of Triangle
    Triangle t = TriangleFactory.createTriangle(type);

    System.out.println(t);

    input.close();

  }
}