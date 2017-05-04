class myCircle extends Shape
{
    // field members
    private double radius;
    private Point center;
    // constructor
    public myCircle(double r, Point c){
      radius = r;
      center = c;
    }

    public double area(){
      double result = 3.14 * radius * radius;
      return result;
    }
}
