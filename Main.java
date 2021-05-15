class Main {
  public static void main(String[] args) {


    // what type of Triangle
    Triangle t = TriangleFactory.createTriangle(TriangleFactory.RIGHT_ANGLE);

    System.out.println(t);

  }
}