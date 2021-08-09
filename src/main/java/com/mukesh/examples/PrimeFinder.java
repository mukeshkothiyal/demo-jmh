package com.mukesh.examples;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(value = 3)
@BenchmarkMode(Mode.AverageTime)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
/**
 * Example class for benchmark testing
 * This will provide a probable prime in the range of provided bitlength
 *
 */
public class PrimeFinder {

  @Param({"10", "100", "1000"})
  int bitlength;

  @Benchmark
  public int findPrime() {
    BigInteger primeInt = BigInteger.probablePrime(bitlength, ThreadLocalRandom.current());
    return primeInt.intValue();
  }
}
