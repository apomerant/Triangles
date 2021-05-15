public class Triangle{
  //attributes
  double side1;
  double side2;
  double side3;
  int angle1;
  int angle2;
  int angle3;
  static double UNKNOWN_SIDE = -1;
  static int UNKOWN_ANGLE = -1;

  //constructor
  public Triangle(double side1, double side2, double side3, int angle1, int angle2, int angle3){
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.angle1 = angle1;
    this.angle2 = angle2; 
    this.angle3 = angle3;
    calculateProperties();
    
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Triangle \n");
    sb.append("Side1: " + this.side1 + "\n");
    sb.append("Side2: " + this.side2 + "\n");
    sb.append("Side3: " + this.side3 + "\n");
    sb.append("Angle1: " + this.angle1 + "\n");
    sb.append("Angle2: " + this.angle2 + "\n");
    sb.append("Angle3: " + this.angle3 + "\n");
    return sb.toString();

  }

  protected void calculateProperties(){

  }

  public double perimeter(){
    return this.side1 + this.side2 + this.side3;
  }
}