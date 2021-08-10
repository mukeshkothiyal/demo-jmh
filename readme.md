<h1>demo-jmh</h1>

<p>Basic application to test demo benchmarking</p>

Benchmarking is invoked via:

<ul>
    <li>JMH Runner (Main)</li>
    <li>Shade plugin using uber-jar</li>
</ul>

<h6>Sample Run </h6>

<details>
<summary>Example Execution</summary>

```

$ java -jar benchmarks.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.openjdk.jmh.util.Utils (file:/Users/../jmh/demo-jmh/target/benchmarks.jar) to method java.io.Console.encoding()
WARNING: Please consider reporting this to the maintainers of org.openjdk.jmh.util.Utils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
# JMH version: 1.32
# VM version: JDK 11.0.11, OpenJDK 64-Bit Server VM, 11.0.11+9-LTS
# VM invoker: /Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.mukesh.examples.PrimeFinder.findPrime
# Parameters: (bitlength = 10)

# Run progress: 0.00% complete, ETA 00:01:30
# Fork: 1 of 3
# Warmup Iteration   1: 37.705 us/op
# Warmup Iteration   2: 29.195 us/op
# Warmup Iteration   3: 28.120 us/op
# Warmup Iteration   4: 28.259 us/op
# Warmup Iteration   5: 27.971 us/op
Iteration   1: 28.132 us/op
Iteration   2: 28.061 us/op
Iteration   3: 28.266 us/op
Iteration   4: 28.335 us/op
Iteration   5: 28.784 us/op

# Run progress: 11.11% complete, ETA 00:01:22
# Fork: 2 of 3
# Warmup Iteration   1: 37.136 us/op
# Warmup Iteration   2: 29.271 us/op
# Warmup Iteration   3: 30.445 us/op
# Warmup Iteration   4: 29.597 us/op
# Warmup Iteration   5: 28.190 us/op
Iteration   1: 27.919 us/op
Iteration   2: 28.239 us/op
Iteration   3: 28.141 us/op
Iteration   4: 28.087 us/op
Iteration   5: 28.595 us/op

# Run progress: 22.22% complete, ETA 00:01:12
# Fork: 3 of 3
# Warmup Iteration   1: 36.306 us/op
# Warmup Iteration   2: 29.872 us/op
# Warmup Iteration   3: 28.178 us/op
# Warmup Iteration   4: 28.116 us/op
# Warmup Iteration   5: 28.055 us/op
Iteration   1: 28.191 us/op
Iteration   2: 28.074 us/op
Iteration   3: 28.114 us/op
Iteration   4: 28.139 us/op
Iteration   5: 28.774 us/op


Result "com.mukesh.examples.PrimeFinder.findPrime":
28.257 ±(99.9%) 0.278 us/op [Average]
(min, avg, max) = (27.919, 28.257, 28.784), stdev = 0.260
CI (99.9%): [27.979, 28.535] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 11.0.11, OpenJDK 64-Bit Server VM, 11.0.11+9-LTS
# VM invoker: /Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.mukesh.examples.PrimeFinder.findPrime
# Parameters: (bitlength = 100)

# Run progress: 33.33% complete, ETA 00:01:01
# Fork: 1 of 3
# Warmup Iteration   1: 532.907 us/op
# Warmup Iteration   2: 336.976 us/op
# Warmup Iteration   3: 339.614 us/op
# Warmup Iteration   4: 357.916 us/op
# Warmup Iteration   5: 333.710 us/op
Iteration   1: 332.129 us/op
Iteration   2: 335.102 us/op
Iteration   3: 331.681 us/op
Iteration   4: 337.639 us/op
Iteration   5: 338.729 us/op

# Run progress: 44.44% complete, ETA 00:00:51
# Fork: 2 of 3
# Warmup Iteration   1: 557.490 us/op
# Warmup Iteration   2: 335.957 us/op
# Warmup Iteration   3: 335.921 us/op
# Warmup Iteration   4: 337.386 us/op
# Warmup Iteration   5: 339.297 us/op
Iteration   1: 334.069 us/op
Iteration   2: 333.840 us/op
Iteration   3: 335.923 us/op
Iteration   4: 340.003 us/op
Iteration   5: 334.431 us/op

# Run progress: 55.56% complete, ETA 00:00:41
# Fork: 3 of 3
# Warmup Iteration   1: 511.437 us/op
# Warmup Iteration   2: 335.213 us/op
# Warmup Iteration   3: 335.244 us/op
# Warmup Iteration   4: 354.934 us/op
# Warmup Iteration   5: 348.301 us/op
Iteration   1: 332.964 us/op
Iteration   2: 330.594 us/op
Iteration   3: 333.821 us/op
Iteration   4: 341.607 us/op
Iteration   5: 334.799 us/op


Result "com.mukesh.examples.PrimeFinder.findPrime":
335.155 ±(99.9%) 3.342 us/op [Average]
(min, avg, max) = (330.594, 335.155, 341.607), stdev = 3.126
CI (99.9%): [331.813, 338.498] (assumes normal distribution)


# JMH version: 1.32
# VM version: JDK 11.0.11, OpenJDK 64-Bit Server VM, 11.0.11+9-LTS
# VM invoker: /Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.mukesh.examples.PrimeFinder.findPrime
# Parameters: (bitlength = 1000)

# Run progress: 66.67% complete, ETA 00:00:30
# Fork: 1 of 3
# Warmup Iteration   1: 40800.129 us/op
# Warmup Iteration   2: 28131.241 us/op
# Warmup Iteration   3: 29822.321 us/op
# Warmup Iteration   4: 25237.038 us/op
# Warmup Iteration   5: 32469.223 us/op
Iteration   1: 27311.967 us/op
Iteration   2: 28043.781 us/op
Iteration   3: 30997.728 us/op
Iteration   4: 38600.821 us/op
Iteration   5: 39015.179 us/op

# Run progress: 77.78% complete, ETA 00:00:20
# Fork: 2 of 3
# Warmup Iteration   1: 37072.997 us/op
# Warmup Iteration   2: 40620.982 us/op
# Warmup Iteration   3: 35959.798 us/op
# Warmup Iteration   4: 30401.471 us/op
# Warmup Iteration   5: 30968.188 us/op
Iteration   1: 36371.778 us/op
Iteration   2: 33771.826 us/op
Iteration   3: 34753.972 us/op
Iteration   4: 30100.240 us/op
Iteration   5: 29385.301 us/op

# Run progress: 88.89% complete, ETA 00:00:10
# Fork: 3 of 3
# Warmup Iteration   1: 40614.905 us/op
# Warmup Iteration   2: 23098.024 us/op
# Warmup Iteration   3: 25641.574 us/op
# Warmup Iteration   4: 32388.819 us/op
# Warmup Iteration   5: 30086.605 us/op
Iteration   1: 29782.695 us/op
Iteration   2: 27908.498 us/op
Iteration   3: 31248.486 us/op
Iteration   4: 30600.933 us/op
Iteration   5: 30410.473 us/op


Result "com.mukesh.examples.PrimeFinder.findPrime":
31886.912 ±(99.9%) 4022.578 us/op [Average]
(min, avg, max) = (27311.967, 31886.912, 39015.179), stdev = 3762.722
CI (99.9%): [27864.333, 35909.490] (assumes normal distribution)


# Run complete. Total time: 00:01:33

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark              (bitlength)  Mode  Cnt      Score      Error  Units
PrimeFinder.findPrime           10  avgt   15     28.257 ±    0.278  us/op
PrimeFinder.findPrime          100  avgt   15    335.155 ±    3.342  us/op
PrimeFinder.findPrime         1000  avgt   15  31886.912 ± 4022.578  us/op

```

</details>

** Benchmarking is preferred via packaged jar (instead of running using JMH Runner)
