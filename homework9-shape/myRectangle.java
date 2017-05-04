class myRectangle extends Shape {
  private Point upperLeft, lowerRight;
  /*
  public Rectangle(Point ul, Point lr){
    upperLeft = ul;
    lowerRight = lr;
  }
  */
  public double width(){
    double result = upperLeft.getX() - lowerRight.getX();
    return result;
  }
  public double height(){
    double result = upperLeft.getY() - lowerRight.getY();
    return result;
  }
  public double area(){
    double result = height() * width();
    return result;
  }
}
