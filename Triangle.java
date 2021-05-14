public class Triangle{
  //attributes
  double side1;
  double side2;
  double side3;
  int angle1;
  int angle2;
  int angle3;

  //constructor
  public Triangle(double side1, double side2, double side3, int angle1, int angle2, int angle3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.angle1 = angle1;
    this.angle2 = angle2; 
    this.angle3 = angle3;
  }

  public Triangle(double side1, double side2, double side3){
    this(side1, side2, side3, 0, 0, 0);
  }


  public double perimeter(){
    return this.side1 + this.side2 + this.side3;
  }
}