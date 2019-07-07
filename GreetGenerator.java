import objectdraw.*;

public class GreetGenerator {
  private static final int NUM_GREETINGS = 7;
  private RandomIntGenerator iGen;

  public GreetGenerator() {
    iGen = new RandomIntGenerator(0, NUM_GREETINGS - 1);
  }

  public String greet() {
    int i = iGen.nextValue();

    if (i == 0) {
      return "Hello";
    } else if (i == 1) {
      return "Konnichiwa";
    } else if (i == 2) {
      return "Bonjour";
    } else if (i == 3) {
      return "Ciao";
    } else if (i == 4) {
      return "Hola";
    } else if (i == 5) {
      return "Jambo";
    } else {
      return "Saluton";
    }
  }
}
