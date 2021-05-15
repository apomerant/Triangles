import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("What type of triangle do you want? ");
    System.out.println("Right angle triangle: 1");
    System.out.println("Equilateral triangle: 2");
    System.out.println("Isosceles triangle: 3");
    System.out.println("Right angle isosceles triangle: 4");

    int type = input.nextInt();
    

    // what type of Triangle
    Triangle t = TriangleFactory.createTriangle(type);

    System.out.println(t);

    input.close();

  }
}