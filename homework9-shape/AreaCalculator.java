class AreaCalculator extends Shape{
  public double calculate(Shape[] shapes){
    // area counter
    double counter = 0;
    // indexes shape array, adding every area
    for (int i = 0; i < shapes.length; i++) {
      counter = counter + shapes[i].area();
    }
    System.out.println(counter);
    return counter;

  }
  public double area(){
    return 0.0;
  }
}
