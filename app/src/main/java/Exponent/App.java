package Exponent;

public class App {

  public static void main(String[] args) {
    Powers powers = new Powers();
    double naive_method = powers.naivePower(34, 0);
    double unoptimized_method = powers.unoptimizedPower(10, 10);
    double optimized_method = powers.optimizedPower(10, 10);
    System.out.printf(
      "Native: %g | Unoptimized: %g | Optimized: %g\n",
      naive_method,
      unoptimized_method,
      optimized_method
    );
  }
}
