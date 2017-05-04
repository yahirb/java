// this class represents a two dimensional coordinate
public class Point
{
  // two points, only accessible by methods in class
  public double X;
  public double Y;
  // default constructor
  public Point()
  {
    X = 0.0;
    Y = 0.0;
  }
  // constructor
  public Point(double X0, double Y0)
  {
    X = X0;
    Y = Y0;
  }
  public double getX(){
    return X;
  }
  public double getY(){
    return Y;
  }
}
