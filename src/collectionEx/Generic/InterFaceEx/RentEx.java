package collectionEx.Generic.InterFaceEx;

public class RentEx {

  public static void main(String[] args) {
    Codi codi = new Codi();
    AriCondtionMachine ariCondtionMachine = codi.rent();
    ariCondtionMachine.powerOn();
  }
}
