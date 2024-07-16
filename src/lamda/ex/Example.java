package lamda.ex;

@FunctionalInterface
interface Funcion {

  double apply(double x, double y);
}

public class Example {

  public static double calc(Funcion funcion) {
    double x = 30;
    double y = 3;
    return funcion.apply(x, y);
  }

  public static void main(String[] args) {
    double result = calc((x, y) -> (x / y));
    System.out.println("result = " + result);
  }
}