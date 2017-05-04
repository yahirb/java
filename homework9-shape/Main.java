public class Main{

  public static void main(String[] args) {
    Point a = new Point(0,0);
    Point b = new Point(1,0);
    Point c = new Point(0,2);
    myTriangle t = new myTriangle(a,b,c);
    t.area();
    //t((1.0,1.0),(0.0,0.0),(2.0,2.0)));
    myCircle cc = new myCircle(1,a);
    cc.area();

    // AreaCalculator test
    Shape[] shapes = new Shape[2];
    shapes[0] = t;
    shapes[1] = cc;
    AreaCalculator x = new AreaCalculator();
    x.calculate(shapes);

  }
}
