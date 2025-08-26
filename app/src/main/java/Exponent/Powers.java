package Exponent;

public class Powers {

  public int naivePower(int base, int exp) {
    if (base == 0) {
      return 0;
    }
    if (exp == 0) {
      return 1;
    }

    return base * naivePower(base, (exp - 1));
  }

  public int unoptimizedPower(int base, int exp) {
    if (base == 0) {
      return 0;
    }
    if (exp == 0) {
      return 1;
    }
    if (exp % 2 == 0) {
      return (
        unoptimizedPower(base, exp / 2) * unoptimizedPower(base, exp / 2)
      );
    } else {
      return (
        base * unoptimizedPower(base, exp / 2) * unoptimizedPower(base, exp / 2)
      );
    }
  }

  public int optimizedPower(int base, int exp) {
    if (base == 0) {
      return 0;
    }
    if (exp == 0) {
      return 1;
    }

    int temp = optimizedPower(base, exp / 2);
    if (exp % 2 == 0) {
      return temp * temp;
    } else {
      return base * temp * temp;
    }
  }
}
