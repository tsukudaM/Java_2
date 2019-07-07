import java.awt.*;

public class InvisibleColor extends Color {
  private Color c;

  public InvisibleColor(Color c) {
    super(255, 255, 255);
    this.c = c;
  }

  public Color visible() {
    return c;
  }

  public Color invisible() {
    return this;
  }

}
