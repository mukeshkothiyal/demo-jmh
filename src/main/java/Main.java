import com.mukesh.examples.PrimeFinder;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Main class to execute benchmarking
 */
public class Main {
  public static void main(String[] args) throws RunnerException {
    Options option = new OptionsBuilder()
            .include(PrimeFinder.class.getName())
            .forks(1)
            .build();
    new Runner(option).run();
  }
}
