package lamda.ex.ColorExam;

public class ColorExampleClass {

  private int x;
  private int y;
  private int z;

  public ColorExampleClass(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }


  public static void main(String[] args) {
    ColorSample cs = new ColorSample();
    ColorExampleClass colorExampleClass = cs.getColor(ColorExampleClass::new);
    System.out.println(
        colorExampleClass.x + "\t" + colorExampleClass.y + "\t" + colorExampleClass.z);
  }
}
