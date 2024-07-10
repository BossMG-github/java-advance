package collectionEx.Generic.InterFaceEx;

public class Codi implements Rentable<AriCondtionMachine>{

  @Override
  public AriCondtionMachine rent() {
    return new AriCondtionMachine();
  }
}
