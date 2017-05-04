class myTriangle extends Shape {
  private Point A, B, C;
  // constructor
  public myTriangle(Point a, Point b, Point c){
    A = a;
    B = b;
    C = c;
  }
  // constructor with points
  /*
  public Triangle(double x1,double y1,double x2, double y2,double x3, double y3){
    Point a = new Point(x1,y1);
    Point b = new Point(x2,y2);
    Point c = new Point(x3,y3);
    A = a;
    B = b;
    C = c;
  }
  */
  public double area(){
    double result = (0.5) * ((A.getX() - C.getX())*(B.getY() - A.getY()) - (A.getX() - B.getX())*(C.getY() - A.getY()));
    System.out.println(result);
    return result;
  }
}
