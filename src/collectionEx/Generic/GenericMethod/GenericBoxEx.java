package collectionEx.Generic.GenericMethod;

import collectionEx.Generic.classEx.Doll;

public class GenericBoxEx {

  public static void main(String[] args) {
    Box<Integer> box = boxing(100);
    int value = box.getType();
    System.out.println(value);

    // 포켓몬 포토카드 박싱하여 포장해주세요
    Box<String> box1 = boxing("포켓몬 포토카드");
    // 상자에서 포켓몬 포토카드를 꺼내주세요
    String card = box1.getType();
    System.out.println(card);

    // box1에 인형을 담아주세요

    Box<Doll> box2 = boxing(new Doll());
    System.out.println(box2.getType().name);
    System.out.println(box2.getType().company);
    Doll doll = box2.getType();
    System.out.println(doll.name);
    System.out.println(doll.company);
  }

  public static <T> Box<T> boxing(T t){
    Box<T> box = new Box<>();
    box.setType(t);
    return box;
  }
}
