package lamda.ex.ColorExam;

public class ColorSample {

  public ColorExampleClass getColor(ColorExampleCreate create) {
    int x = 10;
    int y = 10;
    int z = 20;

    ColorExampleClass color = create.create(x, y, z);
    return color;
  }
}
