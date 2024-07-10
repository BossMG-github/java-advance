package collectionEx.Generic.classEx;

public class GenericEx01 {

  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.content = "러브레터";
    String content = box.content;

    Box<Integer> box1 = new Box<>();
    box1.content = 100;

    Box<Doll> box2 = new Box<>();
    box2.content = new Doll();
    box2.content.name = "미미입니당";
    box2.content.company = "만든 회사는 몰라용";
    //box.content = new Doll();
    System.out.println(box2.content.name.toString());
    System.out.println(box2.content.company.toString());

    Product<smartPhone,String> p1 = new Product<smartPhone, String>();
    p1.setKind(new smartPhone() );
    p1.setModel("애플15Pro");

    smartPhone apple = p1.getKind();
    String model = p1.getModel();
    System.out.println(apple + " " + model);

    Product<Car,String> p2 = new Product<>();
    p2.setKind(new Car());
    p2.setModel("제네시스");
    Car car = p2.getKind();
    String carModel = p2.getModel();
    System.out.println(car + " " + carModel);
  }
}
