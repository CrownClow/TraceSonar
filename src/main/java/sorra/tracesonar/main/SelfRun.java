package sorra.tracesonar.main;

import java.io.IOException;

public class SelfRun {
  public static void main(String[] args) throws IOException {
    Main.main("-p -f target/classes -q sorra.tracesonar.core.GraphStore sorra.tracesonar.sample.Subclass".split(" "));
  }
}
