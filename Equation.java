public class Equation{
  private double a;
  private double b;
  private double c;
  private double delta;
  private double sdelta;


public Equation(double a, double b, double c){
  this.a = a;
  this.b = b;
  this.c = c;
  calculateDelta();
}

public void solveEquation(){
  double x0, x1, x2;

  if(delta < 0){
    System.out.println("Equation " + a + "x^2 + " + b + "x + " + c + " has no result");
    return;
  } else if (delta == 0){
    x0 = calculateX0();
    System.out.println("Equation " + a + "x^2 + " + b + "x + " + c + " has 1 result\n x=" + x0);
  } else {
    x1 = calculateX1();
    x2 = calculateX2();
    System.out.println("Equation " + a + "x^2 + " + b + "x + " + c + " has 3 results\n x1="  + x1 + " and x2=" + x2);
  }

}

private void calculateDelta(){
  delta = b * b - 4 * a * c;
  sdelta = Math.sqrt(delta);
}

private double calculateX0(){
  double x0;
  x0 = -b / (2 * a);
  return x0;
}

private double calculateX1(){
  double x1;
  x1 = (-b - sdelta) / (2 * a);
  return x1;
}

private double calculateX2(){
  double x2;
  x2 = (-b + sdelta) / (2 * a);
  return x2;
}


}
