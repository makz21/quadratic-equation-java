public class Main{

  public static void main(String[] args){
    if(args.length != 3){
      System.out.println("Wrong number of arguments, give exactly 3!(a, b, c)");
      return;
    }

double a, b, c;
  try{
      a = Double.parseDouble(args[0]);
      b = Double.parseDouble(args[1]);
      c = Double.parseDouble(args[2]);
      if(a == 0){
        System.out.println("This is not a quadratic equation!(You entered a=0)");
        return;
      }



      }catch(NumberFormatException exception){
        System.out.println("Wrong number format " + exception);
        return;
      }

      Equation equation = new Equation(a, b, c);
      equation.solveEquation();
    }
}
