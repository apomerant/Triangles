public class TriangleFactory {
  public static final int RIGHT_ANGLE = 1;
  public static final int EQUILATERAL = 2;
  public static final int ISOSCELES = 3;
  public static final int RA_ISOSCELES = 4;
  public static Triangle createTriangle(int triangleType) {
    Triangle result = null;
    switch (triangleType) {
      case TriangleFactory.RIGHT_ANGLE: 
      result = RightAngleTriangle.instance();
      break;
      case TriangleFactory.EQUILATERAL:
      result = EquilateralTriangle.instance();
      break;
      case TriangleFactory.ISOSCELES:
      result = IsoscelesTriangle.instance();
      break;
      case RA_ISOSCELES:
      result = RightAngleIsoscelesTriangle.instance();
      break;
    }
    return result;

  }
}