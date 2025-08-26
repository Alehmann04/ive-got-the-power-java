package Exponent.jmh;

import Exponent.Powers;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Timeout(time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(value = 1)
@Threads(5)
public class PowersBenchmark {

  @Param(
    {
      "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
      // "10",
      // "11",
      // "12",
      // "13",
      // "14",
      // "15",
      // "16",
      // "17",
      // "18",
      // "19",
      // "20",
    }
  )
  public int base;

  @Param(
    {
      "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
      // "11",
      // "12",
      // "13",
      // "14",
      // "15",
      // "16",
      // "17",
      // "18",
      // "19",
      // "20",
    }
  )
  public int power;

  @Benchmark
  public void naiveMathBenchmark(Blackhole bh) {
    Powers math = new Powers();
    int output = math.naivePower(base, power);
    bh.consume(output);
  }
  // @Benchmark
  // public void inoptimalMathBenchmark(Blackhole bh) {
  //   Powers math = new Powers();
  //   int output = math.unoptimizedPower(base, power);
  //   bh.consume(output);
  // }

  // @Benchmark
  // public void optimalMathBenchmark(Blackhole bh) {
  //   Powers math = new Powers();
  //   int output = math.optimizedPower(base, power);
  //   bh.consume(output);
  // }
}
