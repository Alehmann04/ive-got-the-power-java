package Exponent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PowersTest {

  int[] bases = { 0, 1, 2, 5, 7, 10, 9876 };
  int[] powers = { 1, 0, 2, 6, 4, 5, 0 };
  int[] actuals = { 0, 1, 4, 15625, 2401, 100000, 1 };

  @Test
  void itNaivelyHandlesBase0() {
    Powers math = new Powers();
    assertEquals(math.naivePower(0, 1), 0);
    assertEquals(math.naivePower(0, 2), 0);
    assertEquals(math.naivePower(0, 100), 0);
    assertEquals(math.naivePower(0, 5), 0);
    assertEquals(math.naivePower(0, 35), 0);
    assertEquals(math.naivePower(0, 9), 0);
  }

  @Test
  void itNaivelyHandlesPower0() {
    Powers math = new Powers();
    assertEquals(math.naivePower(1, 0), 1);
    assertEquals(math.naivePower(2, 0), 1);
    assertEquals(math.naivePower(100, 0), 1);
    assertEquals(math.naivePower(5, 0), 1);
    assertEquals(math.naivePower(35, 0), 1);
    assertEquals(math.naivePower(9, 0), 1);
  }

  @Test
  void itUnoptimalyHandlesBase0() {
    Powers math = new Powers();
    assertEquals(math.unoptimizedPower(0, 1), 0);
    assertEquals(math.unoptimizedPower(0, 2), 0);
    assertEquals(math.unoptimizedPower(0, 100), 0);
    assertEquals(math.unoptimizedPower(0, 5), 0);
    assertEquals(math.unoptimizedPower(0, 35), 0);
    assertEquals(math.unoptimizedPower(0, 9), 0);
  }

  @Test
  void itUnoptimalyHandlesPower0() {
    Powers math = new Powers();
    assertEquals(math.unoptimizedPower(1, 0), 1);
    assertEquals(math.unoptimizedPower(2, 0), 1);
    assertEquals(math.unoptimizedPower(100, 0), 1);
    assertEquals(math.unoptimizedPower(5, 0), 1);
    assertEquals(math.unoptimizedPower(35, 0), 1);
    assertEquals(math.unoptimizedPower(9, 0), 1);
  }

  @Test
  void itOptimalyHandlesBase0() {
    Powers math = new Powers();
    assertEquals(math.optimizedPower(0, 1), 0);
    assertEquals(math.optimizedPower(0, 2), 0);
    assertEquals(math.optimizedPower(0, 100), 0);
    assertEquals(math.optimizedPower(0, 5), 0);
    assertEquals(math.optimizedPower(0, 35), 0);
    assertEquals(math.optimizedPower(0, 9), 0);
  }

  @Test
  void itOptimalyHandlesPower0() {
    Powers math = new Powers();
    assertEquals(math.optimizedPower(1, 0), 1);
    assertEquals(math.optimizedPower(2, 0), 1);
    assertEquals(math.optimizedPower(100, 0), 1);
    assertEquals(math.optimizedPower(5, 0), 1);
    assertEquals(math.optimizedPower(35, 0), 1);
    assertEquals(math.optimizedPower(9, 0), 1);
  }
  // @Test
  // void itDoesMathNaively() {
  //   Powers math = new Powers();
  //   assertEquals(math.naivePower(bases[0], powers[0]), actuals[0]);
  //   assertEquals(math.naivePower(bases[1], powers[1]), actuals[1]);
  //   assertEquals(math.naivePower(bases[2], powers[2]), actuals[2]);
  //   assertEquals(math.naivePower(bases[3], powers[3]), actuals[3]);
  //   assertEquals(math.naivePower(bases[4], powers[4]), actuals[4]);
  //   assertEquals(math.naivePower(bases[5], powers[5]), actuals[5]);
  //   assertEquals(math.naivePower(bases[6], powers[6]), actuals[6]);
  // }

  // @Test
  // void itDoesMathUnoptimily() {
  //   Powers math = new Powers();
  //   assertEquals(math.unoptimizedPower(bases[0], powers[0]), actuals[0]);
  //   assertEquals(math.unoptimizedPower(bases[1], powers[1]), actuals[1]);
  //   assertEquals(math.unoptimizedPower(bases[2], powers[2]), actuals[2]);
  //   assertEquals(math.unoptimizedPower(bases[3], powers[3]), actuals[3]);
  //   assertEquals(math.unoptimizedPower(bases[4], powers[4]), actuals[4]);
  //   assertEquals(math.unoptimizedPower(bases[5], powers[5]), actuals[5]);
  //   assertEquals(math.unoptimizedPower(bases[6], powers[6]), actuals[6]);
  // }

  // @Test
  // void itDoesMathOptimily() {
  //   Powers math = new Powers();
  //   assertEquals(math.optimizedPower(bases[0], powers[0]), actuals[0]);
  //   assertEquals(math.optimizedPower(bases[1], powers[1]), actuals[1]);
  //   assertEquals(math.optimizedPower(bases[2], powers[2]), actuals[2]);
  //   assertEquals(math.optimizedPower(bases[3], powers[3]), actuals[3]);
  //   assertEquals(math.optimizedPower(bases[4], powers[4]), actuals[4]);
  //   assertEquals(math.optimizedPower(bases[5], powers[5]), actuals[5]);
  //   assertEquals(math.optimizedPower(bases[6], powers[6]), actuals[6]);
  // }
}
